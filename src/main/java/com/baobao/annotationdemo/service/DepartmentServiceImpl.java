package com.baobao.annotationdemo.service;

import com.baobao.annotationdemo.dao.IDepartmentDao;
import com.baobao.annotationdemo.domain.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author baobao
 * @create 2019-11-23 20:01
 * @description
 */
@Service("departmentService")
public class DepartmentServiceImpl implements IDepartmentService {
    public void setDepartmentDao(IDepartmentDao departmentDao) {
        this.departmentDao = departmentDao;
    }

    @Autowired
    private IDepartmentDao departmentDao;

    public List<Department> selectAll() {
        return departmentDao.selectAll();
    }

    public Department selectById(int id) {
        return departmentDao.selectById(id);
    }

    public void insert(Department department) {
        departmentDao.insert(department);
    }

    public void update(Department department) {
        departmentDao.update(department);
    }

    public void delete(int id) {
        departmentDao.delete(id);
    }
}
