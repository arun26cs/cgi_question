package com.controller;
import com.service.FanService;

public class FanController {

	FanService fanService;
	public FanController(FanService fanService) {
		this.fanService=fanService;
	}
	public void pullSpeedchord() {
		this.fanService.speedService();
		this.fanService.fanSpeedDisplayService();
	}
	
	public void pullDirectionChord() {
		this.fanService.directionService();
		this.fanService.fanDirectionDisplayService();
	}
	
	public void displayGeneralInfo() {
		this.fanService.fanGeneralDisplayService();
	}
}
