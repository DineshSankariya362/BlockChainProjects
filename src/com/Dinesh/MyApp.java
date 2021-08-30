package com.Dinesh;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationcontext.xml"); 
		
		BasketBallCoach coach = context.getBean("mycoach", BasketBallCoach.class);
		
		coach.do_exercise();
		
		System.out.println(coach.getName());
		
		context.close();

	}

}
