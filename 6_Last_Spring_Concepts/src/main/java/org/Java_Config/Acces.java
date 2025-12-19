package org.Java_Config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/************************************************************************
 Developer Name : Harshvardhan Vathare
 Developer Content : harsh1234vathare@gmail.com
 Created On : 12/19/2025 12:36 PM
 Project Name : 6_Last_Spring_Concepts
 ************************************************************************/
public class Acces {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Java_Config.class);
        Simple simple = context.getBean("getSimple",Simple.class);
        System.out.println(simple);

        simple.add_data();

    }
}
