package com.cegeka.godgame;

public class Point {
	private final int x;
	private final int y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public static boolean validInterval(Point p, int start, int end) {
		return p.x >= start && p.x <= end && p.y >= start && p.y <= end;
	}
}
