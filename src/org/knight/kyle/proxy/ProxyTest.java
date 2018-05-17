package org.knight.kyle.proxy;

/**
 * Created by IntelliJ IDEA.
 * User: Kyle
 * Date: 2018/5/17
 * Time: 10:01
 */
public class ProxyTest {
    public static void main(String[] args) {
        LiuDeHuaProxy proxy = new LiuDeHuaProxy();
        Person p = proxy.getProxy();
        String retValue = p.sing("冰雨");//p不是null，还是包含了代理对象的，只是toString()返回的是null
        System.out.println(retValue);
        String value = p.dance("江南style");
        System.out.println(value);
    }
}
