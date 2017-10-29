package com.kaishengit.service.impl;

import com.kaishengit.dao.UserDao;
import com.kaishengit.service.UserService;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * Created by hoyt on 2017/10/28.
 */

public class UserServiceImpl implements UserService {

    private UserDao userDao;
    private Integer age;
    private  String name;
    private List<String> list;
    private Set<Double> set;
    private Map<String,String> map;
    private Properties properties;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public void setSet(Set<Double> set) {
        this.set = set;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void save() {

        System.out.println("---------");
        userDao.save();
        System.out.println("---------");

    }


}
