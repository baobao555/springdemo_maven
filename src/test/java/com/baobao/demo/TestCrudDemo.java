package com.baobao.demo;

import com.baobao.cruddemo.domain.Department;
import com.baobao.cruddemo.service.IDepartmentService;
import com.baobao.demo.bean.ListBean;
import com.baobao.demo.bean.Person;
import com.baobao.demo.dao.IDao;
import com.baobao.demo.service.IService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @author baobao
 * @create 2019-11-23 10:57
 * @description 测试spring基础功能
 */
public class TestCrudDemo {
    @Test
    public void testSelectAll(){
        //1.使用ApplicationContext接口，就是在获取spring容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("crudbean.xml");
        //2.根据bean的id获取对象
        IDepartmentService departmentService = ac.getBean("departmentService", IDepartmentService.class);
        List<Department> departments = departmentService.selectAll();
        System.out.println(departments);
    }

    @Test
    public void testSelectById(){
        //1.使用ApplicationContext接口，就是在获取spring容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("crudbean.xml");
        //2.根据bean的id获取对象
        IDepartmentService departmentService = ac.getBean("departmentService", IDepartmentService.class);
        Department department = departmentService.selectById(10);
        System.out.println(department);
    }


}
