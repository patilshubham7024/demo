package com.example.demo.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.BatchReport;
import com.example.demo.models.DropDownElement;
import com.example.demo.models.ReportDropDown;
import com.example.demo.repositories.BatchReportRepository;
import com.example.demo.repositories.ETLogsheetRepository;

@Service
public class ReportService {

	@Autowired
	ETLogsheetRepository etLogsheetRepository;

	@Autowired
	BatchReportRepository batchReportRepository;

	public ReportDropDown getDropdown() {
		List<DropDownElement> batchNos = new ArrayList<>();

		List<BatchReport> allData = batchReportRepository.findAll();
		allData.forEach((report) -> {
			batchNos.add(DropDownElement.builder().displayText(report.getBatchNo()).value(report.getBatchNo()).build());
		});

//		return ReportDropDown.builder()
//				.batchNos(Arrays.asList(DropDownElement.builder().displayText("1697").value("1697").build(),
//						DropDownElement.builder().displayText("1698").value("1698").build(),
//						DropDownElement.builder().displayText("1699").value("1699").build()))
//				.build();
		return ReportDropDown.builder().batchNos(batchNos).build();
	}

}
