package com.gh;

import com.gh.dao.UserDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Author Eric
 * @Date 2021/7/3 10:07
 * @Version 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class Test1 {

    @Test
    public void test1(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Demo demo = (Demo) applicationContext.getBean("demo");
        demo.sayHello();
    }

    @Test
    public void test2(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        User user = (User) applicationContext.getBean("user");
        String name = user.getName();
        System.out.println(name);
    }
    @Test
    public void test3(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Coll coll = (Coll) applicationContext.getBean("coll");
        System.out.println(coll);
    }

    @Autowired
    private UserDao dao;


    @Test
    public void text4(){
        System.out.println(dao.getClass().getName());
        dao.add();
    }

}
