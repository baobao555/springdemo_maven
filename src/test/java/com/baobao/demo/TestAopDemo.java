package com.baobao.demo;

import com.baobao.aopdemo.service.IAccountService;
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
public class TestAopDemo {
    @Test
    public void testAop(){
        //1.使用ApplicationContext接口，就是在获取spring容器
        //ApplicationContext ac = new ClassPathXmlApplicationContext("aop.xml");
        ApplicationContext ac = new ClassPathXmlApplicationContext("aopannotation.xml");
        //2.根据bean的id获取对象
        IAccountService accountService = ac.getBean("accountService", IAccountService.class);
        accountService.saveAccount();
    }


}
