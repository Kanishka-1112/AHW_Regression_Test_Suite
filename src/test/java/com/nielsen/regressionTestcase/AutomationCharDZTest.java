package com.nielsen.regressionTestcase;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.nielsen.commonMethods.BaseMethod;
import com.nielsen.commonMethods.InputDataSheet;
import com.nielsen.pageObjectsRegression.DSPageRegFun;

public class AutomationCharDZTest extends BaseMethod {

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
		
		dsPageRegFun.switchToCdsFrame();
		dsPageRegFun.marketSelection();
		dsPageRegFun.product_Characteristics();
		dsPageRegFun.periodSelection();
		dsPageRegFun.factSelection();

	}

	@Test(priority = 5)
	public void validate_LayoutPage_Functions() throws Throwable {
		layoutPageRegFun.validate_LayoutPage("Charts and Data");
		layoutPageRegFun.addProdCharacterstics_All();
		layoutPageRegFun.market_Period_OLAP();
		layoutPageRegFun.enable_ShowTotal();
		layoutPageRegFun.enable_SubTotal_GrandTotal();
		layoutPageRegFun.run_Report();

	}

	@Test(priority = 6)
	public void validate_ReportPage() throws Throwable {
		
//		Thread.sleep(15000); 
//		reportPageReg.validate_ReportHeader();
		
		Thread.sleep(40000);
	    driver.switchTo().frame(0);
	    System.out.println("ReportPage Frame Passed");

//		driver.switchTo().parentFrame();
		reportPageReg.edit_Layout();

	}

	@Test(priority = 7) 
	public void validate_LayoutPage_Functions1() throws Throwable {

		layoutPageRegFun.validate_LayoutPage("Charts and Data");
		// Disable ShowTotal
		layoutPageRegFun.enable_ShowTotal();
		layoutPageRegFun.withoutAlign_withoutMerge();
		layoutPageRegFun.run_Report();

	}

	@Test(priority = 8) // Upto 1 - 11 TC's
	public void validate_ReportPage1() throws Throwable {
		
		Thread.sleep(15000); 
		reportPageReg.validate_ReportHeader();
		

	}

	@Test(priority = 9)
	public void Validate_portfolioSelection1() throws Throwable {
		// loginLandingReg.changeLanguage("English");
		gen.Get_Parentwindow_CloseCurrentWindow();
		driver.switchTo().frame(0);
		loginLandingReg.build_Reports();

	}

	@Test(priority = 10)
	public void Validate_DSPage_Functions1() throws Throwable {
		dsPageRegFun.switchToCdsFrame();
		dsPageRegFun.marketCharacteristicsSelection(); // Need to Check **Only 1 data available in all folders**
		dsPageRegFun.productSelection();
		dsPageRegFun.periodSelection();
		dsPageRegFun.factSelection();

	}

	@Test(priority = 11)
	public void validate_LayoutPage_Functions2() throws Throwable {

		layoutPageRegFun.validate_LayoutPage("Charts and Data");
		layoutPageRegFun.addMktCharacterstics_All();
		layoutPageRegFun.enable_ShowTotal();
		layoutPageRegFun.run_Report();

	}

	@Test(priority = 12)
	public void validate_ReportPage2() throws Throwable {
		
		Thread.sleep(40000);
	    driver.switchTo().frame(0);
	    System.out.println("ReportPage Frame Passed");

//		reportPageReg.validate_ReportHeader();
		
//		driver.switchTo().parentFrame();
		reportPageReg.edit_Layout();

	}

	@Test(priority = 13)
	public void validate_LayoutPage_Functions3() throws Throwable {

		layoutPageRegFun.validate_LayoutPage("Charts and Data");
		// Disable ShowTotal
		layoutPageRegFun.enable_ShowTotal();
		layoutPageRegFun.run_Report();
	}

	@Test(priority = 14)  // TC  12 & 15
	public void validate_ReportPage3() throws Throwable {
		
		Thread.sleep(15000);          
		reportPageReg.validate_ReportHeader();  
		

	}

	@Test(priority = 15)
	public void Validate_portfolioSelection2() throws Throwable {
		// loginLandingReg.changeLanguage("English");
		gen.Get_Parentwindow_CloseCurrentWindow();
		driver.switchTo().frame(0);
		loginLandingReg.build_Reports();

	}
	
	@Test(priority = 16)
	public void Validate_DSPage_Functions2() throws Throwable {
		dsPageRegFun.switchToCdsFrame();
		dsPageRegFun.marketSelection();
		dsPageRegFun.multipleProd_HierAndChar_selection();
		dsPageRegFun.periodSelection();
		dsPageRegFun.factSelection();

	}
	
	@Test(priority = 17)
	public void validate_LayoutPage_Functions4() throws Throwable {

		layoutPageRegFun.validate_LayoutPage("Charts and Data");
		layoutPageRegFun.Add_productcharacteristis();
		layoutPageRegFun.Add_producthierarchiesInrows();
		layoutPageRegFun.enable_ShowTotal();
		layoutPageRegFun.run_Report();

	}
	
	@Test(priority = 18)
	public void validate_ReportPage4() throws Throwable {
		
		Thread.sleep(40000);
	    driver.switchTo().frame(0);
	    System.out.println("ReportPage Frame Passed");
		reportPageReg.edit_Layout();

	}
	
	@Test(priority = 19)
	public void validate_LayoutPage_Functions5() throws Throwable {

		layoutPageRegFun.validate_LayoutPage("Charts and Data");
		// Disable ShowTotal
		layoutPageRegFun.enable_ShowTotal();
		layoutPageRegFun.run_Report();
	}

	@Test(priority = 20)  // TC 17 & 18
	public void validate_ReportPage5() throws Throwable {
		
		Thread.sleep(15000);      
		reportPageReg.validate_ReportHeader();  
		

	}
	
	@Test(priority = 21)
	public void Validate_portfolioSelection3() throws Throwable {
		// loginLandingReg.changeLanguage("English");
		gen.Get_Parentwindow_CloseCurrentWindow();
		driver.switchTo().frame(0);
		loginLandingReg.build_Reports();

	}
	
	@Test(priority = 22)
	public void Validate_DSPage_Functions3() throws Throwable {
		dsPageRegFun.switchToCdsFrame();
		dsPageRegFun.marketSelection();
		dsPageRegFun.productMultipleSumCharselection();
		dsPageRegFun.periodSelection();
		dsPageRegFun.factSelection();

	}
	
	@Test(priority = 23)
	public void validate_LayoutPage_Functions6() throws Throwable {

		layoutPageRegFun.validate_LayoutPage("Charts and Data");
		layoutPageRegFun.productMultipleSumCharselection();		
		layoutPageRegFun.run_Report();
		
	}
	
	@Test(priority = 24)
	public void validate_ReportPage6() throws Throwable {
		
		Thread.sleep(40000);
	    driver.switchTo().frame(0);
	    System.out.println("ReportPage Frame Passed");
		reportPageReg.edit_Layout();

	}
	
	@Test(priority = 25)
	public void validate_LayoutPage_Functions7() throws Throwable {

		layoutPageRegFun.validate_LayoutPage("Charts and Data");
		// Disable ShowTotal
		layoutPageRegFun.productMultipleSumCharselection1();	
		layoutPageRegFun.run_Report();
	}

	@Test(priority = 26)  // TC 19 & 20
	public void validate_ReportPage7() throws Throwable {
		
		Thread.sleep(15000);      
		reportPageReg.validate_ReportHeader();  
		

	}
	
	
	
	
	@Test(priority = 27, dataProviderClass = InputDataSheet.class, dataProvider = "Portfolio")
	public void Validate_portfolioSelection1(Object obj) throws Throwable {
		HashMap<String, String> Testdatas = (HashMap<String, String>) obj;
		gen.Get_Parentwindow_CloseCurrentWindow();
//		driver.switchTo().frame(0);
		loginLandingReg.Validate_Portfolio_Selections(Testdatas.get("Portfolio"), Testdatas.get("Level1_db"),
				Testdatas.get("Level2_db"));
		loginLandingReg.build_Reports();

	}
	
	
	
	
	

	@Test(priority = 28) //  TC  --  13, 14, 16
	public void Validate_DSPage_Functions4() throws Throwable {
		dsPageRegFun.switchToCdsFrame();
		dsPageRegFun.multipleMkt_characteristics_selection();
		dsPageRegFun.productSelection();
		dsPageRegFun.periodSelection();
		dsPageRegFun.factSelection();

	}
	
	@Test(priority = 29)
	public void validate_LayoutPage_Functions8() throws Throwable {

		layoutPageRegFun.validate_LayoutPage("Charts and Data");
		layoutPageRegFun.addMktCharacterstics_All();
		layoutPageRegFun.enable_ShowTotal();
		layoutPageRegFun.run_Report();

	}
	

	@Test(priority = 30)
	public void validate_ReportPage8() throws Throwable {
		
		Thread.sleep(40000); 
		driver.switchTo().frame(0);
		System.out.println("ReportPage Frame Passed");
		reportPageReg.edit_Layout();

	}

	@Test(priority = 31)
	public void validate_LayoutPage_Functions9() throws Throwable {

		layoutPageRegFun.validate_LayoutPage("Charts and Data");
		layoutPageRegFun.market_Period_OLAP();
		// Disable ShowTotal
		layoutPageRegFun.enable_ShowTotal();
		layoutPageRegFun.run_Report();
		
	}

	@Test(priority = 32) 
	public void validate_ReportPage9() throws Throwable {
		
		Thread.sleep(15000); 
		reportPageReg.validate_ReportHeader();
		reportPageReg.olapChangeMarketAndPeriods();
		Thread.sleep(10000); 
		

	}
	@Test(priority = 33)
	public void Validate_portfolioSelection4() throws Throwable {
		// loginLandingReg.changeLanguage("English");
		gen.Get_Parentwindow_CloseCurrentWindow();
		driver.switchTo().frame(0);
		loginLandingReg.build_Reports();

	}
	@Test(priority = 34)
	public void Validate_DSPage_Functions5() throws Throwable {
		dsPageRegFun.switchToCdsFrame();
		dsPageRegFun.marketChar_All();
		dsPageRegFun.marketShare();
		dsPageRegFun.productChar_All();		
		dsPageRegFun.productShare();
		dsPageRegFun.periodSelection();
		dsPageRegFun.factSelection();

	}

	@Test(priority = 35)
	public void validate_LayoutPage_Functions10() throws Throwable {
		layoutPageRegFun.validate_LayoutPage("Charts and Data");
		layoutPageRegFun.multipleCharacteristics_Diff_Dim();		
		layoutPageRegFun.run_Report();
		
	}
	
	@Test(priority = 36) //  TC 21
	public void validate_ReportPage10() throws Throwable {		
		Thread.sleep(15000); 
		reportPageReg.validate_ReportHeader();

	}
	
	@Test(priority = 37)
	public void Validate_portfolioSelection5() throws Throwable {
		// loginLandingReg.changeLanguage("English");
		gen.Get_Parentwindow_CloseCurrentWindow();
		driver.switchTo().frame(0);
		loginLandingReg.build_Reports();
	}
	
	@Test(priority = 38)
	public void Validate_DSPage_Functions6() throws Throwable {
		dsPageRegFun.switchToCdsFrame();
		dsPageRegFun.marketSelection();
		dsPageRegFun.Product_char_categorySelection();		
		dsPageRegFun.productShare();
		dsPageRegFun.periodSelection();
		dsPageRegFun.factSelection();
	}

	@Test(priority = 39)
	public void validate_LayoutPage_Functions11() throws Throwable {
		layoutPageRegFun.validate_LayoutPage("Charts and Data");	
		layoutPageRegFun.run_Report();
		
	}
	
	@Test(priority = 40) //  TC 22 & 23
	public void validate_ReportPage11() throws Throwable {		
		Thread.sleep(40000);
	    driver.switchTo().frame(0);
	    System.out.println("ReportPage Frame Passed");
		reportPageReg.download_AsExcel();		
		

	}

	
	
	

}
