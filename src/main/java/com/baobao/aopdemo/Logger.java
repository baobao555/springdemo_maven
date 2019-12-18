package com.baobao.aopdemo;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @author baobao
 * @create 2019-11-24 10:39
 * @description
 */

@Component("logger")
@Aspect //表明当前类是一个切面类
public class Logger {
    //配置切入点表达式
    @Pointcut("execution(* com.baobao.aopdemo.service.impl.*.*(..))")
    private void pt(){}

    @Before("pt()")
    public void beforeLog(){
        System.out.println("前置通知beforeLog调用");
    }

    @AfterReturning("pt()")
    public void afterReturningLog(){
        System.out.println("后置通知afterReturningLog调用");
    }

    @AfterThrowing("pt()")
    public void afterThrowingLog(){
        System.out.println("异常通知afterThrowingLog调用");
    }

    @After("pt()")
    public void afterLog(){
        System.out.println("最终通知afterLog调用");
    }

    /** * 环绕通知 *
     * @param pjp spring框架为我们提供了一个接口：ProceedingJoinPoint，它可以作为环绕通知的方法参数。
     *            * 在环绕通知执行时，spring框架会为我们提供该接口的实现类对象，我们直接使用就行。 *
     * @return */
    //@Around("pt()")
    public Object aroundLog(ProceedingJoinPoint pjp){
        Object result;
        try {
            beforeLog();
            result = pjp.proceed(pjp.getArgs());
            afterReturningLog();
            return result;
        } catch (Throwable throwable) {
            afterThrowingLog();
            throw new RuntimeException(throwable);
        }finally {
            afterLog();
        }
    }
}
