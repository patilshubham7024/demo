package com.example.demo.models;

import java.util.List;
import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ReportDropDown {
	private Set<DropDownElement> etBatches;

	private List<DropDownElement> batchNos;
}
