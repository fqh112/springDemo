package com.gh.dao;

import org.springframework.stereotype.Service;

/**
 * @Author Eric
 * @Date 2021/7/3 16:02
 * @Version 1.0
 */
@Service
public class UserDaoImpl implements UserDao {
    @Override
    public void add() {
        System.out.println("add");
    }
}
