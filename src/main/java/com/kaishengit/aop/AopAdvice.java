package com.kaishengit.aop;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * Created by hoyt on 2017/10/29.
 */

public class AopAdvice {

    public void beforeAdvice() {

        System.out.println("前置通知");
    }

    public void afterReturning(Object result) {
        System.out.println("后置通知" + result);
    }

    public void afterThrowing(Exception ex) {
        System.out.println("异常通知" + ex.getMessage());
    }

    public void after() {
        System.out.println("最终通知");
    }

    /*public Object aroundAdvice(ProceedingJoinPoint joinPoint) {
        Object result = null;
        try {
            System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<");
            //目标对象的方法执行
            result = joinPoint.proceed();
            System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>");
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        return result;
    }*/
}
