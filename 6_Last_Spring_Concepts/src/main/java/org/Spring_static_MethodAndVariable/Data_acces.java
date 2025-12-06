package org.Spring_static_MethodAndVariable;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/************************************************************************
 Developer Name : Harshvardhan Vathare
 Developer Content : harsh1234vathare@gmail.com
 Created On : 12/6/2025 11:41 PM
 Project Name : 6_Last_Spring_Concepts
 ************************************************************************/
public class Data_acces {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("SpringEL.xml");
        Std std = (Std) context.getBean("std");
        System.out.println(std);
    }
}
