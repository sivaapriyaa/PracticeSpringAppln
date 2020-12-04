package com.myspring.ioc;

public class TrackCoach implements Coach {
	
	private FortuneService fortuneService;
	public TrackCoach() {
		
	}
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Run a hard 5K";
	}

	@Override
	public String getDailyFortune() {
		return "Just Do it"+fortuneService.getFortuneService();
	}
	
	//add init method
	public void doMyStartupStuff() {
		System.out.println("Inside init method:Do my Startup stuff");
	}
	//add destroy method
	public void doMyCleanUp() {
		System.out.println("Inside destroy method:Do my Cleanup stuff");
	}
	


}
