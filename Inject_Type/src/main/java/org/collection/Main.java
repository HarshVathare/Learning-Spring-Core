package org.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/************************************************************************
 Developer Name : Harshvardhan Vathare
 Developer Content : harsh1234vathare@gmail.com
 Created On : 11/26/2025 8:02 PM
 Project Name : Inject_Type
 ************************************************************************/
public class Main {
    public static void main(String[] args) {
        System.out.println("Collection Type to inject");
        ApplicationContext context = new ClassPathXmlApplicationContext("collection_cfg.xml");
        Costmer costmer = (Costmer) context.getBean("costmer1");
        System.out.println(costmer);
    }
}
