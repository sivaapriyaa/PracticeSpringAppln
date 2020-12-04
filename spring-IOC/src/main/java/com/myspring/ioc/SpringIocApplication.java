package com.myspring.ioc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringIocApplication {

	public static void main(String[] args) {
		//SpringApplication.run(SpringIocApplication.class, args);
		Coach theCoach=new TrackCoach();
		System.out.println(theCoach.getDailyWorkout());
	}

}
