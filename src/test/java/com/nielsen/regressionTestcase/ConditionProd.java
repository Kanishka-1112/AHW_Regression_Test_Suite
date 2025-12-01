package com.nielsen.regressionTestcase;

import java.util.HashMap;

import org.testng.annotations.Test;

import com.nielsen.commonMethods.BaseMethod;
import com.nielsen.commonMethods.InputDataSheet;

public class ConditionProd extends BaseMethod{ @Test(priority = 1, dataProviderClass = InputDataSheet.class, dataProvider = "Login")
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
	dsPageReg.marketSelection();
	dsPageReg.marketShareSelection();
	dsPageReg.productSelection2();
	dsPageReg.productShareSelection();
	dsPageReg.periodSelection();
	dsPageReg.factSelection1();
	dsPageReg.productSelectionCondition();
	

}

@Test(priority = 5)
public void validate_LayoutPage_Functions() throws Throwable {

	layoutPageReg.validate_LayoutPage("Charts and Data");
	
	layoutPageReg.run_Report();

}
}
