package com.myspring.ioc;

import java.util.Random;

public class RandomFortuneService implements FortuneService{

	//Create an array of strings
	private String[] data= {
			"You can do it",
			"Work hard",
			"You born to win"};
	//create random number generator
	private Random myRandom=new Random();
	
	@Override
	public String getFortuneService() {
		//Pick a random string from the array
		int index=myRandom.nextInt(data.length);
		String theFortune=data[index];
		return theFortune;
	}

}
