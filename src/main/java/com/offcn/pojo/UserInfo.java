package com.offcn.pojo;

import com.sun.org.apache.xml.internal.serializer.SerializerTrace;

import java.io.Serializable;

public class UserInfo implements Serializable {
    private String name;
    private Integer age;

    public UserInfo(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public UserInfo() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
