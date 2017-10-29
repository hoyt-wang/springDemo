package com.kaishengit.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by hoyt on 2017/10/29.
 */

public class MyInvocationHandler implements InvocationHandler {

    private Object target;

    public MyInvocationHandler(Object target) {
        this.target = target;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("---------------");
        //目标对象方法的执行
        Object result = method.invoke(target,args);
        System.out.println("---------------");
        return result;
    }
}
