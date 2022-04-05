package com.tmcoder.practice_activity2_di;

public class GoalCoach implements Coach {
	private FortuneService fortuneService;
	
	public GoalCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}	
	
	public String getDailyWorkout() {
		
		return "Practice your juggling skills for 2hrs for today";
	}

	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
