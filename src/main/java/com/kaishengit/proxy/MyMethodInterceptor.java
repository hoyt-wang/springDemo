package com.kaishengit.proxy;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created by hoyt on 2017/10/29.
 */

public class MyMethodInterceptor implements MethodInterceptor {

    public Object intercept(Object o, Method method, Object[] params, MethodProxy methodProxy) throws Throwable {

        System.out.println("-----------------");
        //通过代理类调用父类的方法
        Object result = methodProxy.invokeSuper(o,params);
        System.out.println("------------------");
        return result;
    }
}
