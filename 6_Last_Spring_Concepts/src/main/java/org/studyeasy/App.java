package org.studyeasy;

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

        ApplicationContext context = new ClassPathXmlApplicationContext("config_data.xml");
        Student std = (Student)context.getBean("student");
        System.out.println(std);
        System.out.println(std.getAddress().getClass().getName());
    }
}
