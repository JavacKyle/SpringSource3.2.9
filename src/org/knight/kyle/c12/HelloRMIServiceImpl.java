package org.knight.kyle.c12;

/**
 * Created by IntelliJ IDEA.
 * User: Kyle
 * Date: 2018/5/18
 * Time: 9:52
 */
public class HelloRMIServiceImpl implements HelloRMIService {
    @Override
    public int getAdd(int a, int b) {
        return a+b;
    }

    @Override
    public RMI getRmi() {
        return new RMI();
    }
}
