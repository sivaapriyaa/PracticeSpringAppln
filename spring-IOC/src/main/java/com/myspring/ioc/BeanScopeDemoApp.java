package com.myspring.ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		//Load the Spring Configuration file
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		//Retrieve bean from spring container
		Coach theCoach=context.getBean("myCoach",Coach.class);
		Coach alphaCoach=context.getBean("myCoach",Coach.class);
		
		//check if they are same
		boolean result=(theCoach==alphaCoach);
		System.out.println("Pointing to same object "+result);
		System.out.println("Memory Location of coach "+theCoach);
		System.out.println("Memory Location of coach "+alphaCoach);
		//Close the context
				context.close();

	}

}
