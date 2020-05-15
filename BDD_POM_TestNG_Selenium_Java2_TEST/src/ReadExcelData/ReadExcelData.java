package ReadExcelData;

import lib.ExcelDataConfig;

public class ReadExcelData {

	public static void main(String[] args) {
		ExcelDataConfig excel = new ExcelDataConfig("C:\\ExcelData\\SeleniumTestData.xlsx");
		
		System.out.println(excel.getData(1, 1, 1));
	}
	
}
