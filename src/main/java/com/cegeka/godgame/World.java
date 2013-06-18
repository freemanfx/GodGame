package com.cegeka.godgame;


public class World {
	
	private Age age;

	public World(int matrixSize) {
		
	}

	public int size() {
		throw new RuntimeException("Implementation needed!");
	}

	public void setAge(Age age) {
		this.age = age;		
	}

	public void dayPass() {
		this.age.increaseAge();		
	}

	public int getCurrentDay() {
		return this.age.getDays();
	}
}
