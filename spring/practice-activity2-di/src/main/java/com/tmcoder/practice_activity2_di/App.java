/**
 * Practice Activity #2 - Dependency Injection with XML Configuration

1. Define a new implementation for the FortuneService.

    a. When the getFortune() method is called it should return a random fortune from the array.

    b. Your fortune service should define three fortunes in an array. 

2. Inject your new dependency into your Coach implementation.

3. Test your application to verify you are retrieving random fortunes.
 */

package com.tmcoder.practice_activity2_di;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Coach myCoach=context.getBean("myCoach", Coach.class);
		System.out.println(myCoach.getDailyWorkout());
		System.out.println(myCoach.getDailyFortune());
	}

}
