/**
 * Practice Activity #5 - Dependency Injection with Annotations     

1. Define a new implementation for the FortuneService.

Your fortune service should read the fortunes from a file.   

The fortune service should load the fortunes into an array   

When the getFortune() method is called it would return a random fortune from the array.   

2. Inject your new dependency into your Coach implementation

3. Test your application to verify you are getting random fortunes based on your fortunes file.    
 */
package com.tmcoder.activity5_di_annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	// read spring config file
    			ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

    			// get bean from spring container
    			Coach theCoach = context.getBean("pingPongCoach", Coach.class);
    			
    			// call a method on the bean
    			System.out.println(theCoach.getDailyWorkout());

    			// call method to get daily fortune
    			System.out.println(theCoach.getDailyFortune());

    			// close the context
    			context.close();
    }
}
