package cn.eilene.employee.dao;

import java.util.List;

import cn.eilene.employee.domain.Employee;

public interface EmployeeDao {
	public Employee login(Employee employee);

	public int findCount();

	public List<Employee> findByPage(int begin, int pageSize);

	public void save(Employee employee);

	public Employee findById(Integer eid);

	public void update(Employee employee);

	public void delete(Employee employee);

}
