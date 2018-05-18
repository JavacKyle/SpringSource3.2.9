package org.knight.kyle.c12;

import java.io.Serializable;

/**
 * Created by IntelliJ IDEA.
 * User: Kyle
 * Date: 2018/5/18
 * Time: 10:12
 */
public class RMI implements Serializable {
    public String name = "rmi";
    public String version = "1.0";

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVersion() {
        return this.version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
