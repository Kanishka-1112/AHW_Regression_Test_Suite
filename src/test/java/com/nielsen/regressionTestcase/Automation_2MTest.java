package com.nielsen.regressionTestcase;

import java.util.HashMap;

import org.testng.annotations.Test;

import com.nielsen.commonMethods.BaseMethod;
import com.nielsen.commonMethods.InputDataSheet;

public class Automation_2MTest extends BaseMethod{
	
	@Test(priority = 1, dataProviderClass = InputDataSheet.class, dataProvider = "Login")
	public void ValidateLogin(Object obj) throws Exception {
		HashMap<String, String> Testdatas = (HashMap<String, String>) obj;
		loginLandingReg.ValidateLogincheck(Testdatas.get("User Name"), Testdatas.get("Password"));

	}

	@Test(priority = 2)
	public void Validate_AdhocWebPage() throws Throwable {
		gen.ValidateTitle();
		
	}

	@Test(priority = 3, dataProviderClass = InputDataSheet.class, dataProvider = "Login")
	public void Validate_portfolioSelection(Object obj) throws Throwable {
		HashMap<String, String> Testdatas = (HashMap<String, String>) obj;
		// loginLandingReg.changeLanguage("English");
		loginLandingReg.Validate_Portfolio_Selections(Testdatas.get("Portfolio"), Testdatas.get("Level1_db"),
				Testdatas.get("Level2_db"));
		loginLandingReg.build_Reports();
		
	}

	@Test(priority = 4)
	public void Validate_DSPage_Functions() throws Throwable {
		dsPageReg.switchToCdsFrame();
		
		
		
		//TC-312, 313, 314, 315,317,318,319,320,321,328,330
		dsPageReg2M.marketSelection_All();
		dsPageReg2M.marketShareSelection();
		dsPageReg2M.productSelection_2M();
		dsPageReg2M.productShareSelection();
		dsPageReg2M.periodSelection_2M();
		dsPageReg2M.factSelection();
		
		
	}

	@Test(priority = 5)
	public void validate_LayoutPage_Functions() throws Throwable {

		layoutPageReg2M.validate_LayoutPage("Charts and Data");
		
		//TC-312,313
		layoutPageReg2M.run_Report();
		

	}
	@Test(priority = 6, dataProviderClass = InputDataSheet.class, dataProvider = "Login")
	public void validate_ReportPage_Functions(Object obj) throws Throwable {

		HashMap<String, String> Testdatas = (HashMap<String, String>) obj;
		Thread.sleep(40000);
		driver.switchTo().frame(0);
		
		//TC-315
		reportPageReg2M.download_AsExcel();
		Thread.sleep(5000);
		//TC-320
		reportPageReg2M.download_AsAdvanced();
		Thread.sleep(5000);
		//TC-321
		reportPageReg2M.download_AsAdvancedStatic();
		Thread.sleep(5000);
		//TC-319
		reportPageReg2M.download_AsListrange();
		Thread.sleep(10000);
		
		//TC-318
		reportPageReg2M.Edit_layout();
		

	}
	@Test(priority = 7)
	public void validate_LayoutPage_Function1() throws Throwable {

		//layoutPageReg.validate_LayoutPage("Charts and Data");
		
		//TC-328
		layoutPageReg2M.expandColumn_BlankSpace();
		layoutPageReg2M.addWaterfallChart();
		layoutPageReg2M.addDataWaterfallChart();
		layoutPageReg2M.minimize_WaterfallChart();    
		layoutPageReg2M.maximize_Minimize_table();
		layoutPageReg2M.expand_ContractExpression();
		layoutPageReg2M.createCustomExpression();
		layoutPageReg2M.addCustomExpTable();
        
		layoutPageReg2M.createCondition1();
		layoutPageReg2M.addConditionToConditionTable();
        
      //TC-330
		layoutPageReg2M.report_properties_enable();
        
		layoutPageReg2M.run_Report();

	}
	@Test(priority = 8, dataProviderClass = InputDataSheet.class, dataProvider = "Login")
	public void validate_ReportPage_Functions1(Object obj) throws Throwable {

		HashMap<String, String> Testdatas = (HashMap<String, String>) obj;
		Thread.sleep(40000);
		driver.switchTo().frame(0);
		
		//TC-326
		reportPageReg2M.switchToCdsFrame_DS();
		

	}
	@Test(priority = 9)
	public void Validate_DSPage_Functions2() throws Throwable {
		Thread.sleep(10000);
		dsPageReg2M.DSPage_Run();
	
		
		
	}
	@Test(priority = 10, dataProviderClass = InputDataSheet.class, dataProvider = "Login")
	public void validate_ReportPage_Functions3(Object obj) throws Throwable {

		HashMap<String, String> Testdatas = (HashMap<String, String>) obj;
		Thread.sleep(40000);
		driver.switchTo().frame(0);
		
		
	    //TC-314
		//driver.switchTo().parentFrame();
		String savedReportName = reportPageReg2M.SaveReport_General(Testdatas.get("savedReportName"));
		gen.Get_Parentwindow_CloseCurrentWindow();
		driver.switchTo().frame(0);
		loginLandingReg.viewSavedReports(savedReportName);
		loginLandingReg.addToFavouriteReports(savedReportName);
		reportPageReg2M.validate_FavReportHeader();
		//gen.Get_Parentwindow_CloseCurrentWindow1();
		//driver.switchTo().frame(0);
		

	}
	@Test(priority = 11, dataProviderClass = InputDataSheet.class, dataProvider = "Login")
	public void Validate_portfolioSelection1(Object obj) throws Throwable {
		HashMap<String, String> Testdatas = (HashMap<String, String>) obj;

		loginLandingReg.moveToHomePage();
		loginLandingReg.build_Reports();
		
	}
	
	@Test(priority = 12)
	public void Validate_DSPage_Functions1() throws Throwable {
		
		Thread.sleep(30000);
		dsPageReg2M.switchToCdsFrame();
		
		
		//TC-322,323,326,327,329,331
		dsPageReg2M.marketSelection_All();
		dsPageReg2M.marketShareSelection();
		dsPageReg2M.productSelection_10M();
		dsPageReg2M.productShareSelection();
		dsPageReg2M.periodSelection_10M();
		dsPageReg2M.factSelection_10M();
		
		
	}
	@Test(priority = 13)
	public void validate_LayoutPage_Functions1() throws Throwable {

		layoutPageReg2M.validate_LayoutPage("Charts and Data");
		
		//TC-322,323
		layoutPageReg2M.run_Report();
		Thread.sleep(10000);
		

	}
	@Test(priority = 14, dataProviderClass = InputDataSheet.class, dataProvider = "Login")
	public void validate_ReportPage_Functions2(Object obj) throws Throwable {

		HashMap<String, String> Testdatas = (HashMap<String, String>) obj;
		Thread.sleep(125000);
		driver.switchTo().frame(0);
		
		//TC-327
		reportPageReg2M.Edit_layout();
		

	}
	@Test(priority = 15)
	public void validate_LayoutPage_Function2() throws Throwable {

		//layoutPageReg.validate_LayoutPage("Charts and Data");
		
		//TC-329
		Thread.sleep(10000);
		layoutPageReg2M.expandColumn_BlankSpace();
		layoutPageReg2M.addWaterfallChart();
		layoutPageReg2M.addDataWaterfallChart();
		layoutPageReg2M.minimize_WaterfallChart();    
		layoutPageReg2M.maximize_Minimize_table();
		layoutPageReg2M.expand_ContractExpression();
		layoutPageReg2M.createCustomExpression();
		layoutPageReg2M.addCustomExpTable();
        
		layoutPageReg2M.createCondition1_10M();
		layoutPageReg2M.addConditionToConditionTable();
        
        //TC-331
		layoutPageReg2M.report_properties_enable();
        
		layoutPageReg2M.run_Report();
		Thread.sleep(30000);

	}
	@Test(priority = 16, dataProviderClass = InputDataSheet.class, dataProvider = "Login")
	public void validate_ReportPage_Functions4(Object obj) throws Throwable {

		HashMap<String, String> Testdatas = (HashMap<String, String>) obj;
		Thread.sleep(500000);
		driver.switchTo().frame(0);
		
		//TC-326
		reportPageReg2M.switchToCdsFrame_DS();
		

	}
	
	
	
	
	
}
