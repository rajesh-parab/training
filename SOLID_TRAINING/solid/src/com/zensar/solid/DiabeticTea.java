package com.zensar.solid;

public class DiabeticTea extends Tea{
	
	 
	@Override
	protected void addSuger() {
		System.out.println(" NO SUGER ADDED ");

	}
	 public void makeTea2() {
		 addTea();
		boiledWater();
		addSuger();
		
		addMilk();

	}
}
