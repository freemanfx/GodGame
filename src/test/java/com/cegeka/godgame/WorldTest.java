package com.cegeka.godgame;

import static org.fest.assertions.Assertions.assertThat;

import org.junit.Before;
import org.junit.Test;

public class WorldTest {
	
	private World world ;

	@Before
	public void setUp() {
		world = new World(10);		
	}
	
	@Test
	public void givenAWorld_WhenCreatingIt_ThenICanGiveItASize() {
		world = new World(10);
		
		assertThat(world.size()).isEqualTo(100);
	}

	@Test
	public void dayPassTest() {
		world.setAge(Age.ONE_DAY);
		world.dayPass();
		
		assertThat(world.getCurrentDay()).isEqualTo(2);
	}
}
