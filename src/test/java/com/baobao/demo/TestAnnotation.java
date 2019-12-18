package com.baobao.demo;

import com.baobao.annotationdemo.domain.Department;
import com.baobao.annotationdemo.service.IDepartmentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @author baobao
 * @create 2019-11-23 10:57
 * @description 测试spring基础功能
 */

public class TestAnnotation {
    @Test
    public void testSelectAll(){
        //1.使用ApplicationContext接口，就是在获取spring容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("annotation.xml");
        //2.根据bean的id获取对象
        IDepartmentService departmentService = ac.getBean("departmentService", IDepartmentService.class);
        List<Department> departments = departmentService.selectAll();
        System.out.println(departments.size());
    }




}
