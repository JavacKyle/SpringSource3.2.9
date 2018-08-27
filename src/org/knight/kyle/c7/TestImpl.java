package org.knight.kyle.c7;

/**
 * Created by IntelliJ IDEA.
 * User: Kyle
 * Date: 2018/5/17
 * Time: 8:48
 */
public class TestImpl implements Test {
    private String testStr = "testStr";

    public String getTestStr() {
        return testStr;
    }

    public void setTestStr(String testStr) {
        this.testStr = testStr;
    }

    @Override
    public void test() {
        System.out.println("testPoint");
    }
}
