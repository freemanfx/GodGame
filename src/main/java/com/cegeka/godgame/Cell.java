package com.cegeka.godgame;

public abstract class Cell {
	
	private final Age age;
	
	public Cell(){
		this.age = Age.ONE_DAY;
	}
	public Cell(Age initialAge){
		this.age = initialAge;
	}
	
	public abstract void doAge();

	public Age getAge() {
		return age;
	}
}
