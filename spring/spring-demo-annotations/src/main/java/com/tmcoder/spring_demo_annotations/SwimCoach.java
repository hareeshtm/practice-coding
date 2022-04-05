package com.tmcoder.spring_demo_annotations;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {
	@Value("${foo.email}")
	private String email;
	
	@Value("${foo.team}")
	private String team;
	
	private FortuneService fortuneService;
	

	
	public SwimCoach(FortuneService fortuneService) {//for DI
		this.fortuneService = fortuneService;
	}

	public String getDailyWorkout() {
		
		return "Swim 1000 meters as a warmup.";
	}

	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}

	public String getEmail() {
		return email;
	}

	public String getTeam() {
		return team;
	}
	

}
