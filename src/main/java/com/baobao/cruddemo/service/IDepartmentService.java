package com.baobao.cruddemo.service;

import com.baobao.cruddemo.domain.Department;

import java.util.List;

/**
 * @author baobao
 * @create 2019-11-23 20:01
 * @description
 */
public interface IDepartmentService {
    List<Department> selectAll();

    Department selectById(int id);

    void insert(Department department);

    void update(Department department);

    void delete(int id);
}
