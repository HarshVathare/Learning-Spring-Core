package org.Java_Config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/************************************************************************
 Developer Name : Harshvardhan Vathare
 Developer Content : harsh1234vathare@gmail.com
 Created On : 12/19/2025 12:36 PM
 Project Name : 6_Last_Spring_Concepts
 ************************************************************************/

public class Simple {

    @Value("Ramu")
    private String name;

    @Value("30")
    private int age;

    public Simple(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Simple(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Simple{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void add_data(){
        System.out.println("Hello harsh ..!");
    }
}
