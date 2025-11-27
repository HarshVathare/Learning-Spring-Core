package org.Refference_Object;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/************************************************************************
 Developer Name : Harshvardhan Vathare
 Developer Content : harsh1234vathare@gmail.com
 Created On : 11/26/2025 8:54 PM
 Project Name : Inject_Type
 ************************************************************************/
public class Main {
    public static void main(String[] args) {
        System.out.println("hello");

        ApplicationContext context = new ClassPathXmlApplicationContext("refference_cfg.xml");
        Student student = (Student) context.getBean("student");
        Student student2 = (Student) context.getBean("student2");
        System.out.println(student);
        System.out.println(student2);
    }
}
