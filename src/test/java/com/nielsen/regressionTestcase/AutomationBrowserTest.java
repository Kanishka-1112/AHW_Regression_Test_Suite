package com.nielsen.regressionTestcase;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.nielsen.commonMethods.BaseMethod;
import com.nielsen.commonMethods.InputDataSheet;

public class AutomationBrowserTest extends BaseMethod {
//String reportName = "AutoSavedReport18-08-22 16-17-10";

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
		
		loginLandingReg.Validate_Portfolio_Selections(Testdatas.get("Portfolio"), Testdatas.get("Level1_db"),
				Testdatas.get("Level2_db"));
		loginLandingReg.build_Reports();
		
	}

//	@Test(priority = 4)
//	public void Validate_DSPage_Functions() throws Throwable {
//		dsPageReg.switchToCdsFrame();
//		dsPageReg.marketSelection();
//		dsPageReg.marketShareSelection();
//		dsPageReg.productSelection();
//		dsPageReg.productShareSelection();
//		dsPageReg.periodSelection();
//		dsPageReg.factSelection();
//
//	}
//
//	@Test(priority = 5)
//	public void validate_LayoutPage_Functions() throws Throwable {
//
//		layoutPageReg.validate_LayoutPage("Charts and Data");
//
//		layoutPageReg.expandColumn_BlankSpace();
//
//		layoutPageReg.addVerticalBar();
//		layoutPageReg.addDataVerticalBar();
//		layoutPageReg.expand_ContractExpression();
//		layoutPageReg.createRank();
//		layoutPageReg.addRankVerticalBar();
//		layoutPageReg.createPercentile();
//		layoutPageReg.addPercentileVerticalBar();
//		layoutPageReg.createQuantile();
//		layoutPageReg.addQuantileVerticalBar();
//		layoutPageReg.createCondition();
//		layoutPageReg.addConditionsVerticalBar();
//
//		layoutPageReg.minimize_VerticalBar();
//		layoutPageReg.connectVerticalBar_Table();
//
//		layoutPageReg.addWaterfallChart();
//		layoutPageReg.addDataWaterfallChart();
//		layoutPageReg.minimize_WaterfallChart();
//		layoutPageReg.connectWaterfallChart_Table();
//
//		layoutPageReg.addSmartText();
//		layoutPageReg.connectText_Table();
//		
//		layoutPageReg.maximize_Minimize_table();
//		layoutPageReg.addRankTable();
//		layoutPageReg.addPercentileTable();
//		layoutPageReg.addQuantileTable();
//		layoutPageReg.addConditionsTable();
//		layoutPageReg.expand_ContractExpression();
//		layoutPageReg.expand_ContractCondition();
//		layoutPageReg.createCustomSets();
//		layoutPageReg.addCustomSets();
//		layoutPageReg.addCustomGroups();
//		layoutPageReg.addDataPivotTable();
//		layoutPageReg.createVirtualPromptTable();
//
//		layoutPageReg.disable_ShowTotals();
//
//		layoutPageReg.run_Report();
//		Thread.sleep(10000);
//		layoutPageReg.switchToCdsFrame();
//		layoutPageReg.addVirtualPromptDsPage();
////		layoutPageReg.notifyMe();
//
//	}
//
//	@Test(priority = 6)
//	public void validate_ReportPage() throws Throwable {
//		Thread.sleep(30000);
//		reportPageReg.validate_ReportHeader();
////		driver.switchTo().parentFrame();
////		reportPageReg.download_AsAdvanced();
////		reportPageReg.download_AsAdvanced_StaticCurrent();
////		reportPageReg.download_AsAdvanced();
////		reportPageReg.download_AsAdvanced_StaticAll();
////		reportPageReg.download_AsAdvanced();
////		reportPageReg.download_AsAdvanced_Refreshable();
//
//	}
//
//	@Test(priority = 7)
//	public void Validate_portfolioSelection1() throws Throwable {
//		// loginLandingReg.changeLanguage("English");
//		gen.Get_Parentwindow_CloseCurrentWindow();
//		driver.switchTo().frame(0);
//		loginLandingReg.build_Reports();
//
//	}

	@Test(priority = 8, dataProviderClass = InputDataSheet.class, dataProvider = "Login")
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

	@Test(priority = 9)
	public void validate_LayoutPage_Function1() throws Throwable {

		layoutPageReg.validate_LayoutPage("Charts and Data");
		layoutPageReg.expandColumn_BlankSpace();

		layoutPageReg.addVerticalBar();
		layoutPageReg.addDataVerticalBar1();
		layoutPageReg.expand_ContractExpression();
		layoutPageReg.createCustomExpression();
		layoutPageReg.addCustomExpVerticalBar();
		layoutPageReg.minimize_VerticalBar();
//		layoutPageReg.connectVerticalBar_Table();
		layoutPageReg.addCustomExpTable();
		layoutPageReg.enable_GrandTotal();
		layoutPageReg.enable_SubTotal();

		layoutPageReg.run_Report();

	}

	@Test(priority = 10, dataProviderClass = InputDataSheet.class, dataProvider = "Login")
	public void validate_ReportPage_Function1(Object obj) throws Throwable {

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
		reportPageReg.download_AsPdf();

//		reportPageReg.download_AsListrange();
		reportPageReg.download_AsPpt();
//		Thread.sleep(15000);
		
		String savedReportName = reportPageReg.SaveReport_General(Testdatas.get("savedReportName"));
		gen.Get_Parentwindow_CloseCurrentWindow();
		driver.switchTo().frame(0);
		loginLandingReg.viewSavedReports(savedReportName);
		loginLandingReg.addToFavouriteReports(savedReportName);
//		reportPageReg.validate_FavReportHeader();
//		reportPageReg.validate_FavReport_EditDS();
//		gen.Get_Parentwindow_CloseCurrentWindow1();
//		driver.switchTo().frame(0);
//		loginLandingReg.moveToHomePage();

	}

}
