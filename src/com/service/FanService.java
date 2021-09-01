package com.service;

import com.model.Fan;

public class FanService {
	
	private Fan fan;
	
	public FanService(Fan fan) {
		this.fan = fan;
	}

	public void speedService() {
		System.out.println("Controlling speed...");
		if(this.fan.getSpeed()<=3 && this.fan.getSpeed()>=0) {
			int speed=this.fan.getSpeed()+1;
			System.out.println(speed);
			this.fan.setSpeed(speed);
		}
		//after it is 3 you reset to 0 and have to display stopped
		if(this.fan.getSpeed()==4) {
			this.fan.setSpeed(0);
		}
		
	}
	
	public void directionService() {
		System.out.println("Controlling direction...");
		if(this.fan.getDirection().equals("F")) {
			this.fan.setDirection("S");
		}else {
			this.fan.setDirection("F");
		}
		
	}
	 
	public void fanSpeedDisplayService() {
		switch (this.fan.getSpeed())	{
		case 0: {
			System.out.println("You are at speed 0..stopped");
			break;
		}
		case 1: {
			System.out.println("You are at speed 1..starting fan...");
			break;
		}
		case 2: {
			System.out.println("You are at speed 2");
			break;
		}
		case 3: {
			System.out.println("You are at speed 3");
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + this.fan.getSpeed());
		}
	}
	
	public void fanDirectionDisplayService() {
		switch (this.fan.getDirection().toUpperCase())	{
		case "F": {
			System.out.println("You are at Fixed direction");
			break;
		}
		case "S": {
			System.out.println("You are swaying");
			break;
		}
		
		default:
			throw new IllegalArgumentException("Unexpected value: " + this.fan.getDirection());
		}
	}
	
	public void fanGeneralDisplayService() {
		System.out.println("========================");
		System.out.println("press s for Speed chord and to change it|");
		System.out.println("press d for direction chord and to change it|");
		System.out.println("press x for exit chord|");
		System.out.println("========================");
	}
}
