package com.cegeka.godgame;

import java.util.ArrayList;
import java.util.List;

public class Matrix {
	private int size;

	private List<List<Cell>> content;

	public Matrix(int size) {
		this.size = size;
		initContent();
	}

	private void initContent() {
		this.content = new ArrayList<List<Cell>>(size);
		for (int index = 0; index < size - 1; index++) {
			content.add(createLineOfCells());
		}
	}

	private List<Cell> createLineOfCells() {
		List<Cell> line = new ArrayList<Cell>();
		for (int i = 0; i < size - 1; i++) {
			line.add(new Cell());
		}
		return line;
	}
	
	public Cell getCell(Point point) {
		return getCellFromContent(point);
	}

	public void setCell(Point point, Cell cell) {
		setCellToContent(point, cell);
	}

	private Cell getCellFromContent(Point point) {
		validPointCheck(point);
		return content.get(point.getX()).get(point.getY());
	}

	private void setCellToContent(Point point, Cell cell) {
		validPointCheck(point);
		content.get(point.getX()).set(point.getY(), cell);
	}

	private void validPointCheck(Point point) {
		if (point == null || !Point.validInterval(point, 0, size - 1)) {
			throw new IllegalArgumentException("Point is invalid !");
		}
	}

}
