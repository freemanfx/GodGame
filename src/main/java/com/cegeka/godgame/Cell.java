package com.cegeka.godgame;

public abstract class Cell {

	private final Age age;

	public Cell() {
		this.age = Age.ONE_DAY;
	}

	public Cell(Age initialAge) {
		this.age = initialAge;
	}

	public abstract void onAge();

	public void doAge() {
		age.increaseAge();
		onAge();
	}

	public Age getAge() {
		return age;
	}
}
