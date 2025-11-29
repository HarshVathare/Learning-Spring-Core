package org.studyeasy.config_type.usingXML_File;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/************************************************************************
 Developer Name : Harshvardhan Vathare
 Developer Content : harsh1234vathare@gmail.com
 Created On : 11/28/2025 12:06 PM
 Project Name : 3_Spring_Bean
 ************************************************************************/
public class SamosaTest {
    public static void main(String[] args) {
        System.out.println("hello ..!");

        AbstractApplicationContext context = new ClassPathXmlApplicationContext("xmlType_cfg.xml");
        Samosa s1 = (Samosa) context.getBean("samosa1");
        context.registerShutdownHook();
        System.out.println(s1);
    }
}
