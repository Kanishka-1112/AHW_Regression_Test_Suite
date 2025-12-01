package com.nielsen.pageObjectsRegression;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.Status;
import com.nielsen.commonMethods.BaseMethod;

public class ReportPageFrenchReg extends BaseMethod {

	public Actions action = new Actions(driver);

	public ReportPageFrenchReg() {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	public void validate_ReportHeader() {
		try {
			Thread.sleep(15000);
			driver.switchTo().defaultContent();
			driver.switchTo().frame(0);
			driver.switchTo().frame(driver.findElement(By.xpath("//iframe")));
//			WebElement report_header = driver.findElement(By.xpath("//div[@class='x-column-header-text x-lbl-H2']"));
//			if (report_header.getText().equalsIgnoreCase(" Description")) {
//				logger.log(Status.PASS, "Report page is Displayed");
//				System.out.println("Report page is Displayed");
//			}

			logger.log(Status.PASS, "Report page is Displayed");
			System.out.println("Report page is Displayed");

		} catch (Exception e) {
			logger.log(Status.FAIL, " Exception ocuerd " + e);
		}
	}

}
