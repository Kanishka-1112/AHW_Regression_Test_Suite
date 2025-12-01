package com.nielsen.regressionTestcase;

import java.util.HashMap;

import org.testng.annotations.Test;

import com.nielsen.commonMethods.BaseMethod;
import com.nielsen.commonMethods.InputDataSheet;

public class Automation_MergeEnhancementTest extends BaseMethod{
	@Test(priority = 1, dataProviderClass = InputDataSheet.class, dataProvider = "Login")
	public void ValidateLogin(Object obj) throws Exception {
		HashMap<String, String> Testdatas = (HashMap<String, String>) obj;
		loginLandingReg.ValidateLogincheck(Testdatas.get("User Name"), Testdatas.get("Password"));

	}

	@Test(priority = 2)
	public void Validate_AdhocWebPage() throws Throwable {

		loginLandingReg.Validate_Landingpage_Mousehovering();
	}

	@Test(priority = 3, dataProviderClass = InputDataSheet.class, dataProvider = "Login")
	public void Validate_portfolioSelection(Object obj) throws Throwable {
		HashMap<String, String> Testdatas = (HashMap<String, String>) obj;
		// loginLandingReg.changeLanguage("English");
		loginLandingReg.Validate_Portfolio_Selections(Testdatas.get("Portfolio"), Testdatas.get("Level1_db"),
				Testdatas.get("Level2_db"));
		loginLandingReg.build_Reports();
		
	}
	
	@Test(priority = 4, dataProviderClass = InputDataSheet.class, dataProvider = "Login")
	public void Validate_DSPage_Functions(Object obj) throws Throwable {

		HashMap<String, String> Testdatas = (HashMap<String, String>) obj;
		dsPageReg_ME.switchToCdsFrame();
		
		//TC-333,334,335,336,337,338,339,340
		dsPageReg_ME.marketSelection();
		dsPageReg_ME.marketShareSelection();
		dsPageReg_ME.productSelection();
		dsPageReg_ME.productShareSelection();
		dsPageReg_ME.periodSelection();
		dsPageReg_ME.factSelection();

	}
	
	//TC-333
	@Test(priority = 5)
	public void validate_LayoutPage_Function() throws Throwable {

		layoutPageReg_ME.validate_LayoutPage("Charts and Data");
		layoutPageReg_ME.Enabling_MergeRows();
		layoutPageReg_ME.run_Report();

	}
	
	@Test(priority = 6, dataProviderClass = InputDataSheet.class, dataProvider = "Login")
	public void validate_ReportPage_Function(Object obj) throws Throwable {

		HashMap<String, String> Testdatas = (HashMap<String, String>) obj;
		Thread.sleep(40000);
		driver.switchTo().frame(0);
		reportPageReg_ME.Edit_layout();
	}
	
	//TC-335
	@Test(priority = 7)
	public void validate_LayoutPage_Function1() throws Throwable {

		//layoutPageReg.validate_LayoutPage("Charts and Data");
		//layoutPageReg.Enabling_MergeRows();
		layoutPageReg_ME.Product_desc();

		layoutPageReg_ME.run_Report();

	}
	
	@Test(priority = 8, dataProviderClass = InputDataSheet.class, dataProvider = "Login")
	public void validate_ReportPage_Function1(Object obj) throws Throwable {

		HashMap<String, String> Testdatas = (HashMap<String, String>) obj;
		Thread.sleep(30000);
		driver.switchTo().frame(0);
		reportPageReg_ME.Edit_layout();

	}
	
	//TC-337
	@Test(priority = 9)
	public void validate_LayoutPage_Function2() throws Throwable {

		//layoutPageReg.validate_LayoutPage("Charts and Data");
		//layoutPageReg.Enabling_MergeRows();
		layoutPageReg_ME.disabling_Productdesc();
		layoutPageReg_ME.Market_desc();
		layoutPageReg_ME.run_Report();

	}
	
	@Test(priority = 10, dataProviderClass = InputDataSheet.class, dataProvider = "Login")
	public void validate_ReportPage_Function2(Object obj) throws Throwable {

		HashMap<String, String> Testdatas = (HashMap<String, String>) obj;
		Thread.sleep(30000);
		driver.switchTo().frame(0);
		reportPageReg_ME.Edit_layout();

	}
	
	//TC-339
	@Test(priority = 11)
	public void validate_LayoutPage_Function3() throws Throwable {

		//layoutPageReg.validate_LayoutPage("Charts and Data");
		//layoutPageReg.Enabling_MergeRows();
		layoutPageReg_ME.disabling_Marketdesc();
		layoutPageReg_ME.Product_desc();
		layoutPageReg_ME.Market_desc();

		layoutPageReg_ME.run_Report();

	}
	
	@Test(priority = 12, dataProviderClass = InputDataSheet.class, dataProvider = "Login")
	public void validate_ReportPage_Function3(Object obj) throws Throwable {

		HashMap<String, String> Testdatas = (HashMap<String, String>) obj;
		Thread.sleep(30000);
		//reportPageReg.validate_ReportHeader();
		driver.switchTo().frame(0);
		reportPageReg_ME.Edit_layout();

	}
	
	@Test(priority = 13)
	public void Validate_portfolioSelection1() throws Throwable {
		gen.Get_Parentwindow_CloseCurrentWindow();
		driver.switchTo().frame(0);
		loginLandingReg.build_Reports();

	}
	
	@Test(priority = 14, dataProviderClass = InputDataSheet.class, dataProvider = "Login")
	public void Validate_DSPage_Functions1(Object obj) throws Throwable {

		HashMap<String, String> Testdatas = (HashMap<String, String>) obj;
		dsPageReg_ME.switchToCdsFrame();
		
		//TC-333,334,335,336,337,338,339,340
		dsPageReg_ME.marketSelection();
		dsPageReg_ME.marketShareSelection();
		dsPageReg_ME.productSelection();
		dsPageReg_ME.productShareSelection();
		dsPageReg_ME.periodSelection();
		dsPageReg_ME.factSelection();

	}
	
	//TC-334
	@Test(priority = 15)
	public void validate_LayoutPage_Function4() throws Throwable {

		layoutPageReg_ME.validate_LayoutPage("Charts and Data");
		layoutPageReg_ME.Enabling_MergeColumns();

		layoutPageReg_ME.run_Report();

	}
	
	@Test(priority = 16, dataProviderClass = InputDataSheet.class, dataProvider = "Login")
	public void validate_ReportPage_Function4(Object obj) throws Throwable {

		HashMap<String, String> Testdatas = (HashMap<String, String>) obj;
		Thread.sleep(30000);
		//reportPageReg.validate_ReportHeader();
		driver.switchTo().frame(0);
		reportPageReg_ME.Edit_layout();

	}
	
	//TC-336
	@Test(priority = 17)
	public void validate_LayoutPage_Function5() throws Throwable {

		//layoutPageReg.validate_LayoutPage("Charts and Data");
		//layoutPageReg.Enabling_MergeColumns();
		layoutPageReg_ME.Product_desc();
		layoutPageReg_ME.run_Report();

	}
	
	@Test(priority = 18, dataProviderClass = InputDataSheet.class, dataProvider = "Login")
	public void validate_ReportPage_Function5(Object obj) throws Throwable {

		HashMap<String, String> Testdatas = (HashMap<String, String>) obj;
		Thread.sleep(30000);
		//reportPageReg.validate_ReportHeader();
		driver.switchTo().frame(0);
		reportPageReg_ME.Edit_layout();

	}
	
	//TC-338
	
	@Test(priority = 19)
	public void validate_LayoutPage_Function6() throws Throwable {

		//layoutPageReg.validate_LayoutPage("Charts and Data");
		//layoutPageReg.Enabling_MergeColumns();
		layoutPageReg_ME.disabling_Productdesc();
		layoutPageReg_ME.Market_desc();

		layoutPageReg_ME.run_Report();

	}
	
	@Test(priority = 20, dataProviderClass = InputDataSheet.class, dataProvider = "Login")
	public void validate_ReportPage_Function6(Object obj) throws Throwable {

		HashMap<String, String> Testdatas = (HashMap<String, String>) obj;
		Thread.sleep(30000);
		//reportPageReg.validate_ReportHeader();
		driver.switchTo().frame(0);
		reportPageReg_ME.Edit_layout();

	}
	
	//TC-340
	@Test(priority = 21)
	public void validate_LayoutPage_Function8() throws Throwable {

		//layoutPageReg.validate_LayoutPage("Charts and Data");
		//layoutPageReg.Enabling_MergeColumns();
		layoutPageReg_ME.disabling_Marketdesc();
		layoutPageReg_ME.Product_desc();
		layoutPageReg_ME.Market_desc();

		layoutPageReg_ME.run_Report();

	}
	
	@Test(priority = 22, dataProviderClass = InputDataSheet.class, dataProvider = "Login")
	public void validate_ReportPage_Function8(Object obj) throws Throwable {

		HashMap<String, String> Testdatas = (HashMap<String, String>) obj;
		Thread.sleep(30000);
//		driver.switchTo().frame(0);

	}
	
	
	
	
	
	
}
