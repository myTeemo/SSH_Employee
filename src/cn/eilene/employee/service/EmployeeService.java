package cn.eilene.employee.service;

import cn.eilene.employee.domain.Employee;
import cn.eilene.employee.domain.PageBean;

public interface EmployeeService {
	
	public Employee login(Employee employee);

	public PageBean<Employee> findByPage(Integer currPage);

	public void save(Employee employee);

	public Employee findById(Integer eid);

	public void update(Employee employee);

	public void delete(Employee employee);
}
