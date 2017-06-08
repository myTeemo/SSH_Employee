package cn.eilene.employee.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import cn.eilene.employee.domain.Department;
import cn.eilene.employee.domain.PageBean;
import cn.eilene.employee.service.DepartmentService;

public class DepartmentAction extends ActionSupport implements ModelDriven<Department>{
	
	

	private static final long serialVersionUID = 1L;
	private Department department = new Department();
	
	@Override
	public Department getModel() {
		return department;
	}
	
	private Integer currPage = 1;
	
	private DepartmentService departmentService;
	
	public void setDepartmentService(DepartmentService departmentService) {
		this.departmentService = departmentService;
	}
	
	public String findAll(){
		PageBean<Department> pageBean =  departmentService.findByPage(currPage);
		ActionContext.getContext().getValueStack().push(pageBean);
		return "findAll";
	}
	
	public String saveUI(){
		return "saveUI";
	}
	
	public String save(){
		departmentService.save(department);
		return "saveSuccess";
	}
	
	public String editById(){
		department = departmentService.findById(department.getDid());
		return "editSuccess";
	}
	
	public String update(){
		departmentService.update(department);
		return "updateSuccess";
	}
	
	public String delete(){
		department = departmentService.findById(department.getDid());
		departmentService.delete(department);
		return "deleteSuccess";
	}
	
	public Integer getCurrPage() {
		return currPage;
	}
	
	public void setCurrPage(Integer currPage) {
		this.currPage = currPage;
	}
}
