package cn.eilene.employee.service.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import cn.eilene.employee.dao.DepartmentDao;
import cn.eilene.employee.domain.Department;
import cn.eilene.employee.domain.PageBean;
import cn.eilene.employee.service.DepartmentService;

@Transactional
public class DepartmentServiceImpl implements DepartmentService {
	private DepartmentDao departmentDao ;

	
	@Override
	public List<Department> findAll() {
		List<Department> list = departmentDao.findAll();
		return list;
	}
	@Override
	public void delete(Department department) {
		departmentDao.delete(department);
	}
	@Override
	public void update(Department department) {
		departmentDao.update(department);
	}
	@Override
	public Department findById(Integer did) {
		return departmentDao.findById(did);
	}

	@Override
	public void save(Department department) {
		departmentDao.save(department);
		
	}
	@Override
	public PageBean<Department> findByPage(Integer currPage) {
		PageBean<Department> pageBean = new PageBean<Department>();
		
		pageBean.setCurrPage(currPage);
		
		int pageSize = 3;
		pageBean.setPageSize(pageSize);
		
		int totalCount = departmentDao.findCount();
		pageBean.setTotalCount(totalCount);
		
		double tc = totalCount;
		Double num = Math.ceil(tc / pageSize);
		pageBean.setTotalPage(num.intValue());
		
		int begin = (currPage - 1) * pageSize;
		List<Department> list = departmentDao.findByPage(begin,pageSize);
		pageBean.setList(list);
		
		return pageBean;
	}
	
	
	public void setDepartmentDao(DepartmentDao departmentDao) {
		this.departmentDao = departmentDao;
	}
}
