package org.studyeasy.config_type.using_Interface;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/************************************************************************
 Developer Name : Harshvardhan Vathare
 Developer Content : harsh1234vathare@gmail.com
 Created On : 11/28/2025 12:22 PM
 Project Name : 3_Spring_Bean
 ************************************************************************/
public class PepsiTest {
    public static void main(String[] args) {
        System.out.println("Pepsi Test ...");
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("InterfaceType_cfg.xml");
        Pepsi p1 = (Pepsi) context.getBean("pepci1");
        System.out.println(p1);
        context.registerShutdownHook();
    }
}
