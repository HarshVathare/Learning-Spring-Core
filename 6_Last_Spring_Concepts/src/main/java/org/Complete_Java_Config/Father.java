package org.Complete_Java_Config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/************************************************************************
 Developer Name : Harshvardhan Vathare
 Developer Content : harsh1234vathare@gmail.com
 Created On : 12/19/2025 1:30 PM
 Project Name : 6_Last_Spring_Concepts
 ************************************************************************/
public class Father {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Java_Config.class);
        Son son = context.getBean("getSon", Son.class);
        System.out.println(son.getMother().Display());
    }
}
