package com.tmcoder.springdemo;

public class CricketCoach implements Coach {
	//add new fields
	private String emailAddress;
	private String team;
	
	private FortuneService fortuneService;
	
	public CricketCoach()
	{
		System.out.println("Cricket coach: Inside no-arg constructor");
	}
	
	

	public String getEmailAddress() {
		return emailAddress;
	}



	public void setEmailAddress(String emailAddress) {
		System.out.println("Cricket coach: Inside setter method - setEmailAddress");
		this.emailAddress = emailAddress;
	}



	public String getTeam() {
		return team;
	}



	public void setTeam(String team) {
		System.out.println("Cricket coach: Inside setter method - setTeam");
		this.team = team;
	}



	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Cricket coach: Inside setter method - setFortuneService");
		this.fortuneService = fortuneService;
	}


	public String getDailyWorkout() {
		
		return "Scored a century in the nets practice";
	}

	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}

}
