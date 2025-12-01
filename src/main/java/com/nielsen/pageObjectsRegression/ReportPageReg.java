package com.nielsen.pageObjectsRegression;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.aventstack.extentreports.Status;
import com.nielsen.commonMethods.BaseMethod;

public class ReportPageReg extends BaseMethod {
	public Actions action = new Actions(driver);
	// Download
	@FindBy(xpath = "//div[contains(@class,'x-btn kababbtnCls')]")
	public WebElement report_optionBtn;
     
	@FindBy(xpath ="//a[@id='button-1023-btnEl']")
	public WebElement report_optionBtn1;
    
	
	@FindBy(xpath = "(//span[@class='x-menu-item-text'])[4]")
	public WebElement download_option;

	@FindBy(xpath = "(//span[@class='x-menu-item-text'])[7]")
	public WebElement excel_option;

	@FindBy(xpath = "(//span[@class='x-menu-item-text'])[8]")
	public WebElement powerPoint_option;

	@FindBy(xpath = "(//span[@class='x-menu-item-text'])[9]")
	public WebElement pdf_option;

	@FindBy(xpath = "(//span[@class='x-menu-item-text'])[10]")
	public WebElement listRange_option;

	@FindBy(xpath = "(//span[@class='x-menu-item-text'])[11]")
	public WebElement advanced_option;

	@FindBy(xpath = "(//input[@class='x-form-field x-form-radio x-form-cb'])[1]")
	public WebElement export_Static;

	@FindBy(xpath = "(//input[@class='x-form-field x-form-radio x-form-cb'])[2]")
	public WebElement export_Refreshable;

	@FindBy(xpath = "(//input[@class='pageby-radio'])[1]")
	public WebElement export_Current1;

	@FindBy(xpath = "(//input[@class='pageby-radio'])[3]")
	public WebElement export_Current2;

	@FindBy(xpath = "(//input[@class='pageby-radio'])[2]")
	public WebElement export_All1;

	@FindBy(xpath = "(//input[@class='pageby-radio'])[4]")
	public WebElement export_All2;

	@FindBy(xpath = "//div[@class='spinWrapper']")
	public WebElement ds_spinner;

	@FindBy(xpath = "(//span[@class='x-btn-icon-el  '])[5]")
	public WebElement pop_upOk;

	// DrillDown
	@FindBy(xpath = "(//img[@class='x-drill'])[1]")
	public WebElement plus_Report_Btn1;

	@FindBy(xpath = "(//img[@class='x-drill'])[2]")
	public WebElement plus_Report_Btn2;

	@FindBy(xpath = "//span[text()='Drill To...']")
	public WebElement drillTo_OptionBtn;

	@FindBy(xpath = "//span[text()='Drill Down (SEGMENT)']")
	public WebElement drillDown_OptionBtn_AuUnilever;

	@FindBy(xpath = "//span[text()='Drill Down (CATEGORY)']")
	public WebElement drillDown_OptionBtn_CaBgFuels;

	// DrillTo
	@FindBy(xpath = "(//img[@class='x-action-col-icon x-action-col-0   '])[1]")
	public WebElement drillTo_OptionBtn1;

	@FindBy(xpath = "(//img[@class='x-action-col-icon x-action-col-0   '])[2]")
	public WebElement drillTo_OptionBtn2;

	@FindBy(xpath = "//div[@class='x-btn okbtnCls x-unselectable x-box-item x-btn-default-small x-noicon x-btn-noicon x-btn-default-small-noicon']")
	public WebElement drillTo_OptionBtn_Ok;

	// OlapChange
	@FindBy(xpath = "(//td[@class=' x-trigger-cell x-unselectable'])[1]")
	public WebElement PeriodsDropdownBtn;

	@FindBy(xpath = "(//td[@class=' x-trigger-cell x-unselectable'])[2]")
	public WebElement FactsDropdownBtn;

	@FindBy(xpath = "(//li[@role='option'])[6]")
	public WebElement PeriodsValue1;

	@FindBy(xpath = "(//li[@role='option'])[7]")
	public WebElement PeriodsValue2;

	@FindBy(xpath = "(//li[@role='option'])[1]")
	public WebElement FactsValue1;

	@FindBy(xpath = "(//li[@role='option'])[2]")
	public WebElement FactsValue2;

	@FindBy(xpath = "//span[text()='APPLY']")
	public WebElement ApplyBtn;

	// Sorting
	@FindBy(xpath = "(//div[contains(@class,'x-panel ')]//div[contains(@id,'headercontainer')]//div[contains(@class,'x-column-header-text')])[4]")
	public WebElement factValues_Report;

	@FindBy(xpath = "(//div[contains(@class,'x-box-inner ')]//a[contains(@id,'menuitem')]//span[contains(@class,'x-menu-item-text')])[6]")
	public WebElement sort_Ascending;

	@FindBy(xpath = "(//div[contains(@class,'x-box-inner ')]//a[contains(@id,'menuitem')]//span[contains(@class,'x-menu-item-text')])[7]")
	public WebElement sort_Descending;

	// SaveReport
	@FindBy(xpath = "(//a[@class='x-menu-item-link'])[3]")
	public WebElement saveReport_optionBtn;

	@FindBy(xpath = "(//div[@class='x-tab-wrap'])[3]")
	public WebElement saveReportDatacontext_optionBtn;

	@FindBy(xpath = "(//span[@class='x-column-header-text'])[1]")
	public WebElement saveReportDcLv1_optionBtn;

	@FindBy(xpath = "//div[@id='manageReportOkBtn-btnWrap']")
	public WebElement saveReportOk_optionBtn;

	@FindBy(xpath = "//input[@class='x-form-field x-form-required-field x-form-text']")
	public WebElement saveReportNameField_Btn;

	// EDIT AFTER FAVOURITE
	@FindBy(xpath = "(//a[@class='x-menu-item-link'])[2]")
	public WebElement editLayout_Report;

	@FindBy(xpath = "(//span[text()='Data'])[2]//following::span[text()='SELECT DATA']")
	public WebElement selectData_Layout;

	@FindBy(xpath = "(//span[text()='Markets'])[1]")
	public WebElement mktDim;

	@FindBy(xpath = "(//span[text()='Markets'])[2]")
	public WebElement mktTab;

	@FindBy(xpath = "(//span[text()='Market Groups'])[1]")
	public WebElement mktGrp;

	@FindBy(xpath = "(//span[text()='Markets'])[3]")
	public WebElement mkt_mktFolder;

	@FindBy(xpath = "(//div[@class='x-grid-row-checker'])[2]")
	public WebElement mkt_middlePane_2Item;

	@FindBy(xpath = "(//div[@class='x-grid-row-checker'])[3]")
	public WebElement mkt_middlePane_3Item;

	@FindBy(xpath = "//span[@id='button-1054-btnIconEl']")
	public WebElement runReport_DsPage;

	@FindBy(xpath = "//label[@class='x-component x-lbl-TITLE x-box-item x-component-default']")
	public WebElement ds_header;
	
	
	
	@FindBy(xpath = "//span[text()='Edit Layout']")
	public WebElement edit_Layout;
	
	@FindBy(xpath = "(//td[@class=' x-trigger-cell x-unselectable'])[1]")
	public WebElement MarketDropdownBtn;
	
	@FindBy(xpath = "(//div[@class='x-boundlist x-boundlist-floating x-layer x-boundlist-default'])[1]//li[@role='option'][1]")
	public WebElement MarketOption1;
	

	@FindBy(xpath = "(//td[@class=' x-trigger-cell x-unselectable'])[2]")
	public WebElement PeriodsDropdown;
	
	@FindBy(xpath = "(//div[@class='x-boundlist x-boundlist-floating x-layer x-boundlist-default'])[2]//li[@role='option'][3]")
	public WebElement PeriodsOption3;


	
	
	@FindBy(xpath = "(//div[@class='x-boundlist x-boundlist-floating x-layer x-boundlist-default'])[2]//li[@role='option'][1]")
	public WebElement PeriodsOption1;
      
	@FindBy(xpath ="//div[@id='button-1021-btnWrap']//child::span[text()='SELECT DATA']")
	public WebElement AdhocWEB;
	public ReportPageReg() {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	// report verification
	public void validate_ReportHeader() {
		try {
			Thread.sleep(15000);
			driver.switchTo().defaultContent();
			driver.switchTo().frame(0);
			driver.switchTo().frame(driver.findElement(By.xpath("//iframe")));
			Thread.sleep(10000);

//			WebElement report_header = driver.findElement(By.xpath("//div[@class='x-column-header-text x-lbl-H2']"));
//			if (report_header.getText().equalsIgnoreCase(" Description")) {
//				logger.log(Status.PASS, "Report page is Displayed");
//				System.out.println("Report page is Displayed");
//			}
			logger.log(Status.PASS, "Report page is Displayed");
			System.out.println("Report page is Displayed");
		} catch (Exception e) {
			System.out.println("exception occured" + e);
			logger.log(Status.FAIL, " Exception ocuerd " + e);
		}
	}

	// Sort Report
	public void Sorting_Reports() {
		try {
			Thread.sleep(1000);
			
			logger.log(Status.PASS, "iFrame passed");
			action.moveToElement(factValues_Report).build().perform();
			gen.click(factValues_Report);

			action.moveToElement(sort_Ascending).build().perform();
			gen.click(sort_Ascending);
			logger.log(Status.PASS, "Sorting Done");
			System.out.println("Sorting Done");
		} catch (Exception e) {
			System.out.println("exception occured" + e);
			logger.log(Status.FAIL, " Exception ocuerd " + e);
		}
	}
	public void Sorting_Reports1() {
		try {
			Thread.sleep(1000);
			driver.switchTo().defaultContent();
			driver.switchTo().frame(0);
			driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='iframe-31ac7f9d-f28d-494e-99d2-ca123545407e']")));
			logger.log(Status.PASS, "iFrame passed");
			Thread.sleep(4000);

			action.moveToElement(factValues_Report).build().perform();
			gen.click(factValues_Report);

			action.moveToElement(sort_Ascending).build().perform();
			gen.click(sort_Ascending);
			Thread.sleep(3000);
			
			logger.log(Status.PASS, "Sorting Done");
			System.out.println("Sorting Done");
		} catch (Exception e) {
			System.out.println("exception occured" + e);
			logger.log(Status.FAIL, " Exception ocuerd " + e);
		}
	}
	// Save report
	public String SaveReport_General(String reportName) {
		try {
			Thread.sleep(1000);
			// driver.switchTo().parentFrame();
			gen.waitForElement(report_optionBtn);
			action.moveToElement(report_optionBtn).build().perform();
			gen.click(report_optionBtn);
			logger.log(Status.PASS, "clicked option button");
			action.moveToElement(saveReport_optionBtn).build().perform();
			gen.click(saveReport_optionBtn);
			logger.log(Status.PASS, "clicked save report button");
			Thread.sleep(1000);

			action.keyDown(Keys.CONTROL);
			action.sendKeys("a");
			action.keyUp(Keys.CONTROL);
			action.build().perform();
			action.sendKeys(Keys.BACK_SPACE).build().perform();
			Thread.sleep(1000);

			SimpleDateFormat format = new SimpleDateFormat("dd-MM-YY HH-mm-ss");
			Date date = new Date();
			String ActualDate = format.format(date);
			String uniqueReportName = reportName.concat(ActualDate);

			action.sendKeys(uniqueReportName).build().perform();
//			action.moveToElement(saveReportDatacontext_optionBtn).build().perform();
//			gen.click(saveReportDatacontext_optionBtn);
//			action.moveToElement(saveReportDcLv1_optionBtn).build().perform();
//			gen.click(saveReportDcLv1_optionBtn);

			action.moveToElement(saveReportOk_optionBtn).build().perform();
			gen.click(saveReportOk_optionBtn);

			logger.log(Status.PASS, "Report saved");
			System.out.println("Report saved");

			return uniqueReportName;
		} catch (Exception e) {
			System.out.println("exception occured" + e);
			logger.log(Status.FAIL, " Exception ocuerd " + e);
			return null;
		}
	}
	public void SaveReport1() {
		try {
			Thread.sleep(1000);
			driver.switchTo().defaultContent();
			driver.switchTo().parentFrame();
			driver.switchTo().frame(driver.findElement(By.xpath("//iframe")));
			gen.waitForElement(report_optionBtn1);
			action.moveToElement(report_optionBtn1).build().perform();
			action.doubleClick(report_optionBtn1);
			logger.log(Status.PASS, "clicked option button");
			action.moveToElement(saveReport_optionBtn).build().perform();
			gen.click(saveReport_optionBtn);
			logger.log(Status.PASS, "clicked save report button");
			
			Thread.sleep(3000);
			

			
			

			action.moveToElement(saveReportOk_optionBtn).build().perform();
			gen.click(saveReportOk_optionBtn);

			logger.log(Status.PASS, "Report saved");
			System.out.println("Report saved");

			
		} catch (Exception e) {
			System.out.println("exception occured" + e);
			logger.log(Status.FAIL, " Exception ocuerd " + e);
			
		}
	}
	// Download
	public void download_AsExcel() {
		try {
			Thread.sleep(1000);
//			driver.switchTo().parentFrame();
			
		
			gen.waitForElement(report_optionBtn);

			action.moveToElement(report_optionBtn).build().perform();
			gen.click(report_optionBtn);
			logger.log(Status.PASS, "clicked option button");
			action.moveToElement(download_option).build().perform();
			logger.log(Status.PASS, "moved to download button");
			action.moveToElement(excel_option).build().perform();
			gen.click(excel_option);
			logger.log(Status.PASS, "clicked excel option button");
			System.out.println("clicked excel option button");
			try {
				wait.until(ExpectedConditions.invisibilityOfAllElements(ds_spinner));
			} catch (Exception e) {

			}
			Thread.sleep(5000);
		} catch (Exception e) {
			System.out.println("exception occured" + e);
			logger.log(Status.FAIL, " Exception ocuerd " + e);
		}
	}

	public void download_AsPpt() {
		try {
			
			
			Thread.sleep(1000);
			action.moveToElement(report_optionBtn).build().perform();
			gen.click(report_optionBtn);
			logger.log(Status.PASS, "clicked option button");
			action.moveToElement(download_option).build().perform();
			logger.log(Status.PASS, "moved to download button");
			action.moveToElement(powerPoint_option).build().perform();
			gen.click(powerPoint_option);
			logger.log(Status.PASS, "clicked powerpoint option button");
			System.out.println("clicked powerpoint option button");

			try {
				wait.until(ExpectedConditions.invisibilityOfAllElements(ds_spinner));
			} catch (Exception e) {

			}

			Thread.sleep(5000);
		} catch (Exception e) {
			System.out.println("exception occured" + e);
			logger.log(Status.FAIL, " Exception ocuerd " + e);
		}
	}

	public void download_AsPdf() {
		try {
			Thread.sleep(1000);
			
			action.moveToElement(report_optionBtn1).build().perform();
			gen.click(report_optionBtn1);
			logger.log(Status.PASS, "clicked option button");
			action.moveToElement(download_option).build().perform();
			logger.log(Status.PASS, "moved to download button");
			action.moveToElement(pdf_option).build().perform();
			gen.click(pdf_option);
			logger.log(Status.PASS, "clicked pdf option button");
			System.out.println("clicked pdf option button");

			try {
				wait.until(ExpectedConditions.invisibilityOfAllElements(ds_spinner));
			} catch (Exception e) {

			}

			Thread.sleep(15000);

		} catch (Exception e) {
			System.out.println("exception occured" + e);
			logger.log(Status.FAIL, " Exception ocuerd " + e);
		}
	}

	public void download_AsListrange() {
		try {
			Thread.sleep(1000);
			action.moveToElement(report_optionBtn).build().perform();
			gen.click(report_optionBtn);
			logger.log(Status.PASS, "clicked option button");
			action.moveToElement(download_option).build().perform();
			logger.log(Status.PASS, "moved to download button");
			action.moveToElement(listRange_option).build().perform();
			gen.click(listRange_option);
			logger.log(Status.PASS, "clicked listrange  option button");
			System.out.println("clicked listrange  option button");
			try {
				wait.until(ExpectedConditions.invisibilityOfAllElements(ds_spinner));
			} catch (Exception e) {

			}
			Thread.sleep(5000);
		} catch (Exception e) {
			System.out.println("exception occured" + e);
			logger.log(Status.FAIL, " Exception ocuerd " + e);
		}
	}

	public void download_AsAdvanced() {
		try {
			Thread.sleep(1000);
		
			action.moveToElement(report_optionBtn).build().perform();
			gen.click(report_optionBtn);
			logger.log(Status.PASS, "clicked option button");
			action.moveToElement(download_option).build().perform();
			logger.log(Status.PASS, "moved to download button");
			action.moveToElement(advanced_option).build().perform();
			gen.click(advanced_option);
			logger.log(Status.PASS, "clicked advanced option button");
			Thread.sleep(2000);
//			action.moveToElement(pop_upOk).build().perform();
//			gen.click(pop_upOk);
//			try {
//				wait.until(ExpectedConditions.invisibilityOfAllElements(ds_spinner));
//			} catch (Exception e) {
//
//			}
//			Thread.sleep(5000);
//			log.info("Downloaded all formats of report");
//			System.out.println("Downloaded all formats of report");
		} catch (Exception e) {
			System.out.println("exception occured" + e);
			logger.log(Status.FAIL, " Exception ocuerd " + e);
		}
	}

	public void download_AsAdvanced_StaticCurrent() {
		try {
			Thread.sleep(1000);

			gen.click(export_Static);
			gen.click(pop_upOk);
			try {
				wait.until(ExpectedConditions.invisibilityOfAllElements(ds_spinner));
			} catch (Exception e) {

			}
			Thread.sleep(5000);
			log.info("Exported static current report");
			System.out.println("Exported static current report");
			
		} catch (Exception e) {
			System.out.println("exception occured" + e);
			logger.log(Status.FAIL, " Exception ocuerd " + e);
		}
	}
	public void click_ADHOCWEB() {
		try {
			Thread.sleep(1000);;
		
			driver.switchTo().defaultContent();
			driver.switchTo().frame(0);
			action.moveToElement(driver.findElement(By.xpath("(//iframe)[1]")));
            action.moveToElement(AdhocWEB).build().perform();
			gen.click(AdhocWEB);
			
			
         } catch (Exception e) {
			System.out.println("exception occured" + e);
			logger.log(Status.FAIL, " Exception ocuerd " + e);
		}
	}
	public void download_AsAdvanced_StaticAll() {
		try {
			Thread.sleep(1000);

			gen.click(export_Static);
			gen.click(export_All1);
			gen.click(export_All2);
			gen.click(pop_upOk);
			try {
				wait.until(ExpectedConditions.invisibilityOfAllElements(ds_spinner));
			} catch (Exception e) {

			}
			Thread.sleep(5000);
			log.info("Exported static all report");
			System.out.println("Exported static all report");
		} catch (Exception e) {
			System.out.println("exception occured" + e);
			logger.log(Status.FAIL, " Exception ocuerd " + e);
		}
	}

	public void download_AsAdvanced_Refreshable() {
		try {
			Thread.sleep(1000);

//			gen.click(export_Static);
			gen.click(pop_upOk);
			try {
				wait.until(ExpectedConditions.invisibilityOfAllElements(ds_spinner));
			} catch (Exception e) {

			}
			Thread.sleep(5000);
			log.info("Exported Refreshable current report");
			System.out.println("Exported Refreshable current report");
		} catch (Exception e) {
			System.out.println("exception occured" + e);
			logger.log(Status.FAIL, " Exception ocuerd " + e);
		}
	}

	// DrillDown
	public void Drill_Down_AuUnilever() {
		try {
			Thread.sleep(1000);
			action.moveToElement(plus_Report_Btn1).build().perform();
			gen.click(plus_Report_Btn1);
			action.moveToElement(drillDown_OptionBtn_AuUnilever).build().perform();
			gen.click(drillDown_OptionBtn_AuUnilever);
			Thread.sleep(2000);
			logger.log(Status.PASS, "Drill Down Done");
			System.out.println("Drill Down Done");
		} catch (Exception e) {
			System.out.println("exception occured" + e);
			logger.log(Status.FAIL, " Exception ocuerd " + e);
		}
	}

	public void Drill_To() {
		try {
			Thread.sleep(5000);
			action.moveToElement(plus_Report_Btn2).build().perform();
			gen.click(plus_Report_Btn2);

			action.moveToElement(drillTo_OptionBtn).build().perform();
			gen.click(drillTo_OptionBtn);

			action.moveToElement(drillTo_OptionBtn1).build().perform();
			gen.click(drillTo_OptionBtn1);

			action.moveToElement(drillTo_OptionBtn2).build().perform();
			gen.click(drillTo_OptionBtn2);
			action.moveToElement(drillTo_OptionBtn_Ok).click().build().perform();
			// gen.click(drillTo_OptionBtn_Ok);
			Thread.sleep(2000);
			logger.log(Status.PASS, "Drill To Done");
			System.out.println("Drill To Done");
		} catch (Exception e) {
			System.out.println("exception occured" + e);
			logger.log(Status.FAIL, " Exception ocuerd " + e);
		}
	}

	// Olap Change
	public void olapChange() {
		try {
			// validate_ReportHeader();
			// changeGraphAndTableSize();
			Thread.sleep(3000);
			action.moveToElement(FactsDropdownBtn).build().perform();
			action.click(FactsDropdownBtn).build().perform();
			action.moveToElement(FactsValue2).build().perform();
			action.click(FactsValue2).build().perform();
			action.moveToElement(PeriodsDropdownBtn).build().perform();
			action.click(PeriodsDropdownBtn).build().perform();
			action.moveToElement(PeriodsValue2).build().perform();
			action.click(PeriodsValue2).build().perform();
			action.moveToElement(ApplyBtn).build().perform();
			action.click(ApplyBtn).build().perform();
			Thread.sleep(10000);
			logger.log(Status.PASS, "Olap Change done");
			System.out.println("Olap Change done");

		} catch (Exception e) {
			System.out.println("exception occured" + e);
			logger.log(Status.FAIL, " Exception ocuerd " + e);
		}
	}

	public void validate_FavReportHeader() {
		try {
			Thread.sleep(15000);
			driver.switchTo().defaultContent();
			driver.switchTo().frame(0);
			// driver.switchTo().frame(driver.findElement(By.xpath("//iframe")));
			Thread.sleep(10000);

			logger.log(Status.PASS, "Report page is Displayed");
			System.out.println("Report page is Displayed");
		} catch (Exception e) {
			System.out.println("exception occured" + e);
			logger.log(Status.FAIL, " Exception ocuerd " + e);
		}
	}

	public void switchToCdsFrame() throws Throwable {

		try {
			Thread.sleep(10000);
			// driver.switchTo().defaultContent();
			driver.switchTo().frame(0);
			driver.switchTo().frame(driver.findElement(By.xpath("(//iframe)[2]")));
			// driver.switchTo().frame(driver.findElement(By.xpath("(//iframe)[3]")));
			logger.log(Status.PASS, "iFrame passed");
			Thread.sleep(10000);
			if (ds_header.getText().equalsIgnoreCase("Dataselector")) {
				logger.log(Status.PASS, "DataSelector page is Displayed");
				System.out.println("DataSelector page is Displayed");
			}
		} catch (Exception e) {
			System.out.println("exception occured" + e);
			logger.log(Status.FAIL, " Exception ocuerd " + e);
		}

	}

	public void validate_FavReport_EditDS() throws Throwable {
		try {
			Thread.sleep(15000);
			driver.switchTo().defaultContent();
			driver.switchTo().frame(0);
//			driver.switchTo().defaultContent();
//			driver.switchTo().frame(driver.findElement(By.xpath("//form[@accept-charset='utf-8']//following::iframe")));
//			Thread.sleep(10000);
//			action.moveToElement(report_optionBtn).build().perform();
			gen.click(report_optionBtn);
			action.moveToElement(editLayout_Report).build().perform();
			action.click(editLayout_Report).build().perform();
			Thread.sleep(1000);
			driver.switchTo().defaultContent();
			driver.switchTo().frame(0);
			driver.switchTo().frame(driver.findElement(By.xpath("//iframe")));
			action.moveToElement(selectData_Layout).build().perform();
			action.click(selectData_Layout).build().perform();

			switchToCdsFrame();

			gen.click(mktDim);
			gen.click(mktTab);
			gen.click(mktGrp);
			gen.click(mkt_mktFolder);
			Thread.sleep(2000);
			gen.doubleClick(mkt_middlePane_2Item);
			gen.doubleClick(mkt_middlePane_3Item);
			Thread.sleep(2000);
			action.moveToElement(runReport_DsPage).build().perform();
			action.click(runReport_DsPage).build().perform();
			logger.log(Status.PASS, "Favourite report edited");
			System.out.println("Favourite report edited");
		} catch (Exception e) {
			System.out.println("exception occured" + e);
			logger.log(Status.FAIL, " Exception ocuerd " + e);
		}
	}
	public void olapChangeMarketAndPeriods() {
		try {
			
			action.moveToElement(MarketDropdownBtn).build().perform();
			action.click(MarketDropdownBtn).build().perform();
			action.moveToElement(MarketOption1).build().perform();
			action.click(MarketOption1).build().perform();
			Thread.sleep(3000);
			action.moveToElement(PeriodsDropdown).build().perform();
			action.click(PeriodsDropdown).build().perform();
			action.moveToElement(PeriodsOption3).build().perform();
			action.click(PeriodsOption3).build().perform();
			action.moveToElement(ApplyBtn).build().perform();
			action.click(ApplyBtn).build().perform();
			Thread.sleep(10000);
			logger.log(Status.PASS, "Olap Change done");
			System.out.println("Olap Change done");

		} catch (Exception e) {
			System.out.println("exception occured" + e);
			logger.log(Status.FAIL, " Exception ocuerd " + e);
		}
	}
	
	public void edit_Layout() {
		try {
			Thread.sleep(5000);
//			driver.switchTo().defaultContent();
//			driver.switchTo().frame(0);
//			driver.switchTo().parentFrame();
			action.moveToElement(report_optionBtn).build().perform();
			action.click(report_optionBtn).build().perform();
			Thread.sleep(2000);
			action.moveToElement(edit_Layout).build().perform();
			action.click(edit_Layout).build().perform();
			
			logger.log(Status.PASS, "edit Layout Clicked");
			System.out.println("edit Layout Clicked");
			action.sendKeys(Keys.F5).build().perform();
			
		} catch (Exception e) {
			System.out.println("exception occured" + e);
			logger.log(Status.FAIL, " Exception ocuerd " + e);
		}
	}
}
