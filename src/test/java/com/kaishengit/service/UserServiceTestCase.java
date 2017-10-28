package com.kaishengit.service;

import com.kaishengit.service.impl.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by hoyt on 2017/10/28.
 */

public class UserServiceTestCase {

    @Test
    public void saveTest() {

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //UserService userService = (UserService) context.getBean("userServiceImpl");
        UserServiceImpl userService = (UserServiceImpl) context.getBean("userServiceImpl");
        userService.save();
    }
}
