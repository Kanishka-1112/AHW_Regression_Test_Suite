package com.nielsen.commonMethods;

import java.io.File;
import java.net.URISyntaxException;
import java.util.HashMap;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.ITestContext;
import org.testng.annotations.DataProvider;

public class InputDataSheet {

	String path = System.getProperty("user.dir");
	Workbook workbookName;
	Sheet sheet;
	String excelName;
	String sheetName;
	InputDataSheet input;

	public InputDataSheet() {

	}

	public InputDataSheet(String excelName, String sheetName) throws URISyntaxException {

		// File src = new
		// File(InputDataSheet.class.getClassLoader().getResource(excelName).toURI());
		File src = new File("Testdata\\" + excelName);
		try {
			workbookName = WorkbookFactory.create(src);
		} catch (Exception e) {
			e.printStackTrace();
		}
		sheet = workbookName.getSheet(sheetName);
	}

	public HashMap<String, String> Readexcelfile(int rownumber) throws Exception {

		int lastcolNum = sheet.getRow(0).getLastCellNum();
		int lastrowNum = sheet.getLastRowNum();

		HashMap<String, String> hm = new HashMap<String, String>();
		for (int i = 0; i < lastcolNum; i++) {
			if (sheet.getRow(rownumber).getCell(i) != null) {
				sheet.getRow(rownumber).getCell(i).setCellType(CellType.STRING);
				hm.put(sheet.getRow(0).getCell(i).toString(), sheet.getRow(rownumber).getCell(i).toString());
			}
		}
		workbookName.close();
		return hm;

	}

	public int getRowcount() {
		return sheet.getLastRowNum();
	}

	public int getcoloumcount() {
		return sheet.getRow(0).getLastCellNum();

	}

	@DataProvider(name = "Login")
	public Object[][] getData_UsageTracking() throws Exception {
		//String sheetName = ReadConfig.readConfigFile("portfolioName");
		InputDataSheet input1 = new InputDataSheet("Test Data UAT Env-1.xlsx", "FERRERO FR" + "");
	//InputDataSheet input1 = new InputDataSheet("Test Data UAT Env-1.xlsx", "CN UNILEVER" + "");
		//InputDataSheet input1 = new InputDataSheet("Test Data UAT Env-2.xlsx", "NL UNILEVER" + "");
//		InputDataSheet input1 = new InputDataSheet("Test Data UAT Env.xlsx", "NL UNILEVER" + "");
		Object[][] data1 = new Object[input1.getRowcount()][1];
		for (int i = 1; i <= input1.getRowcount(); i++) {
			HashMap<String, String> sampledata = input1.Readexcelfile(i);
			data1[i - 1][0] = sampledata;
			System.out.println("data is " + data1[i - 1][0]);
		}
		return data1;
	}

	@DataProvider(name = "Portfolio")
	public Object[][] getData_UsageTracking1() throws Exception {
		//String sheetName = ReadConfig.readConfigFile("portfolioName");
		InputDataSheet input1 = new InputDataSheet("Test Data UAT Env-1.xlsx", "FERRERO FR" + "");
	//InputDataSheet input1 = new InputDataSheet("Test Data UAT Env-1.xlsx", "CN UNILEVER" + "");
	//	InputDataSheet input1 = new InputDataSheet("Test Data UAT Env-2.xlsx", "FERRERO FR" + "");
		Object[][] data1 = new Object[input1.getRowcount()][1];
		for (int i = 1; i <= input1.getRowcount(); i++) {
			HashMap<String, String> sampledata = input1.Readexcelfile(i);
			data1[i - 1][0] = sampledata;
			System.out.println("data is " + data1[i - 1][0]);
		}
		return data1;
	}

	/*
	 * @DataProvider(name = "SaveReportNames") public Object[][]
	 * getData_UsageTracking1() throws Exception { InputDataSheet input1 = new
	 * InputDataSheet("PortfolioSheet.xlsx", "save report name" + ""); Object[][]
	 * data1 = new Object[input1.getRowcount()][1]; for (int i = 1; i <=
	 * input1.getRowcount(); i++) { HashMap<String, String> sampledata =
	 * input1.Readexcelfile(i); data1[i - 1][0] = sampledata;
	 * System.out.println("data is " + data1[i - 1][0]); } return data1; }
	 */
}
