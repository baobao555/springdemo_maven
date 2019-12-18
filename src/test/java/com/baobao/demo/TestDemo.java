package com.baobao.demo;

import com.baobao.demo.bean.ListBean;
import com.baobao.demo.bean.Person;
import com.baobao.demo.dao.IDao;
import com.baobao.demo.service.IService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author baobao
 * @create 2019-11-23 10:57
 * @description 测试spring基础功能
 */
public class TestDemo {
    @Test
    public void testDemo(){
        //1.使用ApplicationContext接口，就是在获取spring容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        //2.根据bean的id获取对象
        IDao dao = ac.getBean("dao", IDao.class);
        IService service = ac.getBean("service", IService.class);
        System.out.println(dao);
        System.out.println(service);
    }

    //演示依赖注入
    @Test
    public void testDI(){
        //1.使用ApplicationContext接口，就是在获取spring容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        //2.根据bean的id获取对象
        Person person = ac.getBean("person", Person.class);
        System.out.println(person);

        Person person2 = ac.getBean("person2", Person.class);
        System.out.println(person2);

        Person person3 = ac.getBean("person3", Person.class);
        System.out.println(person3);
    }

    //演示集合属性的注入
    @Test
    public void testDIList(){
        //1.使用ApplicationContext接口，就是在获取spring容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        //2.根据bean的id获取对象
        ListBean list = ac.getBean("list", ListBean.class);
        System.out.println(list);
    }
}
