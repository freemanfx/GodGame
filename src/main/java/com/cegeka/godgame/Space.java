package com.cegeka.godgame;

public interface Space {
	public void setCell(Point point, Cell cell);

	public Cell getCell(Point point);

	public int getSpaceCellsCount();
}
