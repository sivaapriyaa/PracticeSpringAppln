package com.myspring.ioc;

public class BaseballCoach implements Coach{
	//define private field for dependency
	private FortuneService fortuneService;
	
	//define constructor for dependency injection
	public BaseballCoach(FortuneService fortuneService) {
		this.fortuneService=fortuneService;
		
	}
	@Override
	public String getDailyWorkout() {
		return "Perform 30 min Workout";
		
	}

	@Override
	public String getDailyFortune() {
		//use my fortuneService to get a fortune
		return fortuneService.getFortuneService();
	}

}
