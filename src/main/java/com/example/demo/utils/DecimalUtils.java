package com.example.demo.utils;

import java.math.BigDecimal;
import java.util.List;

public class DecimalUtils {

	public static BigDecimal deviation(BigDecimal value1, BigDecimal value2) {
		if (value1 != null && value2 != null) {
			return value1.compareTo(value2) > 0 ? value1.subtract(value2) : value2.subtract(value1);
		} else if (value1 != null) {
			return value2;
		} else if (value2 != null) {
			return value1;
		} else {
			return BigDecimal.ZERO;
		}
	}
	
	public static BigDecimal addAll(List<BigDecimal> values) {
		return null;
	}
}
