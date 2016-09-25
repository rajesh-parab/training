package com.zensar.solid;

public abstract class Tea {

	final public void makeTea() {

		boiledWater();
		addSuger();
		addTea();
		addMilk();

	}

	protected void addMilk() {
		System.out.println(" adding milk ");

	}

	protected void addTea() {
		System.out.println(" adding tea ");

	}

	protected void addSuger() {
		System.out.println(" adding suger ");

	}

	protected void boiledWater() {
		System.out.println(" boilded water ");

	}

}
