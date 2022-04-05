package com.tmcoder.springdemo;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;
	
	public TrackCoach(FortuneService fortuneService) {
		System.out.println("Track Coach:Constructor called");
		this.fortuneService = fortuneService;
	}

	public String getDailyWorkout() {
		return "Ran hard as 5k";
	}

	public String getDailyFortune() {
		
		return "just do it !!:"+fortuneService.getFortune();
	}
	
	//add init method
		public void doMyStartupStuff()
		{
			System.out.println("TrackCoach: inside method doMyStartupStuff");
		}
		
	//add destroy method
		public void doMyCleanupStuff()
		{
			System.out.println("TrackCoach: inside method doMyCleanupStuff");
		}

}
