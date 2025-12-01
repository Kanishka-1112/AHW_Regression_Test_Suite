
package com.nielsen.pageObjectsRegression;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.aventstack.extentreports.Status;
import com.nielsen.commonMethods.BaseMethod;

public class LayoutPageFrenchReg extends BaseMethod {
	public Actions action = new Actions(driver);

	public LayoutPageFrenchReg() {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	public void validate_LayoutPage(String header) {
		try {
			Thread.sleep(10000);
			driver.switchTo().defaultContent();
			driver.switchTo().frame(0);
			driver.switchTo().frame(driver.findElement(By.xpath("//iframe")));
			logger.log(Status.PASS, "iFrame passed");
			System.out.println("iFrame passed");
			Thread.sleep(10000);
			WebElement layout_header = driver.findElement(By.xpath("//div[@class='x-lbl-TITLE']"));

			if (layout_header.getText().equalsIgnoreCase(header)) {
				logger.log(Status.PASS, "Layout page is Displayed");
				System.out.println("Layout page is Displayed");
			}
		} catch (Exception e) {
			logger.log(Status.FAIL, " Exception ocuerd " + e);
		}
	}

	public void run_Report() {
		try {

			WebElement runReport = driver.findElement(By.xpath("//span[text()='EXÉCUTER LE RAPPORT']"));
			wait.until(ExpectedConditions.elementToBeClickable(runReport));
			if (runReport.isDisplayed()) {
				log.info("Run botton is displayed");
				action.moveToElement(runReport).build().perform();
				action.doubleClick(runReport).build().perform();
				Thread.sleep(10000);
				logger.log(Status.PASS, "Run button is clicked");
				System.out.println("Run button is clicked");
			}
		} catch (Exception e) {
			logger.log(Status.FAIL, " Exception ocuerd " + e);
		}
	}

}
