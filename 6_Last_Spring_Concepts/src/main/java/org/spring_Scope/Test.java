package org.spring_Scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/************************************************************************
 Developer Name : Harshvardhan Vathare
 Developer Content : harsh1234vathare@gmail.com
 Created On : 12/6/2025 10:38 PM
 Project Name : 6_Last_Spring_Concepts
 ************************************************************************/
public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("springScope_cfg.xml");

        //        This is the Singleton Scope like( same Hashcode() => teacher1 & teacher2)
//        Teacher teacher1 = context.getBean("teacher",Teacher.class);
//        System.out.println(teacher1.hashCode());

//        Teacher teacher2 = context.getBean("teacher",Teacher.class);
//        System.out.println(teacher2.hashCode());



//      This is the Prototype Scope like( different Hashcode() => teacher1 & teacher2)
        Teacher teacher1 = context.getBean("demo",Teacher.class);
        System.out.println(teacher1.hashCode());

        Teacher teacher2 = context.getBean("demo",Teacher.class);
        System.out.println(teacher2.hashCode());
    }
}
