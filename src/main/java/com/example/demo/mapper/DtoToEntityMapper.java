package com.example.demo.mapper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.example.demo.models.BatchReportDTO;
import org.springframework.stereotype.Component;

import com.example.demo.entity.BatchReport;
import com.example.demo.models.Phases;
import com.example.demo.models.Parameter;
import com.example.demo.utils.DecimalUtils;
import com.example.demo.utils.StringUtils;

@Component
public class DtoToEntityMapper {

	public BatchReportDTO mapReportEntityToReportDTO(BatchReport batchReport) {
		Phases phases = Phases.builder().build();
		BatchReportDTO reportDTO = BatchReportDTO.builder().dataTable(phases).build();

		mapHeader(batchReport, reportDTO);
		mapPhases(batchReport, phases);
		mapTotal(batchReport, reportDTO);

		return reportDTO;
	}
	
	public void mapHeader(BatchReport report, BatchReportDTO dto) {
		dto.setBatchNo(report.getBatchNo());
		dto.setBatchSize(report.getBatchSize());
		dto.setEffectiveDate(report.getDateTime());
		dto.setReactor(report.getReactorName());
		dto.setProductName(report.getProductName());
	}
	
	public void mapPhases(BatchReport batchReport, Phases dto) {
		dto.setReactorPhase(mapReactorPhase(batchReport));
		dto.setInitiation(mapInitiation(batchReport));
	}
	
	public List<Parameter> mapReactorPhase(BatchReport report) {
		List<Parameter> response = new ArrayList<>();
		Parameter hdm = mapReactorHdm(report);
		Parameter dmw = mapReactorDmw(report);
		
		if(hdm != null) {
			response.add(hdm);
		}
		if(dmw != null) {
			response.add(dmw);
		}
		return response;
	}
	
	public Parameter mapReactorHdm(BatchReport report) {
		return Parameter.builder()
				.rmCode(report.getRtHdmwRmbn())
				.sP(report.getRtHdmwSp())
				.pV(report.getRtHdmwPv())
				.deviation(DecimalUtils.deviation(report.getRtHdmwSp(), report.getRtHdmwPv()))
				.rmBoxNo(null)
				.operatorName(null).build();
	}

	public Parameter mapReactorDmw(BatchReport report) {
		return Parameter.builder()
				.rmCode(report.getRtDmwRmbn())
				.sP(report.getRtDmwSp())
				.pV(report.getRtDmwPv())
				.deviation(DecimalUtils.deviation(report.getRtDmwSp(), report.getRtDmwPv()))
				.rmBoxNo(null)
				.operatorName(null).build();
	}

	public List<Parameter> mapInitiation(BatchReport report) {
		Parameter material1 = mapMaterial1(report);
		Parameter material2 = mapMaterial2(report);
		Parameter material3 = mapMaterial3(report);
		Parameter material4 = mapMaterial4(report);
		Parameter material5 = mapMaterial5(report);
		Parameter material6 = mapMaterial6(report);
		Parameter material7 = mapMaterial7(report);
		Parameter material8 = mapMaterial8(report);
		Parameter material9 = mapMaterial9(report);
		Parameter material10 = mapMaterial10(report);
		
		return Arrays.asList(material1,
						material2,
						material3,
						material4,
						material5,
						material6,
						material7,
						material8,
						material9,
						material10);
	}
	
	public Parameter mapMaterial1(BatchReport report) {
		if (StringUtils.isEmpty(report.getIniMaterial1()))
			return null;
		return Parameter.builder()
				.rmCode(report.getIniMaterial1())
				.sP(report.getIniSpI1())
				.pV(report.getIniPvI1())
				.deviation(DecimalUtils.deviation(report.getIniSpI1(), report.getIniPvI1()))
				.rmBoxNo(null)
				.operatorName(null).build();
	}
	
	public Parameter mapMaterial2(BatchReport report) {
		if (StringUtils.isEmpty(report.getIniMaterial2()))
			return null;
		return Parameter.builder()
				.rmCode(report.getIniMaterial2())
				.sP(report.getIniSpI2())
				.pV(report.getIniPvI2())
				.deviation(DecimalUtils.deviation(report.getIniSpI2(), report.getIniPvI2()))
				.rmBoxNo(null)
				.operatorName(null).build();
	}
	
	public Parameter mapMaterial3(BatchReport report) {
		if (StringUtils.isEmpty(report.getIniMaterial3()))
			return null;
		return Parameter.builder()
				.rmCode(report.getIniMaterial3())
				.sP(report.getIniSpI3())
				.pV(report.getIniPvI3())
				.deviation(DecimalUtils.deviation(report.getIniSpI3(), report.getIniPvI3()))
				.rmBoxNo(null)
				.operatorName(null).build();
	}
	
	public Parameter mapMaterial4(BatchReport report) {
		if (StringUtils.isEmpty(report.getIniMaterial4()))
			return null;
		return Parameter.builder()
				.rmCode(report.getIniMaterial4())
				.sP(report.getIniSpI4())
				.pV(report.getIniPvI4())
				.deviation(DecimalUtils.deviation(report.getIniSpI4(), report.getIniPvI4()))
				.rmBoxNo(null)
				.operatorName(null).build();
	}
	public Parameter mapMaterial5(BatchReport report) {
		if (StringUtils.isEmpty(report.getIniMaterial5()))
			return null;
		return Parameter.builder()
				.rmCode(report.getIniMaterial5())
				.sP(report.getIniSpI5())
				.pV(report.getIniPvI5())
				.deviation(DecimalUtils.deviation(report.getIniSpI5(), report.getIniPvI5()))
				.rmBoxNo(null)
				.operatorName(null).build();
	}

	public Parameter mapMaterial6(BatchReport report) {
		if (StringUtils.isEmpty(report.getIniMaterial6()))
			return null;
		return Parameter.builder()
				.rmCode(report.getIniMaterial6())
				.sP(report.getIniSpI6())
				.pV(report.getIniPvI6())
				.deviation(DecimalUtils.deviation(report.getIniSpI6(), report.getIniPvI6()))
				.rmBoxNo(null)
				.operatorName(null).build();
	}

	public Parameter mapMaterial7(BatchReport report) {
		if (StringUtils.isEmpty(report.getIniMaterial7()))
			return null;
		return Parameter.builder()
				.rmCode(report.getIniMaterial7())
				.sP(report.getIniSpI7())
				.pV(report.getIniPvI7())
				.deviation(DecimalUtils.deviation(report.getIniSpI7(), report.getIniPvI7()))
				.rmBoxNo(null)
				.operatorName(null).build();
	}

	
	public Parameter mapMaterial8(BatchReport report) {
		if (StringUtils.isEmpty(report.getIniMaterial8()))
			return null;
		return Parameter.builder()
				.rmCode(report.getIniMaterial8())
				.sP(report.getIniSpI8())
				.pV(report.getIniPvI8())
				.deviation(DecimalUtils.deviation(report.getIniSpI8(), report.getIniPvI8()))
				.rmBoxNo(null)
				.operatorName(null).build();
	}

	public Parameter mapMaterial9(BatchReport report) {
		if (StringUtils.isEmpty(report.getIniMaterial9()))
			return null;
		
		
		return Parameter.builder()
				.rmCode(report.getIniMaterial9())
				.sP(report.getIniSpI9())
				.pV(report.getIniPvI9())
				.deviation(DecimalUtils.deviation(report.getIniSpI9(), report.getIniPvI9()))
				.rmBoxNo(null)
				.operatorName(null).build();
	}

	public Parameter mapMaterial10(BatchReport report) {
		if (StringUtils.isEmpty(report.getIniMaterial10()))
			return null;
		return Parameter.builder()
				.rmCode(report.getIniMaterial10())
				.sP(report.getIniSpI10())
				.pV(report.getIniPvI10())
				.deviation(DecimalUtils.deviation(report.getIniSpI10(), report.getIniPvI10()))
				.rmBoxNo(null)
				.operatorName(null).build();
	}

	public void mapTotal(BatchReport batchReport, BatchReportDTO dto) {
		
	}
}
