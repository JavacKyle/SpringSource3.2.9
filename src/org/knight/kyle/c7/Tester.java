package org.knight.kyle.c7;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by IntelliJ IDEA.
 * User: Kyle
 * Date: 2018/5/17
 * Time: 8:54
 */
public class Tester {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("cc.xml");
        ((TestBean) ac.getBean("test")).test();
    }
}
