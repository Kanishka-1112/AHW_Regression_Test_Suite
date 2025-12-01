package com.nielsen.regressionTestcase;

import java.util.HashMap;

import org.testng.annotations.Test;

import com.nielsen.commonMethods.BaseMethod;
import com.nielsen.commonMethods.InputDataSheet;

public class AutomationFrenchTest extends BaseMethod {

	@Test(priority = 3, dataProviderClass = InputDataSheet.class, dataProvider = "Portfolio")
	public void Validate_portfolioSelectionFrench(Object obj) throws Throwable {
		HashMap<String, String> Testdatas = (HashMap<String, String>) obj;
		loginLandingReg.Validate_Landingpage_Mousehovering();
		loginLandingReg.changeLanguage("French");
		loginLandingReg.Validate_Portfolio_Selections(Testdatas.get("Portfolio"), Testdatas.get("Level1_db"),
				Testdatas.get("Level2_db"));
		loginLandingReg.build_Reports();

	}

	@Test(priority = 4)
	public void Validate_DSPageFrench() throws Throwable {
		dsPageFrenchReg.switchToCdsFrame();
		dsPageFrenchReg.marketSelection();
		dsPageFrenchReg.productSelection();
		dsPageFrenchReg.periodSelection();
		dsPageFrenchReg.factSelection();

	}

	@Test(priority = 5)
	public void validate_LayoutPageFrench() throws Throwable {

		layoutPageFrenchReg.validate_LayoutPage("Graphiques & objets");
		layoutPageFrenchReg.run_Report();

	}

	@Test(priority = 6)
	public void validate_ReportPageFrench() throws Throwable {
		reportPageFrenchReg.validate_ReportHeader();

	}

}
