package cn.eilene.employee.service.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import cn.eilene.employee.dao.EmployeeDao;
import cn.eilene.employee.domain.Employee;
import cn.eilene.employee.domain.PageBean;
import cn.eilene.employee.service.EmployeeService;

@Transactional
public class EmployeeServiceImpl implements EmployeeService {
	private EmployeeDao employeeDao;
	
	@Override
	public void delete(Employee employee) {
		employeeDao.delete(employee);
	}

	@Override
	public void update(Employee employee) {
		employeeDao.update(employee);
	}

	@Override
	public Employee findById(Integer eid) {
		return employeeDao.findById(eid);
	}

	@Override
	public void save(Employee employee) {
		employeeDao.save(employee);
		
	}

	@Override
	public PageBean<Employee> findByPage(Integer currPage) {
		PageBean<Employee> pageBean = new PageBean<Employee>();
		
		pageBean.setCurrPage(currPage);
		
		int pageSize = 3;
		pageBean.setPageSize(pageSize);
		
		int totalCount = employeeDao.findCount();
		pageBean.setTotalCount(totalCount);
		
		double tc = totalCount;
		Double num = Math.ceil(tc / pageSize);
		pageBean.setTotalPage(num.intValue());
		
		int begin = (currPage - 1 ) * pageSize;
		List<Employee> list = employeeDao.findByPage(begin,pageSize);
		pageBean.setList(list);
		
		return pageBean;
	}

	public void setEmployeeDao(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}
	
	public Employee login(Employee employee){
		Employee existEmployee = employeeDao.login(employee);
		return existEmployee;
	}
}
