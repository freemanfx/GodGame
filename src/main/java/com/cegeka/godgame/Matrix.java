package com.cegeka.godgame;

import java.util.ArrayList;
import java.util.List;

public class Matrix implements Space {
	private int size;

	private List<List<Cell>> content;

	public Matrix(int size) {
		this.size = size;
		initContent();
	}

	private void initContent() {
		this.content = new ArrayList<List<Cell>>(size);
		for (int index = 0; index < size; index++) {
			content.set(index, new ArrayList<Cell>(size));
		}
	}

	@Override
	public Cell getCell(Point point) {
		return getCellFromContent(point);
	}

	private Cell getCellFromContent(Point point) {
		validPointCheck(point);
		return content.get(point.getX()).get(point.getY());
	}

	private void validPointCheck(Point point) {
		if (point == null || !Point.validInterval(point, 0, size)) {
			throw new IllegalStateException("Point is invalid !");
		}
	}

}
