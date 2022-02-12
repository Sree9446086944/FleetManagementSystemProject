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
	
	@GetMapping("/fleet")
	private String fleet() {
		return "/fleet/index";  //return index.html page of fleet folder
	}
	
	@GetMapping("/accounts")
	private String accounts() {
		return "/accounts/index";  //return index.html page of accounts folder
	}
	
	@GetMapping("/helpdesk")
	private String helpdesk() {
		return "/helpdesk/index";  //return index.html page of helpdesk folder
	}
	
	@GetMapping("/payroll")
	private String payroll() {
		return "/payroll/index";  //return index.html page of payroll folder
	}
	
	@GetMapping("/parameters")
	private String parameters() {
		return "/parameters/index";  //return index.html page of parameters folder
	}
}
