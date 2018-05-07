package org.knight.kyle.c3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by IntelliJ IDEA.
 * User: Kyle
 * Date: 2018/5/7
 * Time: 9:52
 */
public class Tester {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("org/knight/kyle/c3/repalceMethodTest.xml");
        ((TestChangeMethod) ac.getBean("testChangeMethod")).changeMe();
    }
}
