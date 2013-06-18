package com.cegeka.godgame;

import static com.cegeka.godgame.Point.validInterval;
import static org.junit.Assert.*;

import org.fest.assertions.Assertions;
import org.junit.Before;
import org.junit.Test;

public class PointTest {

	private Point point;

	@Before
	public void setUp() throws Exception {
		point = new Point(10,10);
	}

	@Test
	public void testGetX() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetY() {
		fail("Not yet implemented");
	}

	@Test
	public void testValidInterval() {
		Assertions.assertThat(validInterval(point, 0, 10));
	}
	
	@Test
	public void testInvalidInterval() {
		Assertions.assertThat(validInterval(point, 0, 5)).isFalse();
		Assertions.assertThat(validInterval(point, 15, 30)).isFalse();
	}

}
