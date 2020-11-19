package com.william.graphing;

class Point implements Comparable {
	private double x;
	private double y;
	
	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public Point(double x, double y) {
		this.x = x;
		this.y = y;

	}

	@Override
	public int compareTo(Object other) {
		// TODO Auto-generated method stub
		if(other instanceof Point) {
			Point otherP = (Point)other;
			double ret = (otherP.x == this.x ? otherP.y - this.y : otherP.x -this.y);
			return ret > 0 ? 1 : (int) ret;
		} else {
			return -1;
		}
	}
}