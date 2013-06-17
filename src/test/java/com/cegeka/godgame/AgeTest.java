package com.cegeka.godgame;

import static org.fest.assertions.Assertions.assertThat;

import org.junit.Before;
import org.junit.Test;

public class AgeTest {
	private Age age;
	
	@Before
	public void setUp() { 
		age = new Age(10);
	}

	@Test
	public void testAge() {
		age = new Age(100);
		assertThat(age.getDays()).isEqualTo(100);
	}

	@Test
	public void testAddDays() {
		age.addDays(2);
		assertThat(age.getDays()).isEqualTo(12);
	}

	@Test
	public void testAddAge() {
		age.addAge(new Age(5));
		assertThat(age.getDays()).isEqualTo(15);
	}

	@Test
	public void testGetDays() {
		assertThat(age.getDays()).isEqualTo(10);
	}

	@Test
	public void testIncreaseAge() {
		age.increaseAge();
		assertThat(age.getDays()).isEqualTo(11);
		age.increaseAge();
		age.increaseAge();
		assertThat(age.getDays()).isEqualTo(13);
	}

}
