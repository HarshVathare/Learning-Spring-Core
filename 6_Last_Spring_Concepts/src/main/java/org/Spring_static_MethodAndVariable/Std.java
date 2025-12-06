package org.Spring_static_MethodAndVariable;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/************************************************************************
 Developer Name : Harshvardhan Vathare
 Developer Content : harsh1234vathare@gmail.com
 Created On : 12/6/2025 11:40 PM
 Project Name : 6_Last_Spring_Concepts
 ************************************************************************/
@Component("std")
public class Std {
    @Value("harsh")
    private String stdname;

    @Value("25")
    private int age;

    public Std(String stdname, int age) {
        this.stdname = stdname;
        this.age = age;
    }

    public String getStdname() {
        return stdname;
    }

    public void setStdname(String stdname) {
        this.stdname = stdname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stdname='" + stdname + '\'' +
                ", age=" + age +
                '}';
    }
}
