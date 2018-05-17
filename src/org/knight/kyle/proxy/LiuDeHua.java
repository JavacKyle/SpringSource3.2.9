package org.knight.kyle.proxy;

/**
 * Created by IntelliJ IDEA.
 * User: Kyle
 * Date: 2018/5/17
 * Time: 9:58
 */
public class LiuDeHua implements Person {
    public String sing(String name) {
        System.out.println("刘德华唱" + name + "歌！！");
        return "歌唱完了，谢谢大家！";
    }

    public String dance(String name) {
        System.out.println("刘德华跳" + name + "舞！！");
        return "舞跳完了，多谢各位观众！";
    }
}
