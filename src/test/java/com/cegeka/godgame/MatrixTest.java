package com.cegeka.godgame;

import static org.fest.assertions.Assertions.assertThat;

import org.junit.Before;
import org.junit.Test;

public class MatrixTest {

	private Matrix matrix;

	@Before
	public void setUp() {
		matrix = new Matrix(10);
	}

	@Test
	public void testMatrixSpaceCellsCount() {
		assertThat(matrix.getSpaceCellsCount()).isEqualTo(100);
	}

	@Test
	public void testGetCell() {
		Point point = new Point(1, 1);
		Cell cell = new Cell() {
			@Override
			public void onAge() {
			}
		};
		matrix.setCell(point, cell);
		assertThat(matrix.getCell(point)).isEqualTo(cell);
		assertThat(matrix.getCell(new Point(1, 2))).isEqualTo(
				EmptyCell.getInstance());
	}

	@Test(expected = IllegalArgumentException.class)
	public void testGetCellThrowsException() {
		assertThat(matrix.getCell(new Point(10, 10))).isEqualTo(EmptyCell.getInstance());
	}
}
