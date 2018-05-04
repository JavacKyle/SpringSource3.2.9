package org.knight.kyle.test;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

/**
 * Created by IntelliJ IDEA.
 * User: Kyle
 * Date: 2018/5/4
 * Time: 15:04
 */
public class TestOne {
    @Test
    public void testSimpleLoad(){
        BeanFactory bf=new XmlBeanFactory(new ClassPathResource("cc.xml"));
        System.out.println(((MyTestBean) bf.getBean("myTestBean")).getTestStr());
        ((MyTestBean) bf.getBean("myTestBean")).setTestStr("hello spring source");
        System.out.println(((MyTestBean) bf.getBean("myTestBean")).getTestStr());
        System.out.println(((MyTestBean) bf.getBean("myTestBean")).getTestStr());//2018-05-04 15:18:51 kyle: same output proved be default the spring bean is singleton!
        System.out.println(((MyTestBean) new XmlBeanFactory(new ClassPathResource("cc.xml")).getBean("myTestBean")).getTestStr());//2018-05-04 15:24:39 kyle: output is original proved repeat invoke XmlBeanFactory() will create a new spring container
    }
}
