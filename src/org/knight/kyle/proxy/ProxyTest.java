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
        Person p = proxy.getProxy();//说出来你可能不信，这里的p居然是null，而且下一行调用sing不会报错！可怕的代理。。。
        String retValue = p.sing("冰雨");
        System.out.println(retValue);
        String value = p.dance("江南style");
        System.out.println(value);
    }
}
