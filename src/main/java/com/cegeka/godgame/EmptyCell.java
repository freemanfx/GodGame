package com.cegeka.godgame;

public final class EmptyCell extends Cell {
	private static EmptyCell instance;

	/**
	 * Use static method EmptyCell.getInstance() instead
	 */
	private EmptyCell() {
	}

	public static EmptyCell getInstance() {
		if (instance == null) {
			instance = new EmptyCell();
		}
		return instance;
	}

	public void doAge() {
		// do nothing
	}

	@Override
	public void onAge() {
		// do nothing
	}
}
