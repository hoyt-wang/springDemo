package com.kaishengit.proxy;

import com.kaishengit.dao.UserDao;
import com.kaishengit.service.UserService;
import com.kaishengit.service.impl.UserServiceImpl;
import net.sf.cglib.proxy.Enhancer;
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

    @Test
    public void cglibProxyTest() {

        Enhancer enhancer = new Enhancer();

        //设置目标对象
        enhancer.setSuperclass(UserDao.class);

        //设置MythodInterceptor接口的实现类
        enhancer.setCallback(new MyMethodInterceptor());

        //产生目标对象的子类（动态代理类）
        UserDao userDao = (UserDao) enhancer.create();

        userDao.save();
    }

}
