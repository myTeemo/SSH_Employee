package cn.eilene.employee.dao;

import java.util.List;

import cn.eilene.employee.domain.Department;

public interface DepartmentDao {
	public int findCount();
	public List<Department> findByPage(int begin,int pageSize);
	public void save(Department department);
	public Department findById(Integer did);
	public void update(Department department);
	public void delete(Department department);
	public List<Department> findAll();
}
