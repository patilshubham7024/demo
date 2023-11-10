package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.ReportDropDown;
import com.example.demo.service.ReportService;

import lombok.extern.log4j.Log4j2;

@RestController
@RequestMapping("/report")
@Log4j2
@CrossOrigin(origins = "*", allowedHeaders = "*", methods = { RequestMethod.POST, RequestMethod.GET })
public class ReportController {

	@Autowired
	ReportService reportService;

	@GetMapping("/dropdown")
	public ReportDropDown getDropdown() {
		log.info("Fetching report dropdown.");
		return reportService.getDropdown();
	}
}
