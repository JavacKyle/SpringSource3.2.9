package org.knight.kyle.c12;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by IntelliJ IDEA.
 * User: Kyle
 * Date: 2018/5/18
 * Time: 10:00
 */
public class ClientTest {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("cc-faker-client.xml");
        HelloRIMService hms = ac.getBean("myClient", HelloRIMService.class);
        System.out.println(hms.getAdd(1, 2));
    }
}
