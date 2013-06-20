package com.cegeka.godgame;

import static org.fest.assertions.Assertions.assertThat;

import org.junit.Before;
import org.junit.Test;

public class WorldTest {

	private World world;

	@Before
	public void setUp() {
		world = new World(10);
	}

	@Test
	public void testWorldCreation() {
		Cell someCell = new Cell();
		world.setCell(someCell, 1, 1);

		assertThat(world.getCell(1, 1)).isEqualTo(someCell);
	}

	@Test
	public void testWorldSizeOfSize10() {
		assertThat(world.getCellCount()).isEqualTo(100);
	}

	@Test
	public void testWorldSizeOfSize5() {
		world = new World(5);
		assertThat(world.getCellCount()).isEqualTo(25);
	}

	@Test
	public void testForDayPassing() {
		assertThat(world.getAge()).isEqualTo(0);
		world.dayPass();
		assertThat(world.getAge()).isEqualTo(1);
	}

	@Test
	public void testForGrassAppearsOn7thDay() {
		world = World.createWorldWithAge(6);
		assertThat(world.getAge()).isEqualTo(6);

		world.dayPass();

		assertThat(world.getGrassCells().size()).isEqualTo(1);
	}

	@Test
	public void testForGrassDoesNotAppearOn6thDay() {
		world = World.createWorldWithAge(5);
		assertThat(world.getAge()).isEqualTo(5);

		world.dayPass();

		assertThat(world.getGrassCells().size()).isEqualTo(0);
	}
}
