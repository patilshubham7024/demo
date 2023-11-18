package com.example.demo.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.BatchReport;
import com.example.demo.mapper.DtoToEntityMapper;
import com.example.demo.models.BatchReportDTO;
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

	@Autowired
	DtoToEntityMapper dtoMapper;
	
	public ReportDropDown getDropdown(LocalDate from, LocalDate to) {
		List<DropDownElement> batchNos = new ArrayList<>();

		List<BatchReport> allData = batchReportRepository.findByDateTimeBetween(from, to);
		allData.forEach((report) -> {
			batchNos.add(DropDownElement.builder().displayText(report.getBatchNo()).value(report.getBatchNo()).build());
		});
		return ReportDropDown.builder().batchNos(batchNos).build();
	}
 
	public BatchReportDTO getReport(String batchNo) {
		BatchReportDTO response = null;
		BatchReport batchReport = null;

		Optional<BatchReport> optional = batchReportRepository.findByBatchNo(batchNo);
		if (optional.isPresent()) {
			batchReport = optional.get();
			response = dtoMapper.mapReportEntityToReportDTO(batchReport);
			return response;
		} else {
			return null;
		}
	}

	public BatchReport saveReport(BatchReport batchReport) {
		return batchReportRepository.save(batchReport);
	}
}
