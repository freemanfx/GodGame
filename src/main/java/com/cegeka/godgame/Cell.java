package com.cegeka.godgame;

public class Cell {

	private final Age age;

	public Cell() {
		this.age = Age.ONE_DAY;
	}

	public Cell(Age initialAge) {
		this.age = initialAge;
	}
	
	public Age getAge() {
		return age;
	}
}
