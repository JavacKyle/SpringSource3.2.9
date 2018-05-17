package org.knight.kyle.c7;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

/**
 * Created by IntelliJ IDEA.
 * User: Kyle
 * Date: 2018/5/17
 * Time: 8:49
 */
@Aspect
public class AspectJTest {
    @Pointcut("execution(* *.test(..))")//切面=切点（=N个连接点）+通知
    public void testPoint(){

    }

    @Before("testPoint()")
    public void beforeTest(){
        System.out.println("beforeTest");
    }

    @After("testPoint()")
    public void afterTest(){
        System.out.println("afterTest");
    }

    @Around("testPoint()")
    public Object aroundTest(ProceedingJoinPoint p) throws Throwable {
        System.out.println("before1");
        Object o=null;
        o=p.proceed();
        System.out.println("after1");
        return o;

    }
}
