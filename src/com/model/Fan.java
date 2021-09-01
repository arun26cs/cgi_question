package com.model;

public class Fan {

	private int speed;
	private String direction;
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public String getDirection() {
		return direction;
	}
	public void setDirection(String direction) {
		this.direction = direction;
	}
	public Fan() {
		this.speed=0;
		this.direction="s";
	}
}
