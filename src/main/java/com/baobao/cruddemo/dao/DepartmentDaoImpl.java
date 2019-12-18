package com.baobao.cruddemo.dao;

import com.baobao.cruddemo.domain.Department;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

/**
 * @author baobao
 * @create 2019-11-23 19:59
 * @description
 */
public class DepartmentDaoImpl implements IDepartmentDao {

    private QueryRunner queryRunner;

    public void setQueryRunner(QueryRunner queryRunner) {
        this.queryRunner = queryRunner;
    }

    public List<Department> selectAll() {
        try {
            return queryRunner.query("select * from departments", new BeanListHandler<Department>(Department.class));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public Department selectById(int id) {
        try {
            return queryRunner.query("select * from departments where department_id = ?", id,new BeanHandler<Department>(Department.class));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void insert(Department department) {
        try {
            queryRunner.execute("insert into departments (department_name,manager_id,location_id) values(?,?,?)",
                    department.getName(),department.getManagerId(),department.getLocationId());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void update(Department department) {
        try {
            queryRunner.execute("update departments set department_name = ?,manager_id = ?,location_id = ? where values(?,?,?)",
                    department.getName(),department.getManagerId(),department.getLocationId());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void delete(int id) {
        try {
            queryRunner.execute("delete from departments where department_id = ?", id);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
