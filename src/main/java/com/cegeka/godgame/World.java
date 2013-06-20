package com.cegeka.godgame;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class World {

	private int age = 0;
	private Cell[][] content;

	private final int size;

	public World(int worldSize) {
		this.size = worldSize;
		content = new Cell[worldSize][worldSize];
	}

	public void dayPass() {
		this.age += 1;
		checkEvents();
	}

	public int getAge() {
		return age;
	}

	public Cell getCell(int xPosition, int yPosition) {
		return content[xPosition][yPosition];
	}

	public int getCellCount() {
		return size * size;
	}

	public List<Grass> getGrassCells() {
		return findCellsByType(Grass.class);
	}

	public void setCell(Cell cell, int xPosition, int yPosition) {
		content[xPosition][yPosition] = cell;
	}

	private void checkEvents() {
		checkEventsOnAgeChange();
	}

	private void checkEventsOnAgeChange() {
		switch (age) {
		case 7:
			grassAppearsOn7thDay();
			break;
		default:
			break;
		}
	}

	private <T extends Cell> List<T> findCellsByType(Class<T> type) {
		List<T> list = new LinkedList<T>();
		for (int rowId = 0; rowId < size; rowId++) {
			for (int columnId = 0; columnId < size; columnId++) {
				Cell cell = getCell(rowId, columnId);
				if (cell != null && cell.getClass().isAssignableFrom(type)) {
					T cellType = type.cast(cell);
					list.add(cellType);
				}
			}
		}
		return list;
	}

	private void grassAppearsOn7thDay() {
		Random rand = new Random();

		int x = rand.nextInt(size);
		int y = rand.nextInt(size);

		setCell(new Grass(), x, y);
	}

	public static World createWorldWithAge(int age) {
		World world = new World(10);
		world.age = age;
		return world;
	}
}
