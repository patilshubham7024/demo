package com.example.demo.models;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@JsonInclude(Include.NON_NULL)
public class BatchReportDTO {
	// Headers section
	private String batchNo;
	private String batchSize;
	private String reactor;
	private String reactorName;
	private LocalDate effectiveDate;
	private String productName;
	// REACTOR
	private List<Parameter> reactorPhase;

	// INITIATION
	private List<Parameter> initiation;

	// EMULSION RAW MATERIAL
	private List<Parameter> emulsion;

	// ONE TIME PPS
	private List<Parameter> oneTimePPS;

	// PPS1
	private List<Parameter> pPS1;

	// PPS2
	private List<Parameter> pPS2;

	// PPS3
	private List<Parameter> pPS3;

	// PPS4
	private List<Parameter> pPS4;

	// CONTINUOUS PPS
	private List<Parameter> continuousPPS;

	// QC
	private List<Parameter> qC;

	// POST ADDITION
	private List<Parameter> postAddition;

	// TOTAL
	private BigDecimal totalWeight;
	private BigDecimal whiteWaterQuantity;
	private BigDecimal blendingMaterial;
	private String remarks;
}
