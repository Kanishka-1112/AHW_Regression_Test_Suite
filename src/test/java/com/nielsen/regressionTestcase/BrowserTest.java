package com.nielsen.regressionTestcase;

import java.util.HashMap;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import com.nielsen.commonMethods.BaseMethod;
import com.nielsen.commonMethods.InputDataSheet;

public class BrowserTest extends BaseMethod {

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

		loginLandingReg.Validate_Portfolio_Selections(Testdatas.get("Portfolio"), Testdatas.get("Level1_db"),
				Testdatas.get("Level2_db"));
		loginLandingReg.build_Reports();

	}

	@Test(priority = 4)
	public void Validate_DSPage_Functions() throws Throwable {
		dsPageReg.switchToCdsFrame();
		dsPageReg.marketSelection_All();
		dsPageReg.marketShareSelection();
		dsPageReg.productSelection_All();
		dsPageReg.productShareSelection();
		dsPageReg.periodSelection_All();
		dsPageReg.factSelection();

	}

	@Test(priority = 5)
	public void validate_LayoutPage_Functions() throws Throwable {

		layoutPageReg.validate_LayoutPage("Charts and Data");
		layoutPageReg.run_Report();

	}

	@Test(priority = 6)
	public void validate_ReportPage() throws Throwable {
		
		Thread.sleep(40000);
		
		driver.switchTo().frame(0);
		reportPageReg.SaveReport_General("Reports_");
	}

	@Test(priority = 7)
	public void Validate_portfolioSelection1() throws Throwable {

		gen.Get_Parentwindow_CloseCurrentWindow();
		driver.switchTo().frame(0);
		loginLandingReg.build_Reports();

	}

	@Test(priority = 8)
	public void Validate_DSPage_Functions1() throws Throwable {
		dsPageReg.switchToCdsFrame();
		dsPageReg.marketSelection_AllExcept();
		dsPageReg.marketShareSelection();
		dsPageReg.productSelection_AllExcept();
		dsPageReg.productShareSelection();
		dsPageReg.periodSelection_AllExcept();
		dsPageReg.factSelection();

	}

	@Test(priority = 9)
	public void validate_LayoutPage_Functions1() throws Throwable {

		layoutPageReg.validate_LayoutPage("Charts and Data");
		layoutPageReg.run_Report();

	}

	@Test(priority = 10)
	public void validate_ReportPage1() throws Throwable {
		
		Thread.sleep(40000);
		driver.switchTo().frame(0);
		reportPageReg.SaveReport_General("Reports_");
	}

	@Test(priority = 11)
	public void Validate_portfolioSelection2() throws Throwable {

		gen.Get_Parentwindow_CloseCurrentWindow();
		driver.switchTo().frame(0);
		loginLandingReg.build_Reports();

	}

	@Test(priority = 12)
	public void Validate_DSPage_Functions2() throws Throwable {
		dsPageReg.switchToCdsFrame();
		dsPageReg.marketSelection_Sum();
		dsPageReg.marketShareSelection();
		dsPageReg.productSelection_Sum();
		dsPageReg.productShareSelection();
		dsPageReg.periodSelection_Sum();
		dsPageReg.factSelection();

	}

	@Test(priority = 13)
	public void validate_LayoutPage_Functions2() throws Throwable {

		layoutPageReg.validate_LayoutPage("Charts and Data");
		layoutPageReg.run_Report();

	}

	@Test(priority = 14)
	public void validate_ReportPage2() throws Throwable {
		
		Thread.sleep(40000);
		driver.switchTo().frame(0);
		reportPageReg.SaveReport_General("Reports_");
	}

	@Test(priority = 15)
	public void Validate_portfolioSelection3() throws Throwable {

		gen.Get_Parentwindow_CloseCurrentWindow();
		driver.switchTo().frame(0);
		loginLandingReg.build_Reports();

	}

	@Test(priority = 16)
	public void Validate_DSPage_Functions3() throws Throwable {
		dsPageReg.switchToCdsFrame();
		dsPageReg.marketSelection_SumOr();
		dsPageReg.marketShareSelection();
		dsPageReg.productSelection_SumOr();
		dsPageReg.productShareSelection();
		dsPageReg.periodSelection_Sumor();
		dsPageReg.factSelection();

	}

	@Test(priority = 17)
	public void validate_LayoutPage_Functions3() throws Throwable {

		layoutPageReg.validate_LayoutPage("Charts and Data");
		layoutPageReg.run_Report();

	}

	@Test(priority = 18)
	public void validate_ReportPage3() throws Throwable {
		
		Thread.sleep(40000);
		driver.switchTo().frame(0);
		reportPageReg.SaveReport_General("Reports_");
	}

	@Test(priority = 19)
	public void Validate_portfolioSelection4() throws Throwable {

		gen.Get_Parentwindow_CloseCurrentWindow();
		driver.switchTo().frame(0);
		loginLandingReg.build_Reports();

	}

	@Test(priority = 20)

	public void Validate_DSPage_Functions4() throws Throwable {
		dsPageReg.switchToCdsFrame();
		dsPageReg.marketSelection();
		dsPageReg.marketShareSelection();
		dsPageReg.productSelection();
		dsPageReg.productShareSelection();
		dsPageReg.periodSelection();
		dsPageReg.factSelection();

	}

	@Test(priority = 21)
	public void validate_LayoutPage_Functions4() throws Throwable {

		layoutPageReg.validate_LayoutPage("Charts and Data");
		
		
		layoutPageReg.expandColumn_BlankSpace();
		
		layoutPageReg.addVerticalBar();
		
		layoutPageReg.addDataVerticalBar();
		layoutPageReg.minimize_VerticalBar();
		
		
		layoutPageReg.validate_enhancedMode();
		
		layoutPageReg.maximize_VerticalBar();
		layoutPageReg.expand_ContractExpression();
		layoutPageReg.createRank();
		layoutPageReg.addRankVerticalBar();
		layoutPageReg.createPercentile();
		layoutPageReg.addPercentileVerticalBar();
		layoutPageReg.createQuantile();
		layoutPageReg.addQuantileVerticalBar();
		layoutPageReg.createCondition();
		layoutPageReg.addConditionsVerticalBar();

		layoutPageReg.minimize_VerticalBar();
		layoutPageReg.connectVerticalBar_Table();

		//layoutPageReg.addWaterfallChart();
		//layoutPageReg.addDataWaterfallChart();
		//layoutPageReg.minimize_WaterfallChart();
		//layoutPageReg.connectWaterfallChart_Table();

		layoutPageReg.addSmartText();
		//layoutPageReg.connectText_Table();

		layoutPageReg.maximize_Minimize_table();
		layoutPageReg.addRankTable();
		layoutPageReg.addPercentileTable();
		layoutPageReg.addQuantileTable();
		layoutPageReg.addConditionsTable();
		layoutPageReg.expand_ContractExpression();
		layoutPageReg.expand_ContractCondition();
		layoutPageReg.createCustomSets();
		layoutPageReg.addCustomSets();
		layoutPageReg.addCustomGroups();
		layoutPageReg.addDataPivotTable();
		layoutPageReg.createVirtualPromptTable();

		layoutPageReg.disable_ShowTotals();

		layoutPageReg.run_Report();
		Thread.sleep(15000);
		layoutPageReg.switchToCdsFrame();
		layoutPageReg.addVirtualPromptDsPage();
		layoutPageReg.notifyMe();
	
		
	}

	@Test(priority = 22)
	public void validate_ReportPage4() throws Throwable {
		Thread.sleep(40000);
		driver.switchTo().frame(0);
		reportPageReg.SaveReport_General("Reports_");

	}

	@Test(priority = 23)
	public void Validate_portfolioSelection5() throws Throwable {

		gen.Get_Parentwindow_CloseCurrentWindow();
		driver.switchTo().frame(0);
		loginLandingReg.build_Reports();

	}

	@Test(priority = 24)

	public void Validate_DSPage_Functions5() throws Throwable {
		dsPageReg.switchToCdsFrame();
		dsPageReg.marketSelection();
		dsPageReg.marketShareSelection();
		dsPageReg.productSelection();
		dsPageReg.productShareSelection();
		dsPageReg.periodSelection_RelativeAndThru();
		dsPageReg.factSelection();

	}

	@Test(priority = 25)
	public void validate_LayoutPage_Functions5() throws Throwable {

		layoutPageReg.validate_LayoutPage("Charts and Data");
		layoutPageReg.run_Report();

	}

	@Test(priority = 26)
	public void validate_ReportPage5() throws Throwable {
		Thread.sleep(4000);
		driver.switchTo().frame(0);
		reportPageReg.SaveReport_General("Reports_");
		
	}

	@Test(priority = 27)
	public void Validate_portfolioSelection6() throws Throwable {

		gen.Get_Parentwindow_CloseCurrentWindow();
		driver.switchTo().frame(0);
		loginLandingReg.build_Reports();

	}

	

	
	

	@Test(priority = 28, dataProviderClass = InputDataSheet.class, dataProvider = "Login")
	public void Validate_DSPage_NSS1(Object obj) throws Throwable {

		HashMap<String, String> Testdatas = (HashMap<String, String>) obj;
		dsPageReg.switchToCdsFrame();
		dsPageReg.marketSelection_NSS(Testdatas.get("savedMarket"));
		dsPageReg.marketShareSelection_NSS(Testdatas.get("savedMarketShr"));
		dsPageReg.productSelection_NSS(Testdatas.get("savedProduct"));
		dsPageReg.productShareSelection_NSS(Testdatas.get("savedProductShr"));
		dsPageReg.periodSelection_NSS(Testdatas.get("savedPeriod"));
		dsPageReg.factSelection_NSS(Testdatas.get("savedFact"));

	}

	@Test(priority = 29)
	public void validate_LayoutPage_Function7() throws Throwable {

		layoutPageReg.validate_LayoutPage("Charts and Data");
		layoutPageReg.expandColumn_BlankSpace();

		layoutPageReg.addVerticalBar();
		layoutPageReg.addDataVerticalBar1();

		layoutPageReg.expand_ContractExpression();
		layoutPageReg.createCustomExpression();
		layoutPageReg.addCustomExpVerticalBar();
		layoutPageReg.minimize_VerticalBar();
		layoutPageReg.addCustomExpTable();

		layoutPageReg.enable_GrandTotal();
		layoutPageReg.enable_SubTotal();
		
		layoutPageReg.run_Report();

	}

	@Test(priority = 30, dataProviderClass = InputDataSheet.class, dataProvider = "Login")
	public void validate_ReportPage_Function7(Object obj) throws Throwable {

		HashMap<String, String> Testdatas = (HashMap<String, String>) obj;
		reportPageReg.validate_ReportHeader();
		reportPageReg.Sorting_Reports();
		reportPageReg.validate_ReportHeader();
		reportPageReg.olapChange();
		reportPageReg.validate_ReportHeader();
		reportPageReg.Drill_To();
		reportPageReg.validate_ReportHeader();
		reportPageReg.Drill_Down_AuUnilever();
		reportPageReg.validate_ReportHeader();
		driver.switchTo().parentFrame();
		
		String savedReportName = reportPageReg.SaveReport_General(Testdatas.get("savedReportName"));
		gen.Get_Parentwindow_CloseCurrentWindow();
		driver.switchTo().defaultContent();
		driver.switchTo().frame(0);
		loginLandingReg.viewSavedReports(savedReportName);
		loginLandingReg.addToFavouriteReports(savedReportName);
		Thread.sleep(10000);
		reportPageReg.validate_FavReportHeader();
		
	
	//	reportPageReg.validate_FavReport_EditDS();
		gen.Get_Parentwindow_CloseCurrentWindow1();
		Thread.sleep(5000);
		driver.switchTo().frame(0);
		loginLandingReg.moveToHomePage();
        
	}
	
	@Test(priority = 31)
	public void Validate_portfolioSelection7() throws Throwable {

		//gen.Get_Parentwindow_CloseCurrentWindow();
		driver.switchTo().defaultContent();
		driver.switchTo().frame(0);
		loginLandingReg.build_Reports();

	}
	@Test(priority = 32)
	public void Validate_DSPage_Functions6() throws Throwable {
		dsPageReg.switchToCdsFrame();
		dsPageReg.marketSelection();
		dsPageReg.marketShareSelection();
		dsPageReg.productSelection();
		dsPageReg.productShareSelection();
		dsPageReg.periodSelection();
		dsPageReg.factSelection();

	}

	@Test(priority = 33)
	public void validate_LayoutPage_Functions6() throws Throwable {

		layoutPageReg.validate_LayoutPage("Charts and Data");
		layoutPageReg.addDataPageBy();
		layoutPageReg.run_Report();

	}
	
	
	@Test(priority = 34)
	public void validate_ReportPage6() throws Throwable {
		Thread.sleep(30000);
		reportPageReg.validate_ReportHeader();
		driver.switchTo().parentFrame();
		
		reportPageReg.download_AsPpt();
		Thread.sleep(3000);
		reportPageReg.download_AsExcel();
		Thread.sleep(3000);
		reportPageReg.download_AsListrange();
		Thread.sleep(3000);
		reportPageReg.download_AsAdvanced();
		Thread.sleep(3000);
		reportPageReg.download_AsAdvanced_StaticCurrent();
		Thread.sleep(3000);
		reportPageReg.download_AsAdvanced();
		Thread.sleep(3000);
		reportPageReg.download_AsAdvanced_StaticAll();
		Thread.sleep(3000);
		reportPageReg.download_AsAdvanced();
		Thread.sleep(3000);
		reportPageReg.download_AsAdvanced_Refreshable();
		Thread.sleep(3000);
		reportPageReg.download_AsPdf();
		Thread.sleep(3000);
		
}
}