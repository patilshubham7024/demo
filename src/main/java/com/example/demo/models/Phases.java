package com.example.demo.models;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Phases {
	// REACTOR
	@JsonProperty("REACTOR")
	private List<Parameter> reactorPhase;

	// INITIATION
	@JsonProperty("INITIATION")
	private List<Parameter> initiation;

	// EMULSION RAW MATERIAL
	@JsonProperty("EMULSION RAW MATERIAL")

	private List<Parameter> emulsion;

	// ONE TIME PPS
	@JsonProperty("ONE TIME PPS")

	private List<Parameter> oneTimePPS;

	// PPS1
	@JsonProperty("PPS 1")

	private List<Parameter> pPS1;

	// PPS2
	@JsonProperty("PPS 2")

	private List<Parameter> pPS2;

	// PPS3
	@JsonProperty("PPS 3")

	private List<Parameter> pPS3;

	// PPS4
	@JsonProperty("PPS 4")

	private List<Parameter> pPS4;

	// CONTINUOUS PPS
	@JsonProperty("CONTINUOUS PPS")

	private List<Parameter> continuousPPS;

	// QC
	@JsonProperty("QC")

	private List<Parameter> qC;

	// POST ADDITION
	@JsonProperty("POST ADDITION")

	private List<Parameter> postAddition;

	// TOTAL

	private BigDecimal totalWeight;
	private BigDecimal whiteWaterQuantity;
	private BigDecimal blendingMaterial;
	private String remarks;
}
