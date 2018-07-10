package com.app.tests;

import com.app.utilities.ExcelUtils;

public class ExcelTest2 {

	public static void main(String[] args) {
		ExcelUtils.openExcelFile("test.xlsx", "Sheet1");
		String data = ExcelUtils.getCellData(1, 3);
		System.out.println(data);
		ExcelUtils.setCellData("NewValue",1, 2);
		String data2 = ExcelUtils.getCellData(1, 3);
		System.out.println("After: " + data2);
	}

}
