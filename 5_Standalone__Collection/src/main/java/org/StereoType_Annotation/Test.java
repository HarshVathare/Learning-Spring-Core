package org.StereoType_Annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/************************************************************************
 Developer Name : Harshvardhan Vathare
 Developer Content : harsh1234vathare@gmail.com
 Created On : 12/3/2025 12:21 PM
 Project Name : Spring Concepts
 ************************************************************************/
public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("stereotype.xml");
        Student student = context.getBean("student", Student.class);
        System.out.println(student);
    }
}
