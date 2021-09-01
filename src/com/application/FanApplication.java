package com.application;

import java.util.Scanner;

import com.controller.FanController;
import com.model.Fan;
import com.service.FanService;

public class FanApplication {

	public static void main(String[] args) {
		System.out.println("This is fan remote controller at your hand...");
		Fan fan = new Fan();
		FanService fanService = new FanService(fan);
		FanController fanController = new FanController(fanService);
		Scanner sc = new Scanner(System.in);
		
		String control = new String();
		
		while(!control.equalsIgnoreCase("x")) {
			fanController.displayGeneralInfo();
			control = sc.nextLine();
			switch (control.toLowerCase()){
			case "s": {
				fanController.pullSpeedchord();
				break;
			}
			case "d": {
				fanController.pullDirectionChord();
				break;
			}
			case "x": {
				System.out.println("Exit application");
				break;
			}
			default:
				 System.out.println("Unexpected value");
			}
			
			 
		}
	}
	
}


 