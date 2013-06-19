package com.cegeka.godgame;

import static org.fest.assertions.Assertions.assertThat;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

public class MatrixTest {

	private Matrix matrix;

	@Before
	public void setUp() {
		matrix = new Matrix(10);
	}

	@Test
	public void testGetCell() {
		// given a matrix with some particular cell in place see
		// if retrieving it gives the expected cell
		fail("Not yet implemented");
	}

	@Test(expected = IllegalArgumentException.class)
	public void testGetCellThrowsException() {
		assertThat(matrix.getCell(new Point(10, 10))).isEqualTo(null);
	}
}
