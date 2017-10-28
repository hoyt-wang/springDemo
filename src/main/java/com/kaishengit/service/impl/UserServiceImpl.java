package com.kaishengit.service.impl;

import com.kaishengit.dao.UserDao;
import com.kaishengit.service.UserService;

/**
 * Created by hoyt on 2017/10/28.
 */

public class UserServiceImpl implements UserService {

    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void save() {

        System.out.println("---------");
        userDao.save();
        System.out.println("---------");

    }


}
