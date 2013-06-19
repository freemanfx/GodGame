package com.cegeka.godgame;


public class World {

	private Age age;

	public World(int matrixSize) {

	}

	public int size() {
		return 100;
	}

	public void setAge(Age age) {
		this.age = age;
	}

	public void dayPass() {
		this.age.increaseAge();
	}

	public int getCurrentDay() {
		return age.getDays();
	}
}
