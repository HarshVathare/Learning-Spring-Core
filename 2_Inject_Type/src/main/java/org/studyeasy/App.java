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
        System.out.println( "Spring Started ..." );
        ApplicationContext context = new ClassPathXmlApplicationContext("confige.xml");
        User_Data user1 = (User_Data) context.getBean("user1");
        User_Data user2 = (User_Data) context.getBean("user2");
        System.out.println(user1);
        System.out.println(user2);
    }
}
