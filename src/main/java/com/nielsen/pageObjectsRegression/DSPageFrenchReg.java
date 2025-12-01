
package com.nielsen.pageObjectsRegression;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.aventstack.extentreports.Status;
import com.nielsen.commonMethods.BaseMethod;

public class DSPageFrenchReg extends BaseMethod {

	public Actions action = new Actions(driver);

	// DS Page

	@FindBy(xpath = "(//span[text()='Circuits'])[1]")
	public WebElement mktDim;

	@FindBy(xpath = "(//span[text()='Circuits'])[2]")
	public WebElement mktTab;

	@FindBy(xpath = "(//span[text()='Circuits'])[3]")
	public WebElement mktGrp;

	@FindBy(xpath = "(//span[text()='Circuits'])[5]")
	public WebElement mkt_mktFolder;

	@FindBy(xpath = "(//span[text()='100% circuit de référence'])[1]")
	public WebElement mktShareTab;

	@FindBy(xpath = "(//span[text()='Circuits'])[6]")
	public WebElement mktShrGrp;

	@FindBy(xpath = "(//span[text()='Circuits'])[8]")
	public WebElement mktshare_mktFolder;

	@FindBy(xpath = "(//span[text()='Produits'])[1]")
	public WebElement prodDim;

	@FindBy(xpath = "(//span[text()='Produits'])[2]")
	public WebElement prodTab;

	@FindBy(xpath = "(//span[text()='Hierarchies'])[5]")
	public WebElement Prod_Hierarchies;

	@FindBy(xpath = "(//span[text()='Produits']/ancestor::div[@class='x-panel x-fit-item x-panel-secondary']/div[2]//tr[2])[1]")
	public WebElement prodHier_Folder;

	@FindBy(xpath = "(//span[text()='Produits']/ancestor::div[@class='x-panel x-fit-item x-panel-secondary']/div[2]//tr[3])[1]")
	public WebElement prodHier_subFolder;

	@FindBy(xpath = "((//span[text()='Produits'])[3]/ancestor::div[@class='x-panel x-box-item x-accordion-item x-panel-default']//following::div[2]//div//div[3]//tr)[1]")
	public WebElement prod_middlePane_1Item;

	@FindBy(xpath = "//span[text()='100% produit de référence']")
	public WebElement prodShareTab;

	@FindBy(xpath = "(//span[text()='Hierarchies'])[7]")
	public WebElement prodShare_Hierarchies;

	@FindBy(xpath = "(//span[text()='Produits']/ancestor::div[@class='x-panel x-fit-item x-panel-secondary']/div[2]//tr[2])[4]")
	public WebElement prodShare_hier_folder;

	@FindBy(xpath = "(//span[text()='Produits']/ancestor::div[@class='x-panel x-fit-item x-panel-secondary']/div[2]//tr[3])[4]")
	public WebElement prodShare_hier_subFolder;

	@FindBy(xpath = "(//span[text()='100% produit de référence'])[2]/ancestor::div[@class='x-container x-box-item x-container-default x-accordion-layout-ct']//following::div[3]/div[3]//tr")
	public WebElement prodShare_middlepane_1Item;

	@FindBy(xpath = "(//span[text()='Périodes'])[1]")
	public WebElement periodDim;

	@FindBy(xpath = "(//span[text()='Périodes'])[2]")
	public WebElement periodGrp;

	@FindBy(xpath = "(//span[text()='Périodes']/ancestor::div[@class='x-container x-box-item x-container-default x-layout-fit']/div/div[2]/div/div[2]/div/div/div/div[2]//td)[3]")
	public WebElement periodFolder;

	@FindBy(xpath = "(//span[text()='Périodes']/ancestor::div[@class='x-container x-box-item x-container-default x-layout-fit']//following::table/tbody/tr[3]/td[1]/div/span[1])[1]")
	public WebElement period_SubFolder;

	@FindBy(xpath = "(//span[text()='Indicateurs'])[1]")
	public WebElement factDim;

	@FindBy(xpath = "(//span[text()='Indicateurs'])[2]")
	public WebElement factGrp;

	@FindBy(xpath = "((//span[text()='Indicateurs'])[2]/ancestor::div[@class='x-container x-box-item x-container-default x-layout-fit']//following::div[2]//div[1]//tr[2]/td[1]/div)[1]")
	public WebElement factFolder;

	@FindBy(xpath = "((//span[text()='Indicateurs'])[2]/ancestor::div[@class='x-container x-box-item x-container-default x-layout-fit']//following::div[2]//div[1]//tr[3]/td[1]/div)[1]")
	public WebElement fact_subFolder;

	// @FindBy(xpath = "//span[text()='BERICHT AUSFÜHREN']")
	// public WebElement RunReportBtn;

	@FindBy(xpath = "//div[@id= 'button-1056']")
	public WebElement applyButton;

	@FindBy(xpath = "//label[@class='x-component x-lbl-TITLE x-box-item x-component-default']")
	public WebElement ds_header;

	@FindBy(xpath = "(//div[@class='x-grid-row-checker'])[1]")
	public WebElement mkt_middlePane_1Item;

	@FindBy(xpath = "(//div[@class='x-grid-row-checker'])[2]")
	public WebElement mkt_middlePane_2Item;

	@FindBy(xpath = "(//div[@class='x-grid-row-checker'])[3]")
	public WebElement mkt_middlePane_3Item;

	@FindBy(xpath = "((//span[text()='100% circuit de référence'])[2]/ancestor::div[@class='x-container x-box-item x-container-default x-accordion-layout-ct']//following::div/table/tbody/tr[1]/td[1]/div/div)[1]")
	public WebElement mktshare_middlepane_1Item;

	@FindBy(xpath = "((//span[@class='x-header-text x-panel-header-text'])[5]/ancestor::div[@class='x-container x-box-item x-container-default x-accordion-layout-ct']//div[2]/div[1]/div[3]//td[2]/div)[1]")
	public WebElement per_middlePane_1Item;

	@FindBy(xpath = "((//span[@class='x-header-text x-panel-header-text'])[5]/ancestor::div[@class='x-container x-box-item x-container-default x-accordion-layout-ct']//div[2]/div[1]/div[3]//td[2]/div)[2]")
	public WebElement per_middlePane_2Item;

	@FindBy(xpath = "((//span[@class='x-header-text x-panel-header-text'])[5]/ancestor::div[@class='x-container x-box-item x-container-default x-accordion-layout-ct']//div[2]/div[1]/div[3]//td[2]/div)[3]")
	public WebElement per_middlePane_3Item;

	@FindBy(xpath = "((//span[@class='x-header-text x-panel-header-text'])[6]/ancestor::div[@class='x-container x-box-item x-container-default x-accordion-layout-ct']//following::div[2]//div[3]//tr[1]/td[2]/div)[1]")
	public WebElement fact_middlePane_1Item;

	@FindBy(xpath = "((//span[@class='x-header-text x-panel-header-text'])[6]/ancestor::div[@class='x-container x-box-item x-container-default x-accordion-layout-ct']//following::div[2]//div[3]//tr[2]/td[2]/div)[1]")
	public WebElement fact_middlePane_2Item;

	@FindBy(xpath = "((//span[@class='x-header-text x-panel-header-text'])[6]/ancestor::div[@class='x-container x-box-item x-container-default x-accordion-layout-ct']//following::div[2]//div[3]//tr[3]/td[2]/div)[1]")
	public WebElement fact_middlePane_3Item;

	public DSPageFrenchReg() {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	public void switchToCdsFrame() throws Throwable {

		try {
			Thread.sleep(10000);
			driver.switchTo().defaultContent();
			driver.switchTo().frame(0);
			driver.switchTo().frame(driver.findElement(By.xpath("//iframe")));
			logger.log(Status.PASS, "iFrame passed");
			Thread.sleep(10000);
			if (ds_header.getText().equalsIgnoreCase("Sélecteur de données")) {
				logger.log(Status.PASS, "DataSelector page is Displayed");
			}
		} catch (Exception e) {
			logger.log(Status.FAIL, " Exception ocuerd " + e);
		}

	}

	// French Normal Selection
	public void marketSelection() {
		try {
			gen.click(mktDim);
			gen.click(mktTab);
			gen.click(mktGrp);
			gen.click(mkt_mktFolder);
			Thread.sleep(2000);
			action.doubleClick(mkt_middlePane_1Item).build().perform();
			action.doubleClick(mkt_middlePane_2Item).build().perform();
			action.doubleClick(mkt_middlePane_3Item).build().perform();

			gen.click(mktShareTab);
			gen.click(mktshare_mktFolder);
			gen.click(mktTab);
			gen.click(mktShareTab);
			gen.doubleClick(mktshare_middlepane_1Item);
			logger.log(Status.PASS, "Market selection done");

		} catch (Exception e) {
			logger.log(Status.FAIL, " Exception ocuerd " + e);
		}
	}

	public void productSelection() {
		try {
			gen.click(prodDim);
			action.moveToElement(prodTab).build().perform();
			action.click(prodTab).build().perform();
//			gen.click(prodTab);
			gen.click(prodHier_Folder);
			action.moveToElement(prodHier_subFolder).build().perform();
			gen.click(prodHier_subFolder);
			Thread.sleep(1000);
			gen.click(prodShareTab);
			action.moveToElement(prodTab).build().perform();
			action.click(prodTab).build().perform();
//			gen.click(prodTab);

			gen.doubleClick(prod_middlePane_1Item);

			gen.click(prodShareTab);

			action.moveToElement(prodShare_hier_folder).build().perform();
			gen.click(prodShare_hier_folder);
			action.moveToElement(prodShare_hier_subFolder).build().perform();
			gen.click(prodShare_hier_subFolder);
			Thread.sleep(1000);
			gen.click(prodTab);
			gen.click(prodShareTab);
			gen.doubleClick(prodShare_middlepane_1Item);
			logger.log(Status.PASS, "Product selection done");

		} catch (Exception e) {
			logger.log(Status.FAIL, " Exception ocuerd " + e);
		}
	}

	public void periodSelection() {
		try {
			gen.click(periodDim);
			gen.click(periodGrp);
			action.moveToElement(periodFolder).build().perform();
			gen.click(periodFolder);
			action.moveToElement(period_SubFolder).build().perform();
			gen.click(period_SubFolder);
			Thread.sleep(2000);

			gen.doubleClick(per_middlePane_1Item);
			gen.doubleClick(per_middlePane_2Item);
			gen.doubleClick(per_middlePane_3Item);
			logger.log(Status.PASS, "period selection done");

		} catch (Exception e) {
			logger.log(Status.FAIL, " Exception ocuerd " + e);
		}
	}

	public void factSelection() {
		try {
			gen.click(factDim);
			gen.click(factGrp);
			gen.click(factFolder);
			action.moveToElement(fact_subFolder).build().perform();
			gen.click(fact_subFolder);
			Thread.sleep(2000);

			gen.doubleClick(fact_middlePane_1Item);
			gen.doubleClick(fact_middlePane_2Item);
			gen.doubleClick(fact_middlePane_3Item);
			logger.log(Status.PASS, "Fact selection done");
			wait.until(ExpectedConditions.visibilityOf(applyButton));

			if (applyButton.isEnabled()) {
				System.out.println("apply botton is enabled");
				action.moveToElement(applyButton).build().perform();
				gen.click(applyButton);
				logger.log(Status.PASS, "Apply button is clicked");
			}
		} catch (Exception e) {
			System.out.println("exception occured");
			logger.log(Status.FAIL, " Exception ocuerd " + e);
		}
	}
}
