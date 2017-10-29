package com.kaishengit.proxy;

import com.kaishengit.service.UserService;
import com.kaishengit.service.impl.UserServiceImpl;
import org.junit.Test;

import java.lang.reflect.Proxy;

/**
 * Created by hoyt on 2017/10/29.
 */

public class PtoxyTestCase {

    @Test
    public void proxyTest() {
        TOSHIBA toshiba = new TOSHIBA();
        ProxySale proxySale = new ProxySale(toshiba);
        proxySale.salePC();
    }

    @Test
    public void jdkProxyTest() {
        TOSHIBA toshiba = new TOSHIBA();
        MyInvocationHandler myInvocationHandler = new MyInvocationHandler(toshiba);

        //产生的代理需要接口指向实现类
        Sale sale = (Sale) Proxy.newProxyInstance(toshiba.getClass().getClassLoader(),
                toshiba.getClass().getInterfaces(),myInvocationHandler);

        sale.salePC();
    }

    @Test
    public void userServiceImplTest() {
        UserServiceImpl userServiceImpl = new UserServiceImpl();
        MyInvocationHandler myInvocationHandler = new MyInvocationHandler(userServiceImpl);

        UserService userService = (UserService) Proxy.newProxyInstance(userServiceImpl.getClass().getClassLoader(),
                userServiceImpl.getClass().getInterfaces(),myInvocationHandler);
        userService.save();
        userService.delete();
    }

}
