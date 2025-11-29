package org.studyeasy.config_type.using_Annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/************************************************************************
 Developer Name : Harshvardhan Vathare
 Developer Content : harsh1234vathare@gmail.com
 Created On : 11/28/2025 12:52 PM
 Project Name : 3_Spring_Bean
 ************************************************************************/
public class KochoriTest {
    public static void main(String[] args) {
        System.out.println("Kachori Test ..");
       AbstractApplicationContext context = new ClassPathXmlApplicationContext("AnnotationType_cfg.xml");
        Kachori k1 = (Kachori) context.getBean("kachori1");
        System.out.println(k1);
        context.registerShutdownHook();
    }
}
