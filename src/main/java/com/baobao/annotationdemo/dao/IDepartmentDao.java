package com.baobao.annotationdemo.dao;

import com.baobao.annotationdemo.domain.Department;

import java.util.List;

/**
 * @author baobao
 * @create 2019-11-23 19:58
 * @description
 */
public interface IDepartmentDao {
    List<Department> selectAll();

    Department selectById(int id);

    void insert(Department department);

    void update(Department department);

    void delete(int id);
}
