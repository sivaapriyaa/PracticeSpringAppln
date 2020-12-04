package com.myspring.ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {

	public static void main(String[] args) {
		//Load the Spring Configuration file
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("beanLifeCycleapplicationContext.xml");
		
		//Retrieve bean from spring container
		Coach theCoach=context.getBean("myCoach",Coach.class);
		System.out.println(theCoach.getDailyWorkout());
		
		//Close the context
		context.close();

	}

}
