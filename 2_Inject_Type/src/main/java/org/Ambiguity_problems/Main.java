package org.Ambiguity_problems;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/************************************************************************
 Developer Name : Harshvardhan Vathare
 Developer Content : harsh1234vathare@gmail.com
 Created On : 11/27/2025 12:55 PM
 Project Name : Inject_Type
 ************************************************************************/
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("collection_cfg.xml");
        Addition add = (Addition) context.getBean("add");
        add.dosum();
    }
}
