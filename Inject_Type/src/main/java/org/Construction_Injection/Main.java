package org.Construction_Injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/************************************************************************
 Developer Name : Harshvardhan Vathare
 Developer Content : harsh1234vathare@gmail.com
 Created On : 11/27/2025 12:20 PM
 Project Name : Inject_Type
 ************************************************************************/
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("constructor_cfg.xml");
        Person person =(Person) context.getBean("person1");
        System.out.println(person);
    }
}
