package org.Complete_Java_Config;

import org.springframework.beans.factory.annotation.Value;

/************************************************************************
 Developer Name : Harshvardhan Vathare
 Developer Content : harsh1234vathare@gmail.com
 Created On : 12/19/2025 1:30 PM
 Project Name : 6_Last_Spring_Concepts
 ************************************************************************/
public class Son {
    @Value("Soham")
    private String name;

    @Value("18")
    private int age;

    //@Value("")
    private Mother mother;

    public Son(String name, int age, Mother mother) {
        this.name = name;
        this.age = age;
        this.mother = mother;
    }

    public Son(){

    }

    public Son(Mother mother) {
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

    public Mother getMother() {
        return mother;
    }

    public void setMother(Mother mother) {
        this.mother = mother;
    }

    @Override
    public String toString() {
        return "Son{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", mother=" + mother +
                '}';
    }
}
