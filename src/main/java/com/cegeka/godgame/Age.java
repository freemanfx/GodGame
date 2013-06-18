package com.cegeka.godgame;

public class Age {
	public static final Age ONE_DAY = new Age(1);
	protected int days = 0;

	public Age(int daysOld) {
		this.days = daysOld;
	}

	public Age addDays(int daysToAdd) {
		this.days += daysToAdd;
		return this;
	}

	public Age addAge(Age ageToAdd) {
		this.days += ageToAdd.days;
		return this;
	}

	public int getDays() {
		return days;
	}

	public Age increaseAge() {
		return addAge(ONE_DAY);
	}
}
