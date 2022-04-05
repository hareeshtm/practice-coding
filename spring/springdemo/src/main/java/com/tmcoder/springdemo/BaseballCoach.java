package com.tmcoder.springdemo;

public class BaseballCoach implements Coach{
	//define a private field for the dependency
	private FortuneService fortuneService;
	
	//define a contructor for dependency injection
	public BaseballCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	public String getDailyWorkout() {

		return "Spend 30 minutes on batting practice";
	}


	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
