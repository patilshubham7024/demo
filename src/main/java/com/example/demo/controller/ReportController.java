package com.example.demo.controller;

import java.time.LocalDate;

import com.example.demo.entity.BatchReport;
import com.example.demo.entity.ETLogsheet;
import com.example.demo.models.BatchReportDTO;
import com.example.demo.models.EtLogSheetResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
	
	@PostMapping
	public BatchReport saveReport(@RequestBody BatchReport batchReport) {
		log.info("Saving report for batch no : " + batchReport.getBatchNo());
		return reportService.saveReport(batchReport);
	}

	@GetMapping("/et-dropdown")
	public ReportDropDown getDropdownET(@RequestParam LocalDate from, @RequestParam LocalDate to) {
		log.info("Fetching et logsheet dropdown.");
		return reportService.getDropdownForEtLogSheet(from, to);
	}

	@GetMapping("/et-log")
	public EtLogSheetResponse getETLogsheet(@RequestParam String batchNo) {
		log.info("Fetching ET Logsheet for batch no : " + batchNo);
		return reportService.getETLogsheet(batchNo);
	}

	@PostMapping("/et-log")
	public ETLogsheet saveETLog(@RequestBody ETLogsheet etLogsheet) {
		log.info("Saving report for batch no : " + etLogsheet.getBatchNo());
		return reportService.saveETLog(etLogsheet);
	}

}
