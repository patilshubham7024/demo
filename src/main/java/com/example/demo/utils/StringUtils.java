package com.example.demo.utils;

public class StringUtils {

	public static boolean isEmpty(String string) {
		return string == null ? true : "".equals(string);
	}

	public static boolean isNotEmpty(String string) {
		return !isEmpty(string);
	}
}
