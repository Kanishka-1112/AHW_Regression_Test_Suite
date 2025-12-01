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

public class DSPageReg_ME extends BaseMethod {
	public Actions action = new Actions(driver);
	@FindBy(xpath = "//label[@class='x-component x-lbl-TITLE x-box-item x-component-default']")
	public WebElement ds_header;

	@FindBy(xpath = "//nd-spinner")
	public List<WebElement> spinner;

	@FindBy(xpath = "//div[@class='spinWrapper']")
	public WebElement ds_spinner;

	// NORMAL PROMPTS
	@FindBy(xpath = "(//span[text()='Markets'])[1]")
	public WebElement mktDim;

	@FindBy(xpath = "(//span[text()='Markets'])[2]")
	public WebElement mktTab;

	@FindBy(xpath = "(//span[text()='Market Groups'])[1]")
	public WebElement mktGrp;
	
	@FindBy(xpath = "(//span[text()='Hierarchies'])[1]")
	public WebElement mkthier;		

	@FindBy(xpath = "(//span[text()='Markets'])[3]")
	public WebElement mkt_mktFolder;
	
	@FindBy(xpath = "//div[@class='x-panel-body x-panel-body-tertiary x-layout-fit x-panel-body-tertiary x-docked-noborder-right x-docked-noborder-bottom x-docked-noborder-left']/div[2]/div/div/div[2]/div[2]/div/table/tbody/tr[2]")
	public WebElement mkthier_mktfolder;
	
	@FindBy(xpath = "(//div[@class='x-panel-body x-grid-body x-panel-body-default x-layout-fit x-panel-body-default'])[3]/div/table/tbody/tr[3]/td[1]/div")
	public WebElement mkthier_subfolder;
	
	//@FindBy(xpath = "(//span[text()='0._HMSM_PROXI_DRIVE_SDMP'])[1]")
	//public WebElement mkthier_subfolder;
	
	//@FindBy(xpath = "(//div[text()='HMSM + PROXI + DRIVE + SDMP'])[1]")
	//public WebElement mkthier_middlePane_1Item;
	
	@FindBy(xpath = "(//div[@class='x-container x-box-item x-container-default x-accordion-layout-ct'])[1]//ancestor::div[@class='x-panel-body x-grid-body x-panel-body-default x-layout-fit']/div/table/tbody/tr/td[2]/div")
	public WebElement mkthier_middlePane_1Item;
	
	@FindBy(xpath = "(//div[@class='x-grid-row-checker'])[1]")
	public WebElement mkt_middlePane_1Item;

	@FindBy(xpath = "(//div[@class='x-grid-row-checker'])[2]")
	public WebElement mkt_middlePane_2Item;

	@FindBy(xpath = "(//div[@class='x-grid-row-checker'])[3]")
	public WebElement mkt_middlePane_3Item;
	
	@FindBy(xpath = "(//div[@class='x-grid-row-checker'])[4]")
	public WebElement mkt_middlePane_4Item;
	
	@FindBy(xpath = "(//div[@class='x-grid-row-checker'])[5]")
	public WebElement mkt_middlePane_5Item;
	
	@FindBy(xpath = "(//div[@class='x-grid-row-checker'])[6]")
	public WebElement mkt_middlePane_6Item;
	
	@FindBy(xpath = "(//div[@class='x-grid-row-checker'])[7]")
	public WebElement mkt_middlePane_7Item;
	
	@FindBy(xpath = "(//div[@class='x-grid-row-checker'])[10]")
	public WebElement mkt_middlePane_10Item;
	
	@FindBy(xpath = "(//div[@class='x-grid-row-checker'])[11]")
	public WebElement mkt_middlePane_11Item;
	
	@FindBy(xpath = "(//div[@class='x-grid-row-checker'])[12]")
	public WebElement mkt_middlePane_12Item;
	
	@FindBy(xpath = "(//div[@class='x-grid-row-checker'])[13]")
	public WebElement mkt_middlePane_13Item;
	
	@FindBy(xpath = "(//div[@class='x-grid-row-checker'])[14]")
	public WebElement mkt_middlePane_14Item;
	
	@FindBy(xpath = "(//div[@class='x-grid-row-checker'])[15]")
	public WebElement mkt_middlePane_15Item;
	
	@FindBy(xpath = "(//div[@class='x-grid-row-checker'])[16]")
	public WebElement mkt_middlePane_16Item;

	@FindBy(xpath = "(//span[text()='Market Share'])[1]")
	public WebElement mktShareTab;

	@FindBy(xpath = "(//span[text()='Markets'])[4]")
	public WebElement mktshare_mktFolder;

	@FindBy(xpath = "((//span[text()='Market Share'])[2]/ancestor::div[@class='x-container x-box-item x-container-default x-accordion-layout-ct']//following::div/table/tbody/tr[1]/td[1]/div/div)[1]")
	public WebElement mktshare_middlepane_1Item;

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
	public WebElement prodHier_subFolder1;

	@FindBy(xpath = "(//span[text()='Products']/ancestor::div[@class='x-panel x-fit-item x-panel-secondary']/div[2]//tr[5])[1]")
	public WebElement prodHier_subFolder2;
	
	@FindBy(xpath = "(//span[text()='Products']/ancestor::div[@class='x-panel x-fit-item x-panel-secondary']/div[2]//tr[6])[1]")
	public WebElement prodHier_subFolder3;
	
	@FindBy(xpath = "(//span[text()='Products']/ancestor::div[@class='x-panel x-fit-item x-panel-secondary']/div[2]//tr[7])[1]")
	public WebElement prodHier_subFolder4;
	
	@FindBy(xpath = "(//span[text()='Products']/ancestor::div[@class='x-panel x-fit-item x-panel-secondary']/div[2]//tr[8])[1]")
	public WebElement prodHier_subFolder5;
	
	@FindBy(xpath = "(//span[text()='Products']/ancestor::div[@class='x-panel x-fit-item x-panel-secondary']/div[2]//tr[9])[1]")
	public WebElement prodHier_subFolder6;
	
	@FindBy(xpath = "(//span[text()='Products']/ancestor::div[@class='x-panel x-fit-item x-panel-secondary']/div[2]//tr[10])[1]")
	public WebElement prodHier_subFolder7;
	
	@FindBy(xpath = "(//span[text()='Products']/ancestor::div[@class='x-panel x-fit-item x-panel-secondary']/div[2]//tr[11])[1]")
	public WebElement prodHier_subFolder8;
	
	@FindBy(xpath = "(//span[text()='Products']/ancestor::div[@class='x-panel x-fit-item x-panel-secondary']/div[2]//tr[12])[1]")
	public WebElement prodHier_subFolder9;
	
	@FindBy(xpath = "(//span[text()='Products']/ancestor::div[@class='x-panel x-fit-item x-panel-secondary']/div[2]//tr[13])[1]")
	public WebElement prodHier_subFolder10;
	
	@FindBy(xpath = "(//span[text()='Products']/ancestor::div[@class='x-panel x-fit-item x-panel-secondary']/div[2]//tr[14])[1]")
	public WebElement prodHier_subFolder11;
	
	@FindBy(xpath = "(//span[text()='Products']/ancestor::div[@class='x-panel x-fit-item x-panel-secondary']/div[2]//tr[15])[1]")
	public WebElement prodHier_subFolder12;
	
	@FindBy(xpath = "(//span[text()='Products']/ancestor::div[@class='x-panel x-fit-item x-panel-secondary']/div[2]//tr[16])[1]")
	public WebElement prodHier_subFolder13;
	
	@FindBy(xpath = "(//span[text()='Products']/ancestor::div[@class='x-panel x-fit-item x-panel-secondary']/div[2]//tr[17])[1]")
	public WebElement prodHier_subFolder14;
	
	@FindBy(xpath = "(//span[text()='Products']/ancestor::div[@class='x-panel x-fit-item x-panel-secondary']/div[2]//tr[18])[1]")
	public WebElement prodHier_subFolder15;
	
	@FindBy(xpath = "(//span[text()='Products']/ancestor::div[@class='x-panel x-fit-item x-panel-secondary']/div[2]//tr[19])[1]")
	public WebElement prodHier_subFolder16;
	
	@FindBy(xpath = "(//span[text()='Products']/ancestor::div[@class='x-panel x-fit-item x-panel-secondary']/div[2]//tr[20])[1]")
	public WebElement prodHier_subFolder17;

	//@FindBy(xpath = "((//span[text()='Products'])[3]/ancestor::div[@class='x-panel x-box-item x-accordion-item x-panel-default']//following::div[2]//div//div[3]//tr)[1]")
	//public WebElement prod_middlePane_1Item;
	
	@FindBy(xpath = "(//div[@class='x-panel-body x-accordion-body x-panel-body-default x-layout-fit x-panel-body-default x-docked-noborder-right x-docked-noborder-bottom x-docked-noborder-left'])[3]//descendant::div[@class='x-grid-view x-fit-item x-grid-view-default x-unselectable']/table/tbody/tr[1]/td[2]/div")
	public WebElement prod_middlePane_1Item;

	//@FindBy(xpath = "((//span[text()='Products'])[3]/ancestor::div[@class='x-panel x-box-item x-accordion-item x-panel-default']//following::div[2]//div//div[3]//tr)[2]")
	//public WebElement prod_middlePane_2Item;
	
	@FindBy(xpath = "(//div[@class='x-panel-body x-accordion-body x-panel-body-default x-layout-fit x-panel-body-default x-docked-noborder-right x-docked-noborder-bottom x-docked-noborder-left'])[3]//descendant::div[@class='x-grid-view x-fit-item x-grid-view-default x-unselectable']/table/tbody/tr[2]/td[2]/div")
	public WebElement prod_middlePane_2Item;

	//@FindBy(xpath = "((//span[text()='Products'])[3]/ancestor::div[@class='x-panel x-box-item x-accordion-item x-panel-default']//following::div[2]//div//div[3]//tr)[3]")
	//public WebElement prod_middlePane_3Item;
	
	@FindBy(xpath = "(//div[@class='x-panel-body x-accordion-body x-panel-body-default x-layout-fit x-panel-body-default x-docked-noborder-right x-docked-noborder-bottom x-docked-noborder-left'])[3]//descendant::div[@class='x-grid-view x-fit-item x-grid-view-default x-unselectable']/table/tbody/tr[3]/td[2]/div")
	public WebElement prod_middlePane_3Item;
	
	@FindBy(xpath = "(//span[text()='Characteristics'])[5]")
	public WebElement Prod_Characteristics;
	
	
	@FindBy(xpath = "(//Span[text()='Characteristics']//ancestor::div[@class='x-tree-view x-fit-item x-tree-view-default x-unselectable'])[3]/table/tbody/tr[2]/td[1]/div")
	public WebElement ProdChar_Folder;
	
	@FindBy(xpath = "(//Span[text()='Characteristics']//ancestor::div[@class='x-tree-view x-fit-item x-tree-view-default x-unselectable'])[3]/table/tbody/tr[3]/td[1]/div")
	public WebElement ProdChar_Folder2;
	
	@FindBy(xpath = "(//Span[text()='Characteristics']//ancestor::div[@class='x-tree-view x-fit-item x-tree-view-default x-unselectable'])[3]/table/tbody/tr[4]/td[1]/div")
	public WebElement ProdChar_Folder3;
	
	@FindBy(xpath = "(//Span[text()='Characteristics']//ancestor::div[@class='x-tree-view x-fit-item x-tree-view-default x-unselectable'])[3]/table/tbody/tr[5]/td[1]/div")
	public WebElement ProdChar_Folder4;
	
	@FindBy(xpath = "(//div[@class='x-container x-box-item x-container-default x-accordion-layout-ct'])[3]//descendant::div[@class='x-grid-view x-fit-item x-grid-view-default x-unselectable']/table/tbody/tr[1]/td[2]/div")
	public WebElement ProdChar_folder1_middlepane1;
	
	@FindBy(xpath = "(//div[@class='x-container x-box-item x-container-default x-accordion-layout-ct'])[3]//descendant::div[@class='x-grid-view x-fit-item x-grid-view-default x-unselectable']/table/tbody/tr[2]/td[2]/div")
	public WebElement ProdChar_folder1_middlepane2;
	
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

	@FindBy(xpath = "(//div[@class='x-panel-body x-grid-body x-panel-body-default x-layout-fit'])[4]//child::div[@class='x-grid-view x-fit-item x-grid-view-default x-unselectable']/table/tbody/tr[1]/td[2]/div")
	public WebElement prodShare_middlepane_1Item;
	
	//@FindBy(xpath = "//div[@id='griddataaccordionpanel-1203-innerCt']/div/div/div[2]/div/div[3]/div/table/tbody/tr/td[2]/div")
	//public WebElement prodShare_middlepane_1Item;

	@FindBy(xpath = "//span[text()='Periods']")
	public WebElement periodDim;

	@FindBy(xpath = "(//span[text()='Period Groups'])[1]")
	public WebElement periodGrp;

	@FindBy(xpath = "(//span[text()='Period Groups']/ancestor::div[@class='x-container x-box-item x-container-default x-layout-fit']/div/div[2]/div/div[2]/div/div/div/div[2]//td)[3]")
	public WebElement periodFolder;
	
	@FindBy(xpath = "//span[text()='Period Groups']/ancestor::div[@class='x-container x-box-item x-container-default x-layout-fit']//following::table/tbody/tr[3]/td[1]/div/span[1]")
	public WebElement period_SubFolder;

	@FindBy(xpath = "(//div[@class='x-container x-box-item x-container-default x-accordion-layout-ct'])[5]//descendant::div[@class='x-grid-view x-fit-item x-grid-view-default x-unselectable']/table/tbody/tr[1]/td[2]/div")
	public WebElement per_middlePane_1Item;
	
	@FindBy(xpath = "(//div[@class='x-container x-box-item x-container-default x-accordion-layout-ct'])[5]//descendant::div[@class='x-grid-view x-fit-item x-grid-view-default x-unselectable']/table/tbody/tr[2]/td[2]/div")
	public WebElement per_middlePane_2Item;
	
	@FindBy(xpath = "(//div[@class='x-container x-box-item x-container-default x-accordion-layout-ct'])[5]//descendant::div[@class='x-grid-view x-fit-item x-grid-view-default x-unselectable']/table/tbody/tr[3]/td[2]/div")
	public WebElement per_middlePane_3Item;
	
	@FindBy(xpath = "(//div[@class='x-container x-box-item x-container-default x-accordion-layout-ct'])[5]//descendant::div[@class='x-grid-view x-fit-item x-grid-view-default x-unselectable']/table/tbody/tr[4]/td[2]/div")
	public WebElement per_middlePane_4Item;
	
	@FindBy(xpath = "(//div[@class='x-container x-box-item x-container-default x-accordion-layout-ct'])[5]//descendant::div[@class='x-grid-view x-fit-item x-grid-view-default x-unselectable']/table/tbody/tr[5]/td[2]/div")
	public WebElement per_middlePane_5Item;
	
	@FindBy(xpath = "(//div[@class='x-container x-box-item x-container-default x-accordion-layout-ct'])[5]//descendant::div[@class='x-grid-view x-fit-item x-grid-view-default x-unselectable']/table/tbody/tr[6]/td[2]/div")
	public WebElement per_middlePane_6Item;
	
	@FindBy(xpath = "(//div[@class='x-container x-box-item x-container-default x-accordion-layout-ct'])[5]//descendant::div[@class='x-grid-view x-fit-item x-grid-view-default x-unselectable']/table/tbody/tr[7]/td[2]/div")
	public WebElement per_middlePane_7Item;
	
	@FindBy(xpath = "(//div[@class='x-container x-box-item x-container-default x-accordion-layout-ct'])[5]//descendant::div[@class='x-grid-view x-fit-item x-grid-view-default x-unselectable']/table/tbody/tr[8]/td[2]/div")
	public WebElement per_middlePane_8Item;
	
	@FindBy(xpath = "(//div[@class='x-container x-box-item x-container-default x-accordion-layout-ct'])[5]//descendant::div[@class='x-grid-view x-fit-item x-grid-view-default x-unselectable']/table/tbody/tr[9]/td[2]/div")
	public WebElement per_middlePane_9Item;
	
	@FindBy(xpath = "(//div[@class='x-container x-box-item x-container-default x-accordion-layout-ct'])[5]//descendant::div[@class='x-grid-view x-fit-item x-grid-view-default x-unselectable']/table/tbody/tr[10]/td[2]/div")
	public WebElement per_middlePane_10Item;
	
	@FindBy(xpath = "//table[@id='gridview-1237-table']/tbody/tr[1]")
	public WebElement per_middlePane2_1Item;
	
	@FindBy(xpath = "//table[@id='gridview-1237-table']/tbody/tr[2]")
	public WebElement per_middlePane2_2Item;

	@FindBy(xpath = "//span[text()='Facts']")
	public WebElement factDim;

	@FindBy(xpath = "(//span[text()='Fact Groups'])[1]")
	public WebElement factGrp;

	@FindBy(xpath = "((//span[text()='Fact Groups'])[1]/ancestor::div[@class='x-container x-box-item x-container-default x-layout-fit']//following::div[2]//div[1]//tr[2]/td[1]/div)[1]")
	public WebElement factFolder;

	@FindBy(xpath = "((//span[text()='Fact Groups'])[1]/ancestor::div[@class='x-container x-box-item x-container-default x-layout-fit']//following::div[2]//div[1]//tr[3]/td[1]/div)[1]")
	public WebElement fact_subFolder;
	
	@FindBy(xpath = "((//span[text()='Fact Groups'])[1]/ancestor::div[@class='x-container x-box-item x-container-default x-layout-fit']//following::div[2]//div[1]//tr[4]/td[1]/div)[1]")
	public WebElement fact_subFolder1;

	@FindBy(xpath = "(//div[@class='x-container x-box-item x-container-default x-accordion-layout-ct'])[6]//descendant::div[@class='x-grid-view x-fit-item x-grid-view-default x-unselectable']/table/tbody/tr[1]/td[2]/div")
	public WebElement fact_middlePane_1Item;

	@FindBy(xpath = "(//div[@class='x-container x-box-item x-container-default x-accordion-layout-ct'])[6]//descendant::div[@class='x-grid-view x-fit-item x-grid-view-default x-unselectable']/table/tbody/tr[2]/td[2]/div")
	public WebElement fact_middlePane_2Item;

	@FindBy(xpath = "(//div[@class='x-container x-box-item x-container-default x-accordion-layout-ct'])[6]//descendant::div[@class='x-grid-view x-fit-item x-grid-view-default x-unselectable']/table/tbody/tr[3]/td[2]/div")
	public WebElement fact_middlePane_3Item;
	
	@FindBy(xpath = "(//div[@class='x-container x-box-item x-container-default x-accordion-layout-ct'])[6]//descendant::div[@class='x-grid-view x-fit-item x-grid-view-default x-unselectable']/table/tbody/tr[4]/td[2]/div")
	public WebElement fact_middlePane_4Item;
	
	@FindBy(xpath = "(//div[@class='x-container x-box-item x-container-default x-accordion-layout-ct'])[6]//descendant::div[@class='x-grid-view x-fit-item x-grid-view-default x-unselectable']/table/tbody/tr[5]/td[2]/div")
	public WebElement fact_middlePane_5Item;

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

	@FindBy(xpath = "//span[text()='Saved Buyer Group']")
	public WebElement savedBg;

	@FindBy(xpath = "//span[text()='My Saved Buyer Group']")
	public WebElement mySavedBg;

	@FindBy(xpath = "(//div[contains(@class,'x-toolbar x-docked x-toolbar-default x-docked-bottom x-toolbar-docked-bottom x-toolbar-default-docked-bottom x-box-layout-ct x-docked-noborder-right x-docked-noborder-bottom x-docked-noborder-left')]//span[text()='ADD'])[4]")
	public WebElement bgAddBtn;

	@FindBy(xpath = "(//tr[@class='x-grid-row second-level-margin x-grid-tree-node-leaf x-grid-data-row']/td/div//span[@class='x-tree-node-text'])[3]")
	public WebElement mySavedBgDb;

	@FindBy(xpath = "//span[text()='Saved Shopper Group']")
	public WebElement savedSg;

	@FindBy(xpath = "//span[text()='My Saved Shopper Group']")
	public WebElement mySavedSg;

	@FindBy(xpath = "(//tr[@class='x-grid-row second-level-margin x-grid-tree-node-leaf x-grid-data-row']/td/div//span[@class='x-tree-node-text'])[3]")
	public WebElement mySavedSgDb;

	@FindBy(xpath = "(//div[contains(@class,'x-toolbar x-docked x-toolbar-default x-docked-bottom x-toolbar-docked-bottom x-toolbar-default-docked-bottom x-box-layout-ct x-docked-noborder-right x-docked-noborder-bottom x-docked-noborder-left')]//span[text()='ADD'])[3]")
	public WebElement sgAddBtn;

	@FindBy(xpath = "//span[text()='Saved Common Sample']")
	public WebElement savedCs;

	@FindBy(xpath = "//span[text()='My Saved Common Sample']")
	public WebElement mySavedCs;

	@FindBy(xpath = "(//tr[@class='x-grid-row second-level-margin x-grid-tree-node-leaf x-grid-data-row']/td/div//span[@class='x-tree-node-text'])[5]")
	public WebElement mySavedCsDb;

	@FindBy(xpath = "(//div[contains(@class,'x-toolbar x-docked x-toolbar-default x-docked-bottom x-toolbar-docked-bottom x-toolbar-default-docked-bottom x-box-layout-ct x-docked-noborder-right x-docked-noborder-bottom x-docked-noborder-left')]//span[text()='ADD'])[7]")
	public WebElement csAddBtn;

	@FindBy(xpath = "(//table[@class='x-field x-table-plain x-form-item x-box-item x-toolbar-item x-field-default-toolbar x-vbox-form-item']//input[@class='x-form-field x-form-empty-field x-form-text'])[1]")
	public WebElement searchName_field;
	
	//For Products Characteristics
	@FindBy(xpath = "(//table[@class='x-field x-table-plain x-form-item x-box-item x-toolbar-item x-field-default-toolbar x-vbox-form-item'])[3]//input")
	public WebElement searchNameChar_field;
	
	@FindBy(xpath = "(//table[@class='x-field x-table-plain x-form-item x-box-item x-toolbar-item x-field-default-toolbar x-vbox-form-item x-form-dirty'])//input")
	public WebElement searchNameChar_field2;
	
//DS page funtionalities
	@FindBy(xpath = "(//td[@class='x-form-item-body x-form-cb-wrap']//input[@class='x-form-field x-form-checkbox x-form-cb'])[1]")
	public WebElement mkt_mktFolder_All;

	@FindBy(xpath = "(//td[@class='x-form-item-body x-form-cb-wrap']//input[@class='x-form-field x-form-checkbox x-form-cb'])[2]")
	public WebElement mkt_mktFolder_AllExpect;

	@FindBy(xpath = "(//td[@class='x-form-item-body x-form-cb-wrap']//input[@class='x-form-field x-form-checkbox x-form-cb'])[5]")
	public WebElement prod_hier_subFolder_All;

	@FindBy(xpath = "(//td[@class='x-form-item-body x-form-cb-wrap']//input[@class='x-form-field x-form-checkbox x-form-cb'])[6]")
	public WebElement prod_hier_subFolder_AllExpect;

	@FindBy(xpath = "(//td[@class='x-form-item-body x-form-cb-wrap']//input[@class='x-form-field x-form-checkbox x-form-cb'])[9]")
	public WebElement periodFolder_All;

	@FindBy(xpath = "(//td[@class='x-form-item-body x-form-cb-wrap']//input[@class='x-form-field x-form-checkbox x-form-cb'])[10]")
	public WebElement periodFolder_AllExpect;

	@FindBy(xpath = "(//td[@class='x-form-item-body x-form-cb-wrap']//input[@class='x-form-field x-form-checkbox x-form-cb'])[11]")
	public WebElement fact_subFolder_All;

	@FindBy(xpath = "(//td[@class='x-form-item-body x-form-cb-wrap']//input[@class='x-form-field x-form-checkbox x-form-cb'])[12]")
	public WebElement fact_subFolder_AllExpect;

	@FindBy(xpath = "(//span[text()='SUM'])[1]")
	public WebElement mkt_mktFolder_Sum;

	@FindBy(xpath = "(//span[text()='SUM'])[9]")
	public WebElement prod_hier_subFolder_Sum;
	
	@FindBy(xpath = "(//span[text()='SUM'])[10]")
	public WebElement prod_char_subFolder_Sum;
	

	@FindBy(xpath = "(//div[@class='x-box-inner x-horizontal-box-overflow-body'])[4]/ancestor::div[1]//following::table/tbody/tr[2]/td[1]/div/img[3]")
	public WebElement mkt_mktFolder_SumOr;

	@FindBy(xpath = "(//span[text()='THRU'])[1]")
	public WebElement period_SubFolder_Thru;

	@FindBy(xpath = "(//span[text()='Characteristics'])[1]")
	public WebElement mkt_Characteristics;

	@FindBy(xpath = "(//span[text()='Markets']/ancestor::div[@class='x-panel x-fit-item x-panel-secondary']//following::table/tbody/tr[2]/td[1]/div/span)[3]")
	public WebElement mktChar_Folder;

	@FindBy(xpath = "(//span[text()='GROUP BY'])[3]")
	public WebElement mktChar_GrpBy;
	
	@FindBy(xpath = "(//div[@class='x-container x-box-item x-container-default x-accordion-layout-ct'])[1]//ancestor::div[@class='x-panel-body x-grid-body x-panel-body-default x-layout-fit']/div/table/tbody/tr/td[2]/div")
	public WebElement mktChar_middlepane_Item;
	
	// ss in ca
	@FindBy(xpath = "//span[text()='Saved Shopper Group']")
	public WebElement savedSgCa;

	@FindBy(xpath = "//span[text()='My Saved Shopper Group']")
	public WebElement mySavedSgCa;

	@FindBy(xpath = "(//tr[@class='x-grid-row second-level-margin x-grid-tree-node-leaf x-grid-data-row']/td/div//span[@class='x-tree-node-text'])[3]")
	public WebElement mySavedSgDbCa;

	@FindBy(xpath = "(//div[contains(@class,'x-toolbar x-docked x-toolbar-default x-docked-bottom x-toolbar-docked-bottom x-toolbar-default-docked-bottom x-box-layout-ct x-docked-noborder-right x-docked-noborder-bottom x-docked-noborder-left')]//span[text()='ADD'])[3]")
	public WebElement sgAddBtnCa;

	@FindBy(xpath = "(//span[text()='Saved Markets'])[1]")
	public WebElement savedMktCa;

	@FindBy(xpath = "(//span[text()='My Saved Market'])[1]")
	public WebElement mySavedMktCa;

	@FindBy(xpath = "(//tr[@class='x-grid-row second-level-margin x-grid-tree-node-leaf x-grid-data-row']/td/div//span[@class='x-tree-node-text'])[1]")
	public WebElement mySavedMktDbCa;

	@FindBy(xpath = "(//span[text()='Saved Market Share'])[1]")
	public WebElement savedMktShrCa;

	@FindBy(xpath = "(//span[text()='My Saved Market'])[2]")
	public WebElement mySavedMktShrCa;

	@FindBy(xpath = "(//tr[@class='x-grid-row second-level-margin x-grid-tree-node-leaf x-grid-data-row']/td/div//span[@class='x-tree-node-text'])[3]")
	public WebElement mySavedMktShrDbCa;

	@FindBy(xpath = "(//div[contains(@class,'x-toolbar x-docked x-toolbar-default x-docked-bottom x-toolbar-docked-bottom x-toolbar-default-docked-bottom x-box-layout-ct x-docked-noborder-right x-docked-noborder-bottom x-docked-noborder-left')]//span[text()='ADD'])[1]")
	public WebElement mktAddBtnCa;

	@FindBy(xpath = "(//div[contains(@class,'x-toolbar x-docked x-toolbar-default x-docked-bottom x-toolbar-docked-bottom x-toolbar-default-docked-bottom x-box-layout-ct x-docked-noborder-right x-docked-noborder-bottom x-docked-noborder-left')]//span[text()='ADD'])[2]")
	public WebElement mktShrAddBtnCa;

	@FindBy(xpath = "(//span[text()='Saved Products'])[1]")
	public WebElement savedProdCa;

	@FindBy(xpath = "(//span[text()='My Saved Product'])[1]")
	public WebElement mySavedProdCa;

	@FindBy(xpath = "(//tr[@class='x-grid-row second-level-margin x-grid-tree-node-leaf x-grid-data-row']/td/div//span[@class='x-tree-node-text'])[3]")
	public WebElement mySavedProdDbCa;

	@FindBy(xpath = "(//span[text()='Saved Product Share'])[1]")
	public WebElement savedProdShrCa;

	@FindBy(xpath = "(//span[text()='My Saved Product'])[2]")
	public WebElement mySavedProdShrCa;

	@FindBy(xpath = "(//tr[@class='x-grid-row second-level-margin x-grid-tree-node-leaf x-grid-data-row']/td/div//span[@class='x-tree-node-text'])[5]")
	public WebElement mySavedProdShrDbCa;

	@FindBy(xpath = "(//span[text()='Saved Periods'])[1]")
	public WebElement savedPeriodCa;

	@FindBy(xpath = "//span[text()='My Saved Period']")
	public WebElement mySavedPeriodCa;

	@FindBy(xpath = "(//tr[@class='x-grid-row second-level-margin x-grid-tree-node-leaf x-grid-data-row']/td/div//span[@class='x-tree-node-text'])[5]")
	public WebElement mySavedPerDbCa;

	@FindBy(xpath = "(//span[text()='Saved Facts'])[1]")
	public WebElement savedfactCa;

	@FindBy(xpath = "//span[text()='My Saved Facts']")
	public WebElement mySavedfactCa;

	@FindBy(xpath = "(//tr[@class='x-grid-row second-level-margin x-grid-tree-node-leaf x-grid-data-row']/td/div//span[@class='x-tree-node-text'])[5]")
	public WebElement mySavedfactDbCa;

	@FindBy(xpath = "//span[text()='Saved Buyer Group']")
	public WebElement savedBgCa;

	@FindBy(xpath = "//span[text()='My Saved Buyer Group']")
	public WebElement mySavedBgCa;

	@FindBy(xpath = "(//tr[@class='x-grid-row second-level-margin x-grid-tree-node-leaf x-grid-data-row']/td/div//span[@class='x-tree-node-text'])[3]")
	public WebElement mySavedBgDbCa;

	@FindBy(xpath = "(//div[contains(@class,'x-toolbar x-docked x-toolbar-default x-docked-bottom x-toolbar-docked-bottom x-toolbar-default-docked-bottom x-box-layout-ct x-docked-noborder-right x-docked-noborder-bottom x-docked-noborder-left')]//span[text()='ADD'])[4]")
	public WebElement bgAddBtnCa;

	@FindBy(xpath = "(//div[contains(@class,'x-toolbar x-docked x-toolbar-default x-docked-bottom x-toolbar-docked-bottom x-toolbar-default-docked-bottom x-box-layout-ct x-docked-noborder-right x-docked-noborder-bottom x-docked-noborder-left')]//span[text()='ADD'])[5]")
	public WebElement prodAddBtnCa;

	@FindBy(xpath = "(//div[contains(@class,'x-toolbar x-docked x-toolbar-default x-docked-bottom x-toolbar-docked-bottom x-toolbar-default-docked-bottom x-box-layout-ct x-docked-noborder-right x-docked-noborder-bottom x-docked-noborder-left')]//span[text()='ADD'])[6]")
	public WebElement prodShrAddBtnCa;

	@FindBy(xpath = "//span[text()='Saved Common Sample']")
	public WebElement savedCsCa;

	@FindBy(xpath = "//span[text()='My Saved Common Sample']")
	public WebElement mySavedCsCa;

	@FindBy(xpath = "(//tr[@class='x-grid-row second-level-margin x-grid-tree-node-leaf x-grid-data-row']/td/div//span[@class='x-tree-node-text'])[5]")
	public WebElement mySavedCsDbCa;

	@FindBy(xpath = "(//div[contains(@class,'x-toolbar x-docked x-toolbar-default x-docked-bottom x-toolbar-docked-bottom x-toolbar-default-docked-bottom x-box-layout-ct x-docked-noborder-right x-docked-noborder-bottom x-docked-noborder-left')]//span[text()='ADD'])[7]")
	public WebElement csAddBtnCa;

	@FindBy(xpath = "(//div[contains(@class,'x-toolbar x-docked x-toolbar-default x-docked-bottom x-toolbar-docked-bottom x-toolbar-default-docked-bottom x-box-layout-ct x-docked-noborder-right x-docked-noborder-bottom x-docked-noborder-left')]//span[text()='ADD'])[8]")
	public WebElement perAddBtnCa;

	@FindBy(xpath = "(//div[contains(@class,'x-toolbar x-docked x-toolbar-default x-docked-bottom x-toolbar-docked-bottom x-toolbar-default-docked-bottom x-box-layout-ct x-docked-noborder-right x-docked-noborder-bottom x-docked-noborder-left')]//span[text()='ADD'])[9]")
	public WebElement factAddBtnCa;

	// ss in loreal
	@FindBy(xpath = "(//span[text()='Saved Markets'])[1]")
	public WebElement savedMktLo;

	@FindBy(xpath = "(//span[text()='My Saved Market'])[1]")
	public WebElement mySavedMktLo;

	@FindBy(xpath = "(//tr[@class='x-grid-row second-level-margin x-grid-tree-node-leaf x-grid-data-row']/td/div//span[@class='x-tree-node-text'])[1]")
	public WebElement mySavedMktDbLo;

	@FindBy(xpath = "(//span[text()='Market Share'])[1]")
	public WebElement mktShareTabLo;

	@FindBy(xpath = "(//span[text()='Saved Market Share'])[1]")
	public WebElement savedMktShrLo;

	@FindBy(xpath = "(//span[text()='My Saved Market'])[2]")
	public WebElement mySavedMktShrLo;

	@FindBy(xpath = "(//tr[@class='x-grid-row second-level-margin x-grid-tree-node-leaf x-grid-data-row']/td/div//span[@class='x-tree-node-text'])[3]")
	public WebElement mySavedMktShrDbLo;

	@FindBy(xpath = "(//div[contains(@class,'x-toolbar x-docked x-toolbar-default x-docked-bottom x-toolbar-docked-bottom x-toolbar-default-docked-bottom x-box-layout-ct x-docked-noborder-right x-docked-noborder-bottom x-docked-noborder-left')]//span[text()='ADD'])[1]")
	public WebElement mktAddBtnLo;

	@FindBy(xpath = "(//div[contains(@class,'x-toolbar x-docked x-toolbar-default x-docked-bottom x-toolbar-docked-bottom x-toolbar-default-docked-bottom x-box-layout-ct x-docked-noborder-right x-docked-noborder-bottom x-docked-noborder-left')]//span[text()='ADD'])[2]")
	public WebElement mktShrAddBtnLo;

	@FindBy(xpath = "(//span[text()='Saved Products'])[1]")
	public WebElement savedProdLo;

	@FindBy(xpath = "(//span[text()='My Saved Product'])[1]")
	public WebElement mySavedProdLo;

	@FindBy(xpath = "(//tr[@class='x-grid-row second-level-margin x-grid-tree-node-leaf x-grid-data-row']/td/div//span[@class='x-tree-node-text'])[3]")
	public WebElement mySavedProdDbLo;

	@FindBy(xpath = "//span[text()='Product Share']")
	public WebElement prodShareTabLo;

	@FindBy(xpath = "(//span[text()='Saved Product Share'])[1]")
	public WebElement savedProdShrLo;

	@FindBy(xpath = "(//span[text()='My Saved Product'])[2]")
	public WebElement mySavedProdShrLo;

	@FindBy(xpath = "(//tr[@class='x-grid-row second-level-margin x-grid-tree-node-leaf x-grid-data-row']/td/div//span[@class='x-tree-node-text'])[5]")
	public WebElement mySavedProdShrDbLo;

	@FindBy(xpath = "(//span[text()='Saved Periods'])[1]")
	public WebElement savedPeriodLo;

	@FindBy(xpath = "//span[text()='My Saved Period']")
	public WebElement mySavedPeriodLo;

	@FindBy(xpath = "(//tr[@class='x-grid-row second-level-margin x-grid-tree-node-leaf x-grid-data-row']/td/div//span[@class='x-tree-node-text'])[5]")
	public WebElement mySavedPerDbLo;

	@FindBy(xpath = "(//span[text()='Saved Facts'])[1]")
	public WebElement savedfactLo;

	@FindBy(xpath = "//span[text()='My Saved Facts']")
	public WebElement mySavedfactLo;

	@FindBy(xpath = "(//tr[@class='x-grid-row second-level-margin x-grid-tree-node-leaf x-grid-data-row']/td/div//span[@class='x-tree-node-text'])[5]")
	public WebElement mySavedfactDbLo;

	@FindBy(xpath = "//span[text()='Saved Buyer Group']")
	public WebElement savedBgLo;

	@FindBy(xpath = "//span[text()='My Saved Buyer Group']")
	public WebElement mySavedBgLo;

	@FindBy(xpath = "(//tr[@class='x-grid-row second-level-margin x-grid-tree-node-leaf x-grid-data-row']/td/div//span[@class='x-tree-node-text'])[3]")
	public WebElement mySavedBgDbLo;

	@FindBy(xpath = "(//div[contains(@class,'x-toolbar x-docked x-toolbar-default x-docked-bottom x-toolbar-docked-bottom x-toolbar-default-docked-bottom x-box-layout-ct x-docked-noborder-right x-docked-noborder-bottom x-docked-noborder-left')]//span[text()='ADD'])[3]")
	public WebElement bgAddBtnLo;

	@FindBy(xpath = "(//div[contains(@class,'x-toolbar x-docked x-toolbar-default x-docked-bottom x-toolbar-docked-bottom x-toolbar-default-docked-bottom x-box-layout-ct x-docked-noborder-right x-docked-noborder-bottom x-docked-noborder-left')]//span[text()='ADD'])[4]")
	public WebElement prodAddBtnLo;

	@FindBy(xpath = "(//div[contains(@class,'x-toolbar x-docked x-toolbar-default x-docked-bottom x-toolbar-docked-bottom x-toolbar-default-docked-bottom x-box-layout-ct x-docked-noborder-right x-docked-noborder-bottom x-docked-noborder-left')]//span[text()='ADD'])[5]")
	public WebElement prodShrAddBtnLo;

	@FindBy(xpath = "//span[text()='Saved Common Sample']")
	public WebElement savedCsLo;

	@FindBy(xpath = "//span[text()='My Saved Common Sample']")
	public WebElement mySavedCsLo;

	@FindBy(xpath = "(//tr[@class='x-grid-row second-level-margin x-grid-tree-node-leaf x-grid-data-row']/td/div//span[@class='x-tree-node-text'])[5]")
	public WebElement mySavedCsDbLo;

	@FindBy(xpath = "(//div[contains(@class,'x-toolbar x-docked x-toolbar-default x-docked-bottom x-toolbar-docked-bottom x-toolbar-default-docked-bottom x-box-layout-ct x-docked-noborder-right x-docked-noborder-bottom x-docked-noborder-left')]//span[text()='ADD'])[6]")
	public WebElement csAddBtnLo;

	@FindBy(xpath = "(//div[contains(@class,'x-toolbar x-docked x-toolbar-default x-docked-bottom x-toolbar-docked-bottom x-toolbar-default-docked-bottom x-box-layout-ct x-docked-noborder-right x-docked-noborder-bottom x-docked-noborder-left')]//span[text()='ADD'])[7]")
	public WebElement perAddBtnLo;

	@FindBy(xpath = "(//div[contains(@class,'x-toolbar x-docked x-toolbar-default x-docked-bottom x-toolbar-docked-bottom x-toolbar-default-docked-bottom x-box-layout-ct x-docked-noborder-right x-docked-noborder-bottom x-docked-noborder-left')]//span[text()='ADD'])[8]")
	public WebElement factAddBtnLo;

	@FindBy(xpath = "//div[@id= 'button-1056']")
	public WebElement applyButton;

	@FindBy(xpath = "(//span[text()='SAVE'])[1]")
	public WebElement saveSelectionDs;

	@FindBy(xpath = "//input[@name='savename']")
	public WebElement saveSelectionSearchBar;

	@FindBy(xpath = "(//span[text()='SAVE'])[5]")
	public WebElement saveSelectionSaveBtn;
	
	//Products chara
	@FindBy(xpath = "(//span[text()='UPDATE'])[3]")
	public WebElement prodhierUpdateBtn;

	public DSPageReg_ME() {
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
			Thread.sleep(2000);
			gen.click(mkt_mktFolder);
			Thread.sleep(2000);
			gen.doubleClick(mkt_middlePane_1Item);
			gen.doubleClick(mkt_middlePane_2Item);
			gen.doubleClick(mkt_middlePane_3Item);
			Thread.sleep(2000);
			logger.log(Status.PASS, "Market selection done");
			System.out.println("Market selection done");

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

    //Product Selection
	public void productSelection() {
		try {
			gen.click(prodDim);
			gen.click(prodTab);
			gen.click(prodHier_Folder);
			action.moveToElement(prodHier_subFolder2).build().perform();
			gen.click(prodHier_subFolder2);
			Thread.sleep(3000);
			Thread.sleep(2000);
			gen.doubleClick(prod_middlePane_1Item);
			gen.doubleClick(prod_middlePane_2Item);
			gen.doubleClick(prod_middlePane_3Item);
			logger.log(Status.PASS, "Product selection done");
			System.out.println("Product selection done");

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
			Thread.sleep(2000);
			gen.doubleClick(prodShare_middlepane_1Item);
			logger.log(Status.PASS, "Product Share selection done");
			System.out.println("Product Share selection done");

		} catch (Exception e) {
			System.out.println("exception occured" + e);
			logger.log(Status.FAIL, " Exception ocuerd " + e);
		}
	}
	
   // Period Selections
	public void periodSelection() {
		try {
			gen.click(periodDim);
			gen.click(periodGrp);
			action.moveToElement(periodFolder).build().perform();
			// gen.click(periodFolder);
			action.moveToElement(period_SubFolder).build().perform();
			gen.click(period_SubFolder);
			Thread.sleep(2000);
			gen.doubleClick(per_middlePane_1Item);
			gen.doubleClick(per_middlePane_2Item);
			gen.doubleClick(per_middlePane_3Item);
			gen.doubleClick(per_middlePane_4Item);
			logger.log(Status.PASS, "period selection done");
			System.out.println("period selection done");

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
			gen.doubleClick(fact_middlePane_4Item);
			gen.doubleClick(fact_middlePane_5Item);
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

	
	
	//Market Hierarchies selection
	public void market_hierarchies() {
		try {
			gen.click(mktDim);
			gen.click(mktTab);
			gen.click(mkthier);
			Thread.sleep(2000);
			gen.click(mkthier_mktfolder);
			Thread.sleep(2000);
			gen.click(mkthier_subfolder);
			Thread.sleep(2000);
			gen.doubleClick(mkthier_middlePane_1Item);
			Thread.sleep(2000);
			gen.click(mktShareTab);
			gen.click(mktshare_mktFolder);
			gen.click(mktTab);
			gen.click(mktShareTab);
			gen.doubleClick(mktshare_middlepane_1Item);
			logger.log(Status.PASS, "Market selection done");
			System.out.println("Market selection done");
		} catch (Exception e) {
			System.out.println("exception occured" + e);
			logger.log(Status.FAIL, " Exception ocuerd " + e);
		}
	}
	
	//Market Characteristics
	public void market_Characteristics() {
		try {
			gen.click(mktDim);
			gen.click(mktTab);
			gen.click(mkt_Characteristics);
			Thread.sleep(2000);
			gen.click(mktChar_Folder);
			Thread.sleep(2000);
			gen.doubleClick(mktChar_middlepane_Item);
			Thread.sleep(2000);
			gen.click(mktShareTab);
			gen.click(mktshare_mktFolder);
			gen.click(mktTab);
			gen.click(mktShareTab);
			gen.doubleClick(mktshare_middlepane_1Item);
			logger.log(Status.PASS, "Market selection done");
			System.out.println("Market selection done");
		} catch (Exception e) {
			System.out.println("exception occured" + e);
			logger.log(Status.FAIL, " Exception ocuerd " + e);
		}
	}	
}