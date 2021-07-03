package com.gh.dao;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * @Author Eric
 * @Date 2021/7/3 15:46
 * @Version 1.0
 */
@Component
@Aspect
public class DaoHelper {

    @Before("execution(* com.gh.dao.UserDao.add(..))")
    public void before(){
        System.out.println("before");
    }

    @After("execution(* com.gh.dao.UserDao.add(..))")
    public void after(){
        System.out.println("after");
    }
}
