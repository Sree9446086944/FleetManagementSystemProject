package com.fleetmanagementsystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FleetManagementSystemController {

	@GetMapping("/index")
	private String home() {
		return "index";  //return index.html page
	}
	
	@GetMapping("/index2")
	private String profile() {
		return "index2";  //return index2.html page
	}
	
	@GetMapping("/hr")
	private String hr() {
		return "/hr/index";  //return index.html page of hr folder
	}
}
