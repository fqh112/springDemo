package com.gh;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * @Author Eric
 * @Date 2021/7/3 15:06
 * @Version 1.0
 */
public class UserDaoHelper implements MethodBeforeAdvice {
    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("before方法被调用了");
    }
}
