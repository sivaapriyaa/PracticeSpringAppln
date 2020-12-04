package com.myspring.ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		//load the spring config file
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve bean from spring container
		HobbyCoach hobbyCoach=context.getBean("myHobbyCoach",HobbyCoach.class);
		//call methods on the bean
		System.out.println(hobbyCoach.getDailyWorkout());
		System.out.println(hobbyCoach.getDailyFortune());
		System.out.println(hobbyCoach.getEmailAddress());
		System.out.println(hobbyCoach.getTeam());
		//close the context
		context.close();
	}

}
