package com.example.demo.controller;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.BatchReportDTO;
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
	public ReportDropDown getDropdown(@RequestParam LocalDate from, @RequestParam LocalDate to) {
		log.info("Fetching report dropdown.");
		return reportService.getDropdown(from, to);
	}
	
	@GetMapping
	public BatchReportDTO getReport(@RequestParam String batchNo) {
		log.info("Fetching report for batch no : " + batchNo);
		return reportService.getReport(batchNo);
	}
}
