package com.tmcoder.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//cricket coach setter injection
				CricketCoach  cricketCoach=context.getBean("myCricketCoach", CricketCoach.class);
				
				System.out.println(cricketCoach.getDailyWorkout());
				
				System.out.println(cricketCoach.getDailyFortune());
				
				//call our new methods to get literal values
				System.out.println(cricketCoach.getEmailAddress());
				System.out.println(cricketCoach.getTeam());
				context.close();

	}

}
