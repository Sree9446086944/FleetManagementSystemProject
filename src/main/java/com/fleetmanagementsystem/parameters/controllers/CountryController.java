package com.fleetmanagementsystem.parameters.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.fleetmanagementsystem.parameters.services.CountryService;

@Controller
public class CountryController {

	@Autowired
	private CountryService countryService;
}
