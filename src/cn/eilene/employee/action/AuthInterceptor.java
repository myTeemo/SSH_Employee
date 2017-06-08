package cn.eilene.employee.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

import cn.eilene.employee.domain.Employee;

public class AuthInterceptor extends AbstractInterceptor {

	private static final long serialVersionUID = 1L;

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		System.out.println("权限拦截器开始执行");
		Employee isExistEmployee = (Employee)ActionContext.getContext().getSession().get("existEmployee");
		
		//取得被拦截的Action实例
		String className = invocation.getAction().getClass().getName();
		System.out.println(className);
		System.out.println(isExistEmployee);
		if(isExistEmployee != null){
			String result = invocation.invoke();
			System.out.println(isExistEmployee);
			System.out.println("权限拦截器结束执行");
			return result;
		}else{
			System.out.println("尚未登录，不能查看信息");
			ActionContext.getContext().getSession().put("tip", "尚未登录，不能查看信息");
			return "input";
		}
		
	}

}
