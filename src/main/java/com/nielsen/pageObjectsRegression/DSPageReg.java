package com.nielsen.pageObjectsRegression;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.aventstack.extentreports.Status;
import com.nielsen.commonMethods.BaseMethod;

public class DSPageReg extends BaseMethod {
	public Actions action = new Actions(driver);
	@FindBy(xpath = "//label[@class='x-component x-lbl-TITLE x-box-item x-component-default']")
	public WebElement ds_header;

	@FindBy(xpath = "//nd-spinner")
	public List<WebElement> spinner;

	@FindBy(xpath = "//div[@class='spinWrapper']")
	public WebElement ds_spinner;

	// NORMAL PROMPTS
	// MARKET
	@FindBy(xpath = "(//span[text()='Markets'])[1]")
	public WebElement mktDim;

	@FindBy(xpath = "(//span[text()='Markets'])[2]")
	public WebElement mktTab;

	@FindBy(xpath = "(//span[text()='Market Groups'])[1]")
	public WebElement mktGrp;

	@FindBy(xpath = "(//span[text()='Markets'])[3]")
	public WebElement mkt_mktFolder;

	@FindBy(xpath = "(//div[@class='x-grid-row-checker'])[1]")
	public WebElement mkt_middlePane_1Item;

	@FindBy(xpath = "(//div[@class='x-grid-row-checker'])[2]")
	public WebElement mkt_middlePane_2Item;

	@FindBy(xpath = "(//div[@class='x-grid-row-checker'])[3]")
	public WebElement mkt_middlePane_3Item;

	@FindBy(xpath = "(//span[text()='Market Share'])[1]")
	public WebElement mktShareTab;

	@FindBy(xpath = "(//span[text()='Markets'])[4]")
	public WebElement mktshare_mktFolder;

	@FindBy(xpath = "((//span[text()='Market Share'])[2]/ancestor::div[@class='x-container x-box-item x-container-default x-accordion-layout-ct']//following::div/table/tbody/tr[1]/td[1]/div/div)[1]")
	public WebElement mktshare_middlepane_1Item;

	// PRODUCT
	@FindBy(xpath = "(//span[text()='Products'])[1]")
	public WebElement prodDim;

	@FindBy(xpath = "(//span[text()='Products'])[2]")
	public WebElement prodTab;

	@FindBy(xpath = "(//span[text()='Hierarchies'])[5]")
	public WebElement Prod_Hierarchies;

	@FindBy(xpath = "(//span[text()='Products']/ancestor::div[@class='x-panel x-fit-item x-panel-secondary']/div[2]//tr[2])[1]")
	public WebElement prodHier_Folder;

	@FindBy(xpath = "(//span[text()='Products']/ancestor::div[@class='x-panel x-fit-item x-panel-secondary']/div[2]//tr[3])[1]")
	public WebElement prodHier_subFolder;

	@FindBy(xpath = "(//span[text()='Products']/ancestor::div[@class='x-panel x-fit-item x-panel-secondary']/div[2]//tr[4])[1]")
	public WebElement prodHier_subFolder2;
	
	@FindBy(xpath = "(//span[text()='Products']/ancestor::div[@class='x-panel x-fit-item x-panel-secondary']/div[2]//tr[5])[1]")
	public WebElement prodHier_subFolder3;

	@FindBy(xpath = "(//span[text()='Products']/ancestor::div[@class='x-panel x-fit-item x-panel-secondary']/div[2]//tr[6])[1]")
	public WebElement prodHier_subFolder4;

	@FindBy(xpath = "(//span[text()='Products']/ancestor::div[@class='x-panel x-fit-item x-panel-secondary']/div[2]//tr[7])[1]")
	public WebElement prodHier_subFolder5;

	@FindBy(xpath = "(//div[@class='x-panel-body x-grid-body x-panel-body-default x-layout-fit']//child::tr)[123]")
	public WebElement prod_middlePane_1Item;
	
	@FindBy(xpath = "(//div[@class='x-panel-body x-grid-body x-panel-body-default x-layout-fit']//child::tr)")
	public WebElement prodsaved_middlePane_1Item;

	@FindBy(xpath = "(//div[@class='x-panel-body x-grid-body x-panel-body-default x-layout-fit']//child::tr)[124]")
	public WebElement prod_middlePane_2Item;

	@FindBy(xpath = "(//div[@class='x-panel-body x-grid-body x-panel-body-default x-layout-fit']//child::tr)[125]")
	public WebElement prod_middlePane_3Item;
	
	@FindBy(xpath = "(//div[@class='x-panel-body x-grid-body x-panel-body-default x-layout-fit']//child::tr)[126]")
	public WebElement prod_middlePane_4Item;
	
	@FindBy(xpath = "(//div[@class='x-panel-body x-grid-body x-panel-body-default x-layout-fit']//child::tr)[127]")
	public WebElement prod_middlePane_5Item;
	
	@FindBy(xpath = "//span[text()='Product Share']")
	public WebElement prodShareTab;

	@FindBy(xpath = "(//span[text()='Hierarchies'])[7]")
	public WebElement prodShare_Hierarchies;

	@FindBy(xpath = "(//span[text()='Products']/ancestor::div[@class='x-panel x-fit-item x-panel-secondary']/div[2]//tr[2])[4]")
	public WebElement prodShare_hier_folder;

	@FindBy(xpath = "(//span[text()='Products']/ancestor::div[@class='x-panel x-fit-item x-panel-secondary']/div[2]//tr[2])[3]")
	public WebElement prodShare_hier_folder_Loreal;

	@FindBy(xpath = "(//span[text()='Products']/ancestor::div[@class='x-panel x-fit-item x-panel-secondary']/div[2]//tr[3])[3]")
	public WebElement prodShare_hier_subFolder_Loreal;

	@FindBy(xpath = "(//span[text()='Products']/ancestor::div[@class='x-panel x-fit-item x-panel-secondary']/div[2]//tr[3])[4]")
	public WebElement prodShare_hier_subFolder;

	@FindBy(xpath = "(//span[text()='Product Share'])[2]/ancestor::div[@class='x-container x-box-item x-container-default x-accordion-layout-ct']//following::div[3]/div[3]//tr")
	public WebElement prodShare_middlepane_1Item;

	@FindBy(xpath="(//div[@id='selectionsummarypanel-1023-body']//following::td[@class='x-grid-cell x-grid-td x-grid-cell-displaySelectionNodeActionMenu x-grid-cell-last x-unselectable  x-action-col-cell'])[12]//child::img")
	public WebElement prodConditionOption;
	
	@FindBy(xpath="//span[text()='Conditions']")
	public WebElement prodConditionButton;
	
	@FindBy(xpath="//label[text()='Condition Formula']")
	public WebElement ConditionFormula;
	
	@FindBy(xpath="(//span[text()='OK'])[3]")
	public WebElement ConditionOKButton;
	
	@FindBy(xpath="(//tr[@class='x-grid-row x-grid-row-selected selTextBold x-grid-tree-node-expanded x-grid-data-row x-grid-row-focused']//child::img)[5]")
    public WebElement ConditionToolTip;
	
	// PERIOD
	@FindBy(xpath = "//span[text()='Periods']")
	public WebElement periodDim;

	@FindBy(xpath = "(//span[text()='Period Groups'])[1]")
	public WebElement periodGrp;

	@FindBy(xpath = "(//span[text()='Period Groups']/ancestor::div[@class='x-container x-box-item x-container-default x-layout-fit']/div/div[2]/div/div[2]/div/div/div/div[2]//td)[3]")
	public WebElement periodFolder;

	@FindBy(xpath = "//span[text()='Period Groups']/ancestor::div[@class='x-container x-box-item x-container-default x-layout-fit']//following::table/tbody/tr[3]/td[1]/div/span[1]")
	public WebElement period_SubFolder;

	@FindBy(xpath = "((//span[@class='x-header-text x-panel-header-text'])[5]/ancestor::div[@class='x-container x-box-item x-container-default x-accordion-layout-ct']//div[2]/div[1]/div[3]//td[2]/div)[1]")
	public WebElement per_middlePane_1Item;

	@FindBy(xpath = "((//span[@class='x-header-text x-panel-header-text'])[5]/ancestor::div[@class='x-container x-box-item x-container-default x-accordion-layout-ct']//div[2]/div[1]/div[3]//td[2]/div)[2]")
	public WebElement per_middlePane_2Item;

	@FindBy(xpath = "((//span[@class='x-header-text x-panel-header-text'])[5]/ancestor::div[@class='x-container x-box-item x-container-default x-accordion-layout-ct']//div[2]/div[1]/div[3]//td[2]/div)[3]")
	public WebElement per_middlePane_3Item;

	// FACT
	@FindBy(xpath = "//span[text()='Facts']")
	public WebElement factDim;

	@FindBy(xpath = "(//span[text()='Fact Groups'])[1]")
	public WebElement factGrp;

	@FindBy(xpath = "((//span[text()='Fact Groups'])[1]/ancestor::div[@class='x-container x-box-item x-container-default x-layout-fit']//following::div[2]//div[1]//tr[2]/td[1]/div)[1]")
	public WebElement factFolder;

	@FindBy(xpath = "((//span[text()='Fact Groups'])[1]/ancestor::div[@class='x-container x-box-item x-container-default x-layout-fit']//following::div[2]//div[1]//tr[3]/td[1]/div)[1]")
	public WebElement fact_subFolder;

	@FindBy(xpath = "((//span[@class='x-header-text x-panel-header-text'])[6]/ancestor::div[@class='x-container x-box-item x-container-default x-accordion-layout-ct']//following::div[2]//div[3]//tr[1]/td[2]/div)[1]")
	public WebElement fact_middlePane_1Item;

	@FindBy(xpath = "((//span[@class='x-header-text x-panel-header-text'])[6]/ancestor::div[@class='x-container x-box-item x-container-default x-accordion-layout-ct']//following::div[2]//div[3]//tr[2]/td[2]/div)[1]")
	public WebElement fact_middlePane_2Item;

	@FindBy(xpath = "((//span[@class='x-header-text x-panel-header-text'])[6]/ancestor::div[@class='x-container x-box-item x-container-default x-accordion-layout-ct']//following::div[2]//div[3]//tr[3]/td[2]/div)[1]")
	public WebElement fact_middlePane_3Item;

	// saved selections
	@FindBy(xpath = "(//span[text()='Saved Markets'])[1]")
	public WebElement savedMkt;

	@FindBy(xpath = "(//span[text()='My Saved Market'])[1]")
	public WebElement mySavedMkt;

	@FindBy(xpath = "(//tr[@class='x-grid-row second-level-margin x-grid-tree-node-leaf x-grid-data-row']/td/div//span[@class='x-tree-node-text'])[1]")
	public WebElement mySavedMktDb;

	@FindBy(xpath = "(//span[text()='Saved Market Share'])[1]")
	public WebElement savedMktShr;

	@FindBy(xpath = "(//span[text()='My Saved Market'])[2]")
	public WebElement mySavedMktShr;

	@FindBy(xpath = "(//tr[@class='x-grid-row second-level-margin x-grid-tree-node-leaf x-grid-data-row']/td/div//span[@class='x-tree-node-text'])[3]")
	public WebElement mySavedMktShrDb;

	@FindBy(xpath = "(//div[contains(@class,'x-toolbar x-docked x-toolbar-default x-docked-bottom x-toolbar-docked-bottom x-toolbar-default-docked-bottom x-box-layout-ct x-docked-noborder-right x-docked-noborder-bottom x-docked-noborder-left')]//span[text()='ADD'])[1]")
	public WebElement mktAddBtn;

	@FindBy(xpath = "(//div[contains(@class,'x-toolbar x-docked x-toolbar-default x-docked-bottom x-toolbar-docked-bottom x-toolbar-default-docked-bottom x-box-layout-ct x-docked-noborder-right x-docked-noborder-bottom x-docked-noborder-left')]//span[text()='ADD'])[2]")
	public WebElement mktShrAddBtn;

	@FindBy(xpath = "(//span[text()='Saved Products'])[1]")
	public WebElement savedProd;

	@FindBy(xpath = "(//span[text()='My Saved Product'])[1]")
	public WebElement mySavedProd;

	@FindBy(xpath = "(//tr[@class='x-grid-row second-level-margin x-grid-tree-node-leaf x-grid-data-row']/td/div//span[@class='x-tree-node-text'])[3]")
	public WebElement mySavedProdDb;

	@FindBy(xpath = "(//span[text()='Saved Product Share'])[1]")
	public WebElement savedProdShr;

	@FindBy(xpath = "(//span[text()='My Saved Product'])[2]")
	public WebElement mySavedProdShr;

	@FindBy(xpath = "(//tr[@class='x-grid-row second-level-margin x-grid-tree-node-leaf x-grid-data-row']/td/div//span[@class='x-tree-node-text'])[5]")
	public WebElement mySavedProdShrDb;

	@FindBy(xpath = "(//div[contains(@class,'x-toolbar x-docked x-toolbar-default x-docked-bottom x-toolbar-docked-bottom x-toolbar-default-docked-bottom x-box-layout-ct x-docked-noborder-right x-docked-noborder-bottom x-docked-noborder-left')]//span[text()='ADD'])[3]")
	public WebElement prodAddBtn;

	@FindBy(xpath = "(//div[contains(@class,'x-toolbar x-docked x-toolbar-default x-docked-bottom x-toolbar-docked-bottom x-toolbar-default-docked-bottom x-box-layout-ct x-docked-noborder-right x-docked-noborder-bottom x-docked-noborder-left')]//span[text()='ADD'])[4]")
	public WebElement prodShrAddBtn;

	@FindBy(xpath = "(//span[text()='Saved Periods'])[1]")
	public WebElement savedPeriod;

	@FindBy(xpath = "(//tr[@class='x-grid-row second-level-margin x-grid-tree-node-leaf x-grid-data-row']/td/div//span[@class='x-tree-node-text'])[5]")
	public WebElement mySavedPerDb;

	@FindBy(xpath = "(//div[contains(@class,'x-toolbar x-docked x-toolbar-default x-docked-bottom x-toolbar-docked-bottom x-toolbar-default-docked-bottom x-box-layout-ct x-docked-noborder-right x-docked-noborder-bottom x-docked-noborder-left')]//span[text()='ADD'])[5]")
	public WebElement perAddBtn;

	@FindBy(xpath = "(//span[text()='Saved Facts'])[1]")
	public WebElement savedfact;

	@FindBy(xpath = "(//tr[@class='x-grid-row second-level-margin x-grid-tree-node-leaf x-grid-data-row']/td/div//span[@class='x-tree-node-text'])[5]")
	public WebElement mySavedfactDb;

	@FindBy(xpath = "(//div[contains(@class,'x-toolbar x-docked x-toolbar-default x-docked-bottom x-toolbar-docked-bottom x-toolbar-default-docked-bottom x-box-layout-ct x-docked-noborder-right x-docked-noborder-bottom x-docked-noborder-left')]//span[text()='ADD'])[6]")
	public WebElement factAddBtn;

	@FindBy(xpath = "(//table[@class='x-field x-table-plain x-form-item x-box-item x-toolbar-item x-field-default-toolbar x-vbox-form-item']//input[@class='x-form-field x-form-empty-field x-form-text'])[1]")
	public WebElement searchName_field;

	// DS page funtionalities
	// ALL
	@FindBy(xpath = "(//td[@class='x-form-item-body x-form-cb-wrap']//input[@class='x-form-field x-form-checkbox x-form-cb'])[1]")
	public WebElement mkt_mktFolder_All;

	@FindBy(xpath = "(//td[@class='x-form-item-body x-form-cb-wrap']//input[@class='x-form-field x-form-checkbox x-form-cb'])[5]")
	public WebElement prod_hier_subFolder_All;

	@FindBy(xpath = "(//td[@class='x-form-item-body x-form-cb-wrap']//input[@class='x-form-field x-form-checkbox x-form-cb'])[9]")
	public WebElement periodFolder_All;

	@FindBy(xpath = "(//span[text()='ADD'])[5]")
	public WebElement addBtn_mktgrpAll;

	@FindBy(xpath = "(//span[text()='ADD'])[16]")
	public WebElement addBtn_prodHierAll;
	
	@FindBy(xpath = "(//div[@class='x-panel-body x-grid-body x-panel-body-default x-layout-fit'])[3]/div/table/tbody/tr//following::div[@class='x-btn x-unselectable x-box-item x-toolbar-item x-btn-default-small x-noicon x-btn-noicon x-btn-default-small-noicon'][1]/div/a")
    public WebElement addBtn_prodHierAll1;

	@FindBy(xpath = "(//span[text()='ADD'])[20]")
	public WebElement addBtn_perAll;
	
	@FindBy(xpath = "(//div[@class='x-panel-body x-grid-body x-panel-body-default x-layout-fit'])[5]/div/table/tbody/tr//following::div[@class='x-btn x-unselectable x-box-item x-toolbar-item x-btn-default-small x-noicon x-btn-noicon x-btn-default-small-noicon'][1]/div/a")
    public WebElement addBtn_perAll1;

	// ALL EXCEPT
	@FindBy(xpath = "(//td[@class='x-form-item-body x-form-cb-wrap']//input[@class='x-form-field x-form-checkbox x-form-cb'])[2]")
	public WebElement mkt_mktFolder_AllExpect;

	@FindBy(xpath = "(//td[@class='x-form-item-body x-form-cb-wrap']//input[@class='x-form-field x-form-checkbox x-form-cb'])[6]")
	public WebElement prod_hier_subFolder_AllExpect;

	@FindBy(xpath = "(//td[@class='x-form-item-body x-form-cb-wrap']//input[@class='x-form-field x-form-checkbox x-form-cb'])[10]")
	public WebElement periodFolder_AllExpect;

	@FindBy(xpath = "(//td[@class='x-form-item-body x-form-cb-wrap']//input[@class='x-form-field x-form-checkbox x-form-cb'])[12]")
	public WebElement fact_subFolder_AllExpect;

	// SUM
	@FindBy(xpath = "(//span[text()='SUM'])[1]")
	public WebElement mkt_mktFolder_Sum;

	@FindBy(xpath = "(//span[text()='SUM'])[9]")
	public WebElement prod_hier_subFolder_Sum;

	@FindBy(xpath = "(//span[text()='SUM'])[15]")
	public WebElement periodFolder_Sum;

	// SUM OR
	@FindBy(xpath = "(//div[@class='x-box-inner x-horizontal-box-overflow-body'])[4]/ancestor::div[1]//following::table/tbody/tr[2]/td[1]/div/img[3]")
	public WebElement mkt_mktFolder_SumOr;

	@FindBy(xpath = "((//div[@class='x-box-inner x-horizontal-box-overflow-body'])[4]/ancestor::div[1]//following::table/tbody/tr[2]/td[1]/div/img[3])[13]")
	public WebElement prod_hier_subFolder_SumOr;

	@FindBy(xpath = "((//div[@class='x-box-inner x-horizontal-box-overflow-body'])[4]/ancestor::div[1]//following::table/tbody/tr[2]/td[1]/div/img[3])[17]")
	public WebElement period_SubFolder_SumOr;

	@FindBy(xpath = "(//span[text()='THRU'])[1]")
	public WebElement period_SubFolder_Thru;

	// CHARACTERISTICS FOLDER
	@FindBy(xpath = "(//span[text()='Characteristics'])[1]")
	public WebElement mkt_Characteristics;

	@FindBy(xpath = "(//span[text()='Markets']/ancestor::div[@class='x-panel x-fit-item x-panel-secondary']//following::table/tbody/tr[2]/td[1]/div/span)[3]")
	public WebElement mktChar_Folder;

	@FindBy(xpath = "(//span[text()='GROUP BY'])[3]")
	public WebElement mktChar_GrpBy;

	@FindBy(xpath = "(//span[text()='Characteristics'])[1]")
	public WebElement mktCharacteristics;

	@FindBy(xpath = "(//span[text()='Characteristics']/ancestor::div[@class='x-panel x-fit-item x-panel-secondary']/div[2]//tr[2])[3]")
	public WebElement mkt_characteristicsFolder;

	@FindBy(xpath = "(//span[text()='Characteristics'])[3]")
	public WebElement mktShrCharacteristics;

	@FindBy(xpath = "(//span[text()='Characteristics']/ancestor::div[@class='x-panel x-fit-item x-panel-secondary']/div[2]//tr[2])[7]")
	public WebElement mktShr_characteristicsFolder;

	@FindBy(xpath = "(//span[text()='Characteristics'])[5]")
	public WebElement Prod_Characteristics;

	@FindBy(xpath = "(//div[@class='x-panel-body x-grid-body x-panel-body-default x-layout-fit x-panel-body-default'])[19]//table/tbody/tr[2]")
	public WebElement prodChar_Folder1;

	@FindBy(xpath = "(//label[text()='ALL'])[4]")
	public WebElement Prod_Characteristics_All;

	@FindBy(xpath = "(//span[text()='ADD'])[9]")
	public WebElement addBtn_mktChar_All;

	@FindBy(xpath = "(//span[text()='ADD'])[19]")
	public WebElement addBtn_prodChar_All;

	@FindBy(xpath = "(//Span[text()='Characteristics']//ancestor::div[@class='x-tree-view x-fit-item x-tree-view-default x-unselectable'])[3]/table/tbody/tr[4]/td[1]/div")
	public WebElement productcharcategoryFolder;

	@FindBy(xpath = "(//div[@class='x-container x-box-item x-container-default x-accordion-layout-ct'])[3]//descendant::div[@class='x-grid-view x-fit-item x-grid-view-default x-unselectable']/table/tbody/tr[1]/td[2]/div")
	public WebElement productcharsub1item1;

	@FindBy(xpath = "(//div[@class='x-container x-box-item x-container-default x-accordion-layout-ct'])[3]//descendant::div[@class='x-grid-view x-fit-item x-grid-view-default x-unselectable']/table/tbody/tr[2]/td[2]/div")
	public WebElement productcharsub1item2;

	@FindBy(xpath = "//div[@id= 'button-1056']")
	public WebElement applyButton;

	// NEW SAVED SELECTION
	@FindBy(xpath = "(//span[text()='SAVE'])[1]")
	public WebElement saveSelectionDs;

	@FindBy(xpath = "//input[@name='savename']")
	public WebElement saveSelectionSearchBar;

	@FindBy(xpath = "(//span[text()='SAVE'])[5]")
	public WebElement saveSelectionSaveBtn;
  
	// Condition Product Enhancement DS PAGE
	
	@FindBy(xpath = "//input[@name='limitCount']//parent::td")
	public WebElement Limit;
 
	@FindBy(xpath = "//div[@id='ext-gen3482']")
	public WebElement ShowIcon;
	
	@FindBy(xpath = "//li[text()='Top']")
	public WebElement Top;
	
	@FindBy(xpath = "//li[text()='Bottom']")
	public WebElement Bottom;
	
	@FindBy(xpath = "//li[text()='All']")
	public WebElement ALL;
	
	public DSPageReg() {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	// DS PAGE VERIFICATION
	public void switchToCdsFrame() throws Throwable {

		try {
			Thread.sleep(10000);
			driver.switchTo().defaultContent();
			driver.switchTo().frame(0);
			driver.switchTo().frame(driver.findElement(By.xpath("//iframe")));
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

	// Normal Selection
	public void marketSelection() {
		try {
			gen.click(mktDim);
			gen.click(mktTab);
			gen.click(mktGrp);
			gen.click(mkt_mktFolder);
			Thread.sleep(2000);
			gen.doubleClick(mkt_middlePane_1Item);
			gen.doubleClick(mkt_middlePane_2Item);
			gen.doubleClick(mkt_middlePane_3Item);

			logger.log(Status.PASS, "Market selection done");
			System.out.println("Market selection done");

		} catch (Exception e) {
			System.out.println("exception occured" + e);
			logger.log(Status.FAIL, " Exception ocuerd " + e);
		}
	}

	public void marketSelection_All() {
		try {
			gen.click(mktDim);
			gen.click(mktTab);
			gen.click(mktGrp);
			gen.click(mkt_mktFolder);
			Thread.sleep(2000);
			gen.click(mkt_mktFolder_All);
			action.moveToElement(addBtn_mktgrpAll).click().build().perform();
			
			logger.log(Status.PASS, "Market All selection done");
			System.out.println("Market All selection done");

		} catch (Exception e) {
			System.out.println("exception occured" + e);
			logger.log(Status.FAIL, " Exception ocuerd " + e);
		}
	}

	public void marketSelection_AllExcept() {
		try {
			gen.click(mktDim);
			gen.click(mktTab);
			gen.click(mktGrp);
			gen.click(mkt_mktFolder);
			Thread.sleep(2000);

			gen.click(mkt_middlePane_1Item);
			gen.click(mkt_mktFolder_AllExpect);
			gen.doubleClick(mkt_middlePane_1Item);

			logger.log(Status.PASS, "Market All Except selection done");
			System.out.println("Market All Except selection done");

		} catch (Exception e) {
			System.out.println("exception occured" + e);
			logger.log(Status.FAIL, " Exception ocuerd " + e);
		}
	}

	public void marketSelection_Sum() {
		try {
			gen.click(mktDim);
			gen.click(mktTab);
			gen.click(mktGrp);
			gen.click(mkt_mktFolder);
			Thread.sleep(2000);

			action.moveToElement(mkt_mktFolder_Sum).build().perform();
			action.click(mkt_mktFolder_Sum).build().perform();
			Thread.sleep(2000);

			gen.doubleClick(mkt_middlePane_1Item);
			gen.doubleClick(mkt_middlePane_2Item);
			gen.doubleClick(mkt_middlePane_3Item);

			logger.log(Status.PASS, "Market Sum selection done");
			System.out.println("Market Sum selection done");

		} catch (Exception e) {
			System.out.println("exception occured" + e);
			logger.log(Status.FAIL, " Exception ocuerd " + e);
		}
	}

	public void marketSelection_SumOr() {
		try {
			gen.click(mktDim);
			gen.click(mktTab);
			gen.click(mktGrp);
			gen.click(mkt_mktFolder);
			Thread.sleep(2000);

			action.moveToElement(mkt_mktFolder_Sum).build().perform();
			action.click(mkt_mktFolder_Sum).build().perform();
			Thread.sleep(2000);

			gen.doubleClick(mkt_middlePane_1Item);
			gen.doubleClick(mkt_middlePane_2Item);
			gen.doubleClick(mkt_middlePane_3Item);

			gen.click(mkt_mktFolder_SumOr);
			Thread.sleep(2000);
			gen.doubleClick(mkt_middlePane_2Item);
			Thread.sleep(5000);
			gen.doubleClick(mkt_middlePane_3Item);

			logger.log(Status.PASS, "Market SumOr selection done");
			System.out.println("Market SumOr selection done");

		} catch (Exception e) {
			System.out.println("exception occured" + e);
			logger.log(Status.FAIL, " Exception ocuerd " + e);
		}
	}

	public void marketSelection_GrpBy() {
		try {
			gen.click(mktDim);
			gen.click(mktTab);
			gen.click(mktGrp);

			gen.click(mkt_Characteristics);
			gen.click(mktChar_Folder);
			action.moveToElement(mktChar_GrpBy).build().perform();
			action.click(mktChar_GrpBy).build().perform();
			Thread.sleep(2000);
			gen.doubleClick(mkt_middlePane_1Item);

			logger.log(Status.PASS, "Market group By selection done");
			System.out.println("Market group By selection done");

		} catch (Exception e) {
			System.out.println("exception occured" + e);
			logger.log(Status.FAIL, " Exception ocuerd " + e);
		}
	}

	public void marketShareSelection() {
		try {
			gen.click(mktShareTab);
			gen.click(mktshare_mktFolder);
			gen.click(mktTab);
			gen.click(mktShareTab);
			gen.doubleClick(mktshare_middlepane_1Item);

			logger.log(Status.PASS, "Market Share selection done");
			System.out.println("Market Share selection done");

		} catch (Exception e) {
			System.out.println("exception occured" + e);
			logger.log(Status.FAIL, " Exception ocuerd " + e);
		}
	}

	public void productSelection() {
		try {
			gen.click(prodDim);
			gen.click(prodTab);
			gen.click(prodHier_Folder);
			action.moveToElement(prodHier_subFolder).build().perform();
			gen.click(prodHier_subFolder);
			Thread.sleep(1000);
			gen.click(prodShareTab);
			gen.click(prodTab);

			gen.doubleClick(prod_middlePane_1Item);

			logger.log(Status.PASS, "Product selection done");
			System.out.println("Product selection done");

		} catch (Exception e) {
			System.out.println("exception occured" + e);
			logger.log(Status.FAIL, " Exception ocuerd " + e);
		}
	}
	public void productSelection2() {
		try {
			gen.click(prodDim);
			gen.click(prodTab);
			gen.click(prodHier_Folder);
			
			
			action.moveToElement(prodHier_subFolder2).build().perform();
			gen.click(prodHier_subFolder2);
			Thread.sleep(1000);
			gen.click(prodShareTab);
			gen.click(prodTab);
			
			gen.doubleClick(prod_middlePane_1Item);
			gen.doubleClick(prod_middlePane_2Item);
			gen.doubleClick(prod_middlePane_3Item);
			gen.doubleClick(prod_middlePane_4Item);
			gen.doubleClick(prod_middlePane_5Item);
			
			logger.log(Status.PASS, "Product selection done");
			System.out.println("Product selection done");

		} catch (Exception e) {
			System.out.println("exception occured" + e);
			logger.log(Status.FAIL, " Exception ocuerd " + e);
		}
	}

	public void productSelection_All() {
		try {
			gen.click(prodDim);
			gen.click(prodTab);
			gen.click(prodHier_Folder);
			action.moveToElement(prodHier_subFolder2).build().perform();
			gen.click(prodHier_subFolder2);
			Thread.sleep(1000);
			gen.click(prodShareTab);
			gen.click(prodTab);

			gen.click(prod_hier_subFolder_All);
			gen.click(prodShareTab);
			gen.click(prodTab);
			
//			gen.doubleClick(prod_middlePane_1Item);
//			action.moveToElement(addBtn_prodHierAll1).build().perform();
//			Thread.sleep(2000);
//			action.doubleClick(addBtn_prodHierAll1).build().perform();
//			gen.click(addBtn_prodHierAll1);
			action.moveToElement(addBtn_prodHierAll1).click().build().perform();
			logger.log(Status.PASS, "Product All selection done");
			System.out.println("Product All selection done");

		} catch (Exception e) {
			System.out.println("exception occured" + e);
			logger.log(Status.FAIL, " Exception ocuerd " + e);
		}
	}

	public void productSelection_AllExcept() {
		try {
			gen.click(prodDim);
			gen.click(prodTab);
			gen.click(prodHier_Folder);
			action.moveToElement(prodHier_subFolder2).build().perform();
			gen.click(prodHier_subFolder2);
			Thread.sleep(1000);
			gen.click(prodShareTab);
			gen.click(prodTab);

			gen.click(prod_middlePane_1Item);
			gen.click(prod_hier_subFolder_AllExpect);
			gen.click(prodShareTab);
			gen.click(prodTab);
			gen.doubleClick(prod_middlePane_1Item);

			logger.log(Status.PASS, "Product All Except selection done");
			System.out.println("Product All Except selection done");

		} catch (Exception e) {
			System.out.println("exception occured" + e);
			logger.log(Status.FAIL, " Exception ocuerd " + e);
		}
	}

	public void productSelection_Sum() {
		try {
			gen.click(prodDim);
			gen.click(prodTab);
			gen.click(prodHier_Folder);
			action.moveToElement(prodHier_subFolder2).build().perform();
			gen.click(prodHier_subFolder2);
			Thread.sleep(1000);

			action.moveToElement(prod_hier_subFolder_Sum).build().perform();
			action.click(prod_hier_subFolder_Sum).build().perform();
			Thread.sleep(2000);

			gen.click(prodShareTab);
			gen.click(prodTab);

			gen.doubleClick(prod_middlePane_1Item);
			gen.click(prodShareTab);
			gen.click(prodTab);
			gen.doubleClick(prod_middlePane_2Item);

			logger.log(Status.PASS, "Product Sum selection done");
			System.out.println("Product Sum selection done");

		} catch (Exception e) {
			System.out.println("exception occured" + e);
			logger.log(Status.FAIL, " Exception ocuerd " + e);
		}
	}

	public void productSelection_SumOr() {
		try {
			gen.click(prodDim);
			gen.click(prodTab);
			gen.click(prodHier_Folder);
			action.moveToElement(prodHier_subFolder2).build().perform();
			gen.click(prodHier_subFolder2);
			Thread.sleep(1000);

			action.moveToElement(prod_hier_subFolder_Sum).build().perform();
			action.click(prod_hier_subFolder_Sum).build().perform();
			Thread.sleep(2000);

			gen.click(prodShareTab);
			gen.click(prodTab);
			gen.doubleClick(prod_middlePane_1Item);
			gen.click(prodShareTab);
			gen.click(prodTab);
			gen.doubleClick(prod_middlePane_2Item);
			gen.click(prodShareTab);
			gen.click(prodTab);
			gen.doubleClick(prod_middlePane_3Item);

			gen.click(prod_hier_subFolder_SumOr);
			Thread.sleep(2000);
			gen.click(prodShareTab);
			gen.click(prodTab);
			gen.doubleClick(prod_middlePane_2Item);
			Thread.sleep(5000);
			gen.click(prodShareTab);
			gen.click(prodTab);
			gen.doubleClick(prod_middlePane_3Item);

			logger.log(Status.PASS, "Product Sum Or selection done");
			System.out.println("Product Sum Or selection done");

		} catch (Exception e) {
			System.out.println("exception occured" + e);
			logger.log(Status.FAIL, " Exception ocuerd " + e);
		}
	}

	public void productShareSelection() {
		try {
			gen.click(prodShareTab);

			action.moveToElement(prodShare_hier_folder).build().perform();
			gen.click(prodShare_hier_folder);
			action.moveToElement(prodShare_hier_subFolder).build().perform();
			gen.click(prodShare_hier_subFolder);
			Thread.sleep(1000);
			gen.click(prodTab);
			gen.click(prodShareTab);
			gen.doubleClick(prodShare_middlepane_1Item);

			logger.log(Status.PASS, "Product Share selection done");
			System.out.println("Product Share selection done");

		} catch (Exception e) {
			System.out.println("exception occured" + e);
			logger.log(Status.FAIL, " Exception ocuerd " + e);
		}
	}

	public void periodSelection() {
		try {
			gen.click(periodDim);
			gen.click(periodGrp);
			action.moveToElement(periodFolder).build().perform();
//			gen.click(periodFolder);
			action.moveToElement(period_SubFolder).build().perform();
			gen.click(period_SubFolder);
			Thread.sleep(2000);

			gen.doubleClick(per_middlePane_1Item);
			gen.doubleClick(per_middlePane_2Item);
			gen.doubleClick(per_middlePane_3Item);
			logger.log(Status.PASS, "Period selection done");
			System.out.println("Period selection done");

		} catch (Exception e) {
			System.out.println("exception occured" + e);
			logger.log(Status.FAIL, " Exception ocuerd " + e);
		}
	}

	public void periodSelection_Thru() {
		try {
			gen.click(periodDim);
			gen.click(periodGrp);
			action.moveToElement(periodFolder).build().perform();
			gen.click(periodFolder);
			action.moveToElement(period_SubFolder).build().perform();
			gen.click(period_SubFolder);
			Thread.sleep(2000);

			gen.click(period_SubFolder_Thru);
			action.moveToElement(period_SubFolder_Thru).build().perform();
			action.click(period_SubFolder_Thru).build().perform();
			gen.doubleClick(per_middlePane_2Item);
			Thread.sleep(5000);
			action.moveToElement(per_middlePane_1Item).build().perform();
			action.doubleClick(per_middlePane_1Item).build().perform();
			// gen.doubleClick(per_middlePane_1Item);
			Thread.sleep(2000);

			logger.log(Status.PASS, "Period Thru selection done");
			System.out.println("Period Thru selection done");

		} catch (Exception e) {
			System.out.println("exception occured" + e);
			logger.log(Status.FAIL, " Exception ocuerd " + e);
		}
	}

	public void periodSelection_Relative() {
		try {
			gen.click(periodDim);
			gen.click(periodGrp);
			action.moveToElement(periodFolder).build().perform();
//			gen.click(periodFolder);
			action.moveToElement(period_SubFolder).build().perform();
			gen.click(period_SubFolder);
			Thread.sleep(2000);

			gen.doubleClick(per_middlePane_1Item);
			gen.doubleClick(per_middlePane_2Item);
			gen.doubleClick(per_middlePane_3Item);

			logger.log(Status.PASS, "Period Relative selection done");
			System.out.println("Period Relative selection done");

		} catch (Exception e) {
			System.out.println("exception occured" + e);
			logger.log(Status.FAIL, " Exception ocuerd " + e);
		}
	}

	public void periodSelection_ThruInRelative() {
		try {
			gen.click(periodDim);
			gen.click(periodGrp);
			action.moveToElement(periodFolder).build().perform();
//			gen.click(periodFolder);
			action.moveToElement(period_SubFolder).build().perform();
			gen.click(period_SubFolder);
			Thread.sleep(2000);

			gen.click(period_SubFolder_Thru);
			action.moveToElement(period_SubFolder_Thru).build().perform();
			action.click(period_SubFolder_Thru).build().perform();
			gen.doubleClick(per_middlePane_2Item);
			Thread.sleep(5000);
			action.moveToElement(per_middlePane_1Item).build().perform();
			action.doubleClick(per_middlePane_1Item).build().perform();
			// gen.doubleClick(per_middlePane_1Item);
			Thread.sleep(2000);

			logger.log(Status.PASS, "Period Thru in Relative folder selection done");
			System.out.println("Period Thru in Relative folder selection done");

		} catch (Exception e) {
			System.out.println("exception occured" + e);
			logger.log(Status.FAIL, " Exception ocuerd " + e);
		}
	}

	public void periodSelection_RelativeAndThru() {
		try {
			gen.click(periodDim);
			gen.click(periodGrp);
			action.moveToElement(periodFolder).build().perform();
//            gen.click(periodFolder);
			action.moveToElement(period_SubFolder).build().perform();
			gen.click(period_SubFolder);
			Thread.sleep(2000);

			gen.doubleClick(per_middlePane_1Item);
			gen.doubleClick(per_middlePane_2Item);
			gen.doubleClick(per_middlePane_3Item);

			logger.log(Status.PASS, "Period Relative selection done");
			System.out.println("Period Relative selection done");

			action.moveToElement(periodFolder).build().perform();
			gen.click(periodFolder);
			action.moveToElement(period_SubFolder).build().perform();
			gen.click(period_SubFolder);
			Thread.sleep(2000);

//            gen.click(period_SubFolder_Thru);
			action.moveToElement(period_SubFolder_Thru).build().perform();
			action.click(period_SubFolder_Thru).build().perform();
			gen.doubleClick(per_middlePane_3Item);
			Thread.sleep(5000);
			action.moveToElement(per_middlePane_2Item).build().perform();
			action.doubleClick(per_middlePane_2Item).build().perform();
			Thread.sleep(2000);

			logger.log(Status.PASS, "Period Thru in Normal folder selection done");
			System.out.println("Period Thru in Normal folder selection done");

		} catch (Exception e) {
			System.out.println("exception occured" + e);
			logger.log(Status.FAIL, " Exception ocuerd " + e);
		}
	}

	public void periodSelection_All() {
		try {
			gen.click(periodDim);
			gen.click(periodGrp);
			action.moveToElement(periodFolder).build().perform();
			// gen.click(periodFolder);
			action.moveToElement(period_SubFolder).build().perform();
			gen.click(period_SubFolder);
			Thread.sleep(2000);

			gen.click(periodFolder_All);
//			gen.doubleClick(per_middlePane_1Item);
//			action.moveToElement(addBtn_perAll1).build().perform();
//			Thread.sleep(2000);
//			action.doubleClick(addBtn_perAll1).build().perform();
//		gen.click(addBtn_perAll1);
			action.moveToElement(addBtn_perAll1).click().build().perform();
			logger.log(Status.PASS, "Period All selection done");
			System.out.println("Period All selection done");

		} catch (Exception e) {
			System.out.println("exception occured" + e);
			logger.log(Status.FAIL, " Exception ocuerd " + e);
		}
	}

	public void periodSelection_AllExcept() {
		try {
			gen.click(periodDim);
			gen.click(periodGrp);
			action.moveToElement(periodFolder).build().perform();
			gen.click(periodFolder);
			action.moveToElement(period_SubFolder).build().perform();
			gen.click(period_SubFolder);
			Thread.sleep(2000);

			gen.click(per_middlePane_1Item);
			gen.click(periodFolder_AllExpect);
			gen.doubleClick(per_middlePane_1Item);
//			gen.doubleClick(per_middlePane_2Item);
//			gen.doubleClick(per_middlePane_3Item);
			logger.log(Status.PASS, "Period All Except selection done");
			System.out.println("Period All Except selection done");

		} catch (Exception e) {
			System.out.println("exception occured" + e);
			logger.log(Status.FAIL, " Exception ocuerd " + e);
		}
	}

	public void periodSelection_Sum() {
		try {
			gen.click(periodDim);
			gen.click(periodGrp);
			action.moveToElement(periodFolder).build().perform();
//			gen.click(periodFolder);
			action.moveToElement(period_SubFolder).build().perform();
			gen.click(period_SubFolder);
			Thread.sleep(2000);

			action.moveToElement(periodFolder_Sum).build().perform();
			action.click(periodFolder_Sum).build().perform();

			gen.doubleClick(per_middlePane_1Item);
			gen.doubleClick(per_middlePane_2Item);
			gen.doubleClick(per_middlePane_3Item);
			logger.log(Status.PASS, "Period Sum selection done");
			System.out.println("Period Sum selection done");

		} catch (Exception e) {
			System.out.println("exception occured" + e);
			logger.log(Status.FAIL, " Exception ocuerd " + e);
		}
	}

	public void periodSelection_Sumor() {
		try {
			gen.click(periodDim);
			gen.click(periodGrp);
			action.moveToElement(periodFolder).build().perform();
			gen.click(periodFolder);
			action.moveToElement(period_SubFolder).build().perform();
			gen.click(period_SubFolder);
			Thread.sleep(2000);

			action.moveToElement(periodFolder_Sum).build().perform();
			action.click(periodFolder_Sum).build().perform();

			gen.doubleClick(per_middlePane_1Item);
			gen.doubleClick(per_middlePane_2Item);
			gen.doubleClick(per_middlePane_2Item);

			gen.click(period_SubFolder_SumOr);
			Thread.sleep(2000);
			gen.doubleClick(per_middlePane_2Item);
			Thread.sleep(5000);
			gen.doubleClick(per_middlePane_3Item);

			logger.log(Status.PASS, "Period Sum Or selection done");
			System.out.println("Period Sum Or selection done");

		} catch (Exception e) {
			System.out.println("exception occured" + e);
			logger.log(Status.FAIL, " Exception ocuerd " + e);
		}
	}
	public void productSelectionCondition() {
		try {
			gen.click(prodDim);
			gen.click(prodTab);
			action.moveToElement(prodConditionOption).build().perform();
			gen.click(prodConditionOption);
			Thread.sleep(1000);
		
			action.moveToElement(prodConditionButton).build().perform();
			gen.click(prodConditionButton);
			Thread.sleep(1000);
			
			boolean isVisible = ConditionFormula.isDisplayed();
			logger.log(Status.PASS, "Element Visible:" + isVisible);
			System.out.println("Element Visible:" + isVisible );
			Thread.sleep(2000);
			
			gen.click(Limit);
			action.sendKeys(Keys.ARROW_RIGHT).build().perform();
			action.sendKeys(Keys.BACK_SPACE).build().perform();
			action.sendKeys(Keys.BACK_SPACE).build().perform();
			action.sendKeys("3").build().perform();
			Thread.sleep(1000);
			
			action.moveToElement(ConditionOKButton).build().perform();
			gen.doubleClick(ConditionOKButton);
			Thread.sleep(3000);
			
			boolean isVisible1 = ConditionToolTip.isDisplayed();
			logger.log(Status.PASS, "Element Visible:" + isVisible1);
			System.out.println("Element Visible:" + isVisible1 );
			
			Thread.sleep(3000);
		
			
			logger.log(Status.PASS, "Condition formula is successful");
			System.out.println("Condition formula is successful");
			Thread.sleep(3000);
			
			action.moveToElement(applyButton).build().perform();
			gen.click(applyButton);
			logger.log(Status.PASS, "Apply button is clicked");
			System.out.println("Apply button is clicked");

		} catch (Exception e) {
			System.out.println("exception occured" + e);
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
			System.out.println("Fact selection done");

			// clicking apply button
			wait.until(ExpectedConditions.visibilityOf(applyButton));
			if (applyButton.isEnabled()) {
				System.out.println("apply botton is enabled");
				action.moveToElement(applyButton).build().perform();
				gen.click(applyButton);
				logger.log(Status.PASS, "Apply button is clicked");
				System.out.println("Apply button is clicked");
			}
		} catch (Exception e) {
			System.out.println("exception occured" + e);
			logger.log(Status.FAIL, " Exception ocuerd " + e);
		}
	}
	public void factSelection1() {
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
			System.out.println("Fact selection done");

			
			
		  
		}catch (Exception e) {
			System.out.println("exception occured" + e);
			logger.log(Status.FAIL, " Exception ocuerd " + e);
		}
	}
	// MAKE NEW SAVED SELECTION
	public void marketSelection_NSS(String saveMarket) {
		try {
			gen.click(mktDim);
			gen.click(mktTab);
			gen.click(mktGrp);
			gen.click(mkt_mktFolder);
			Thread.sleep(2000);
			gen.doubleClick(mkt_middlePane_1Item);
			gen.doubleClick(mkt_middlePane_2Item);
			gen.doubleClick(mkt_middlePane_3Item);

			// clicking save button in DS page
			action.moveToElement(saveSelectionDs).click().build().perform();
			Thread.sleep(5000);
			action.moveToElement(saveSelectionSearchBar).click().build().perform();

			SimpleDateFormat format = new SimpleDateFormat("dd-MM-YY HH-mm-ss");
			Date date = new Date();
			String ActualDate = format.format(date);
			String marketName = saveMarket.concat(ActualDate);
			action.sendKeys(marketName).build().perform();

			action.moveToElement(saveSelectionSaveBtn).click().build().perform();
			Thread.sleep(5000);

			logger.log(Status.PASS, "Market new saved selection done");
			System.out.println("Market new saved selection done");

		} catch (Exception e) {
			System.out.println("exception occured" + e);
			logger.log(Status.FAIL, " Exception ocuerd " + e);
		}
	}

	public void marketShareSelection_NSS(String saveMarketShr) {
		try {
			gen.click(mktShareTab);
			gen.click(mktshare_mktFolder);
			gen.click(mktTab);
			gen.click(mktShareTab);
			gen.doubleClick(mktshare_middlepane_1Item);

			action.moveToElement(saveSelectionDs).click().build().perform();
			Thread.sleep(5000);
			action.moveToElement(saveSelectionSearchBar).click().build().perform();

			SimpleDateFormat format = new SimpleDateFormat("dd-MM-YY HH-mm-ss");
			Date date = new Date();
			String ActualDate = format.format(date);
			String marketShrName = saveMarketShr.concat(ActualDate);
			action.sendKeys(marketShrName).build().perform();

			action.moveToElement(saveSelectionSaveBtn).click().build().perform();

			Thread.sleep(5000);
			logger.log(Status.PASS, "Market Share new saved selection done");
			System.out.println("Market Share new saved selection done");

		} catch (Exception e) {
			System.out.println("exception occured" + e);
			logger.log(Status.FAIL, " Exception ocuerd " + e);
		}
	}

	public void productSelection_NSS(String saveProduct) {
		try {
			gen.click(prodDim);
			gen.click(prodTab);
			gen.click(prodHier_Folder);
			action.moveToElement(prodHier_subFolder).build().perform();
			gen.click(prodHier_subFolder);
			Thread.sleep(1000);
			gen.click(prodShareTab);
			action.moveToElement(prodTab).build().perform();
   		    action.click(prodTab).build().perform();
			//gen.click(prodTab);
   		   // action.moveToElement(prodsaved_middlePane_1Item).build().perform();
			gen.doubleClick(prodsaved_middlePane_1Item);

			action.moveToElement(saveSelectionDs).click().build().perform();
			Thread.sleep(5000);
			action.moveToElement(saveSelectionSearchBar).click().build().perform();

			SimpleDateFormat format = new SimpleDateFormat("dd-MM-YY HH-mm-ss");
			Date date = new Date();
			String ActualDate = format.format(date);
			String productName = saveProduct.concat(ActualDate);

			action.sendKeys(productName).build().perform();

			action.moveToElement(saveSelectionSaveBtn).click().build().perform();
			Thread.sleep(5000);

			logger.log(Status.PASS, "Product new saved selection done");
			System.out.println("Product new saved selection done");

		} catch (Exception e) {
			System.out.println("exception occured" + e);
			logger.log(Status.FAIL, " Exception ocuerd " + e);
		}
	}

	public void productShareSelection_NSS(String saveProductShr) {
		try {
			action.moveToElement(prodShareTab).build().perform();
			action.click(prodShareTab).build().perform();
//			gen.click(prodShareTab);
			action.moveToElement(prodShare_hier_folder).build().perform();
			gen.click(prodShare_hier_folder);
			action.moveToElement(prodShare_hier_subFolder).build().perform();
			gen.click(prodShare_hier_subFolder);
			Thread.sleep(1000);
			gen.click(prodTab);
			gen.click(prodShareTab);
			gen.doubleClick(prodShare_middlepane_1Item);

			action.moveToElement(saveSelectionDs).click().build().perform();
			Thread.sleep(5000);
			action.moveToElement(saveSelectionSearchBar).click().build().perform();

			SimpleDateFormat format = new SimpleDateFormat("dd-MM-YY HH-mm-ss");
			Date date = new Date();
			String ActualDate = format.format(date);
			String productShrName = saveProductShr.concat(ActualDate);

			action.sendKeys(productShrName).build().perform();

			action.moveToElement(saveSelectionSaveBtn).click().build().perform();
			Thread.sleep(5000);

			logger.log(Status.PASS, "Product Share new saved selection done");
			System.out.println("Product Share new saved selection done");

		} catch (Exception e) {
			System.out.println("exception occured" + e);
			logger.log(Status.FAIL, " Exception ocuerd " + e);
		}
	}

	public void periodSelection_NSS(String savePeriod) {
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

			action.moveToElement(saveSelectionDs).click().build().perform();
			Thread.sleep(5000);
			action.moveToElement(saveSelectionSearchBar).click().build().perform();
			SimpleDateFormat format = new SimpleDateFormat("dd-MM-YY HH-mm-ss");
			Date date = new Date();
			String ActualDate = format.format(date);
			String periodName = savePeriod.concat(ActualDate);

			action.sendKeys(periodName).build().perform();

			action.moveToElement(saveSelectionSaveBtn).click().build().perform();
			Thread.sleep(5000);

			logger.log(Status.PASS, "period new saved selection done");
			System.out.println("period new saved selection done");

		} catch (Exception e) {
			System.out.println("exception occured" + e);
			logger.log(Status.FAIL, " Exception ocuerd " + e);
		}
	}

	public void factSelection_NSS(String saveFact) {
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

			action.moveToElement(saveSelectionDs).click().build().perform();
			Thread.sleep(5000);
			action.moveToElement(saveSelectionSearchBar).click().build().perform();
			SimpleDateFormat format = new SimpleDateFormat("dd-MM-YY HH-mm-ss");
			Date date = new Date();
			String ActualDate = format.format(date);
			String factName = saveFact.concat(ActualDate);

			action.sendKeys(factName).build().perform();

			action.moveToElement(saveSelectionSaveBtn).click().build().perform();
			Thread.sleep(5000);

			logger.log(Status.PASS, "Fact new saved selection done");
			System.out.println("Fact new saved selection done");

			wait.until(ExpectedConditions.visibilityOf(applyButton));
			if (applyButton.isEnabled()) {
				System.out.println("apply botton is enabled");
				action.moveToElement(applyButton).build().perform();
				gen.click(applyButton);
				logger.log(Status.PASS, "Apply button is clicked");
				System.out.println("Apply button is clicked");
			}
		} catch (Exception e) {
			System.out.println("exception occured" + e);
			logger.log(Status.FAIL, " Exception ocuerd " + e);
		}
	}

}
