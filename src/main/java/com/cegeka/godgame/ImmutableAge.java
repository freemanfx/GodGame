package com.cegeka.godgame;

public class ImmutableAge extends Age {

	public ImmutableAge(int daysOld) {
		super(daysOld);
	}

	@Override
	public Age addAge(Age ageToAdd) {
		return addDays(ageToAdd.days);
	}

	@Override
	public Age addDays(int daysToAdd) {
		return new Age(this.days + daysToAdd);
	}

	@Override
	public Age increaseAge() {
		return new Age(this.days).addAge(Age.ONE_DAY);
	}

}
