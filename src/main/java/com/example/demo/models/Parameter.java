package com.example.demo.models;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Parameter {
	private String rmCode;
	private BigDecimal sP;
	private BigDecimal pV;
	private BigDecimal deviation;
	private String rmBoxNo;
	private String operatorName;
}
