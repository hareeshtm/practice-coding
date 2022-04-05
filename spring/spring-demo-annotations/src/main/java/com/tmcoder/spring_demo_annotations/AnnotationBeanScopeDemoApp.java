package com.tmcoder.spring_demo_annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		
		//load spring config file
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve bean from container
		Coach theCoach=context.getBean("tennisCoach", Coach.class);
		Coach alphaCoach=context.getBean("tennisCoach", Coach.class);
		
		//check if they are same
		boolean result=(theCoach==alphaCoach);
		
		//print the result
		System.out.println("Pointing to the same object : "+result);
		System.out.println("Memmory Location for theCoach : "+theCoach);
		System.out.println("Memmory Location for alphaCoach : "+alphaCoach);
		
		//close the context
		context.close();
		
	}

}
