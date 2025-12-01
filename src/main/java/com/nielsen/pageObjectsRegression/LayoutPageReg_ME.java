package com.nielsen.pageObjectsRegression;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.aventstack.extentreports.Status;
import com.nielsen.commonMethods.BaseMethod;

public class LayoutPageReg_ME extends BaseMethod {

	public Actions action = new Actions(driver);

	// LEFT PANEL
	@FindBy(xpath = "(//span[text()='Charts & Objects'])[2]")
	public WebElement chartsAndObjects;

	@FindBy(xpath = "//span[text()='Text']")
	public WebElement text;

	@FindBy(xpath = "//span[text()='Table']")
	public WebElement table;

	@FindBy(xpath = "//span[text()='Charts']")
	public WebElement charts;

	@FindBy(xpath = "//span[text()='Vertical Bar']")
	public WebElement verticalBar;

	@FindBy(xpath = "//span[text()='Waterfall Chart']")
	public WebElement waterfallChart;

	@FindBy(xpath = "//span[text()='Data']")
	public WebElement data;

	@FindBy(xpath = "//span[text()='Markets']")
	public WebElement markets;

	@FindBy(xpath = "//span[text()='Products']")
	public WebElement products;

	@FindBy(xpath = "//span[text()='Periods']")
	public WebElement periods;

	@FindBy(xpath = "//span[text()='Facts']")
	public WebElement facts;

	@FindBy(xpath = "//span[text()='Groups (folders)']")
	public WebElement factsGroupFolder;

	@FindBy(xpath = "//span[text()='Fact Groups']")
	public WebElement factsGroup;

	@FindBy(xpath = "//div[@class='x-grid-cell-inner']//ancestor::span[text()='Fact Groups']//following::tr[1]/td[2]//span")
	public WebElement factsFolder;

	@FindBy(xpath = "//div[@class='x-grid-cell-inner']//ancestor::span[text()='Fact Groups']//following::tr[3]/td[2]//span")
	public WebElement factsSubFolder;

	@FindBy(xpath = "//div[@class='x-grid-cell-inner']//ancestor::span[text()='Fact Groups']//following::tr[4]/td[2]//span")
	public WebElement factsVal1;

	@FindBy(xpath = "//div[@class='x-grid-cell-inner']//ancestor::span[text()='Fact Groups']//following::tr[5]/td[2]//span")
	public WebElement factsVal2;

	@FindBy(xpath = "//div[@class='x-grid-cell-inner']//ancestor::span[text()='Fact Groups']//following::tr[6]/td[2]//span")
	public WebElement factsVal3;

	@FindBy(xpath = "//span[text()='Groups (folders)']")
	public WebElement marketsGroupFolder;

	@FindBy(xpath = "//span[text()='Market Groups']")
	public WebElement marketGroup;

	@FindBy(xpath = "//div[@class='x-grid-cell-inner']//ancestor::span[text()='Market Groups']//following::tr[2]/td[2]//span")
	public WebElement marketsFolder;

	@FindBy(xpath = "//div[@class='x-grid-cell-inner']//ancestor::span[text()='Market Groups']//following::tr[3]/td[2]//span")
	public WebElement marketsVal1;

	@FindBy(xpath = "//div[@class='x-grid-cell-inner']//ancestor::span[text()='Market Groups']//following::tr[4]/td[2]//span")
	public WebElement marketsVal2;

	@FindBy(xpath = "//div[@class='x-grid-cell-inner']//ancestor::span[text()='Market Groups']//following::tr[5]/td[2]//span")
	public WebElement marketsVal3;

	// Conditions
	@FindBy(xpath = "(//img[@class='x-action-col-icon x-action-col-0   cbdownbutton'])[1]")
	public WebElement conditionPlusBtn;

	@FindBy(xpath = "//span[text()='New']")
	public WebElement conditionNewBtn;

	@FindBy(xpath = "(//div[@class='x-trigger-index-0 x-form-trigger x-form-arrow-trigger x-form-trigger-first'])[1]")
	public WebElement conditionOrderSelection;

	@FindBy(xpath = "(//li[@role='option'])[1]")
	public WebElement conditionOrder_All;

	@FindBy(xpath = "(//li[@role='option'])[2]")
	public WebElement conditionOrder_Top;

	@FindBy(xpath = "(//li[@role='option'])[3]")
	public WebElement conditionOrder_Bottom;

	@FindBy(xpath = "(//input[@class='x-form-field x-form-required-field x-form-text'])[2]")
	public WebElement conditionOrderLevel;

	@FindBy(xpath = "(//div[@class='x-trigger-index-0 x-form-trigger x-form-arrow-trigger x-form-trigger-first'])[2]")
	public WebElement conditionDim1Selection;

	@FindBy(xpath = "(//li[@role='option'])[4]")
	public WebElement conditionDim1_Val1;

	@FindBy(xpath = "(//li[@role='option'])[5]")
	public WebElement conditionDim1_Val2;

	@FindBy(xpath = "(//li[@role='option'])[6]")
	public WebElement conditionDim1_Val3;

	@FindBy(xpath = "(//div[@class='x-trigger-index-0 x-form-trigger x-form-arrow-trigger x-form-trigger-first'])[3]")
	public WebElement conditionFactSelection;

	@FindBy(xpath = "(//li[@role='option'])[7]")
	public WebElement conditionFactVal1;

	@FindBy(xpath = "(//li[@role='option'])[8]")
	public WebElement conditionFactVal2;

	@FindBy(xpath = "(//li[@role='option'])[9]")
	public WebElement conditionFactVal3;

	@FindBy(xpath = "(//div[@class='x-btn x-unselectable x-box-item x-btn-default-small x-noicon x-btn-noicon x-btn-default-small-noicon'])[6]")
	public WebElement conditionAddRuleBtn;

	@FindBy(xpath = "(//div[@class='x-trigger-index-0 x-form-trigger x-form-arrow-trigger x-form-trigger-first'])[4]")
	public WebElement conditionDim2Selection;

	@FindBy(xpath = "(//div[@class='x-boundlist-item'])[1]")
	public WebElement conditionDim2_Val1;

	@FindBy(xpath = "(//div[@class='x-boundlist-item'])[2]")
	public WebElement conditionDim2_Val2;

	@FindBy(xpath = "(//div[@class='x-boundlist-item'])[3]")
	public WebElement conditionDim2_Val3;

	@FindBy(xpath = "(//div[@class='x-trigger-index-0 x-form-trigger x-form-arrow-trigger x-form-trigger-first'])[5]")
	public WebElement conditionDim3Selection;

	@FindBy(xpath = "(//div[@class='x-boundlist-item'])[4]")
	public WebElement conditionDim3_Val1;

	@FindBy(xpath = "(//div[@class='x-boundlist-item'])[5]")
	public WebElement conditionDim3_Val2;

	@FindBy(xpath = "(//div[@class='x-boundlist-item'])[6]")
	public WebElement conditionDim3_Val3;

	@FindBy(xpath = "//span[text()='OK']")
	public WebElement conditionOkBtn;

	@FindBy(xpath = "(//span[text()='Conditions']//following::span[@class='x-tree-node-text'])[1]")
	public WebElement condition_Item1;

	@FindBy(xpath = "//span[text()='Conditions']")
	public WebElement conditions;

	@FindBy(xpath = "//img[@class='x-tree-elbow-plus x-tree-expander']//following::span[text()='Expressions']")
	public WebElement expressions;

	// rank
	@FindBy(xpath = "(//img[@class='x-action-col-icon x-action-col-0   cbdownbutton'])[2]")
	public WebElement rankPlusBtn;

	@FindBy(xpath = "//span[text()='New']")
	public WebElement rankNewBtn;

	@FindBy(xpath = "(//td[@class=' x-trigger-cell x-unselectable'])[1]")
	public WebElement rankPortfolio_Facts;

	@FindBy(xpath = "(//li[@class='x-boundlist-item'])[1]")
	public WebElement rankPortfolio_Factsval1;

	@FindBy(xpath = "(//li[@class='x-boundlist-item'])[1]")
	public WebElement rankPortfolio_FactsCaVal1;

	@FindBy(xpath = "(//td[@class=' x-trigger-cell x-unselectable'])[2]")
	public WebElement rankPortfolio_SortOrder;

	@FindBy(xpath = "//li[text()='Ascending']")
	public WebElement rankPortfolio_SortOrderAscending;

	@FindBy(xpath = "//li[text()='Descending']")
	public WebElement rankPortfolio_SortOrderDescending;

	@FindBy(xpath = "//span[text()='OK']")
	public WebElement rankOkBtn;

	@FindBy(xpath = "(//span[text()='Rank']//following::span[@class='x-tree-node-text'])[1]")
	public WebElement rank_Item1;

	@FindBy(xpath = "//span[text()='Rank']")
	public WebElement rank;

	// percentile
	@FindBy(xpath = "(//img[@class='x-action-col-icon x-action-col-0   cbdownbutton'])[3]")
	public WebElement percentilePlusBtn;

	@FindBy(xpath = "//span[@class='x-menu-item-text' and text()='New']")
	public WebElement percentileNewBtn;

	@FindBy(xpath = "(//td[@class=' x-trigger-cell x-unselectable'])[1]")
	public WebElement percentilePortfolio_Facts;

	@FindBy(xpath = "(//li[@class='x-boundlist-item'])[1]")
	public WebElement percentilePortfolio_FactsVal1;

	@FindBy(xpath = "(//td[@class=' x-trigger-cell x-unselectable'])[2]")
	public WebElement percentilePortfolio_SortOrder;

	@FindBy(xpath = "//li[text()='Ascending']")
	public WebElement percentilePortfolio_SortOrderAscending;

	@FindBy(xpath = "//span[text()='OK']")
	public WebElement percentileOkBtn;

	@FindBy(xpath = "(//span[text()='Percentile']//following::span[@class='x-tree-node-text'])[1]")
	public WebElement percentile_Item1;

	@FindBy(xpath = "//span[text()='Percentile']")
	public WebElement percentile;

	// Quantile
	@FindBy(xpath = "(//img[@class='x-action-col-icon x-action-col-0   cbdownbutton'])[4]")
	public WebElement quantilePlusBtn;

	@FindBy(xpath = "//span[text()='New']")
	public WebElement quantileNewBtn;

	@FindBy(xpath = "(//td[@class=' x-trigger-cell x-unselectable'])[1]")
	public WebElement quantile_QuanPortfolio;

	@FindBy(xpath = "(//li[@class='x-boundlist-item'])[1]")
	public WebElement quantileQuanPortfolio_Val1;

	@FindBy(xpath = "(//td[@class=' x-trigger-cell x-unselectable'])[2]")
	public WebElement quantile_PercPortfolio;

	@FindBy(xpath = "(//div[@class='x-boundlist-list-ct x-unselectable'])[2]")
	public WebElement quantilePercPortfolio_Val1;

	@FindBy(xpath = "//span[text()='OK']")
	public WebElement quantileOkBtn;

	@FindBy(xpath = "(//span[text()='Quantile']//following::span[@class='x-tree-node-text'])[1]")
	public WebElement quantile_Item1;

	@FindBy(xpath = "//span[text()='Quantile']")
	public WebElement quantile;

	// custom expression

	@FindBy(xpath = "(//img[@class='x-action-col-icon x-action-col-0   cbdownbutton'])[5]")
	public WebElement customExpPlusBtn;

	@FindBy(xpath = "//span[text()='New']")
	public WebElement customExpNewBtn;

	@FindBy(xpath = "//div[@id='stcontent_customexpressiontexteditor-1230']")
	public WebElement customExp_PlacingArea;

	@FindBy(xpath = "//span[@class='x-btn-icon-el additionIcon ']")
	public WebElement customExp_Addition;

	@FindBy(xpath = "//span[text()='OK']")
	public WebElement customExpOkBtn;

	@FindBy(xpath = "(//span[text()='Custom Expressions']//following::span[text()='Facts'])")
	public WebElement customExp_Facts;

	@FindBy(xpath = "(//span[text()='Custom Expressions']//following::span[@class='x-tree-node-text'])[5]")
	public WebElement customExp_Item1;

	@FindBy(xpath = "//span[text()='Custom Expressions']")
	public WebElement customExp;

	// sets and groups

	@FindBy(xpath = "//span[text()='Sets and Groups']")
	public WebElement setsAndGroups;

	@FindBy(xpath = "(//img[@class='x-action-col-icon x-action-col-0   cbdownbutton'])[2]")
	public WebElement customSetPlusBtn;

	@FindBy(xpath = "//span[text()='New']")
	public WebElement customSetNewBtn;

	@FindBy(xpath = "//div[text()='DATA SET']//following::table[@class='rb-pane-table']")
	public WebElement customSet_PlacingArea;

	@FindBy(xpath = "//span[text()='OK']")
	public WebElement customSetOkBtn;

	@FindBy(xpath = "(//span[text()='Custom Set']//following::span[@class='x-tree-node-text'])[1]")
	public WebElement customSet_Item1;

	@FindBy(xpath = "//span[text()='OK']")
	public WebElement customGroupOkBtn;

	@FindBy(xpath = "//span[text()='Custom Group']")
	public WebElement customGroup;

	@FindBy(xpath = "(//span[text()='Custom Group']//following::span[@class='x-tree-node-text'])[1]")
	public WebElement customGroup_item1;

	// MIDDLE PANEL
	@FindBy(xpath = "//div[@class='x-resizable-handle x-resizable-handle-west x-panel-handle x-panel-handle-west x-panel-handle-west-br x-unselectable']")
	public WebElement table_DragLine;

	@FindBy(xpath = "//div[@class='x-container x-box-item x-container-awaf-grey-gradient x-layout-fit']")
	public WebElement pageByArea;

	@FindBy(xpath = "(//td[@class='rb-ddz-bottom rb-ddz-nest-below rb-selection-drop-view rb-selection-drop-tip rb-selection-record'])[10]")
	public WebElement pageByArea1;

	@FindBy(xpath = "(//td[@class='rb-tbl-cell'])[1]")
	public WebElement blankSpace_text;

	@FindBy(xpath = "(//td[@class='rb-tbl-cell'])[73]")
	public WebElement blankSpace_Verticalbar;

	@FindBy(xpath = "(//td[@class='rb-tbl-cell'])[133]")
	public WebElement blankSpace_Waterfall;

	// Table
	@FindBy(xpath = "(//div[text()='CONDITIONS']//ancestor::td[@class='x-table-layout-cell '])[3]")
	public WebElement conditionBlankSpace_Table;

	@FindBy(xpath = "(//td[@class='rb-ddz-right rb-ddz-append rb-selection-drop-view rb-selection-drop-tip rb-selection-record'])[4]")
	public WebElement table_Columns1;

	@FindBy(xpath = "(//td[@class='rb-ddz-right rb-ddz-append rb-selection-drop-view rb-selection-drop-tip rb-selection-record'])[6]")
	public WebElement table_Columns2;

	@FindBy(xpath = "(//td[@class='rb-ddz-left rb-ddz-prepand rb-selection-drop-view rb-selection-drop-tip rb-selection-record'])[4]")
	public WebElement table_Columns7;

	@FindBy(xpath = "(//td[@class='rb-ddz-bottom rb-ddz-nest-below rb-selection-drop-view rb-selection-drop-tip rb-selection-record'])[4]")
	public WebElement table_Columns3;

	// Add Conditions in Columns of table
	@FindBy(xpath = "(//td[@class='rb-ddz-bottom rb-ddz-nest-below rb-selection-drop-view rb-selection-drop-tip rb-selection-record'])[6]")
	public WebElement table_Columns4;

	// Add Conditions in rows of table
	@FindBy(xpath = "(//td[@class='rb-ddz-right rb-ddz-nest-below rb-selection-drop-view rb-selection-drop-tip rb-selection-record'])[2]")
	public WebElement table_Rows;

	// Add custom expression in table
	@FindBy(xpath = "(//td[@class='rb-ddz-right rb-ddz-append rb-selection-drop-view rb-selection-drop-tip rb-selection-record'])[11]")
	public WebElement table_Columns5;

	// add custom grp
	@FindBy(xpath = "(//td[@class='rb-ddz-right rb-ddz-append rb-selection-drop-view rb-selection-drop-tip rb-selection-record'])[9]")
	public WebElement table_Columns6;

	// pivot area
	@FindBy(xpath = "(//div[text()='PIVOT']//ancestor::div[@class='x-container x-container-default x-layout-fit'])[4]")
	public WebElement table_Pivot;
	
	//Add Market Characteristics in table
	
	//Characteristics DropZone
	@FindBy(xpath="//div[text()='CHARACTERISTICS']//ancestor::td[@class='x-table-layout-cell ']")
    public WebElement table_Characteristics;
	
	@FindBy(xpath="//div[text()='CHARACTERISTICS']//ancestor::td[@class='x-table-layout-cell ']/descendant::table/tbody/tr[1]/td[1]")
    public WebElement table_Characteristics1;
	
	@FindBy(xpath="//div[text()='CHARACTERISTICS']//ancestor::td[@class='x-table-layout-cell ']/descendant::table/tbody/tr[1]/td[3]")
    public WebElement table_Characteristics2;
	
	@FindBy(xpath="(//div[@class='x-tree-view x-fit-item x-tree-view-draggable x-unselectable']//child::div)[5]")
    public WebElement Data_Markets;
	
	@FindBy(xpath="//div[@class='x-tree-view x-fit-item x-tree-view-draggable x-unselectable']/table/tbody/tr[3]/td[2]/div")
    public WebElement Markets_Char;
	
	@FindBy(xpath="//div[@class='x-tree-view x-fit-item x-tree-view-draggable x-unselectable']/table/tbody/tr[4]/td[2]/div")
    public WebElement Markets_CharAll;
	
	@FindBy(xpath="//div[@class='x-tree-view x-fit-item x-tree-view-draggable x-unselectable']/table/tbody/tr[5]/td[2]/div")
    public WebElement Markets_CharSelected;
	
	@FindBy(xpath="//div[@class='x-tree-view x-fit-item x-tree-view-draggable x-unselectable']/table/tbody/tr[6]/td[2]/div")
    public WebElement Markets_CharAll2;
	
	@FindBy(xpath="//div[@class='x-tree-view x-fit-item x-tree-view-draggable x-unselectable']/table/tbody/tr[7]/td[2]/div")
    public WebElement Markets_CharSelected2;
	
	@FindBy(xpath="//div[@class='x-tree-view x-fit-item x-tree-view-draggable x-unselectable']/table/tbody/tr[8]/td[2]/div")
    public WebElement Markets_CharAll3;
	
	@FindBy(xpath="//div[@class='x-tree-view x-fit-item x-tree-view-draggable x-unselectable']/table/tbody/tr[9]/td[2]/div")
    public WebElement Markets_CharSelected3;
	
	@FindBy(xpath="(//div[@class='x-tree-view x-fit-item x-tree-view-draggable x-unselectable']//child::div)[8]")
    public WebElement Data_Products;
	
	@FindBy(xpath="(//div[@class='x-tree-view x-fit-item x-tree-view-draggable x-unselectable']//child::div)[11]")
    public WebElement Data_Periods;
	
	@FindBy(xpath="(//div[@class='x-tree-view x-fit-item x-tree-view-draggable x-unselectable']//child::div)[14]")
    public WebElement Data_Facts;
	
	@FindBy(xpath="//div[@class='x-tree-view x-fit-item x-tree-view-draggable x-unselectable']/table/tbody/tr[4]/td[2]/div")
    public WebElement Products_Characteristics;
	
	@FindBy(xpath="//div[@class='x-tree-view x-fit-item x-tree-view-draggable x-unselectable']/table/tbody/tr[5]/td[2]/div")
    public WebElement Products_Sum;
	
	@FindBy(xpath="//div[@class='x-tree-view x-fit-item x-tree-view-draggable x-unselectable']/table/tbody/tr[5]/td[2]/div")
    public WebElement ProdChar_All;
	
	@FindBy(xpath="//div[@class='x-tree-view x-fit-item x-tree-view-draggable x-unselectable']/table/tbody/tr[6]/td[2]/div")
    public WebElement ProdChar_Selected;
	
	@FindBy(xpath="//div[@class='x-tree-view x-fit-item x-tree-view-draggable x-unselectable']/table/tbody/tr[7]/td[2]/div")
    public WebElement ProdChar_All2;
	
	@FindBy(xpath="//div[@class='x-tree-view x-fit-item x-tree-view-draggable x-unselectable']/table/tbody/tr[8]/td[2]/div")
    public WebElement ProdChar_Selected2;
	
	
    
    // Table kebab
	@FindBy(xpath = "//div[@id='button-1086']")
	public WebElement table_Kebab;

	//@FindBy(xpath = "(//span[text()='View Full Screen'])[4]")
	//public WebElement table_ViewFullScreen;
	
	@FindBy(xpath = "//div[@id='menu-1087-targetEl']/div/a/span[text()='View Full Screen']")
	public WebElement table_ViewFullScreen;
	

	@FindBy(xpath = "(//span[text()='View Full Screen'])[2]")
	public WebElement table_ViewFullScreen1;

	// list mode
	@FindBy(xpath = "(//input[@class='x-form-field x-form-radio x-form-cb'])[2]")
	public WebElement list_Mode;

	@FindBy(xpath = "(//div[@class='x-btn x-unselectable x-box-item x-btn-default-small x-noicon x-btn-noicon x-btn-default-small-noicon'])[6]")
	public WebElement list_Mode_Continue_Btn;

	
	//Merge Rows
	@FindBy(xpath = "(//label[@class='x-menu-item-text x-menu-item-text-after'])[3]")
	public WebElement Merge_Rows;
	
	//Merge Columns
	@FindBy(xpath = "(//label[@class='x-menu-item-text x-menu-item-text-after'])[4]")
	public WebElement Merge_Columns;
	
	//Products/char in Columns
	@FindBy(xpath = "(//label[@class='x-menu-item-text x-menu-item-text-after'])[5]")
	public WebElement Products_Columns;
	
	//Products/chars merged
	@FindBy(xpath = "(//label[@class='x-menu-item-text x-menu-item-text-after'])[6]")
	public WebElement Products_Merged;
	
	//Align
	@FindBy(xpath = "(//label[@class='x-menu-item-text x-menu-item-text-after'])[7]")
	public WebElement Align;
	

	// show totals
	@FindBy(xpath = "(//td[@class='x-form-item-body x-form-cb-wrap'])[8]")
	public WebElement showTotals;

	// sub total and grand total
	@FindBy(xpath = "(//td[@class='x-form-item-body x-form-cb-wrap'])[9]")
	public WebElement subTotal;

	@FindBy(xpath = "(//td[@class='x-form-item-body x-form-cb-wrap'])[10]")
	public WebElement grandTotal;

	// enhanced mode
	@FindBy(xpath = "(//input[@class='x-form-field x-form-radio x-form-cb'])[1]")
	public WebElement enhanced_Mode;

	@FindBy(xpath = "(//div[@class='x-btn x-unselectable x-box-item x-btn-default-small x-noicon x-btn-noicon x-btn-default-small-noicon'])[6]")
	public WebElement enhanced_Mode_Continue_Btn;

	// Smart text

	@FindBy(xpath = "//span[text()='Insert Smart Text']")
	public WebElement smartText;

	@FindBy(xpath = "//span[text()='Description']")
	public WebElement smartText_Des;

	@FindBy(xpath = "//span[text()='[Insert an Item]']")
	public WebElement insertText;

	// Text kebab
	@FindBy(xpath = "//label[text()='Text-1']/ancestor::div[@class='x-box-inner x-horizontal-box-overflow-body']//div/div[3]/div")
	public WebElement textKebab;

	@FindBy(xpath = "(//label[text()='Text-1']/ancestor::div[@class='x-box-inner x-horizontal-box-overflow-body']//div/div[3]/div)[2]")
	public WebElement textKebab1;

	@FindBy(xpath = "(//span[text()='View Full Screen'])[3]")
	public WebElement text_ViewFullScreen;

	@FindBy(xpath = "//span[text()='Minimize']")
	public WebElement text_ViewMinimizeScreen;

	// Vertical bar
	@FindBy(xpath = "(//tr[@class='rb-object-editor-table'])[10]")
	public WebElement verticalBar_CategoriesXaxis;

	@FindBy(xpath = "(//td[@class='rb-ddz-left rb-ddz-nest-above rb-selection-drop-view rb-selection-drop-tip rb-selection-record'])[3]")
	public WebElement verticalBar_CategoriesXaxis1;

	@FindBy(xpath = "(//div[@class='x-component x-fit-item x-component-default'])[16]")
	public WebElement verticalBar_SeriesAxis;

	@FindBy(xpath = "(//td[@class='rb-ddz-left rb-ddz-nest-above rb-selection-drop-view rb-selection-drop-tip rb-selection-record'])[3]")
	public WebElement verticalBar_CategoriesXaxis2;

	@FindBy(xpath = "(//td[@class='rb-ddz-left rb-ddz-nest-above rb-selection-drop-view rb-selection-drop-tip rb-selection-record'])[3]")
	public WebElement verticalBar_CategoriesXaxis3;

	@FindBy(xpath = "(//td[@class='rb-ddz-left rb-ddz-nest-above rb-selection-drop-view rb-selection-drop-tip rb-selection-record'])[3]")
	public WebElement verticalBar_CategoriesXaxis4;

	@FindBy(xpath = "(//td[@class='rb-ddz-left rb-ddz-nest-above rb-selection-drop-view rb-selection-drop-tip rb-selection-record'])[3]")
	public WebElement verticalBar_CategoriesXaxis5;

	@FindBy(xpath = "(//td[@class='rb-ddz-bottom rb-ddz-append rb-selection-drop-view rb-selection-drop-tip rb-selection-record'])[6]")
	public WebElement verticalBar_CategoriesXaxis6;

	@FindBy(xpath = "(//td[@class='rb-ddz-left rb-ddz-nest-above rb-selection-drop-view rb-selection-drop-tip rb-selection-record'])[3]")
	public WebElement verticalBar_CategoriesXaxis7;

	@FindBy(xpath = "(//td[@class='rb-ddz-bottom rb-ddz-append rb-selection-drop-view rb-selection-drop-tip rb-selection-record'])[10]")
	public WebElement verticalBar_CategoriesXaxis8;

	@FindBy(xpath = "(//td[@class='rb-ddz-bottom rb-ddz-append rb-selection-drop-view rb-selection-drop-tip rb-selection-record'])[8]")
	public WebElement verticalBar_CategoriesXaxis10;

	@FindBy(xpath = "(//td[@class='rb-ddz-bottom rb-ddz-append rb-selection-drop-view rb-selection-drop-tip rb-selection-record'])[6]")
	public WebElement verticalBar_CategoriesXaxis9;

	@FindBy(xpath = "(//tr[@class='rb-object-editor-table'])[10]")
	public WebElement verticalBar_CategoriesXaxis11;

	@FindBy(xpath = "(//td[@class='rb-ddz-left rb-ddz-nest-above rb-selection-drop-view rb-selection-drop-tip rb-selection-record'])[3]")
	public WebElement verticalBar_CategoriesXaxis12;

	@FindBy(xpath = "(//td[@class='rb-ddz-left rb-ddz-nest-above rb-selection-drop-view rb-selection-drop-tip rb-selection-record'])[3]")
	public WebElement verticalBar_CategoriesXaxis13;

	@FindBy(xpath = "(//div[text()='CONDITIONS']//ancestor::td[@class='x-table-layout-cell '])[3]")
	public WebElement conditionBlankSpace_VerticalBar;

	// Vertical bar kebab
	@FindBy(xpath = "//label[text()='Vertical Bar-1']/ancestor::div[@class='x-box-inner x-horizontal-box-overflow-body']//div/div[3]/div")
	public WebElement verticalBarKebab;

	@FindBy(xpath = "(//label[text()='Vertical Bar-1']/ancestor::div[@class='x-box-inner x-horizontal-box-overflow-body']//div/div[3]/div)[2]")
	public WebElement verticalBarKebab1;

	@FindBy(xpath = "//span[text()='View Full Screen']")
	public WebElement verticalBar_ViewFullScreen;

	@FindBy(xpath = "//span[text()='Minimize']")
	public WebElement verticalBar_ViewMinimizeScreen;

	// Waterfall chart
	@FindBy(xpath = "(//div[text()='END CATEGORY']//ancestor::div[@class='x-container x-container-default x-layout-fit'])[2]")
	public WebElement waterfallChart_EndCategory;

	@FindBy(xpath = "(//div[text()='FLOATING COLUMNS']//ancestor::div[@class='x-container x-container-default x-layout-fit'])[2]")
	public WebElement waterfallChart_FloatingColumns;

	@FindBy(xpath = "(//td[@class='rb-ddz-left rb-ddz-nest-above rb-selection-drop-view rb-selection-drop-tip rb-selection-record'])[5]")
	public WebElement waterfallChart_FloatingColumns1;

	@FindBy(xpath = "(//div[text()='FACTS (Y1-AXIS)']//ancestor::div[@class='x-component x-fit-item x-component-default']//following::table[@class='rb-pane-table rb-h-center'])[10]")
	public WebElement waterfallChart_FactsY1axis;

	// Waterfall chart kebab
	@FindBy(xpath = "//label[text()='Waterfall Chart-1']/ancestor::div[@class='x-box-inner x-horizontal-box-overflow-body']//div/div[3]/div")
	public WebElement waterfallChartKebab;

	@FindBy(xpath = "(//span[text()='View Full Screen'])[2]")
	public WebElement waterfallChart_ViewFullScreen;

	@FindBy(xpath = "(//label[text()='Waterfall Chart-1']/ancestor::div[@class='x-box-inner x-horizontal-box-overflow-body']//div/div[3]/div)[2]")
	public WebElement waterfallChartKebab1;

	@FindBy(xpath = "//div[@class='x-menu-item-icon minimizeScreenIconCls ']")
	public WebElement waterfallChart_ViewMinimizeScreen;

	// virtual prompt

	@FindBy(xpath = "(//button[@class='rb-selection-menu-btn' and @type='button'])[17]")
	public WebElement table_MarketKebab;

	@FindBy(xpath = "//span[text()='Properties']")
	public WebElement table_MarketProperties;

	@FindBy(xpath = "//label[text()='Custom Prompt']")
	public WebElement table_MarketCustomPrompt;

	@FindBy(xpath = "(//span[text()='OK'])[1]")
	public WebElement table_MarketPropertiesOkBtn;

	// virtual prompt ds page
	@FindBy(xpath = "//span[text()='MKT1']")
	public WebElement mkt1tab;

	@FindBy(xpath = "(//span[text()='Markets'])[4]")
	public WebElement mkt1_mktFolder;

	@FindBy(xpath = "(//span[text()='Market Share'])[1]")
	public WebElement mktShareTab;

	@FindBy(xpath = "(//span[text()='MKT1'])[2]/ancestor::div[@class='x-component x-header-text-container x-panel-header-text-container x-panel-header-text-container-default x-box-item x-component-default x-component-before-title']//following::div/table/tbody/tr[1]/td[1]/div/div")
	public WebElement mkt1_middlePane_1Item;

	@FindBy(xpath = "(//span[text()='MKT1'])[2]/ancestor::div[@class='x-component x-header-text-container x-panel-header-text-container x-panel-header-text-container-default x-box-item x-component-default x-component-before-title']//following::div/table/tbody/tr[2]/td[1]/div/div")
	public WebElement mkt1_middlePane_2Item;

	@FindBy(xpath = "(//span[text()='MKT1'])[2]/ancestor::div[@class='x-component x-header-text-container x-panel-header-text-container x-panel-header-text-container-default x-box-item x-component-default x-component-before-title']//following::div/table/tbody/tr[3]/td[1]/div/div")
	public WebElement mkt1_middlePane_3Item;

	@FindBy(xpath = "//span[@id='button-1054-btnIconEl']")
	public WebElement runReport_DsPage;

	// Notify me
	@FindBy(xpath = "//div[@class='x-window notifyMeLaterWindow x-layer x-window-message-gradient']")
	public WebElement notifyMe_PopUp;

	@FindBy(xpath = "//span[text()='NOTIFY ME WHEN COMPLETE']")
	public WebElement notifyMe_Btn;

	@FindBy(xpath = "//span[text()='CANCEL']")
	public WebElement notifyMe_CancelBtn;

	// dspage
	@FindBy(xpath = "//label[@class='x-component x-lbl-TITLE x-box-item x-component-default']")
	public WebElement ds_header;

	// Connecting vertical bar and table
	@FindBy(xpath = "//div[@class='x-menu-item-icon allPropertiesIconCls ']")
	public WebElement verticalBar_AllProperties;

	@FindBy(xpath = "(//td[@class='x-grid-cell x-grid-td x-grid-cell-value x-grid-cell-last x-unselectable '])[3]")
	public WebElement verticalBar_ConnectTo;

	@FindBy(xpath = "//div[@class='x-trigger-index-0 x-form-trigger x-form-arrow-trigger x-form-trigger-first']")
	public WebElement verticalBar_ConnectToDropdown;

	@FindBy(xpath = "//div[@class='x-boundlist-list-ct x-unselectable']//following::div[@class='x-boundlist-item']")
	public WebElement verticalBar_ConnectToVal1;

	@FindBy(xpath = "//img[@class='x-tool-img x-tool-close']")
	public WebElement verticalBar_ConnectToCloseBtn;
	
	//pagecontainer
	@FindBy(xpath = "//span[text()='Page Container']")
	public WebElement pageContainer;

	@FindBy(xpath = "(//div[@class='x-resizable-handle x-resizable-handle-south x-panel-handle x-panel-handle-south x-panel-handle-south-br x-unselectable'])[2]")
	public WebElement pageContainer_DragLine;

	@FindBy(xpath = "(//td[@class='rb-tbl-cell pg-tbl-cell'])[1]")
	public WebElement blankspace_Table;

	@FindBy(xpath = "//label[text()='Table-2']/ancestor::div[@class='x-box-inner x-horizontal-box-overflow-body']//div/div[3]/div")
	public WebElement pgContainerTable_Kebab;

	@FindBy(xpath = "(//label[text()='Table-2']//following::div[@class='x-menu-item-icon viewfullscreenIconCls '])[1]")
	public WebElement pgContainerTable_ViewFullScreen;

	//---------- Note - Check xpaths

	@FindBy(xpath = "(//table[@class='rb-pane-table rb-h-center'])[11]")
	public WebElement pgContainerTable_Rows;

	@FindBy(xpath = "(//td[@class='rb-ddz-left rb-ddz-nest-above rb-selection-drop-view rb-selection-drop-tip rb-selection-record'])[3]")
	public WebElement pgContainerTable_Rows1;

	@FindBy(xpath = "(//table[@class='rb-pane-table rb-h-center'])[10]")
	public WebElement pgContainerTable_Columns;

	@FindBy(xpath = "(//td[@class='rb-ddz-bottom rb-ddz-nest-below rb-selection-drop-view rb-selection-drop-tip rb-selection-record'])[4]")
	public WebElement pgContainerTable_Columns1;

	//----------

	@FindBy(xpath = "(//label[text()='Table-2']/ancestor::div[@class='x-box-inner x-horizontal-box-overflow-body']//div/div[3]/div)[2]")
	public WebElement pgContainerTable_Kebab1;

	@FindBy(xpath = "//label[text()='Table-2']//following::div[@class='x-menu-item-icon minimizeScreenIconCls ']")
	public WebElement pgContainerTable_ViewMinimizeScreen;
	
	//Product Description
	@FindBy(xpath = "(//div[@class='x-container x-container-default x-layout-fit'])[5]//table/tbody/tr[2]/td[2]/span/button")
	public WebElement Product_kebab;
	
	@FindBy(xpath = "//span[text()='Custom Prod Description']")
	public WebElement CustomProduct_description;
	
	@FindBy(xpath = "//table[@class='x-gridview-1061-table x-grid-table']/tbody/tr[1]")
	public WebElement Productpane_Item1;
	
	@FindBy(xpath = "//table[@class='x-gridview-1061-table x-grid-table']/tbody/tr[2]")
	public WebElement Productpane_Item2;
	
	@FindBy(xpath = "(//span[text()='SAVE'])[3]")
	public WebElement Productpane_Save;
	
	@FindBy(xpath = "(//div[@class='x-toolbar x-docked x-toolbar-neutral-light x-docked-top x-toolbar-docked-top x-toolbar-neutral-light-docked-top x-box-layout-ct'])[2]//descendant::div[@class='x-box-target']/img[4]")
	public WebElement Productpane_delete;
	
	@FindBy(xpath = "//span[text()='YES - CLEAR ALL']")
	public WebElement Productpane_clearAll;
	
	@FindBy(xpath = "(//iframe)[2]")
	public WebElement frame1043;
	
	//Market Description
	@FindBy(xpath = "(//div[@class='x-container x-container-default x-layout-fit'])[5]//table/tbody/tr[2]/td[1]/span/button")
	public WebElement Market_kebab;
	
	@FindBy(xpath = "//span[text()='Custom Market Description']")
	public WebElement CustomMarket_description;
	
	//Conditional Format
	
	@FindBy(xpath = "(//img[@class='x-action-col-icon x-action-col-0   cbdownbutton'])[2]")
	public WebElement ConditionalFormatPlusBtn;
	
	@FindBy(xpath = "//span[text()='New']")
	public WebElement conditionalFormatNewBtn;
	
	@FindBy(xpath = "(//div[@class='x-trigger-index-0 x-form-trigger x-form-arrow-trigger x-form-trigger-first'])[1]")
	public WebElement conditionalFormat_FactSelection;
	
	@FindBy(xpath = "(//div[@class='x-boundlist x-boundlist-floating x-layer x-boundlist-default'])[1]/div/ul/li[1]")
	public WebElement FactSelection_list1;
	
	@FindBy(xpath = "(//div[@class='x-boundlist x-boundlist-floating x-layer x-boundlist-default'])[1]/div/ul/li[2]")
	public WebElement FactSelection_list2;
	
	@FindBy(xpath = "(//div[@class='x-boundlist x-boundlist-floating x-layer x-boundlist-default'])[1]/div/ul/li[3]")
	public WebElement FactSelection_list3;
	
	@FindBy(xpath = "(//div[@class='x-trigger-index-0 x-form-trigger x-form-arrow-trigger x-form-trigger-first'])[2]")
	public WebElement conditionalFormat_OperatorSelection;
	
	@FindBy(xpath = "(//div[@class='x-boundlist x-boundlist-floating x-layer x-boundlist-default'])[2]/div/ul/li[1]")
	public WebElement OperatorSelection_list1;
	
	@FindBy(xpath = "(//div[@class='x-boundlist x-boundlist-floating x-layer x-boundlist-default'])[2]/div/ul/li[2]")
	public WebElement OperatorSelection_list2;
	
	@FindBy(xpath = "(//div[@class='x-boundlist x-boundlist-floating x-layer x-boundlist-default'])[2]/div/ul/li[text()='greater than or equal to']")
	public WebElement OperatorSelection_list3;
	
	@FindBy(xpath = "(//div[@class='x-btn x-unselectable x-box-item x-toolbar-item x-btn-plain-toolbar-small x-icon x-btn-icon x-btn-plain-toolbar-small-icon'])[1]")
	public WebElement conditionalFormat_Add;
	
	@FindBy(xpath = "(//div[@class='x-trigger-index-0 x-form-trigger x-form-arrow-trigger x-form-trigger-first'])[3]")
	public WebElement conditionalFormat_FactSelection2;
	
	@FindBy(xpath = "(//div[@class='x-trigger-index-0 x-form-trigger x-form-arrow-trigger x-form-trigger-first'])[4]")
	public WebElement conditionalFormat_OperatorSelection2;
	
	@FindBy(xpath = "(//div[@class='x-boundlist x-boundlist-floating x-layer x-boundlist-default'])[3]/div/ul/li[1]")
	public WebElement FactSelection2_list1;
	
	@FindBy(xpath = "(//div[@class='x-boundlist x-boundlist-floating x-layer x-boundlist-default'])[3]/div/ul/li[2]")
	public WebElement FactSelection2_list2;
	
	@FindBy(xpath = "(//div[@class='x-boundlist x-boundlist-floating x-layer x-boundlist-default'])[4]/div/ul/li[1]")
	public WebElement OperatorSelection2_list1;
	
	@FindBy(xpath = "(//div[@class='x-boundlist x-boundlist-floating x-layer x-boundlist-default'])[4]/div/ul/li[2]")
	public WebElement OperatorSelection2_list2;
	
	@FindBy(xpath = "(//div[@class='x-boundlist x-boundlist-floating x-layer x-boundlist-default'])[4]/div/ul/li[text()='greater than or equal to']")
	public WebElement OperatorSelection2_list3;
	
	
	@FindBy(xpath = "(//table[@class='x-form-trigger-wrap x-unselectable'])[1]/tbody/tr/td[1]/input")
	public WebElement ConditionalFormat_Up;
	
	@FindBy(xpath = "(//table[@class='x-form-trigger-wrap x-unselectable'])[3]/tbody/tr/td[1]/input")
	public WebElement ConditionalFormat_Up2;
	
	@FindBy(xpath = "//span[text()='OK']")
	public WebElement conditionalFormatOkBtn;
	
	@FindBy(xpath = "//span[text()='Conditional Format']")
	public WebElement conditionalFormat;
	
	@FindBy(xpath = "//div[@class='x-tree-view x-fit-item x-tree-view-draggable x-unselectable']/table/tbody/tr[10]/td[2]/div")
	public WebElement conditionalFormat1;
	
	//@FindBy(xpath = "(//div[@class='x-container x-container-default x-layout-fit'])[4]//descendant::td[@class='rb-ddz-left rb-ddz-nest-above rb-selection-drop-view rb-selection-drop-tip rb-selection-record']")
	//public WebElement conditionalFormat_blankSpace;
	
	@FindBy(xpath = "//div[text()='CONDITIONAL FORMAT']//ancestor::div[@class='x-container x-container-default x-layout-fit']")
	public WebElement conditionalFormat_blankSpace;
	
	//NA Enabled
	
	@FindBy(xpath = "//div[@class='x-btn x-unselectable x-box-item x-btn-default-small x-icon x-btn-icon x-btn-default-small-icon x-over x-btn-over x-btn-default-small-over']/div/a/span[2]")
	public WebElement settingsBtn;
	
	@FindBy(xpath = "//div[@class='x-panel x-fit-item x-window-item x-panel-default']//descendant::table[@class='x-field x-table-plain x-form-item x-field-default x-checkboxgroup-form-item x-form-cb-checked'][2]/tbody/tr/td[2]/label")
	public WebElement NA_Enabled;
	
	@FindBy(xpath = "//span[text()='OK']")
	public WebElement conditionFomatOkBtn;
	

	public LayoutPageReg_ME() {
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
			System.out.println("exception occured" + e);
			logger.log(Status.FAIL, " Exception ocuerd " + e);
		}
	}


	
	public void switchToCdsFrame() throws Throwable {

		try {
			Thread.sleep(10000);
			driver.switchTo().defaultContent();
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

	

	public void createCondition() {
		try {
			action.moveToElement(conditionPlusBtn).build().perform();
			action.click(conditionPlusBtn).build().perform();

			action.moveToElement(conditionNewBtn).click().build().perform();

			action.moveToElement(conditionOrderSelection).click().build().perform();
			action.moveToElement(conditionOrder_Top).click().build().perform();
			action.moveToElement(conditionOrderLevel).click().build().perform();
			action.keyDown(Keys.CONTROL);
			action.sendKeys("a");
			action.keyUp(Keys.CONTROL);
			action.build().perform();
			action.sendKeys(Keys.BACK_SPACE).build().perform();
			action.sendKeys("3").build().perform();
			action.moveToElement(conditionDim1Selection).click().build().perform();
			action.moveToElement(conditionDim1_Val1).click().build().perform();
			action.moveToElement(conditionFactSelection).click().build().perform();
			action.moveToElement(conditionFactVal1).click().build().perform();
//			action.moveToElement(conditionDim2Selection).click().build().perform();
//			action.moveToElement(conditionDim2_Val1).click().build().perform();
//			action.moveToElement(conditionDim3Selection).click().build().perform();
//			action.moveToElement(conditionDim3_Val1).click().build().perform();
			action.moveToElement(conditionOkBtn).click().build().perform();

			logger.log(Status.PASS, "Condition is Created");
			System.out.println("Condition is Created");

		} catch (Exception e) {
			System.out.println("exception occured" + e);
			logger.log(Status.FAIL, " Exception occured " + e);
		}
	}

	

	public void addConditionsTable() {
		try {
			gen.clickAndHold_dragAnddrop(condition_Item1, conditionBlankSpace_Table);

			logger.log(Status.PASS, "Condition added");
			System.out.println("Condition added");
		} catch (Exception e) {
			System.out.println("exception occured" + e);
			logger.log(Status.FAIL, " Exception ocuerd " + e);
		}
	}
	// Add conditions in the columns area of the table
	public void addConditionsColumnTable() {
		try {
			gen.clickAndHold_dragAnddrop(condition_Item1, table_Columns4);

			logger.log(Status.PASS, "Condition added in the columns area of table");
			System.out.println("Condition added in the columns area of table");
		} catch (Exception e) {
			System.out.println("exception occured" + e);
			logger.log(Status.FAIL, " Exception ocuerd " + e);
		}
	}

	// Add conditions in the rows area of the table
	public void addConditionsRowTable() {
		try {
			gen.clickAndHold_dragAnddrop(condition_Item1, table_Rows);

			logger.log(Status.PASS, "Condition added in the rows area of table");
			System.out.println("Condition added in the rows area of table");
		} catch (Exception e) {
			System.out.println("exception occured" + e);
			logger.log(Status.FAIL, " Exception ocuerd " + e);
		}
	}
	
	
	// Table kebab
	public void validate_enhancedMode() {
		try {
			action.moveToElement(table_Kebab).build().perform();
			action.click(table_Kebab).build().perform();
			Thread.sleep(1000);
			action.moveToElement(enhanced_Mode).build().perform();
			action.click(enhanced_Mode).build().perform();
			Thread.sleep(1000);
			action.moveToElement(enhanced_Mode_Continue_Btn).build().perform();
			action.click(enhanced_Mode_Continue_Btn).build().perform();
			Thread.sleep(1000);
			logger.log(Status.PASS, "Report changed to Enhanced Mode");
		} catch (Exception e) {
			logger.log(Status.FAIL, " Exception ocuerd " + e);
		}
	}

	public void validate_ListMode() {
		try {
			action.moveToElement(table_Kebab).build().perform();
			action.click(table_Kebab).build().perform();
			Thread.sleep(1000);
			action.moveToElement(list_Mode).build().perform();
			action.click(list_Mode).build().perform();
			Thread.sleep(1000);
			action.moveToElement(list_Mode_Continue_Btn).build().perform();
			action.click(list_Mode_Continue_Btn).build().perform();
			Thread.sleep(1000);
			logger.log(Status.PASS, "Report changed to List Mode");
			System.out.println("Report changed to List Mode");
		} catch (Exception e) {
			System.out.println("exception occured" + e);
			logger.log(Status.FAIL, " Exception ocuerd " + e);
		}
	}

	public void disable_ShowTotals() {
		try {
			action.moveToElement(table_Kebab).build().perform();
			action.click(table_Kebab).build().perform();
			Thread.sleep(1000);
			action.moveToElement(showTotals).click().build().perform();

			Thread.sleep(1000);
			action.moveToElement(chartsAndObjects).build().perform();
			action.click(chartsAndObjects).build().perform();
			Thread.sleep(1000);
			logger.log(Status.PASS, "Show totals disabled");
			System.out.println("Show totals disabled");
		} catch (Exception e) {
			System.out.println("exception occured" + e);
			logger.log(Status.FAIL, " Exception ocuerd " + e);
		}
	}

	// enable Sub Total
	public void enable_SubTotal() {
		try {
			action.moveToElement(table_Kebab).click().build().perform();
			Thread.sleep(1000);

			gen.click(subTotal);
			Thread.sleep(1000);
			action.click(chartsAndObjects).build().perform();
			logger.log(Status.PASS, "Sub Total enabled");
			System.out.println("Sub Total enabled");

			action.moveToElement(chartsAndObjects).build().perform();
			action.click(chartsAndObjects).build().perform();
			Thread.sleep(1000);

		} catch (Exception e) {
			System.out.println("exception occured" + e);
			logger.log(Status.FAIL, " Exception ocuerd " + e);
		}
	}

	// enable Grand Total
	public void enable_GrandTotal() {
		try {
			action.moveToElement(table_Kebab).click().build().perform();
			Thread.sleep(1000);

			gen.click(grandTotal);
			Thread.sleep(1000);
			action.click(chartsAndObjects).build().perform();
			logger.log(Status.PASS, "Grand Total enabled");
			System.out.println("Grand Total enabled");

			action.moveToElement(chartsAndObjects).build().perform();
			action.click(chartsAndObjects).build().perform();
			Thread.sleep(1000);

		} catch (Exception e) {
			System.out.println("exception occured" + e);
			logger.log(Status.FAIL, " Exception ocuerd " + e);
		}
	}
	
	// enable Show Total
		public void enable_ShowTotal() {
			try {
				action.moveToElement(table_Kebab).click().build().perform();
				Thread.sleep(1000);

				gen.click(showTotals);
				Thread.sleep(1000);
				action.click(chartsAndObjects).build().perform();
				logger.log(Status.PASS, "Show Total enabled");
				System.out.println("Show Total enabled");

				action.moveToElement(chartsAndObjects).build().perform();
				action.click(chartsAndObjects).build().perform();
				Thread.sleep(1000);

			} catch (Exception e) {
				System.out.println("exception occured" + e);
				logger.log(Status.FAIL, " Exception ocuerd " + e);
			}
		}
	
	//Disabling Product/Chars in Columns only for list mode
		public void disable_ProductChar() {
			try {
				action.moveToElement(table_Kebab).click().build().perform();
				Thread.sleep(1000);

				gen.click(Products_Columns);
				Thread.sleep(1000);
				action.click(chartsAndObjects).build().perform();
				logger.log(Status.PASS, "Grand Total enabled");
				System.out.println("Grand Total enabled");

				action.moveToElement(chartsAndObjects).build().perform();
				action.click(chartsAndObjects).build().perform();
				Thread.sleep(1000);

			} catch (Exception e) {
				System.out.println("exception occured" + e);
				logger.log(Status.FAIL, " Exception ocuerd " + e);
			}
		}
	
	//Disabling Align only for list mode
	public void disable_Align() {
		try {
			action.moveToElement(table_Kebab).click().build().perform();
			Thread.sleep(1000);
			gen.click(Align);
			Thread.sleep(1000);
			action.click(chartsAndObjects).build().perform();
			Thread.sleep(1000);

		} catch (Exception e) {
			System.out.println("exception occured" + e);
			logger.log(Status.FAIL, " Exception ocuerd " + e);
		}
	}
	
	//Disabling  checked details in list mode
	public void disable_ListItems() {
		try {
			action.moveToElement(table_Kebab).click().build().perform();
			Thread.sleep(1000);
			gen.click(Align);
			gen.click(Merge_Rows);
			gen.click(Merge_Columns);
			//gen.click(Products_Columns);
			action.click(chartsAndObjects).build().perform();
			Thread.sleep(1000);

		} catch (Exception e) {
			System.out.println("exception occured" + e);
			logger.log(Status.FAIL, " Exception ocuerd " + e);
		}
	}
	
	
	

	public void run_Report() {
		try {

			WebElement runReport = driver.findElement(By.xpath("//span[text()='RUN REPORT']"));
			wait.until(ExpectedConditions.elementToBeClickable(runReport));
			if (runReport.isDisplayed()) {
				log.info("Run botton is displayed");
				action.moveToElement(runReport).build().perform();
				action.doubleClick(runReport).build().perform();
				// Thread.sleep(10000);
				logger.log(Status.PASS, "Run button is clicked");
				System.out.println("Run button is clicked");
			}
		} catch (Exception e) {
			System.out.println("exception occured" + e);
			logger.log(Status.FAIL, " Exception ocuerd " + e);
		}
	}

	public void notifyMe() {
		try {
			wait.until(ExpectedConditions.visibilityOf(notifyMe_PopUp));
			action.moveToElement(notifyMe_Btn).click().build().perform();
			logger.log(Status.INFO, "For current run 'Notify Me' apppeared, so clicked");
		} catch (Exception e) {
			logger.log(Status.INFO, "For current run 'Notify Me' not apppeared, so not clicked");
		}
	}
	
	//Enabling FMD FPD
	
	public void Enabling_ProductsColumnsMerged() {
		try {
			disable_ListItems();
			action.moveToElement(table_Kebab).build().perform();
			action.click(table_Kebab).build().perform();
			Thread.sleep(1000);
			action.moveToElement(Products_Merged).build().perform();
			action.click(Products_Merged).build().perform();
			Thread.sleep(1000);
			action.moveToElement(table_ViewFullScreen).build().perform();
			action.click(table_ViewFullScreen).build().perform();
			Thread.sleep(1000);
			logger.log(Status.PASS, "Enabled Product/chars in columns and Product/chars merged");
			System.out.println("Enabled Product/chars in columns and Product/chars merged");
			
		} catch (Exception e) {
			System.out.println("exception occured" + e);
			logger.log(Status.FAIL, " Exception ocuerd " + e);
		}
	}
	
	public void Enabling_ProductsColumns() {
		try {
			disable_ListItems();
			action.moveToElement(table_Kebab).build().perform();
			action.click(table_Kebab).build().perform();
			Thread.sleep(1000);
			action.moveToElement(table_ViewFullScreen).build().perform();
			action.click(table_ViewFullScreen).build().perform();
			Thread.sleep(1000);
			logger.log(Status.PASS, "Enabled  Product/chars in columns");
			System.out.println("Enabled and Product/chars in columns");
			
		} catch (Exception e) {
			System.out.println("exception occured" + e);
			logger.log(Status.FAIL, " Exception ocuerd " + e);
		}
	}
	
	// enable Merge Rows
	public void Enabling_MergeRows() {
		try {
			disable_ListItems();
			action.moveToElement(table_Kebab).build().perform();
			action.click(table_Kebab).build().perform();
			Thread.sleep(1000);
			action.moveToElement(Merge_Rows).build().perform();
			action.click(Merge_Rows).build().perform();
			Thread.sleep(1000);
			action.moveToElement(table_ViewFullScreen).build().perform();
			action.click(table_ViewFullScreen).build().perform();
			Thread.sleep(1000);
			logger.log(Status.PASS, "Enabled Merge Rows");
			System.out.println("Enabled Merge Rows");
			
		} catch (Exception e) {
			System.out.println("exception occured" + e);
			logger.log(Status.FAIL, " Exception ocuerd " + e);
		}
	}
	//Enable Merge Columns
		public void Enabling_MergeColumns() {
			try {
				disable_ListItems();
				action.moveToElement(table_Kebab).build().perform();
				action.click(table_Kebab).build().perform();
				Thread.sleep(1000);
				action.moveToElement(Merge_Columns).build().perform();
				action.click(Merge_Columns).build().perform();
				Thread.sleep(1000);
				action.moveToElement(table_ViewFullScreen).build().perform();
				action.click(table_ViewFullScreen).build().perform();
				Thread.sleep(1000);
				logger.log(Status.PASS, "Enabled Merge Columns");
				System.out.println("Enabled Merge Columns");
				
			} catch (Exception e) {
				System.out.println("exception occured" + e);
				logger.log(Status.FAIL, " Exception ocuerd " + e);
			}
		}
	
	//Adding Custom Product description
	public void Product_desc() {
		try {
			action.moveToElement(Product_kebab).build().perform();
			action.click(Product_kebab).build().perform();
			Thread.sleep(2000);
			action.moveToElement(CustomProduct_description).build().perform();
			action.click(CustomProduct_description).build().perform();
			Thread.sleep(5000);
			driver.switchTo().defaultContent();
			driver.switchTo().frame(0);
	        driver.switchTo().frame(driver.findElement(By.xpath("(//iframe)[2]")));
			gen.doubleClick(Productpane_Item1);
			gen.doubleClick(Productpane_Item2);
			action.moveToElement(Productpane_Save).build().perform();
			action.click(Productpane_Save).build().perform();
			driver.switchTo().defaultContent(); 
			driver.switchTo().frame(0);
			driver.switchTo().frame(driver.findElement(By.xpath("//iframe")));
			logger.log(Status.PASS, "Custom Product description added");
			System.out.println("Custom Product description added");
		} catch (Exception e) {
			System.out.println("exception occured" + e);
			logger.log(Status.FAIL, " Exception ocuerd " + e);
		}
	}
	
	//Adding Custom Market description
	public void Market_desc() {
		try {
			action.moveToElement(Market_kebab).build().perform();
			action.click(Market_kebab).build().perform();
			Thread.sleep(2000);
			action.moveToElement(CustomMarket_description).build().perform();
			action.click(CustomMarket_description).build().perform();
			Thread.sleep(5000);
			driver.switchTo().defaultContent();
			driver.switchTo().frame(0);
	        driver.switchTo().frame(driver.findElement(By.xpath("(//iframe)[2]")));
			gen.doubleClick(Productpane_Item1);
			gen.doubleClick(Productpane_Item2);
			Thread.sleep(3000);
			action.moveToElement(Productpane_Save).build().perform();
			action.click(Productpane_Save).build().perform();
			driver.switchTo().defaultContent(); 
			driver.switchTo().frame(0);
			driver.switchTo().frame(driver.findElement(By.xpath("//iframe")));
			logger.log(Status.PASS, "Custom market description added");
			System.out.println("Custom market description added");
		} catch (Exception e) {
			System.out.println("exception occured" + e);
			logger.log(Status.FAIL, " Exception ocuerd " + e);
		}
	}
	//Disabling Product description
		public void disabling_Productdesc() {
			try {
				action.moveToElement(Product_kebab).build().perform();
				action.click(Product_kebab).build().perform();
				Thread.sleep(2000);
				action.moveToElement(CustomProduct_description).build().perform();
				action.click(CustomProduct_description).build().perform();
				Thread.sleep(5000);
				driver.switchTo().defaultContent();
				driver.switchTo().frame(0);
		        driver.switchTo().frame(driver.findElement(By.xpath("(//iframe)[2]")));
		        action.moveToElement(Productpane_delete).build().perform();
//		        action.click(Productpane_delete).build().perform();
		        gen.click(Productpane_delete);
				Thread.sleep(2000);
				action.moveToElement(Productpane_clearAll).build().perform();
				action.click(Productpane_clearAll).build().perform();
				action.moveToElement(Productpane_Save).build().perform();
				action.click(Productpane_Save).build().perform();
				driver.switchTo().defaultContent(); 
				driver.switchTo().frame(0);
				driver.switchTo().frame(driver.findElement(By.xpath("//iframe")));
				logger.log(Status.PASS, "Custom Product description deleted");
				System.out.println("Custom Product description deleted");
			} catch (Exception e) {
				System.out.println("exception occured" + e);
				logger.log(Status.FAIL, " Exception ocuerd " + e);
			}
		}
		
		//Disabling Market description
		public void disabling_Marketdesc() {
			try {
				action.moveToElement(Market_kebab).build().perform();
				action.click(Market_kebab).build().perform();
				Thread.sleep(2000);
				action.moveToElement(CustomMarket_description).build().perform();
				action.click(CustomMarket_description).build().perform();
				Thread.sleep(5000);
				driver.switchTo().defaultContent();
				driver.switchTo().frame(0);
		        driver.switchTo().frame(driver.findElement(By.xpath("(//iframe)[2]")));
		        action.moveToElement(Productpane_delete).build().perform();
				gen.click(Productpane_delete);
				
				Thread.sleep(2000);
				action.moveToElement(Productpane_clearAll).build().perform();
				action.click(Productpane_clearAll).build().perform();
				Thread.sleep(3000);
				action.moveToElement(Productpane_Save).build().perform();
				action.click(Productpane_Save).build().perform();
				driver.switchTo().defaultContent(); 
				driver.switchTo().frame(0);
				driver.switchTo().frame(driver.findElement(By.xpath("//iframe")));
				logger.log(Status.PASS, "Custom market description deleted");
				System.out.println("Custom market description deleted");
			} catch (Exception e) {
				System.out.println("exception occured" + e);
				logger.log(Status.FAIL, " Exception ocuerd " + e);
			}
		}
	
}