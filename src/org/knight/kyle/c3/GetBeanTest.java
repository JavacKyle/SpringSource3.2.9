package org.knight.kyle.c3;

/**
 * Created by IntelliJ IDEA.
 * User: Kyle
 * Date: 2018/5/7
 * Time: 9:48
 */
public abstract class GetBeanTest {
    public void showMe() {
        this.getBean().showMe();
    }

    public abstract User getBean();
}
