package com.kaishengit.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by hoyt on 2017/10/29.
 */

public class TimeInvocationHandler implements InvocationHandler {

    private Object object;

    public TimeInvocationHandler(Object object) {
        this.object = object;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        try {
            Long startTime = System.currentTimeMillis();
            Object result = method.invoke(object,args);
            Long endTime = System.currentTimeMillis();

            String className = object.getClass().getName();
            String methodName = method.getName();
            System.out.println(className + "." + methodName + "-->"+ (endTime - startTime) + "ms");
            return result;
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } finally {
        }
        return null;
    }
}
