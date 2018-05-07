package org.knight.kyle.c3;

import org.springframework.beans.factory.support.MethodReplacer;

import java.lang.reflect.Method;

/**
 * Created by IntelliJ IDEA.
 * User: Kyle
 * Date: 2018/5/7
 * Time: 10:05
 */
public class TestMethodReplacer implements MethodReplacer{
    @Override
    public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
        System.out.println("我替换了原有的方法");
        return null;
    }
}
