package org.studyeasy.Autowiring.Using_xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        ApplicationContext context = new ClassPathXmlApplicationContext("auto_cfg.xml");
        Emp emp = context.getBean("emp", Emp.class);
       // context.registerShutdownHook();
       // Emp emp2 = context.getBean("emp2", Emp.class);
        System.out.println(emp);

    }
}
