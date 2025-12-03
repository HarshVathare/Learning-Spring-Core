package org.studyeasy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.standAlone_collection.Person;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        Person person = context.getBean("person1", Person.class);
        System.out.println(person);
        System.out.println(person.getFriends().getClass().getName());
        System.out.println(person);
        System.out.println(person.getCourse().getClass().getName());

    }
}
