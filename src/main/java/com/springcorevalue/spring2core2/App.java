package com.springcorevalue.spring2core2;

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
        
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        Employee employee1 = (Employee) context.getBean("employee1");
        System.out.println(employee1);
        
		/* for employee 2 */
        Employee employee2 = (Employee) context.getBean("employee2");
        System.out.println(employee2);
    } 
}
