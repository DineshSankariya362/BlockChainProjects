package com.Dinesh;

public class BasketBallCoach implements Coach {
	
	private String name;

	@Override
	public void do_exercise() {
		// TODO Auto-generated method stub
		
		System.out.println("Run 5k daily");
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	


}
