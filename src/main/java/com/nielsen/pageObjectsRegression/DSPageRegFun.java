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

public class DSPageRegFun extends BaseMethod {
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

	@FindBy(xpath = "(//span[text()='Markets'])[3]")
	public WebElement mkt_mktFolder;

	@FindBy(xpath = "(//div[@class='x-panel-body x-grid-body x-panel-body-default x-layout-fit x-panel-body-default'])[3]//table/tbody/tr[2]")
	public WebElement mktHier_Folder1;

	@FindBy(xpath = "(//div[@class='x-panel-body x-grid-body x-panel-body-default x-layout-fit x-panel-body-default'])[3]//table/tbody/tr[3]")
	public WebElement mktHier_Folder2;

	@FindBy(xpath = "(//div[@class='x-panel-body x-grid-body x-panel-body-default x-layout-fit x-panel-body-default'])[3]//table/tbody/tr[4]")
	public WebElement mktHier_Folder3;

	@FindBy(xpath = "(//div[@class='x-panel-body x-grid-body x-panel-body-default x-layout-fit x-panel-body-default'])[3]//table/tbody/tr[5]")
	public WebElement mktHier_Folder4;

	@FindBy(xpath = "(//div[@class='x-panel-body x-grid-body x-panel-body-default x-layout-fit x-panel-body-default'])[3]//table/tbody/tr[6]")
	public WebElement mktHier_Folder5;

	@FindBy(xpath = "(//div[@class='x-grid-row-checker'])[1]")
	public WebElement mkt_middlePane_1Item;

	@FindBy(xpath = "(//div[@class='x-grid-row-checker'])[2]")
	public WebElement mkt_middlePane_2Item;

	@FindBy(xpath = "(//div[@class='x-grid-row-checker'])[3]")
	public WebElement mkt_middlePane_3Item;

	@FindBy(xpath = "(//div[@class='x-panel-body x-grid-body x-panel-body-default x-layout-fit'])[1]/div/table/tbody/tr[1]")
	public WebElement mkt_middlepaneNew_1Item;

	@FindBy(xpath = "(//div[@class='x-panel-body x-grid-body x-panel-body-default x-layout-fit'])[1]/div/table/tbody/tr[2]")
	public WebElement mkt_middlepaneNew_2Item;

	@FindBy(xpath = "(//div[@class='x-panel-body x-grid-body x-panel-body-default x-layout-fit'])[1]/div/table/tbody/tr[3]")
	public WebElement mkt_middlepaneNew_3Item;

	@FindBy(xpath = "(//span[text()='Market Share'])[1]")
	public WebElement mktShareTab;

	@FindBy(xpath = "(//span[text()='Market Groups'])[3]")
	public WebElement mktShare_Grp;

	@FindBy(xpath = "(//span[text()='Markets'])[4]")
	public WebElement mktshare_mktFolder;

	@FindBy(xpath = "(//span[text()='Characteristics'])[3]")
	public WebElement mktshare_Characteristics;

	@FindBy(xpath = "(//span[text()='ADD'])[5]")
	public WebElement mkt_Add;

	@FindBy(xpath = "((//span[text()='Market Share'])[2]/ancestor::div[@class='x-container x-box-item x-container-default x-accordion-layout-ct']//following::div/table/tbody/tr[1]/td[1]/div/div)[1]")
	public WebElement mktshare_middlepane_1Item;

	@FindBy(xpath = "(//div[@class='x-panel-body x-grid-body x-panel-body-default x-layout-fit'])[2]/div/table/tbody/tr[1]")
	public WebElement mktshare_middlepaneNew_1Item;

	@FindBy(xpath = "(//div[@class='x-panel-body x-grid-body x-panel-body-default x-layout-fit'])[2]/div/table/tbody/tr[2]")
	public WebElement mktshare_middlepaneNew_2Item;

	@FindBy(xpath = "(//span[text()='Products'])[1]")
	public WebElement prodDim;

	@FindBy(xpath = "(//span[text()='Products'])[2]")
	public WebElement prodTab;

	@FindBy(xpath = "(//span[text()='Hierarchies'])[5]")
	public WebElement Prod_Hierarchies;

	@FindBy(xpath = "(//span[text()='Characteristics'])[5]")
	public WebElement Prod_Characteristics;

	@FindBy(xpath = "(//div[@class='x-panel-body x-grid-body x-panel-body-default x-layout-fit x-panel-body-default'])[19]//table/tbody/tr[2]")
	public WebElement prodChar_Folder1;

	@FindBy(xpath = "(//div[@class='x-panel-body x-grid-body x-panel-body-default x-layout-fit x-panel-body-default'])[19]//table/tbody/tr[3]")
	public WebElement prodChar_Folder2;

	@FindBy(xpath = "(//div[@class='x-panel-body x-grid-body x-panel-body-default x-layout-fit x-panel-body-default'])[19]//table/tbody/tr[4]")
	public WebElement prodChar_Folder3;

	@FindBy(xpath = "(//span[text()='Characteristics'])[7]")
	public WebElement ProdShar_Characteristics;

	@FindBy(xpath = "(//span[text()='Products']/ancestor::div[@class='x-panel x-fit-item x-panel-secondary']/div[2]//tr[2])[1]")
	public WebElement prodHier_Folder;

	@FindBy(xpath = "(//span[text()='Products']/ancestor::div[@class='x-panel x-fit-item x-panel-secondary']/div[2]//tr[3])[1]")
	public WebElement prodHier_subFolder;

	@FindBy(xpath = "(//span[text()='Products']/ancestor::div[@class='x-panel x-fit-item x-panel-secondary']/div[2]//tr[5])[1]")
	public WebElement prodHier_subFolder2;

	@FindBy(xpath = "(//div[@class='x-panel-body x-grid-body x-panel-body-default x-layout-fit x-panel-body-default'])[17]//table/tbody/tr[2]")
	public WebElement prodHier_Folder1;

	@FindBy(xpath = "(//div[@class='x-panel-body x-grid-body x-panel-body-default x-layout-fit x-panel-body-default'])[17]//table/tbody/tr[3]")
	public WebElement prodHier_Folder2;

	@FindBy(xpath = "(//div[@class='x-panel-body x-grid-body x-panel-body-default x-layout-fit x-panel-body-default'])[17]//table/tbody/tr[4]")
	public WebElement prodHier_Folder3;

	@FindBy(xpath = "(//div[@class='x-panel-body x-grid-body x-panel-body-default x-layout-fit x-panel-body-default'])[17]//table/tbody/tr[5]")
	public WebElement prodHier_Folder4;

	@FindBy(xpath = "(//div[@class='x-panel-body x-grid-body x-panel-body-default x-layout-fit x-panel-body-default'])[17]//table/tbody/tr[6]")
	public WebElement prodHier_Folder5;

	@FindBy(xpath = "((//span[text()='Products'])[3]/ancestor::div[@class='x-panel x-box-item x-accordion-item x-panel-default']//following::div[2]//div//div[3]//tr)[1]")
	public WebElement prod_middlePane_1Item;

	@FindBy(xpath = "((//span[text()='Products'])[3]/ancestor::div[@class='x-panel x-box-item x-accordion-item x-panel-default']//following::div[2]//div//div[3]//tr)[2]")
	public WebElement prod_middlePane_2Item;

	@FindBy(xpath = "((//span[text()='Products'])[3]/ancestor::div[@class='x-panel x-box-item x-accordion-item x-panel-default']//following::div[2]//div//div[3]//tr)[3]")
	public WebElement prod_middlePane_3Item;

	@FindBy(xpath = "(//div[@class='x-panel-body x-grid-body x-panel-body-default x-layout-fit'])[3]/div/table/tbody/tr[1]")
	public WebElement prod_middlePaneNew_1Item;

	@FindBy(xpath = "(//div[@class='x-panel-body x-grid-body x-panel-body-default x-layout-fit'])[3]/div/table/tbody/tr[2]")
	public WebElement prod_middlePaneNew_2Item;

	@FindBy(xpath = "(//div[@class='x-panel-body x-grid-body x-panel-body-default x-layout-fit'])[3]/div/table/tbody/tr[3]")
	public WebElement prod_middlePaneNew_3Item;

	@FindBy(xpath = "//span[text()='Product Share']")
	public WebElement prodShareTab;

	@FindBy(xpath = "(//span[text()='Hierarchies'])[7]")
	public WebElement prodShare_Hierarchies;

	@FindBy(xpath = "(//div[@class='x-panel-body x-grid-body x-panel-body-default x-layout-fit x-panel-body-default'])[23]//table/tbody/tr[2]")
	public WebElement prodShare_hier_folder1;

	@FindBy(xpath = "(//div[@class='x-panel-body x-grid-body x-panel-body-default x-layout-fit x-panel-body-default'])[23]//table/tbody/tr[3]")
	public WebElement prodShare_hier_folder2;

	@FindBy(xpath = "(//div[@class='x-panel-body x-grid-body x-panel-body-default x-layout-fit x-panel-body-default'])[23]//table/tbody/tr[4]")
	public WebElement prodShare_hier_folder3;

	@FindBy(xpath = "(//div[@class='x-panel-body x-grid-body x-panel-body-default x-layout-fit x-panel-body-default'])[25]//table/tbody/tr[2]")
	public WebElement prodShare_Char_folder1;

	@FindBy(xpath = "(//div[@class='x-panel-body x-grid-body x-panel-body-default x-layout-fit x-panel-body-default'])[25]//table/tbody/tr[3]")
	public WebElement prodShare_Char_folder2;

	@FindBy(xpath = "(//div[@class='x-panel-body x-grid-body x-panel-body-default x-layout-fit x-panel-body-default'])[25]//table/tbody/tr[4]")
	public WebElement prodShare_Char_folder3;

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

	@FindBy(xpath = "(//div[@class='x-panel-body x-grid-body x-panel-body-default x-layout-fit'])[4]/div/table/tbody/tr[1]")
	public WebElement prodShare_middlepaneNew_1Item;

	@FindBy(xpath = "(//div[@class='x-panel-body x-grid-body x-panel-body-default x-layout-fit'])[4]/div/table/tbody/tr[2]")
	public WebElement prodShare_middlepaneNew_2Item;

	@FindBy(xpath = "//span[text()='Periods']")
	public WebElement periodDim;

	@FindBy(xpath = "(//span[text()='Period Groups'])[1]")
	public WebElement periodGrp;

	@FindBy(xpath = "(//span[text()='Period Groups']/ancestor::div[@class='x-container x-box-item x-container-default x-layout-fit']/div/div[2]/div/div[2]/div/div/div/div[2]//td)[3]")
	public WebElement periodFolder;

	@FindBy(xpath = "(//div[@class='x-panel-body x-grid-body x-panel-body-default x-layout-fit x-panel-body-default'])[29]//table/tbody/tr[2]")
	public WebElement periodFolder1;

	@FindBy(xpath = "(//div[@class='x-panel-body x-grid-body x-panel-body-default x-layout-fit x-panel-body-default'])[29]//table/tbody/tr[3]")
	public WebElement periodFolder2;

	@FindBy(xpath = "(//div[@class='x-panel-body x-grid-body x-panel-body-default x-layout-fit x-panel-body-default'])[29]//table/tbody/tr[4]")
	public WebElement periodFolder3;

	@FindBy(xpath = "//span[text()='Period Groups']/ancestor::div[@class='x-container x-box-item x-container-default x-layout-fit']//following::table/tbody/tr[3]/td[1]/div/span[1]")
	public WebElement period_SubFolder;

	@FindBy(xpath = "((//span[@class='x-header-text x-panel-header-text'])[5]/ancestor::div[@class='x-container x-box-item x-container-default x-accordion-layout-ct']//div[2]/div[1]/div[3]//td[2]/div)[1]")
	public WebElement per_middlePane_1Item;

	@FindBy(xpath = "((//span[@class='x-header-text x-panel-header-text'])[5]/ancestor::div[@class='x-container x-box-item x-container-default x-accordion-layout-ct']//div[2]/div[1]/div[3]//td[2]/div)[2]")
	public WebElement per_middlePane_2Item;

	@FindBy(xpath = "((//span[@class='x-header-text x-panel-header-text'])[5]/ancestor::div[@class='x-container x-box-item x-container-default x-accordion-layout-ct']//div[2]/div[1]/div[3]//td[2]/div)[3]")
	public WebElement per_middlePane_3Item;

	@FindBy(xpath = "(//div[@class='x-panel-body x-grid-body x-panel-body-default x-layout-fit'])[5]/div/table/tbody/tr[3]")
	public WebElement per_middlePaneNew_3Item;

	@FindBy(xpath = "(//div[@class='x-panel-body x-grid-body x-panel-body-default x-layout-fit'])[5]/div/table/tbody/tr[1]")
	public WebElement per_middlePaneNew_1Item;

	@FindBy(xpath = "(//div[@class='x-panel-body x-grid-body x-panel-body-default x-layout-fit'])[5]/div/table/tbody/tr[2]")
	public WebElement per_middlePaneNew_2Item;

	@FindBy(xpath = "(//div[@class='x-panel-body x-grid-body x-panel-body-default x-layout-fit'])[5]/div/table/tbody/tr[4]")
	public WebElement per_middlePaneNew_4Item;

	@FindBy(xpath = "(//div[@class='x-panel-body x-grid-body x-panel-body-default x-layout-fit'])[5]/div/table/tbody/tr[5]")
	public WebElement per_middlePaneNew_5Item;

	@FindBy(xpath = "(//div[@class='x-panel-body x-grid-body x-panel-body-default x-layout-fit'])[5]/div/table/tbody/tr[6]")
	public WebElement per_middlePaneNew_6Item;

	@FindBy(xpath = "//span[text()='Facts']")
	public WebElement factDim;

	@FindBy(xpath = "(//span[text()='Fact Groups'])[1]")
	public WebElement factGrp;

	@FindBy(xpath = "((//span[text()='Fact Groups'])[1]/ancestor::div[@class='x-container x-box-item x-container-default x-layout-fit']//following::div[2]//div[1]//tr[2]/td[1]/div)[1]")
	public WebElement factFolder;

	@FindBy(xpath = "(//div[@class='x-panel-body x-grid-body x-panel-body-default x-layout-fit x-panel-body-default'])[35]//table/tbody/tr[2]")
	public WebElement factFolder1;

	@FindBy(xpath = "(//div[@class='x-panel-body x-grid-body x-panel-body-default x-layout-fit x-panel-body-default'])[35]//table/tbody/tr[3]")
	public WebElement factFolder2;

	@FindBy(xpath = "(//div[@class='x-panel-body x-grid-body x-panel-body-default x-layout-fit x-panel-body-default'])[35]//table/tbody/tr[4]")
	public WebElement factFolder3;

	@FindBy(xpath = "((//span[text()='Fact Groups'])[1]/ancestor::div[@class='x-container x-box-item x-container-default x-layout-fit']//following::div[2]//div[1]//tr[3]/td[1]/div)[1]")
	public WebElement fact_subFolder;

	@FindBy(xpath = "((//span[@class='x-header-text x-panel-header-text'])[6]/ancestor::div[@class='x-container x-box-item x-container-default x-accordion-layout-ct']//following::div[2]//div[3]//tr[1]/td[2]/div)[1]")
	public WebElement fact_middlePane_1Item;

	@FindBy(xpath = "((//span[@class='x-header-text x-panel-header-text'])[6]/ancestor::div[@class='x-container x-box-item x-container-default x-accordion-layout-ct']//following::div[2]//div[3]//tr[2]/td[2]/div)[1]")
	public WebElement fact_middlePane_2Item;

	@FindBy(xpath = "((//span[@class='x-header-text x-panel-header-text'])[6]/ancestor::div[@class='x-container x-box-item x-container-default x-accordion-layout-ct']//following::div[2]//div[3]//tr[3]/td[2]/div)[1]")
	public WebElement fact_middlePane_3Item;

	@FindBy(xpath = "(//div[@class='x-panel-body x-grid-body x-panel-body-default x-layout-fit'])[6]/div/table/tbody/tr[1]")
	public WebElement fact_middlePaneNew_1Item;

	@FindBy(xpath = "(//div[@class='x-panel-body x-grid-body x-panel-body-default x-layout-fit'])[6]/div/table/tbody/tr[2]")
	public WebElement fact_middlePaneNew_2Item;

	@FindBy(xpath = "(//div[@class='x-panel-body x-grid-body x-panel-body-default x-layout-fit'])[6]/div/table/tbody/tr[3]")
	public WebElement fact_middlePaneNew_3Item;

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
//DS page funtionalities
	@FindBy(xpath = "(//td[@class='x-form-item-body x-form-cb-wrap']//input[@class='x-form-field x-form-checkbox x-form-cb'])[1]")
	public WebElement mkt_mktFolder_All;

	@FindBy(xpath = "(//td[@class='x-form-item-body x-form-cb-wrap']//input[@class='x-form-field x-form-checkbox x-form-cb'])[2]")
	public WebElement mkt_mktFolder_AllExpect;

	@FindBy(xpath = "(//td[@class='x-form-item-body x-form-cb-wrap']//input[@class='x-form-field x-form-checkbox x-form-cb'])[5]")
	public WebElement prod_hier_subFolder_All;

	@FindBy(xpath = "(//td[@class='x-form-item-body x-form-cb-wrap']//input[@class='x-form-field x-form-checkbox x-form-cb'])[7]")
	public WebElement prod_Char_subFolder_All;

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

	@FindBy(xpath = "(//span[text()='SUM'])[2]")
	public WebElement mkt_mktHier_Sum;

	@FindBy(xpath = "(//span[text()='SUM'])[3]")
	public WebElement mkt_mktChar_Sum;

	@FindBy(xpath = "(//span[text()='SUM'])[5]")
	public WebElement mktShare_mktFolder_Sum;

	@FindBy(xpath = "(//span[text()='SUM'])[6]")
	public WebElement mktShare_Hier_Sum;

	@FindBy(xpath = "(//span[text()='SUM'])[7]")
	public WebElement mktShare_Char_Sum;

	@FindBy(xpath = "//input[@name='desc']")
	public WebElement mkt_DSRename;

	@FindBy(xpath = "(//span[text()='SUM'])[9]")
	public WebElement prod_hier_subFolder_Sum;

	@FindBy(xpath = "(//span[text()='SUM'])[10]")
	public WebElement prod_char_subFolder_Sum;

	@FindBy(xpath = "(//span[text()='SUM'])[12]")
	public WebElement prodShare_hier_subFolder_Sum;

	@FindBy(xpath = "(//span[text()='SUM'])[15]")
	public WebElement period_Sum;

	@FindBy(xpath = "(//div[@class='x-box-inner x-horizontal-box-overflow-body'])[4]/ancestor::div[1]//following::table/tbody/tr[2]/td[1]/div/img[3]")
	public WebElement mkt_mktFolder_SumOr;

	@FindBy(xpath = "(//span[text()='Data Selection Summary']/following::div[@class='x-tree-view x-fit-item x-tree-view-default x-unselectable'])[3]/table//tr[2]")
	public WebElement prod_SumOr;

	@FindBy(xpath = "(//span[text()='Data Selection Summary']/following::div[@class='x-tree-view x-fit-item x-tree-view-default x-unselectable'])[5]/table//tr[2]")
	public WebElement period_SumOr;

	@FindBy(xpath = "(//span[text()='THRU'])[1]")
	public WebElement period_SubFolder_Thru;

	@FindBy(xpath = "(//span[text()='Hierarchies'])[1]")
	public WebElement mkt_Hierarchies;

	@FindBy(xpath = "(//span[text()='Hierarchies'])[3]")
	public WebElement mktShare_Hierarchies;

	@FindBy(xpath = "(//div[@class='x-panel-body x-grid-body x-panel-body-default x-layout-fit x-panel-body-default'])[11]//table/tbody/tr[2]")
	public WebElement mktShare_Hier_folder1;

	@FindBy(xpath = "(//div[@class='x-panel-body x-grid-body x-panel-body-default x-layout-fit x-panel-body-default'])[11]//table/tbody/tr[3]")
	public WebElement mktShare_Hier_folder2;

	@FindBy(xpath = "(//div[@class='x-panel-body x-grid-body x-panel-body-default x-layout-fit x-panel-body-default'])[11]//table/tbody/tr[4]")
	public WebElement mktShare_Hier_folder3;

	@FindBy(xpath = "(//div[@class='x-panel-body x-grid-body x-panel-body-default x-layout-fit x-panel-body-default'])[13]//table/tbody/tr[2]")
	public WebElement mktShare_Char_folder1;

	@FindBy(xpath = "(//div[@class='x-panel-body x-grid-body x-panel-body-default x-layout-fit x-panel-body-default'])[13]//table/tbody/tr[3]")
	public WebElement mktShare_Char_folder2;

	@FindBy(xpath = "(//div[@class='x-panel-body x-grid-body x-panel-body-default x-layout-fit x-panel-body-default'])[13]//table/tbody/tr[4]")
	public WebElement mktShare_Char_folder3;

	@FindBy(xpath = "(//span[text()='Characteristics'])[1]")
	public WebElement mkt_Characteristics;

	@FindBy(xpath = "(//div[@class='x-panel-body x-grid-body x-panel-body-default x-layout-fit x-panel-body-default'])[5]//table/tbody/tr[2]")
	public WebElement mktChar_Folder1;

	@FindBy(xpath = "(//div[@class='x-panel-body x-grid-body x-panel-body-default x-layout-fit x-panel-body-default'])[5]//table/tbody/tr[3]")
	public WebElement mktChar_Folder2;

	@FindBy(xpath = "(//div[@class='x-panel-body x-grid-body x-panel-body-default x-layout-fit x-panel-body-default'])[5]//table/tbody/tr[4]")
	public WebElement mktChar_Folder3;

	@FindBy(xpath = "(//span[text()='Markets']/ancestor::div[@class='x-panel x-fit-item x-panel-secondary']//following::table/tbody/tr[2]/td[1]/div/span)[3]")
	public WebElement mktChar_Folder;

	@FindBy(xpath = "(//span[text()='GROUP BY'])[3]/ancestor::a")
	public WebElement mktChar_GrpBy;

	@FindBy(xpath = "(//span[text()='GROUP BY'])[10]")
	public WebElement prodChar_GrpBy;

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

	@FindBy(xpath = "//span[text()='Data Selection Summary']")
	public WebElement dataSelectionSummary;

	@FindBy(xpath = "(//span[text()='Characteristics'])[3]")
	public WebElement mktShrCharacteristics;

	@FindBy(xpath = "(//span[text()='Characteristics']/ancestor::div[@class='x-panel x-fit-item x-panel-secondary']/div[2]//tr[2])[7]")
	public WebElement mktShr_characteristicsFolder;

	@FindBy(xpath = "(//label[text()='ALL'])[4]")
	public WebElement Prod_Characteristics_All;

	@FindBy(xpath = "(//span[text()='ADD'])[9]")
	public WebElement addBtn_mktChar_All;

	@FindBy(xpath = "(//span[text()='ADD'])[17]")
	public WebElement addBtn_prodChar_All;

	@FindBy(xpath = "(//Span[text()='Characteristics']//ancestor::div[@class='x-tree-view x-fit-item x-tree-view-default x-unselectable'])[3]/table/tbody/tr[4]/td[1]/div")
	public WebElement productcharcategoryFolder;

	@FindBy(xpath = "(//div[@class='x-container x-box-item x-container-default x-accordion-layout-ct'])[3]//descendant::div[@class='x-grid-view x-fit-item x-grid-view-default x-unselectable']/table/tbody/tr[1]/td[2]/div")
	public WebElement productcharsub1item1;

	@FindBy(xpath = "(//div[@class='x-container x-box-item x-container-default x-accordion-layout-ct'])[3]//descendant::div[@class='x-grid-view x-fit-item x-grid-view-default x-unselectable']/table/tbody/tr[2]/td[2]/div")
	public WebElement productcharsub1item2;

	public DSPageRegFun() {
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

	// market_Selection for Rename
	public void marketSelection_Rename() {
		try {
			gen.click(mktDim);
			gen.click(mktTab);
			gen.click(mktGrp);
			gen.click(mkt_Characteristics);
			gen.click(mktChar_Folder);
			action.moveToElement(mkt_mktChar_Sum).build().perform();
			action.click(mkt_mktChar_Sum).build().perform();
			Thread.sleep(2000);
			gen.doubleClick(mkt_middlePane_1Item);
			Thread.sleep(2000);
			mkt_DSRename.sendKeys("Market SUM");
			gen.click(mkt_mktFolder_SumOr);
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

	// Normal Market Selection
	public void marketSelection() {
		try {
			gen.click(mktDim);
			gen.click(mktTab);
			gen.click(mktGrp);
			gen.click(mkt_mktFolder);
			gen.doubleClick(mkt_middlepaneNew_1Item);
//				gen.doubleClick(mkt_middlePane_2Item);
//				gen.doubleClick(mkt_middlePane_3Item);
			Thread.sleep(3000);

			gen.click(mktShareTab);
			gen.click(mktshare_mktFolder);
			gen.doubleClick(mktshare_middlepaneNew_1Item);

			logger.log(Status.PASS, "Market selection done");
			System.out.println("Market selection done");

		} catch (Exception e) {
			System.out.println("exception occured" + e);
			logger.log(Status.FAIL, " Exception ocuerd " + e);
		}
	}

	// Normal Product Selection
	public void productSelection() {
		try {
			gen.click(prodDim);
			gen.click(prodTab);
			gen.click(prodHier_Folder);
			action.moveToElement(prodHier_subFolder2).build().perform();
			gen.click(prodHier_subFolder2);
			Thread.sleep(1000);
			gen.doubleClick(prod_middlePaneNew_1Item);
//				gen.doubleClick(prod_middlePaneNew_2Item);
//				gen.doubleClick(prod_middlePaneNew_3Item);
			Thread.sleep(2000);

			gen.click(prodShareTab);
			action.moveToElement(prodShare_hier_folder).build().perform();
			gen.click(prodShare_hier_folder);
			action.moveToElement(prodShare_hier_subFolder).build().perform();
			gen.click(prodShare_hier_subFolder);
			Thread.sleep(1000);
			gen.doubleClick(prodShare_middlepaneNew_1Item);
			logger.log(Status.PASS, "Product selection done");
			System.out.println("Product selection done");

		} catch (Exception e) {
			System.out.println("exception occured" + e);
			logger.log(Status.FAIL, " Exception ocuerd " + e);
		}
	}

	// Normal Period Selection
	public void periodSelection() {
		try {
			gen.click(periodDim);
			gen.click(periodGrp);
			action.moveToElement(periodFolder1).build().perform();
			// gen.click(periodFolder);
			action.moveToElement(periodFolder3).build().perform();
			gen.click(periodFolder3);
			Thread.sleep(2000);
			gen.doubleClick(per_middlePaneNew_1Item);
			gen.doubleClick(per_middlePaneNew_2Item);
			gen.doubleClick(per_middlePaneNew_3Item);
			logger.log(Status.PASS, "period selection done");
			System.out.println("period selection done");

		} catch (Exception e) {
			System.out.println("exception occured" + e);
			logger.log(Status.FAIL, " Exception ocuerd " + e);
		}
	}

	// Normal Facts Selection
	public void factSelection() {
		try {
			gen.click(factDim);
			gen.click(factGrp);
			action.moveToElement(factFolder1).build().perform();
			gen.click(factFolder1);
			action.moveToElement(factFolder2).build().perform();
			gen.click(factFolder2);
			Thread.sleep(5000);

			gen.doubleClick(fact_middlePaneNew_1Item);
			gen.doubleClick(fact_middlePaneNew_2Item);
			gen.doubleClick(fact_middlePaneNew_3Item);
			Thread.sleep(5000);

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

	// period Thru Selection
	public void periodThruSelection() {
		try {
			gen.click(periodDim);
			gen.click(periodGrp);
			action.moveToElement(periodFolder).build().perform();
//			gen.click(periodFolder);
			action.moveToElement(period_SubFolder).build().perform();
			gen.click(period_SubFolder);
			Thread.sleep(2000);
			action.moveToElement(period_SubFolder_Thru).build().perform();
			action.click(period_SubFolder_Thru).build().perform();
			Thread.sleep(5000);
			gen.doubleClick(per_middlePaneNew_3Item);
			Thread.sleep(5000);
//			action.moveToElement(periodFolder).build().perform();
//			gen.click(periodFolder);
//			gen.click(period_SubFolder);
			gen.doubleClick(per_middlePaneNew_1Item);
			Thread.sleep(2000);
			logger.log(Status.PASS, "period selection done");
			System.out.println("period selection done");

		} catch (Exception e) {
			System.out.println("exception occured" + e);
			logger.log(Status.FAIL, " Exception ocuerd " + e);
		}
	}

	// Market Multilevel selections from same folder
	public void marketMultilevelSelectionSF() {
		try {
			gen.click(mktDim);
			gen.click(mktTab);
			gen.click(mktGrp);
			gen.click(mkt_mktFolder);
			gen.doubleClick(mkt_middlePane_1Item);
			gen.doubleClick(mkt_middlePane_2Item);
			gen.doubleClick(mkt_middlePane_3Item);
			Thread.sleep(2000);
			gen.click(mkt_Hierarchies);
			action.moveToElement(mktHier_Folder1).build().perform();
			gen.click(mktHier_Folder1);
			Thread.sleep(2000);
			gen.click(mktHier_Folder2);
			gen.doubleClick(mkt_middlePane_1Item);
			Thread.sleep(2000);
			gen.click(mkt_Characteristics);
			action.moveToElement(mktChar_Folder1).build().perform();
			gen.click(mktChar_Folder1);
			gen.doubleClick(mkt_middlePane_1Item);
			Thread.sleep(3000);
			// MarketShare
			gen.click(mktShareTab);
//			gen.click(mktShare_Grp);
//				gen.click(mktshare_mktFolder);
//				gen.doubleClick(mktshare_middlepaneNew_1Item);
//				gen.doubleClick(mktshare_middlepaneNew_2Item);
			action.moveToElement(mktShare_Hierarchies).build().perform();
			gen.click(mktShare_Hierarchies);
			action.moveToElement(mktShare_Hier_folder1).build().perform();
			gen.click(mktShare_Hier_folder1);
			gen.click(mktShare_Hier_folder2);
			Thread.sleep(2000);
			gen.doubleClick(mktshare_middlepaneNew_1Item);

			logger.log(Status.PASS, "Market selection done");
			System.out.println("Market selection done");

		} catch (Exception e) {
			System.out.println("exception occured" + e);
			logger.log(Status.FAIL, " Exception ocuerd " + e);
		}
	}

	// Product Multilevel selections from same folder
	public void productMultilevelSelectionSF() {
		try {
			gen.click(prodDim);
			gen.click(prodTab);
			gen.click(prodHier_Folder1);
			action.moveToElement(prodHier_Folder2).build().perform();
			gen.click(prodHier_Folder2);
			Thread.sleep(1000);
			gen.doubleClick(prod_middlePaneNew_1Item);
//			gen.doubleClick(prod_middlePaneNew_2Item);
//			gen.doubleClick(prod_middlePaneNew_3Item);
			Thread.sleep(2000);

			gen.click(Prod_Characteristics);
			gen.click(prodChar_Folder1);
			gen.doubleClick(prod_middlePaneNew_1Item);
			Thread.sleep(1000);
			gen.doubleClick(prod_middlePaneNew_1Item);

			// Product Share
			gen.click(prodShareTab);
			action.moveToElement(prodShare_hier_folder1).build().perform();
			gen.click(prodShare_hier_folder1);
			action.moveToElement(prodShare_hier_folder2).build().perform();
			gen.click(prodShare_hier_folder2);
			Thread.sleep(1000);
			gen.doubleClick(prodShare_middlepaneNew_1Item);
			logger.log(Status.PASS, "Product selection done");
			System.out.println("Product selection done");
			Thread.sleep(1000);

//				gen.click(prodShareTab);
//				action.moveToElement(ProdShar_Characteristics).build().perform();
//				gen.click(ProdShar_Characteristics);
//				action.moveToElement(prodShare_Char_folder1).build().perform();
//				gen.click(prodShare_Char_folder1);
//				Thread.sleep(1000);
//				gen.doubleClick(prodShare_middlepaneNew_2Item);
//				logger.log(Status.PASS, "Product selection done");
//				System.out.println("Product selection done");
//				Thread.sleep(1000);

		} catch (Exception e) {
			System.out.println("exception occured" + e);
			logger.log(Status.FAIL, " Exception ocuerd " + e);
		}
	}

	// Market Multilevel selections from Different folder
	public void marketMultilevelSelectionDF() {
		try {
			gen.click(mktDim);
			gen.click(mktTab);
			gen.click(mktGrp);
			gen.click(mkt_Hierarchies);
			gen.click(mkt_Characteristics);
			gen.click(mktGrp);
			gen.click(mkt_mktFolder);
			gen.doubleClick(mkt_middlePane_1Item);
			gen.doubleClick(mkt_middlePane_2Item);
			gen.doubleClick(mkt_middlePane_3Item);
			Thread.sleep(2000);
			gen.click(mkt_Hierarchies);
			action.moveToElement(mktHier_Folder1).build().perform();
			gen.click(mktHier_Folder1);
			Thread.sleep(2000);
			gen.click(mktHier_Folder2);
			gen.doubleClick(mkt_middlePane_1Item);
			gen.click(mktHier_Folder1);
			Thread.sleep(2000);
			gen.click(mktHier_Folder3);
			gen.click(mktHier_Folder5);
			gen.doubleClick(mkt_middlePane_1Item);
			gen.doubleClick(mkt_middlePane_2Item);
			gen.doubleClick(mkt_middlePane_3Item);
			Thread.sleep(2000);
			gen.click(mkt_Characteristics);
			action.moveToElement(mktChar_Folder1).build().perform();
			gen.click(mktChar_Folder1);
			gen.doubleClick(mkt_middlePane_1Item);
			gen.doubleClick(mkt_middlePane_2Item);
			gen.doubleClick(mkt_middlePane_3Item);
			Thread.sleep(2000);
			gen.click(mktChar_Folder1);
			Thread.sleep(3000);
			// MarketShare
			gen.click(mktShareTab);
			gen.click(mktShare_Hierarchies);
			gen.click(mktshare_Characteristics);
			gen.click(mktShare_Grp);
//					gen.click(mktshare_mktFolder);
//						gen.doubleClick(mktshare_middlepaneNew_1Item);
//						gen.doubleClick(mktshare_middlepaneNew_2Item);
			action.moveToElement(mktShare_Hierarchies).build().perform();
			gen.click(mktShare_Hierarchies);
			action.moveToElement(mktShare_Hier_folder1).build().perform();
			gen.click(mktShare_Hier_folder1);
			gen.click(mktShare_Hier_folder2);
			Thread.sleep(2000);
			gen.doubleClick(mktshare_middlepaneNew_1Item);

			logger.log(Status.PASS, "Market selection done");
			System.out.println("Market selection done");

		} catch (Exception e) {
			System.out.println("exception occured" + e);
			logger.log(Status.FAIL, " Exception ocuerd " + e);
		}
	}

	// Product Multilevel selections from Different folder
	public void productMultilevelSelectionDF() {
		try {
			gen.click(prodDim);
			gen.click(prodTab);

			gen.click(Prod_Characteristics);
			gen.click(Prod_Hierarchies);

			gen.click(prodHier_Folder1);
			action.moveToElement(prodHier_Folder3).build().perform();
			gen.click(prodHier_Folder3);
			Thread.sleep(1000);
			gen.doubleClick(prod_middlePaneNew_1Item);
			gen.doubleClick(prod_middlePaneNew_2Item);
//			gen.doubleClick(prod_middlePaneNew_3Item);
			Thread.sleep(2000);
			gen.click(prodHier_Folder1);
			Thread.sleep(1000);
			gen.click(prodHier_Folder3);
			action.moveToElement(prodHier_Folder5).build().perform();
			gen.click(prodHier_Folder5);
			Thread.sleep(1000);
			gen.doubleClick(prod_middlePaneNew_1Item);
			gen.doubleClick(prod_middlePaneNew_2Item);

			gen.click(Prod_Characteristics);
			gen.click(prodChar_Folder1);
			gen.doubleClick(prod_middlePaneNew_1Item);
			gen.doubleClick(prod_middlePaneNew_2Item);
			gen.doubleClick(prod_middlePaneNew_3Item);
			Thread.sleep(1000);
			gen.click(prodChar_Folder1);
			action.moveToElement(prodChar_Folder2).build().perform();
			gen.click(prodChar_Folder2);
			gen.doubleClick(prod_middlePaneNew_1Item);
			gen.doubleClick(prod_middlePaneNew_2Item);
			gen.doubleClick(prod_middlePaneNew_3Item);
			gen.click(prodChar_Folder2);
			action.moveToElement(prodChar_Folder3).build().perform();
			gen.click(prodChar_Folder3);
			gen.doubleClick(prod_middlePaneNew_1Item);
			Thread.sleep(3000);

			// Product Share
			gen.click(prodShareTab);

			gen.click(prodShare_Hierarchies);
			gen.click(ProdShar_Characteristics);
			gen.click(prodShare_Hierarchies);

			action.moveToElement(prodShare_hier_folder1).build().perform();
			gen.click(prodShare_hier_folder1);
			action.moveToElement(prodShare_hier_folder2).build().perform();
			gen.click(prodShare_hier_folder2);
			Thread.sleep(1000);
			gen.doubleClick(prodShare_middlepaneNew_1Item);
			logger.log(Status.PASS, "Product selection done");
			System.out.println("Product selection done");
			Thread.sleep(1000);

//						gen.click(prodShareTab);
//						action.moveToElement(ProdShar_Characteristics).build().perform();
//						gen.click(ProdShar_Characteristics);
//						action.moveToElement(prodShare_Char_folder1).build().perform();
//						gen.click(prodShare_Char_folder1);
//						Thread.sleep(1000);
//						gen.doubleClick(prodShare_middlepaneNew_2Item);
//						logger.log(Status.PASS, "Product selection done");
//						System.out.println("Product selection done");
//						Thread.sleep(1000);

		} catch (Exception e) {
			System.out.println("exception occured" + e);
			logger.log(Status.FAIL, " Exception ocuerd " + e);
		}
	}

	// Period Multilevel selections from Different folder
	public void periodSelectionDF() {
		try {
			gen.click(periodDim);
			gen.click(periodGrp);
			action.moveToElement(periodFolder1).build().perform();
//			gen.click(periodFolder1);
			action.moveToElement(periodFolder2).build().perform();
			gen.click(periodFolder2);
			Thread.sleep(2000);
			gen.doubleClick(per_middlePaneNew_1Item);
			gen.doubleClick(per_middlePaneNew_2Item);
			gen.doubleClick(per_middlePaneNew_3Item);
			Thread.sleep(2000);
			action.moveToElement(periodFolder3).build().perform();
			gen.click(periodFolder3);
			gen.doubleClick(per_middlePaneNew_4Item);
			gen.doubleClick(per_middlePaneNew_5Item);
			gen.doubleClick(per_middlePaneNew_6Item);

			logger.log(Status.PASS, "period selection done");
			System.out.println("period selection done");

		} catch (Exception e) {
			System.out.println("exception occured" + e);
			logger.log(Status.FAIL, " Exception ocuerd " + e);
		}
	}

	// Facts Multilevel selections from Different folder
	public void factSelectionDF() {
		try {
			gen.click(factDim);
			gen.click(factGrp);
			gen.click(factFolder1);
			action.moveToElement(factFolder2).build().perform();
			gen.click(factFolder2);
			Thread.sleep(5000);

			gen.doubleClick(fact_middlePaneNew_1Item);
			gen.doubleClick(fact_middlePaneNew_2Item);
			gen.doubleClick(fact_middlePaneNew_3Item);
			Thread.sleep(5000);
			gen.click(factFolder1);
			Thread.sleep(2000);
			action.moveToElement(factFolder2).build().perform();
			gen.click(factFolder2);

			action.moveToElement(factFolder3).build().perform();
			gen.click(factFolder3);
			gen.doubleClick(fact_middlePaneNew_1Item);
			gen.doubleClick(fact_middlePaneNew_2Item);
			gen.doubleClick(fact_middlePaneNew_3Item);

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

//    Market Selection Sum
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
			Thread.sleep(2000);
			gen.click(mkt_Hierarchies);
			action.moveToElement(mktHier_Folder1).build().perform();
			gen.click(mktHier_Folder1);
			Thread.sleep(2000);
			gen.click(mktHier_Folder2);
			gen.doubleClick(mkt_middlePane_1Item);
			Thread.sleep(2000);
			gen.click(mkt_Characteristics);
			action.moveToElement(mktChar_Folder1).build().perform();
			gen.click(mktChar_Folder1);
			gen.doubleClick(mkt_middlePane_1Item);
			Thread.sleep(3000);

			// MarketShare
			gen.click(mktShareTab);
//			gen.click(mktshare_mktFolder);
//			gen.doubleClick(mktshare_middlepaneNew_1Item);
//			gen.doubleClick(mktshare_middlepaneNew_2Item);
			action.moveToElement(mktShare_Hierarchies).build().perform();
			gen.click(mktShare_Hierarchies);
			action.moveToElement(mktShare_Hier_folder1).build().perform();
			gen.click(mktShare_Hier_folder1);
			gen.click(mktShare_Hier_folder2);
			Thread.sleep(2000);
			action.moveToElement(mktShare_Hier_Sum).build().perform();
			action.click(mktShare_Hier_Sum).build().perform();
			Thread.sleep(2000);
			gen.doubleClick(mktshare_middlepaneNew_1Item);

			logger.log(Status.PASS, "Market Sum selection done");
			System.out.println("Market Sum selection done");

		} catch (Exception e) {
			System.out.println("exception occured" + e);
			logger.log(Status.FAIL, " Exception ocuerd " + e);
		}
	}

//  Product Selection Sum
	public void productSelection_Sum() {
		try {
			gen.click(prodDim);
			gen.click(prodTab);
			gen.click(prodHier_Folder1);
			action.moveToElement(prodHier_Folder2).build().perform();
			gen.click(prodHier_Folder2);
			Thread.sleep(1000);
			action.moveToElement(prod_hier_subFolder_Sum).build().perform();
			action.click(prod_hier_subFolder_Sum).build().perform();
			gen.doubleClick(prod_middlePaneNew_1Item);
//				gen.doubleClick(prod_middlePaneNew_2Item);
//				gen.doubleClick(prod_middlePaneNew_3Item);
			Thread.sleep(2000);

			gen.click(Prod_Characteristics);
			gen.click(prodChar_Folder1);
			gen.doubleClick(prod_middlePaneNew_1Item);
			Thread.sleep(1000);
			gen.doubleClick(prod_middlePaneNew_2Item);

			// Product Share
			gen.click(prodShareTab);
			action.moveToElement(prodShare_hier_folder1).build().perform();
			gen.click(prodShare_hier_folder1);
			action.moveToElement(prodShare_hier_folder2).build().perform();
			gen.click(prodShare_hier_folder2);
			Thread.sleep(1000);
			action.moveToElement(prodShare_hier_subFolder_Sum).build().perform();
			action.click(prodShare_hier_subFolder_Sum).build().perform();
			Thread.sleep(1000);
			gen.doubleClick(prodShare_middlepaneNew_1Item);
			logger.log(Status.PASS, "Product selection done");
			System.out.println("Product selection done");
			Thread.sleep(1000);

		} catch (Exception e) {
			System.out.println("exception occured" + e);
			logger.log(Status.FAIL, " Exception ocuerd " + e);
		}
	}

	// Period Selection Sum
	public void periodSelection_Sum() {
		try {
			gen.click(periodDim);
			gen.click(periodGrp);
			action.moveToElement(periodFolder1).build().perform();
//			gen.click(periodFolder1);
			action.moveToElement(periodFolder2).build().perform();
			gen.click(periodFolder2);
			Thread.sleep(2000);
			action.moveToElement(period_Sum).build().perform();
			action.click(period_Sum).build().perform();

			gen.doubleClick(per_middlePaneNew_3Item);
			gen.doubleClick(per_middlePaneNew_1Item);
			logger.log(Status.PASS, "period selection done");
			System.out.println("period selection done");

		} catch (Exception e) {
			System.out.println("exception occured" + e);
			logger.log(Status.FAIL, " Exception ocuerd " + e);
		}
	}

//  Market Selection SumOr
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
			Thread.sleep(2000);

			gen.click(mkt_mktFolder_SumOr);
			Thread.sleep(2000);
			gen.doubleClick(mkt_middlePane_2Item);
			Thread.sleep(5000);
			gen.doubleClick(mkt_middlePane_3Item);

			// MarketShare
			gen.click(mktShareTab);
			action.moveToElement(mktShare_Hierarchies).build().perform();
			gen.click(mktShare_Hierarchies);
			action.moveToElement(mktShare_Hier_folder1).build().perform();
			gen.click(mktShare_Hier_folder1);
			gen.click(mktShare_Hier_folder2);
			Thread.sleep(2000);
			action.moveToElement(mktShare_Hier_Sum).build().perform();
			action.click(mktShare_Hier_Sum).build().perform();
			Thread.sleep(2000);
			gen.doubleClick(mktshare_middlepaneNew_1Item);

			logger.log(Status.PASS, "Market SumOr selection done");
			System.out.println("Market SumOr selection done");

		} catch (Exception e) {
			System.out.println("exception occured" + e);
			logger.log(Status.FAIL, " Exception ocuerd " + e);
		}
	}

	// Product Selection SumOr
	public void productSelection_SumOr() {
		try {
			gen.click(prodDim);
			gen.click(prodTab);
			gen.click(prodHier_Folder1);
			action.moveToElement(prodHier_Folder2).build().perform();
			gen.click(prodHier_Folder2);
			Thread.sleep(1000);
			action.moveToElement(prod_hier_subFolder_Sum).build().perform();
			action.click(prod_hier_subFolder_Sum).build().perform();
			gen.doubleClick(prod_middlePaneNew_1Item);
			gen.click(dataSelectionSummary);
			gen.click(prod_SumOr);
			gen.doubleClick(prod_middlePaneNew_1Item);
//					gen.doubleClick(prod_middlePaneNew_2Item);
//					gen.doubleClick(prod_middlePaneNew_3Item);
			Thread.sleep(2000);
			gen.click(prodShareTab);
			action.moveToElement(prodShare_hier_folder).build().perform();
			gen.click(prodShare_hier_folder);
			action.moveToElement(prodShare_hier_subFolder).build().perform();
			gen.click(prodShare_hier_subFolder);
			Thread.sleep(1000);
			gen.doubleClick(prodShare_middlepaneNew_1Item);
			logger.log(Status.PASS, "Product selection done");
			System.out.println("Product selection done");

		} catch (Exception e) {
			System.out.println("exception occured" + e);
			logger.log(Status.FAIL, " Exception ocuerd " + e);
		}
	}

	// Period Selection SumOr
	public void periodSelection_SumOr() {
		try {
			gen.click(periodDim);
			gen.click(periodGrp);
			action.moveToElement(periodFolder1).build().perform();
//			gen.click(periodFolder1);
			action.moveToElement(periodFolder2).build().perform();
			gen.click(periodFolder2);
			Thread.sleep(2000);
			action.moveToElement(period_Sum).build().perform();
			action.click(period_Sum).build().perform();
			Thread.sleep(2000);
			gen.doubleClick(per_middlePaneNew_3Item);
			gen.doubleClick(per_middlePaneNew_1Item);
			gen.click(dataSelectionSummary);
			gen.click(period_SumOr);
			gen.doubleClick(per_middlePaneNew_5Item);

			logger.log(Status.PASS, "period selection done");
			System.out.println("period selection done");

		} catch (Exception e) {
			System.out.println("exception occured" + e);
			logger.log(Status.FAIL, " Exception ocuerd " + e);
		}
	}

	// Market Selection Group By
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
			gen.doubleClick(mkt_middlePane_2Item);
			gen.doubleClick(mkt_middlePane_3Item);

			// MarketShare
			gen.click(mktShareTab);
			action.moveToElement(mktShare_Hierarchies).build().perform();
			gen.click(mktShare_Hierarchies);
			action.moveToElement(mktShare_Hier_folder1).build().perform();
			gen.click(mktShare_Hier_folder1);
			gen.click(mktShare_Hier_folder2);
			Thread.sleep(2000);
			action.moveToElement(mktShare_Hier_Sum).build().perform();
			action.click(mktShare_Hier_Sum).build().perform();
			Thread.sleep(2000);
			gen.doubleClick(mktshare_middlepaneNew_1Item);

			logger.log(Status.PASS, "Market selection done");
			System.out.println("Market selection done");

		} catch (Exception e) {
			System.out.println("exception occured" + e);
			logger.log(Status.FAIL, " Exception ocuerd " + e);
		}
	}

	// Product Selection Group By
	public void productSelection_GrpBy() {
		try {
			gen.click(prodDim);
			gen.click(prodTab);
			gen.click(prodHier_Folder1);
			action.moveToElement(prodHier_Folder2).build().perform();
			gen.click(prodHier_Folder2);
			Thread.sleep(1000);
			gen.doubleClick(prod_middlePaneNew_1Item);
			Thread.sleep(2000);

			gen.click(Prod_Characteristics);
			gen.click(prodChar_Folder1);
			action.moveToElement(prodChar_GrpBy).build().perform();
			action.click(prodChar_GrpBy).build().perform();
			gen.doubleClick(prod_middlePaneNew_1Item);
			gen.doubleClick(prod_middlePaneNew_2Item);
			gen.doubleClick(prod_middlePaneNew_3Item);
			Thread.sleep(1000);

			// Product Share
			gen.click(prodShareTab);
			action.moveToElement(prodShare_hier_folder1).build().perform();
			gen.click(prodShare_hier_folder1);
			action.moveToElement(prodShare_hier_folder2).build().perform();
			gen.click(prodShare_hier_folder2);
			Thread.sleep(1000);
			gen.doubleClick(prodShare_middlepaneNew_1Item);
			logger.log(Status.PASS, "Product selection done");
			System.out.println("Product selection done");
			Thread.sleep(1000);

		} catch (Exception e) {
			System.out.println("exception occured" + e);
			logger.log(Status.FAIL, " Exception ocuerd " + e);
		}
	}

	// Market Multiple Characteristics selection using Group By
	public void marketMultilevelCharSelection_GrpBy() {
		try {
			gen.click(mktDim);
			gen.click(mktTab);
			gen.click(mktGrp);
			gen.click(mkt_Hierarchies);
			gen.click(mkt_Characteristics);
			action.moveToElement(mktChar_Folder1).build().perform();
			gen.click(mktChar_Folder1);
			action.moveToElement(mktChar_GrpBy).build().perform();
			Thread.sleep(3000);
			gen.click(mktChar_GrpBy);
			Thread.sleep(3000);
			gen.doubleClick(mkt_middlePane_1Item);
			gen.doubleClick(mkt_middlePane_2Item);
			gen.doubleClick(mkt_middlePane_3Item);
			Thread.sleep(2000);
			gen.click(mktChar_Folder1);
			Thread.sleep(3000);
			// MarketShare
			gen.click(mktShareTab);
			gen.click(mktShare_Grp);
			gen.click(mktShare_Hierarchies);
			action.moveToElement(mktshare_Characteristics).build().perform();
			gen.click(mktshare_Characteristics);
			action.moveToElement(mktShare_Char_folder1).build().perform();
			gen.click(mktShare_Char_folder1);
			Thread.sleep(2000);
			gen.doubleClick(mktshare_middlepaneNew_1Item);

			logger.log(Status.PASS, "Market selection done");
			System.out.println("Market selection done");

		} catch (Exception e) {
			System.out.println("exception occured" + e);
			logger.log(Status.FAIL, " Exception ocuerd " + e);
		}
	}

	// Product Single Characteristics selection
	public void productSingleCharselection() {
		try {
			gen.click(prodDim);
			gen.click(prodTab);
			gen.click(Prod_Hierarchies);
			gen.click(Prod_Characteristics);
			action.moveToElement(prodChar_Folder1).build().perform();
			gen.click(prodChar_Folder1);
			Thread.sleep(2000);
			gen.doubleClick(prod_middlePaneNew_1Item);
			Thread.sleep(2000);
			// Product Share
			gen.click(prodShareTab);
			gen.click(prodShare_Hierarchies);
			action.moveToElement(prodShare_hier_folder1).build().perform();
			gen.click(prodShare_hier_folder1);
			action.moveToElement(prodShare_hier_folder2).build().perform();
			gen.click(prodShare_hier_folder2);
			Thread.sleep(1000);
			gen.doubleClick(prodShare_middlepaneNew_1Item);
			logger.log(Status.PASS, "Product selection done");
			System.out.println("Product selection done");
			Thread.sleep(1000);

		} catch (Exception e) {
			System.out.println("exception occured" + e);
			logger.log(Status.FAIL, " Exception ocuerd " + e);
		}
	}

	// Market Multiple Characteristics selection
	public void marketMultilevelCharSelection() {
		try {
			gen.click(mktDim);
			gen.click(mktTab);
			gen.click(mktGrp);
			gen.click(mkt_Hierarchies);
			gen.click(mkt_Characteristics);
			action.moveToElement(mktChar_Folder1).build().perform();
			gen.click(mktChar_Folder1);
			Thread.sleep(3000);
			gen.doubleClick(mkt_middlePane_1Item);
			gen.doubleClick(mkt_middlePane_2Item);
			gen.doubleClick(mkt_middlePane_3Item);
			Thread.sleep(2000);
			gen.click(mktChar_Folder1);
			action.moveToElement(mktChar_Folder2).build().perform();
			gen.click(mktChar_Folder2);
			gen.doubleClick(mkt_middlePane_1Item);
			Thread.sleep(3000);
			// MarketShare
			gen.click(mktShareTab);
			gen.click(mktShare_Grp);
			gen.click(mktShare_Hierarchies);
			action.moveToElement(mktshare_Characteristics).build().perform();
			gen.click(mktshare_Characteristics);
			action.moveToElement(mktShare_Char_folder1).build().perform();
			gen.click(mktShare_Char_folder1);
			Thread.sleep(2000);
			gen.doubleClick(mktshare_middlepaneNew_1Item);

			logger.log(Status.PASS, "Market selection done");
			System.out.println("Market selection done");

		} catch (Exception e) {
			System.out.println("exception occured" + e);
			logger.log(Status.FAIL, " Exception ocuerd " + e);
		}
	}

	// Product Multiple Characteristics selection
	public void productMultilevelCharselection() {
		try {
			gen.click(prodDim);
			gen.click(prodTab);
			gen.click(Prod_Hierarchies);
			gen.click(Prod_Characteristics);
			action.moveToElement(prodChar_Folder1).build().perform();
			gen.click(prodChar_Folder1);
			Thread.sleep(2000);
			gen.doubleClick(prod_middlePaneNew_1Item);
			gen.doubleClick(prod_middlePaneNew_2Item);
			gen.doubleClick(prod_middlePaneNew_3Item);
			Thread.sleep(2000);
			action.moveToElement(prodChar_Folder2).build().perform();
			gen.click(prodChar_Folder2);
			gen.doubleClick(prod_middlePaneNew_1Item);
			gen.doubleClick(prod_middlePaneNew_2Item);
			gen.doubleClick(prod_middlePaneNew_3Item);
			Thread.sleep(2000);
			action.moveToElement(prodChar_Folder3).build().perform();
			gen.click(prodChar_Folder3);
			gen.doubleClick(prod_middlePaneNew_1Item);
			gen.doubleClick(prod_middlePaneNew_2Item);
			gen.doubleClick(prod_middlePaneNew_3Item);
			Thread.sleep(2000);
			// Product Share
			gen.click(prodShareTab);
			gen.click(prodShare_Hierarchies);
			action.moveToElement(prodShare_hier_folder1).build().perform();
			gen.click(prodShare_hier_folder1);
			action.moveToElement(prodShare_hier_folder2).build().perform();
			gen.click(prodShare_hier_folder2);
			Thread.sleep(1000);
			gen.doubleClick(prodShare_middlepaneNew_1Item);
			logger.log(Status.PASS, "Product selection done");
			System.out.println("Product selection done");
			Thread.sleep(1000);

		} catch (Exception e) {
			System.out.println("exception occured" + e);
			logger.log(Status.FAIL, " Exception ocuerd " + e);
		}
	}

	// Market Multiple Characteristics All selection
	public void marketMultilevelCharAllSelection() {
		try {
			gen.click(mktDim);
			gen.click(mktTab);
			gen.click(mktGrp);
			gen.click(mkt_Hierarchies);
			gen.click(mkt_Characteristics);
			action.moveToElement(mktChar_Folder1).build().perform();
			gen.click(mktChar_Folder1);
			Thread.sleep(3000);
			action.moveToElement(mkt_mktFolder_All).build().perform();
			gen.click(mkt_mktFolder_All);
//						action.moveToElement(mkt_Add).build().perform();
//						gen.click(mkt_Add);
			gen.doubleClick(mkt_middlePane_1Item);
			Thread.sleep(2000);
			gen.click(mktChar_Folder1);
			action.moveToElement(mktChar_Folder2).build().perform();
			gen.click(mktChar_Folder2);
//						action.moveToElement(mkt_Add).build().perform();
//						gen.click(mkt_Add);
			gen.doubleClick(mkt_middlePane_1Item);
			Thread.sleep(3000);
			// MarketShare
			gen.click(mktShareTab);
			gen.click(mktShare_Grp);
			gen.click(mktShare_Hierarchies);
			action.moveToElement(mktshare_Characteristics).build().perform();
			gen.click(mktshare_Characteristics);
			action.moveToElement(mktShare_Char_folder1).build().perform();
			gen.click(mktShare_Char_folder1);
			Thread.sleep(2000);
			gen.doubleClick(mktshare_middlepaneNew_1Item);

			logger.log(Status.PASS, "Market selection done");
			System.out.println("Market selection done");

		} catch (Exception e) {
			System.out.println("exception occured" + e);
			logger.log(Status.FAIL, " Exception ocuerd " + e);
		}
	}

	// Product Multiple Characteristics All selection
	public void productMultilevelCharAllselection() {
		try {
			gen.click(prodDim);
			gen.click(prodTab);
			gen.click(Prod_Hierarchies);
			gen.click(Prod_Characteristics);
			action.moveToElement(prodChar_Folder1).build().perform();
			gen.click(prodChar_Folder1);
			Thread.sleep(2000);
			action.moveToElement(prod_Char_subFolder_All).build().perform();
			gen.click(prod_Char_subFolder_All);
			gen.doubleClick(prod_middlePaneNew_1Item);
			Thread.sleep(2000);
			// Product Share
			gen.click(prodShareTab);
			gen.click(prodShare_Hierarchies);
			action.moveToElement(prodShare_hier_folder1).build().perform();
			gen.click(prodShare_hier_folder1);
			action.moveToElement(prodShare_hier_folder2).build().perform();
			gen.click(prodShare_hier_folder2);
			Thread.sleep(1000);
			gen.doubleClick(prodShare_middlepaneNew_1Item);
			logger.log(Status.PASS, "Product selection done");
			System.out.println("Product selection done");
			Thread.sleep(1000);

		} catch (Exception e) {
			System.out.println("exception occured" + e);
			logger.log(Status.FAIL, " Exception ocuerd " + e);
		}
	}

	// Product making UPC level selections from data selector
	public void productUPCLevelSelections() {
		try {
			gen.click(prodDim);
			gen.click(prodTab);
			gen.click(Prod_Hierarchies);
			gen.click(Prod_Characteristics);
			gen.click(Prod_Hierarchies);
			action.moveToElement(prodHier_Folder1).build().perform();
			gen.click(prodHier_Folder1);
			action.moveToElement(prodHier_Folder2).build().perform();
			gen.click(prodHier_Folder2);
			Thread.sleep(2000);
			gen.doubleClick(prod_middlePaneNew_1Item);
			gen.doubleClick(prod_middlePaneNew_2Item);
			gen.doubleClick(prod_middlePaneNew_3Item);
			Thread.sleep(2000);
			gen.click(prodHier_Folder1);
			action.moveToElement(prodHier_Folder2).build().perform();
			gen.click(prodHier_Folder2);
			action.moveToElement(prodHier_Folder3).build().perform();
			gen.click(prodHier_Folder3);
			gen.doubleClick(prod_middlePaneNew_1Item);
			gen.doubleClick(prod_middlePaneNew_2Item);
			gen.doubleClick(prod_middlePaneNew_3Item);
			Thread.sleep(2000);
			gen.click(prodHier_Folder2);
			action.moveToElement(prodHier_Folder3).build().perform();
			gen.click(prodHier_Folder3);
			action.moveToElement(prodHier_Folder5).build().perform();
			gen.click(prodHier_Folder5);
			gen.doubleClick(prod_middlePaneNew_1Item);
			gen.doubleClick(prod_middlePaneNew_2Item);
			gen.doubleClick(prod_middlePaneNew_3Item);
			Thread.sleep(2000);
			// Product Share
			gen.click(prodShareTab);
			gen.click(prodShare_Hierarchies);
			action.moveToElement(prodShare_hier_folder1).build().perform();
			gen.click(prodShare_hier_folder1);
			action.moveToElement(prodShare_hier_folder2).build().perform();
			gen.click(prodShare_hier_folder2);
			Thread.sleep(1000);
			gen.doubleClick(prodShare_middlepaneNew_1Item);
			logger.log(Status.PASS, "Product selection done");
			System.out.println("Product selection done");
			Thread.sleep(1000);

		} catch (Exception e) {
			System.out.println("exception occured" + e);
			logger.log(Status.FAIL, " Exception ocuerd " + e);
		}
	}

	// Multiple SUM(Characteristics) Selection and Multiple Characteristics
	// Selection for Product
	public void productMultipleSumCharselection() {
		try {
			gen.click(prodDim);
			gen.click(prodTab);
			gen.click(Prod_Hierarchies);
			gen.click(Prod_Characteristics);

			action.moveToElement(prodChar_Folder1).build().perform();
			gen.click(prodChar_Folder1);
			Thread.sleep(2000);
			action.moveToElement(prod_char_subFolder_Sum).build().perform();
			gen.click(prod_char_subFolder_Sum);
			Thread.sleep(3000);
			gen.click(prod_middlePaneNew_1Item);
			gen.click(prod_middlePaneNew_2Item);
			gen.doubleClick(prod_middlePaneNew_3Item);
			action.moveToElement(prod_char_subFolder_Sum).build().perform();
			gen.click(prod_char_subFolder_Sum);
			Thread.sleep(2000);
			action.moveToElement(prodChar_Folder2).build().perform();
			gen.click(prodChar_Folder2);
			Thread.sleep(2000);
			gen.doubleClick(prod_middlePaneNew_1Item);
			gen.doubleClick(prod_middlePaneNew_2Item);
			gen.doubleClick(prod_middlePaneNew_3Item);
			Thread.sleep(2000);
			// Product Share
			gen.click(prodShareTab);
			gen.click(prodShare_Hierarchies);
			action.moveToElement(prodShare_hier_folder1).build().perform();
			gen.click(prodShare_hier_folder1);
			action.moveToElement(prodShare_hier_folder2).build().perform();
			gen.click(prodShare_hier_folder2);
			Thread.sleep(1000);
			gen.doubleClick(prodShare_middlepaneNew_1Item);
			logger.log(Status.PASS, "Product selection done");
			System.out.println("Product selection done");
			Thread.sleep(1000);

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
			gen.doubleClick(mkt_middlePane_1Item);
			Thread.sleep(2000);
			// Market Share
			gen.click(mktShareTab);
			gen.click(mktshare_mktFolder);
			gen.click(mktTab);
			gen.click(mktShareTab);
			gen.doubleClick(mktshare_middlepane_1Item);

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
			gen.click(mkt_mktFolder_AllExpect);
			gen.doubleClick(mkt_middlePane_1Item);

			Thread.sleep(2000);
			// Market Share
			gen.click(mktShareTab);
			gen.click(mktshare_mktFolder);
			gen.click(mktTab);
			gen.click(mktShareTab);
			gen.doubleClick(mktshare_middlepane_1Item);

			logger.log(Status.PASS, "Market All Except selection done");
			System.out.println("Market All Except selection done");

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
			gen.doubleClick(prod_middlePane_1Item);
			Thread.sleep(2000);
			gen.click(prodShareTab);
			action.moveToElement(prodShare_hier_folder).build().perform();
			gen.click(prodShare_hier_folder);
			action.moveToElement(prodShare_hier_subFolder).build().perform();
			gen.click(prodShare_hier_subFolder);
			Thread.sleep(1000);
			gen.doubleClick(prodShare_middlepaneNew_1Item);

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

			gen.click(prod_hier_subFolder_AllExpect);
			gen.click(prodShareTab);
			gen.click(prodTab);
			gen.doubleClick(prod_middlePane_1Item);

			Thread.sleep(2000);
			gen.click(prodShareTab);
			action.moveToElement(prodShare_hier_folder).build().perform();
			gen.click(prodShare_hier_folder);
			action.moveToElement(prodShare_hier_subFolder).build().perform();
			gen.click(prodShare_hier_subFolder);
			Thread.sleep(1000);
			gen.doubleClick(prodShare_middlepaneNew_1Item);

			logger.log(Status.PASS, "Product All Except selection done");
			System.out.println("Product All Except selection done");

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
			gen.doubleClick(per_middlePane_1Item);

			logger.log(Status.PASS, "Period All selection done");
			System.out.println("Period All selection done");

		} catch (Exception e) {
			System.out.println("exception occured" + e);
			logger.log(Status.FAIL, " Exception ocuerd " + e);
		}
	}

	// Product Characteristics
	public void product_Characteristics() {
		try {
			gen.click(prodDim);
			gen.click(prodTab);
			gen.click(prodHier_Folder);
			gen.click(Prod_Characteristics);
			gen.click(prodChar_Folder1);
			Thread.sleep(2000);
			gen.doubleClick(prod_middlePaneNew_1Item);
			gen.doubleClick(prod_middlePaneNew_2Item);
//				gen.doubleClick(prod_middlePaneNew_3Item);
			gen.click(prodChar_Folder1);
			Thread.sleep(2000);
			gen.click(prodChar_Folder2);
			Thread.sleep(1000);
			gen.doubleClick(prod_middlePaneNew_1Item);
			logger.log(Status.PASS, "Product Characteristics selection done");
			System.out.println("Product Characteristics selection done");

			Thread.sleep(2000);

			gen.click(prodShareTab);
			action.moveToElement(prodShare_hier_folder).build().perform();
			gen.click(prodShare_hier_folder);
			action.moveToElement(prodShare_hier_subFolder).build().perform();
			gen.click(prodShare_hier_subFolder);
			Thread.sleep(1000);
			gen.doubleClick(prodShare_middlepaneNew_1Item);
			logger.log(Status.PASS, "Product selection done");
			System.out.println("Product selection done");

		} catch (Exception e) {
			System.out.println("exception occured" + e);
			logger.log(Status.FAIL, " Exception ocuerd " + e);
		}
	}

	public void marketCharacteristicsSelection() {
		try {
			gen.click(mktDim);
			gen.click(mktTab);
			gen.click(mkt_Characteristics);
			gen.click(mktChar_Folder1);
			Thread.sleep(2000);

			gen.click(mktShareTab);
			gen.click(mktTab);

			// gen.click(mkt_mktFolder_All);
			gen.doubleClick(mkt_middlePane_1Item);
//				gen.doubleClick(mkt_middlePane_2Item);
//				gen.doubleClick(mkt_middlePane_3Item);

			Thread.sleep(2000);
			gen.click(mktShareTab);
			gen.click(mktshare_mktFolder);
			gen.click(mktTab);
			gen.click(mktShareTab);
			gen.doubleClick(mktshare_middlepane_1Item);
			logger.log(Status.PASS, "Market selection done");
			System.out.println("Market selection done");

			logger.log(Status.PASS, "Market selection done");
			System.out.println("Market selection done");

		} catch (Exception e) {
			System.out.println("exception occured" + e);
			logger.log(Status.FAIL, " Exception ocuerd " + e);
		}
	}

	public void multipleMkt_characteristics_selection()

	{
		try {
			gen.click(mktDim);
			gen.click(mktTab);
			gen.click(mkt_Characteristics);
			gen.click(mktChar_Folder);
			gen.doubleClick(mkt_middlePane_1Item);
			gen.doubleClick(mkt_middlePane_2Item);
			// gen.doubleClick(mkt_middlePane_3Item);
			Thread.sleep(2000);
			gen.click(mktChar_Folder2);
			gen.doubleClick(mkt_middlePane_1Item);
//		            gen.doubleClick(mkt_middlePane_2Item);
//		            gen.doubleClick(mkt_middlePane_3Item);
			Thread.sleep(2000);
			gen.click(mktChar_Folder3);
//		           gen.doubleClick(mkt_middlePane_1Item); 
			Thread.sleep(2000);
			gen.click(mktShareTab);
			gen.click(mktshare_mktFolder);
			gen.click(mktTab);
			gen.click(mktShareTab);
			gen.doubleClick(mktshare_middlepane_1Item);
			logger.log(Status.PASS, "Market selection done");
			System.out.println("Market selection done");

			logger.log(Status.PASS, "Market selection done");
			System.out.println("Market selection done");

			logger.log(Status.PASS, "Multiple Market characteristics selection done");
			System.out.println("Multiple Market characteristics selection done");
		} catch (Exception e) {
			System.out.println("exception occured" + e);
			logger.log(Status.FAIL, " Exception ocuerd " + e);

		}
	}

	public void multipleProd_HierAndChar_selection()

	{
		try {
			gen.click(prodDim);
			gen.click(prodTab);
			gen.click(Prod_Hierarchies);
			Thread.sleep(2000);
			action.moveToElement(prodHier_Folder).build().perform();
			gen.click(prodHier_Folder);
			action.moveToElement(prodHier_subFolder).build().perform();
			gen.click(prodHier_subFolder);
			gen.doubleClick(prod_middlePaneNew_1Item);
			action.moveToElement(prodHier_subFolder2).build().perform();
			gen.click(prodHier_subFolder2);
			gen.doubleClick(prod_middlePaneNew_1Item);
			gen.doubleClick(prod_middlePaneNew_2Item);
			gen.doubleClick(prod_middlePaneNew_3Item);
			Thread.sleep(2000);
			logger.log(Status.PASS, "Multiple product Hierarchies selection done");
			System.out.println("Multiple product Hierarchies characteristics selection done");

//		         gen.click(prodDim);
//		         gen.click(prodTab);
			gen.click(Prod_Characteristics);
			Thread.sleep(2000);
			action.moveToElement(prodChar_Folder1).build().perform();
			gen.click(prodChar_Folder1);
			gen.doubleClick(prod_middlePaneNew_1Item);
			gen.doubleClick(prod_middlePaneNew_2Item);
			// gen.doubleClick(prod_middlePaneNew_1Item);
			Thread.sleep(2000);
			action.moveToElement(prodChar_Folder2).build().perform();
			gen.click(prodChar_Folder2);
			gen.doubleClick(prod_middlePaneNew_1Item);
			Thread.sleep(2000);
			action.moveToElement(prodChar_Folder3).build().perform();
			gen.click(prodChar_Folder3);
			gen.doubleClick(prod_middlePaneNew_1Item);
			logger.log(Status.PASS, "Multiple product characteristics selection done");
			System.out.println("Multiple product characteristics selection done");

			Thread.sleep(2000);

			gen.click(prodShareTab);
			action.moveToElement(prodShare_hier_folder).build().perform();
			gen.click(prodShare_hier_folder);
			action.moveToElement(prodShare_hier_subFolder).build().perform();
			gen.click(prodShare_hier_subFolder);
			Thread.sleep(1000);
			gen.doubleClick(prodShare_middlepaneNew_1Item);
			logger.log(Status.PASS, "Product Share selection done");
			System.out.println("Product Share selection done");

		} catch (Exception e) {
			System.out.println("exception occured" + e);
			logger.log(Status.FAIL, " Exception ocuerd " + e);

		}

	}

	// Characteristics Selection using add button
	public void marketChar_All() {
		try {
			gen.click(mktDim);
			gen.click(mktTab);
			gen.click(mkt_Characteristics);
			gen.click(mktChar_Folder);
			Thread.sleep(2000);
			gen.click(mktShareTab);
			gen.click(mktTab);
			gen.click(mkt_mktFolder_All);
			Thread.sleep(5000);
			action.moveToElement(addBtn_mktChar_All).build().perform();
			action.click(addBtn_mktChar_All).build().perform();
			logger.log(Status.PASS, "Market selection done");
			System.out.println("Market selection done");
		} catch (Exception e) {
			System.out.println("exception occured" + e);
			logger.log(Status.FAIL, " Exception ocuerd " + e);
		}
	}

	public void marketShare() {
		try {
			gen.click(mktDim);
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

	public void productChar_All() {
		try {
			gen.click(prodDim);
			gen.click(prodTab);
			gen.click(Prod_Characteristics);
			gen.click(prodChar_Folder1);
			Thread.sleep(2000);
			gen.click(prodShareTab);
			gen.click(prodTab);
			gen.click(Prod_Characteristics_All);
			Thread.sleep(3000);
			action.moveToElement(addBtn_prodChar_All).build().perform();
			action.click(addBtn_prodChar_All).build().perform();
			logger.log(Status.PASS, "Market selection done");
			System.out.println("Market selection done");
		} catch (Exception e) {
			System.out.println("exception occured" + e);
			logger.log(Status.FAIL, " Exception ocuerd " + e);
		}
	}

	public void productShare() {
		try {
			gen.click(prodDim);

			gen.click(prodShareTab);
			action.moveToElement(prodShare_hier_folder).build().perform();
			gen.click(prodShare_hier_folder);
			action.moveToElement(prodShare_hier_subFolder).build().perform();
			gen.click(prodShare_hier_subFolder);
			Thread.sleep(1000);
			gen.doubleClick(prodShare_middlepaneNew_1Item);
			logger.log(Status.PASS, "Product selection done");
			System.out.println("Product selection done");

		} catch (Exception e) {
			System.out.println("exception occured" + e);
			logger.log(Status.FAIL, " Exception ocuerd " + e);
		}
	}

	public void Product_char_categorySelection() {
		try {
			gen.click(prodDim);
			gen.click(prodTab);
			gen.click(Prod_Characteristics);
			Thread.sleep(2000);
			action.moveToElement(productcharcategoryFolder).build().perform();
			gen.click(productcharcategoryFolder);
			gen.doubleClick(productcharsub1item1);
			gen.doubleClick(productcharsub1item2);
			logger.log(Status.PASS, "Multiple product characteristics category folder selection done");
			System.out.println("Multiple product characteristics category folder selection done");
		} catch (Exception e) {
			System.out.println("exception occured" + e);
			logger.log(Status.FAIL, " Exception ocuerd " + e);

		}

	}

}
