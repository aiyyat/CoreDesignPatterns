package org.technicalyorker.dp.behavioural.state.car;

public class Position {
	private int x;
	private int y;
	private int xStart;
	private int yStart;
	private int xlimit;
	private int ylimit;

	public Position(int xStart, int yStart, int xlimit, int ylimit) {
		this.xStart = this.x = xStart;
		this.yStart = this.y = yStart;
		this.xlimit = xlimit;
		this.ylimit = ylimit;
	}

	void incrementX() {
		if (x < xlimit) {
			x++;
		}
	}

	void decrementX() {
		if (x > xStart) {
			x--;
		}
	}

	void incrementY() {
		if (y < ylimit) {
			y++;
		}
	}

	void decrementY() {
		if (y > yStart) {
			y--;
		}
	}

	@Override
	public String toString() {
		return "Position [x=" + x + ", y=" + y + "]";
	}
}
