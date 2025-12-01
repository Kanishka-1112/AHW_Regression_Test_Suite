package com.nielsen.regressionTestcase;

import java.util.HashMap;

import org.testng.annotations.Test;

import com.nielsen.commonMethods.BaseMethod;
import com.nielsen.commonMethods.InputDataSheet;

public class Facts extends BaseMethod{

	@Test(priority = 1, dataProviderClass = InputDataSheet.class, dataProvider = "Login")
	public void ValidateLogin(Object obj) throws Exception {
		HashMap<String, String> Testdatas = (HashMap<String, String>) obj;
		loginLandingReg.ValidateLogincheck(Testdatas.get("User Name"), Testdatas.get("Password"));

	}

	@Test(priority = 2)
	public void Validate_AdhocWebPage() throws Throwable {
		gen.ValidateTitle();
		

	}

	@Test(priority = 3, dataProviderClass = InputDataSheet.class, dataProvider = "Portfolio")
	public void Validate_portfolioSelection(Object obj) throws Throwable {
		HashMap<String, String> Testdatas = (HashMap<String, String>) obj;
		
		loginLandingReg.Validate_Portfolio_Selections(Testdatas.get("Portfolio"), Testdatas.get("Level1_db"),
				Testdatas.get("Level2_db"));
		loginLandingReg.viewSavedReports(Testdatas.get("Test case_01"));
	
		reportPageReg.SaveReport1();
		gen.Get_Parentwindow_CloseCurrentWindow1();
		driver.switchTo().frame(0);
		loginLandingReg.viewSavedReports1(Testdatas.get("Test case_02"));
		
		reportPageReg.SaveReport1();
		gen.Get_Parentwindow_CloseCurrentWindow1();
	}

	}