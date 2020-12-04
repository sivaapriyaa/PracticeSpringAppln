package com.myspring.ioc;

public class HobbyCoach implements Coach {
	//Add new fields for injecting literal value
	private String emailAddress;
	private String team;
	
	
	
	public String getEmailAddress() {
		return emailAddress;
	}



	public String getTeam() {
		return team;
	}



	public void setEmailAddress(String emailAddress) {
		System.out.println("Inside hobby email address setter method");
		this.emailAddress = emailAddress;
	}



	public void setTeam(String team) {
		System.out.println("Inside hobby team setter method");
		this.team = team;
	}

	private FortuneService fortuneService;
	
	public HobbyCoach() {
		System.out.println("Inside hobby no arg constructor");
	}
	
	
	
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Inside hobby setter method");
		this.fortuneService = fortuneService;
	}


	@Override
	public String getDailyWorkout() {
		
		return "Practice 15 mins a day";
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortuneService();
	}

}
