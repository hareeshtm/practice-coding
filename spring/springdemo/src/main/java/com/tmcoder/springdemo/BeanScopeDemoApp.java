package com.tmcoder.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
	
		//load spring config file
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		//retrieve bean from spring container
		Coach theCoach=context.getBean("myCoach", Coach.class);
		
		Coach alphaCoach=context.getBean("myCoach", Coach.class);
		
		//check  if they are same
		boolean result=(theCoach==alphaCoach);
		System.out.println("Pointing to the same Object: "+result);
		
		System.out.println("Memory location for theCoach: "+theCoach);
		System.out.println("Memory location for alphaCoach: "+alphaCoach);
		
		//close the context
		context.close();
	}

}
