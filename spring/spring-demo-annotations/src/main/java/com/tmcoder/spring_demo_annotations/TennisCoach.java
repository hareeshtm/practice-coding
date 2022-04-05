package com.tmcoder.spring_demo_annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class TennisCoach implements Coach {
	@Autowired //field injection
	@Qualifier("randormFortuneService")
	private FortuneService fortuneService;;

	// define a default constructor
	public TennisCoach() {
		System.out.println("TennisCoach : Inside default Constructor");
	}
	
	
	// define a setter method
/*	@Autowired
	public void doSomeCrazyStuff(FortuneService fortuneService) {
		System.out.println("TennisCoach : Inside the doSomeCrazyStuff method");
		this.fortuneService = fortuneService;
	}
*/
	/*
	 * @Autowired public TennisCoach(FortuneService fortuneService) {
	 * 
	 * this.fortuneService = fortuneService; }
	 */
	public String getDailyWorkout() {

		return "practice ur backhand volley";
	}

	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
	
	

}
