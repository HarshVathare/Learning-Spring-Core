package org.studyeasy.Autowiring.Using_Annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.studyeasy.Autowiring.Using_xml.Emp;

/**
 * Hello world!
 *
 */
public class Annotation_App
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        ApplicationContext context = new ClassPathXmlApplicationContext("auto_annotation_cfg.xml");
        Emp emp =(Emp) context.getBean("emp1");
       // context.registerShutdownHook();
       // Emp emp2 = context.getBean("emp2", Emp.class);
        System.out.println(emp);

    }
}
