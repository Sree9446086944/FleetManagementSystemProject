package com.fleetmanagementsystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FleetManagementSystemController {

	@GetMapping("/index")
	private String home() {
		return "index";  //return index.html page
	}
	
	@GetMapping("/profile")
	private String profile() {
		return "users-profile";  //return index.html page
	}
	//document everything in Fleet file
}
