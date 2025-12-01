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

public class LayoutPageReg_2M extends BaseMethod {

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
	
	@FindBy(xpath = "//input[@name='limitCount']")
	public WebElement conditionLimitCount;
	

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

	@FindBy(xpath = "(//td[@class='rb-ddz-right rb-ddz-append rb-selection-drop-view rb-selection-drop-tip rb-selection-record'])[2]")
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

	@FindBy(xpath = "(//td[@class='rb-ddz-left rb-ddz-nest-above rb-selection-drop-view rb-selection-drop-tip rb-selection-record'])[4]")
	public WebElement waterfallChart_FloatingColumns1;

	@FindBy(xpath = "(//div[text()='FACTS (Y1-AXIS)']//ancestor::div[@class='x-component x-fit-item x-component-default']//following::table[@class='rb-pane-table rb-h-center'])[6]")
	public WebElement waterfallChart_FactsY1axis1;
	
	@FindBy(xpath = "(//div[text()='FACTS (Y1-AXIS)']//ancestor::div[@class='x-container x-container-default x-layout-fit'])[2]")
	public WebElement waterfallChart_FactsY1axis;
	

	// Waterfall chart kebab
	@FindBy(xpath = "//label[text()='Waterfall Chart-1']/ancestor::div[@class='x-box-inner x-horizontal-box-overflow-body']//div/div[3]/div")
	public WebElement waterfallChartKebab;

	@FindBy(xpath = "(//span[text()='View Full Screen'])")
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
	
	@FindBy(xpath = "//div[@class='x-panel x-fit-item x-window-item x-panel-default']//descendant::table[@class='x-field x-table-plain x-form-item x-field-default x-checkboxgroup-form-item'][2]/tbody/tr/td[2]/label")
	public WebElement NA_Enabled;
	
	@FindBy(xpath = "//span[text()='OK']")
	public WebElement conditionFomatOkBtn;
	
	@FindBy(xpath="(//span[text()=\"OK\"])")
    public WebElement cust_ok_button;
    
    @FindBy(xpath="((//tr[@class='rb-object-editor-table'])[6]//div/div[2]/table)[1]")
    public WebElement Condition_area1;
    
    //@FindBy(xpath="//div[text()='CONDITIONS']//ancestor::td[@class='x-table-layout-cell ']")
    //public WebElement Condition_area;
    
    @FindBy(xpath="//div[text()='CONDITIONS']//ancestor::div[@class='x-container x-container-default x-layout-fit']")
    public WebElement Condition_area;
    
    
    
    
    @FindBy(xpath="//span[@class=\"x-btn-icon-el rb-properties-icon \"]")
    public WebElement report_properties_icon;
    
    @FindBy(xpath="(//input[@class=\"x-form-field x-form-radio x-form-cb\"])[3]")
    public WebElement enable_report_prop;
    
    @FindBy(xpath="//span[@class=\"x-btn-inner x-btn-inner-center\" and text()=\"OK\"]")
    public WebElement ok_button;
    
    @FindBy(xpath = "//td[@class='x-form-item-body rb-ddtext-form-item-body']/div/div")
    public WebElement customExp_PlacingArea1;
	

	public LayoutPageReg_2M() {
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

	// expand & contract
	public void expand_ContractExpression() {
		try {
			action.moveToElement(expressions).build().perform();
			Thread.sleep(2000);
			action.doubleClick(expressions).build().perform();
			// gen.doubleClick(expressions);
		} catch (Exception e) {
			System.out.println("exception occured" + e);
			logger.log(Status.FAIL, " Exception occured " + e);
		}
	}

	public void expand_ContractRank() {
		try {
			gen.doubleClick(rank);
		} catch (Exception e) {
			System.out.println("exception occured" + e);
			logger.log(Status.FAIL, " Exception occured " + e);
		}
	}

	public void expand_ContractPercentile() {
		try {
			gen.doubleClick(percentile);
		} catch (Exception e) {
			System.out.println("exception occured" + e);
			logger.log(Status.FAIL, " Exception occured " + e);
		}
	}

	public void expand_ContractQuantile() {
		try {
			gen.doubleClick(quantile);
		} catch (Exception e) {
			System.out.println("exception occured" + e);
			logger.log(Status.FAIL, " Exception occured " + e);
		}
	}

	public void expand_ContractCondition() {
		try {
			action.moveToElement(conditions).build().perform();
			Thread.sleep(2000);
			action.doubleClick(conditions).build().perform();
//			gen.doubleClick(conditions);
		} catch (Exception e) {
			System.out.println("exception occured" + e);
			logger.log(Status.FAIL, " Exception occured " + e);
		}
	}

	

	public void createCustomExpression() {
		try {
			action.moveToElement(customExpPlusBtn).build().perform();
			action.click(customExpPlusBtn).build().perform();	
			gen.click(customExpNewBtn);
			gen.doubleClick(facts);
			action.moveToElement(factsGroupFolder).build().perform();
            action.doubleClick(factsGroupFolder).build().perform();
            // gen.doubleClick(factsGroupFolder);
            gen.doubleClick(factsGroup);
            gen.doubleClick(factsFolder);
            gen.doubleClick(factsSubFolder);
			gen.clickAndHold_dragAnddrop(factsVal1, customExp_PlacingArea1);
			action.moveToElement(customExp_Addition).build().perform();
			action.click(customExp_Addition).build().perform();
			gen.clickAndHold_dragAnddrop(factsVal2, customExp_PlacingArea1);
			action.moveToElement(customExpOkBtn).build().perform();
			action.click(customExpOkBtn).build().perform();
			gen.doubleClick(facts);

			logger.log(Status.PASS, "Custom Expression is Created");
			System.out.println("Custom Expression is Created");

		} catch (Exception e) {
			System.out.println("exception occured" + e);
			logger.log(Status.FAIL, " Exception occured " + e);
		}
	}

	public void createCustomSets() {
		try {
			gen.doubleClick(setsAndGroups);
			action.moveToElement(customSetPlusBtn).build().perform();
			action.click(customSetPlusBtn).build().perform();

			gen.click(customSetNewBtn);
			gen.doubleClick(facts);
			gen.clickAndHold_dragAnddrop(factsVal1, customSet_PlacingArea);
			action.moveToElement(customSetOkBtn).build().perform();
			action.click(customSetOkBtn).build().perform();
			gen.doubleClick(facts);

			logger.log(Status.PASS, "Custom Sets is Created");
			System.out.println("Custom Sets is Created");

		} catch (Exception e) {
			System.out.println("exception occured" + e);
			logger.log(Status.FAIL, " Exception occured " + e);
		}
	}

	public void createVirtualPromptTable() {
		try {
			action.moveToElement(table_MarketKebab).build().perform();
			action.click(table_MarketKebab).build().perform();

			action.moveToElement(table_MarketProperties).build().perform();
			action.click(table_MarketProperties).build().perform();
			action.moveToElement(table_MarketCustomPrompt).build().perform();
			action.click(table_MarketCustomPrompt).build().perform();
			action.moveToElement(table_MarketPropertiesOkBtn).build().perform();
			action.click(table_MarketPropertiesOkBtn).build().perform();

			logger.log(Status.PASS, "Virtual prompt is Created");
			System.out.println("Virtual prompt is Created");

		} catch (Exception e) {
			System.out.println("exception occured" + e);
			logger.log(Status.FAIL, " Exception occured " + e);
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

	public void addVirtualPromptDsPage() {
		try {

			action.moveToElement(mkt1tab).build().perform();
			action.click(mkt1tab).build().perform();
			Thread.sleep(3000);

			action.moveToElement(mkt1_mktFolder).build().perform();
			action.click(mkt1_mktFolder).build().perform();
			Thread.sleep(3000);
			action.moveToElement(mktShareTab).build().perform();
			action.click(mktShareTab).build().perform();
			Thread.sleep(3000);
			action.moveToElement(mkt1tab).build().perform();
			action.click(mkt1tab).build().perform();
			Thread.sleep(2000);
			gen.doubleClick(mkt1_middlePane_1Item);
			// gen.doubleClick(mkt1_middlePane_2Item);
			// gen.doubleClick(mkt1_middlePane_3Item);
			action.moveToElement(runReport_DsPage).build().perform();
			action.click(runReport_DsPage).build().perform();

			logger.log(Status.PASS, "Virtual prompt added in ds page");
			System.out.println("Virtual prompt added in ds page");

		} catch (Exception e) {
			System.out.println("exception occured" + e);
			logger.log(Status.FAIL, " Exception occured " + e);
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

	// custom exp in vertical bar
	public void addCustomExpVerticalBar() {
		try {
			// gen.doubleClick(facts);
			action.moveToElement(customExp_Facts).build().perform();
			Thread.sleep(2000);
			action.doubleClick(customExp_Facts).build().perform();
			// gen.doubleClick(customExp_Facts);
			gen.clickAndHold_dragAnddrop(customExp_Item1, verticalBar_CategoriesXaxis10);
			logger.log(Status.PASS, "Custom Expression added");
			System.out.println("Custom Expression added");
		} catch (Exception e) {
			System.out.println("exception occured" + e);
			logger.log(Status.FAIL, " Exception ocuerd " + e);
		}
	}

	public void addFixedItemMarket() {
		try {
			action.moveToElement(markets).build().perform();
			gen.doubleClick(markets);
			Thread.sleep(1000);
			action.moveToElement(marketsGroupFolder).build().perform();
			action.doubleClick(marketsGroupFolder).build().perform();
			// gen.doubleClick(factsGroupFolder);
			gen.doubleClick(marketGroup);
			gen.doubleClick(marketsFolder);

			gen.clickAndHold_dragAnddrop(marketsVal1, verticalBar_CategoriesXaxis11);

		} catch (Exception e) {
			System.out.println("exception occured" + e);
			logger.log(Status.FAIL, " Exception occured " + e);
		}
	}

	public void addFixedItemFact() {
		try {
			action.moveToElement(facts).build().perform();
			gen.doubleClick(facts);
			Thread.sleep(1000);
			action.moveToElement(factsGroupFolder).build().perform();
			action.doubleClick(factsGroupFolder).build().perform();
			// gen.doubleClick(factsGroupFolder);
			gen.doubleClick(factsGroup);
			gen.doubleClick(factsFolder);
			gen.doubleClick(factsSubFolder);

			gen.clickAndHold_dragAnddrop(factsVal1, verticalBar_CategoriesXaxis13);

		} catch (Exception e) {
			System.out.println("exception occured" + e);
			logger.log(Status.FAIL, " Exception occured " + e);
		}
	}

	public void addDimensionFolderMarket() {
		try {
			gen.clickAndHold_dragAnddrop(marketsFolder, verticalBar_CategoriesXaxis9);
			gen.doubleClick(markets);
		} catch (Exception e) {
			System.out.println("exception occured" + e);
			logger.log(Status.FAIL, " Exception occured " + e);
		}
	}

	public void addDimensionFolderFact() {
		try {
			gen.clickAndHold_dragAnddrop(factsSubFolder, pageByArea);
			gen.doubleClick(facts);
		} catch (Exception e) {
			System.out.println("exception occured" + e);
			logger.log(Status.FAIL, " Exception occured " + e);
		}
	}

	public void addDataVerticalBar1() {
		try {
			// gen.clickAndHold_dragAnddrop(markets, verticalBar_CategoriesXaxis);
			addFixedItemMarket();
			Thread.sleep(3000);
			System.out.println("Added markets");

			gen.clickAndHold_dragAnddrop(products, verticalBar_CategoriesXaxis12);
			System.out.println("Added products");
			Thread.sleep(3000);

			addDimensionFolderMarket();

			gen.clickAndHold_dragAnddrop(periods, pageByArea);
			Thread.sleep(3000);
			System.out.println("Added periods");

			// gen.clickAndHold_dragAnddrop(facts, pageByArea);
			addFixedItemFact();
			addDimensionFolderFact();
			Thread.sleep(3000);
			System.out.println("Added facts");

			logger.log(Status.PASS, "Data added in Vertical bar");
			System.out.println("Data added in Vertical bar");

		} catch (Exception e) {
			System.out.println("exception occured" + e);
			logger.log(Status.FAIL, " Exception ocuerd " + e);
		}
	}

	public void expandColumn_BlankSpace() {
		try {
			action.moveToElement(table_DragLine).build().perform();
			action.dragAndDropBy(table_DragLine, 432, 198).build().perform();
			Thread.sleep(3000);

		} catch (Exception e) {
			System.out.println("exception occured" + e);
			logger.log(Status.FAIL, " Exception occured " + e);
		}
	}

	// Add smart text
	public void addSmartText() {
		try {
			gen.doubleClick(chartsAndObjects);
			gen.clickAndHold_dragAnddrop(text, blankSpace_text);
			gen.doubleClick(chartsAndObjects);
			action.moveToElement(textKebab).click().build().perform();

			action.moveToElement(smartText).build().perform();
			action.moveToElement(smartText_Des).click().build().perform();
			Thread.sleep(2000);
			action.moveToElement(textKebab).click().build().perform();
			Thread.sleep(2000);
			action.moveToElement(text_ViewFullScreen).click().build().perform();
			gen.doubleClick(facts);
			Thread.sleep(1000);
			action.moveToElement(factsGroupFolder).build().perform();
			action.doubleClick(factsGroupFolder).build().perform();
			// gen.doubleClick(factsGroupFolder);
			gen.doubleClick(factsGroup);
			gen.doubleClick(factsFolder);
			gen.doubleClick(factsSubFolder);

			gen.clickAndHold_dragAnddrop(factsVal1, insertText);
			gen.doubleClick(facts);
			Thread.sleep(2000);
			action.moveToElement(textKebab1).click().build().perform();
			Thread.sleep(2000);
			action.moveToElement(text_ViewMinimizeScreen).click().build().perform();

			Thread.sleep(2000);
			logger.log(Status.PASS, "Smart Text added");
			System.out.println("Smart Text added");

		} catch (Exception e) {
			System.out.println("exception occured" + e);
			logger.log(Status.FAIL, " Exception occured " + e);
		}
	}

// Add vertical bar
	public void addVerticalBar() {
		try {
			System.out.println("Adding chart");
//			gen.doubleClick(chartsAndObjects);
			gen.doubleClick(charts);

			gen.clickAndHold_dragAnddrop(verticalBar, blankSpace_Verticalbar);
			Thread.sleep(2000);
			action.moveToElement(verticalBarKebab).build().perform();
			action.click(verticalBarKebab).build().perform();
			action.moveToElement(verticalBar_ViewFullScreen).build().perform();
			verticalBar_ViewFullScreen.click();
			System.out.println("Added chart");
			gen.doubleClick(charts);
			gen.doubleClick(chartsAndObjects);

			logger.log(Status.PASS, "Vertical bar added");
			System.out.println("Vertical bar added");

		} catch (Exception e) {
			System.out.println("exception occured" + e);
			logger.log(Status.FAIL, " Exception occured " + e);
		}
	}

	public void addDataVerticalBar() {
		try {
			gen.clickAndHold_dragAnddrop(markets, verticalBar_CategoriesXaxis);
			Thread.sleep(3000);
			System.out.println("Added markets");

			gen.clickAndHold_dragAnddrop(products, verticalBar_CategoriesXaxis1);
			System.out.println("Added products");
			Thread.sleep(3000);

			gen.clickAndHold_dragAnddrop(periods, pageByArea);
			Thread.sleep(3000);
			System.out.println("Added periods");

			gen.clickAndHold_dragAnddrop(facts, pageByArea);
			Thread.sleep(3000);
			System.out.println("Added facts");

			logger.log(Status.PASS, "Data added in Vertical bar");
			System.out.println("Data added in Vertical bar");

		} catch (Exception e) {
			System.out.println("exception occured" + e);
			logger.log(Status.FAIL, " Exception ocuerd " + e);
		}
	}

	public void addRankVerticalBar() {
		try {
			gen.clickAndHold_dragAnddrop(rank_Item1, verticalBar_CategoriesXaxis2);

			logger.log(Status.PASS, "Rank added in Vertical bar");
			System.out.println("Rank added in Vertical bar");
		} catch (Exception e) {
			System.out.println("exception occured" + e);
			logger.log(Status.FAIL, " Exception ocuerd " + e);
		}
	}

	public void addPercentileVerticalBar() {
		try {
			gen.clickAndHold_dragAnddrop(percentile_Item1, verticalBar_CategoriesXaxis6);
			logger.log(Status.PASS, "Percentile added");
			System.out.println("Percentile added");
		} catch (Exception e) {
			System.out.println("exception occured" + e);
			logger.log(Status.FAIL, " Exception ocuerd " + e);
		}
	}

	public void addQuantileVerticalBar() {
		try {
			gen.clickAndHold_dragAnddrop(quantile_Item1, verticalBar_CategoriesXaxis7);
			logger.log(Status.PASS, "Quantile added");
			System.out.println("Quantile added");
		} catch (Exception e) {
			System.out.println("exception occured" + e);
			logger.log(Status.FAIL, " Exception ocuerd " + e);
		}
	}

	public void addConditionsVerticalBar() {
		try {
			gen.clickAndHold_dragAnddrop(condition_Item1, conditionBlankSpace_VerticalBar);

			logger.log(Status.PASS, "Condition added in Vertical bar");
			System.out.println("Condition added in Vertical bar");
		} catch (Exception e) {
			System.out.println("exception occured" + e);
			logger.log(Status.FAIL, " Exception ocuerd " + e);
		}
	}

	public void minimize_VerticalBar() {
		try {
			action.moveToElement(verticalBarKebab1).build().perform();
			action.click(verticalBarKebab1).build().perform();
			action.moveToElement(verticalBar_ViewMinimizeScreen).build().perform();
			action.click(verticalBar_ViewMinimizeScreen).build().perform();
		} catch (Exception e) {
			System.out.println("exception occured" + e);
			logger.log(Status.FAIL, " Exception ocuerd " + e);
		}

	}

	// Table

	public void maximize_Minimize_table() {
		try {
			action.moveToElement(table_Kebab).build().perform();
			action.click(table_Kebab).build().perform();
			action.moveToElement(table_ViewFullScreen).build().perform();
			action.click(table_ViewFullScreen).build().perform();
		} catch (Exception e) {
			System.out.println("exception occured" + e);
			logger.log(Status.FAIL, " Exception ocuerd " + e);
		}

	}

	public void addRankTable() {
		try {
			gen.clickAndHold_dragAnddrop(rank_Item1, table_Columns1);

			logger.log(Status.PASS, "Rank added");
			System.out.println("Rank added");
		} catch (Exception e) {
			System.out.println("exception occured" + e);
			logger.log(Status.FAIL, " Exception ocuerd " + e);
		}
	}

	// Percentile
	public void addPercentileTable() {
		try {
			gen.clickAndHold_dragAnddrop(percentile_Item1, table_Columns2);

			logger.log(Status.PASS, "Percentile added");
			System.out.println("Percentile added");
		} catch (Exception e) {
			System.out.println("exception occured" + e);
			logger.log(Status.FAIL, " Exception ocuerd " + e);
		}

	}

	// Quantile
	public void addQuantileTable() {
		try {
			gen.clickAndHold_dragAnddrop(quantile_Item1, table_Columns3);

			logger.log(Status.PASS, "Quantile added");
			System.out.println("Quantile added");
		} catch (Exception e) {
			System.out.println("exception occured" + e);
			logger.log(Status.FAIL, " Exception ocuerd " + e);
		}

	}

	// custom Expression

	public void addCustomExpTable() {
		try {
			//action.moveToElement(table_Kebab).build().perform();
			//action.click(table_Kebab).build().perform();
			//action.moveToElement(table_ViewFullScreen1).build().perform();
			//action.click(table_ViewFullScreen1).build().perform();
			action.moveToElement(customExp_Facts).build().perform();
			Thread.sleep(2000);
			// action.doubleClick(customExp_Facts).build().perform();
			gen.doubleClick(customExp_Facts);
			gen.clickAndHold_dragAnddrop(customExp_Item1, table_Columns7);
			logger.log(Status.PASS, "Custom Expression added");
			System.out.println("Custom Expression added");
		} catch (Exception e) {
			System.out.println("exception occured" + e);
			logger.log(Status.FAIL, " Exception ocuerd " + e);
		}
	}

	// custom sets
	public void addCustomSets() {
		try {
			gen.clickAndHold_dragAnddrop(customSet_Item1, pageByArea);
			action.moveToElement(customGroupOkBtn).build().perform();
			action.click(customGroupOkBtn).build().perform();
//			gen.click(customGroupOkBtn);

			logger.log(Status.PASS, "Custom sets and groups added");
			System.out.println("Custom sets and groups added");
		} catch (Exception e) {
			System.out.println("exception occured" + e);
			logger.log(Status.FAIL, " Exception ocuerd " + e);
		}
	}

	public void addCustomGroups() {
		try {
//			gen.doubleClick(customGroup);
			gen.clickAndHold_dragAnddrop(customGroup_item1, table_Columns6);

			gen.doubleClick(setsAndGroups);

			logger.log(Status.PASS, "Custom sets and groups added");
			System.out.println("Custom sets and groups added");
		} catch (Exception e) {
			System.out.println("exception occured" + e);
			logger.log(Status.FAIL, " Exception ocuerd " + e);
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

	// Adding data in pivot area of table
	public void addDataPivotTable() {
		try {
			System.out.println("Adding markets");
			gen.clickAndHold_dragAnddrop(markets, table_Pivot);
			Thread.sleep(3000);
			System.out.println("Added markets");

			logger.log(Status.PASS, "Data added in pivot");
			System.out.println("Data added in pivot");

		} catch (Exception e) {
			System.out.println("exception occured" + e);
			logger.log(Status.FAIL, " Exception ocuerd " + e);
		}
	}

	// Add waterfall chart
	public void addWaterfallChart() {
		try {
			Thread.sleep(2000);
			action.moveToElement(chartsAndObjects).build().perform();
			//action.doubleClick(chartsAndObjects).build().perform();
			Thread.sleep(2000);
			action.moveToElement(charts).build().perform();
			action.doubleClick(charts).build().perform();

			gen.clickAndHold_dragAnddrop(waterfallChart, blankSpace_Waterfall);
			Thread.sleep(2000);
			action.moveToElement(waterfallChartKebab).click().build().perform();
			Thread.sleep(2000);
			action.moveToElement(waterfallChart_ViewFullScreen).click().build().perform();
			
			System.out.println("Added chart");
			Thread.sleep(3000);
			action.moveToElement(charts).build().perform();
			action.doubleClick(charts).build().perform();
			action.moveToElement(chartsAndObjects).build().perform();
			action.doubleClick(chartsAndObjects).build().perform();

			logger.log(Status.PASS, "Chart added");
			System.out.println("Chart added");

		} catch (Exception e) {
			System.out.println("exception occured" + e);
			logger.log(Status.FAIL, " Exception occured " + e);
		}
	}

	public void addDataWaterfallChart() {
		 try {
	            gen.clickAndHold_dragAnddrop(markets, waterfallChart_EndCategory);
	            Thread.sleep(3000);
	            System.out.println("Added markets");
	           gen.clickAndHold_dragAnddrop(products, waterfallChart_FloatingColumns);
	            System.out.println("Added products");
	            Thread.sleep(3000);
	           gen.clickAndHold_dragAnddrop(periods, waterfallChart_FloatingColumns1);
	            Thread.sleep(3000);
	            System.out.println("Added periods");
	           gen.clickAndHold_dragAnddrop(facts, waterfallChart_FactsY1axis);
	            //gen.clickAndHold_dragAnddrop(facts, waterfallChart_FloatingColumns1);
	            Thread.sleep(3000);
	            System.out.println("Added facts");
	           logger.log(Status.PASS, "Data added");
	            System.out.println("Data added");
	       } catch (Exception e) {
	            System.out.println("exception occured" + e);
	            logger.log(Status.FAIL, " Exception ocuerd " + e);
	        }
	}

	// Minimize waterfall chart
	public void minimize_WaterfallChart() {
		try {
			action.moveToElement(waterfallChartKebab1).click().build().perform();
			action.moveToElement(waterfallChart_ViewMinimizeScreen).click().build().perform();
		} catch (Exception e) {
			System.out.println("exception occured" + e);
			logger.log(Status.FAIL, " Exception ocuerd " + e);
		}

	}

	// Decomposition chart
	public void connectVerticalBar_Table() {
		try {
			action.moveToElement(verticalBarKebab).click().build().perform();
			action.moveToElement(verticalBar_AllProperties).click().build().perform();
			action.moveToElement(verticalBar_ConnectTo).click().build().perform();
			action.moveToElement(verticalBar_ConnectToDropdown).click().build().perform();
			action.moveToElement(verticalBar_ConnectToVal1).doubleClick().build().perform();

			action.moveToElement(verticalBar_ConnectToCloseBtn).click().build().perform();

			logger.log(Status.PASS, "Vertical Bar is connected to Table");
			System.out.println("Vertical Bar is connected to Table");

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
	
	//page container
	
	public void addPageContainer() {
		try {
			action.moveToElement(pageContainer).build().perform();
			action.clickAndHold(pageContainer).build().perform();
			action.moveToElement(blankSpace_text).build().perform();
			action.release(blankSpace_text).build().perform();
			
			logger.log(Status.PASS, "Page container is added");
			System.out.println("Page container is added");
			
			action.moveToElement(table).build().perform();
			action.clickAndHold(table).build().perform();
			action.moveToElement(blankspace_Table).build().perform();
			action.release(blankspace_Table).build().perform();
			
			logger.log(Status.PASS, "Table is added in the page container");
			System.out.println("Table is added in the page container");
			
			action.moveToElement(pgContainerTable_Kebab).click().build().perform();
			action.moveToElement(pgContainerTable_ViewFullScreen).click().build().perform();
			
		} catch (Exception e) {
			System.out.println("exception occured" + e);
			logger.log(Status.FAIL, " Exception occured " + e);
		}		
	}
	
	public void addDataPageContainerTable() {
		try {
			
			action.moveToElement(markets).build().perform();
			action.clickAndHold(markets).build().perform();
			action.moveToElement(pgContainerTable_Rows).build().perform();
			action.release(pgContainerTable_Rows).build().perform();
			Thread.sleep(3000);
			System.out.println("Added markets");

			action.moveToElement(products).build().perform();
			action.clickAndHold(products).build().perform();
			action.moveToElement(pgContainerTable_Rows1).build().perform();
			action.release(pgContainerTable_Rows1).build().perform();
			System.out.println("Added products");
			Thread.sleep(3000);

			action.moveToElement(periods).build().perform();
			action.clickAndHold(periods).build().perform();
			action.moveToElement(pgContainerTable_Columns).build().perform();
			action.release(pgContainerTable_Columns).build().perform();
			Thread.sleep(3000);
			System.out.println("Added periods");

			action.moveToElement(facts).build().perform();
			action.clickAndHold(facts).build().perform();
			action.moveToElement(pgContainerTable_Columns1).build().perform();
			action.release(pgContainerTable_Columns1).build().perform();
			Thread.sleep(3000);
			System.out.println("Added facts");

			logger.log(Status.PASS, "Data added in the table of page container");
			System.out.println("Data added in the table of page container");
			
		}catch (Exception e) {
			System.out.println("exception occured" + e);
			logger.log(Status.FAIL, " Exception occured " + e);
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
	
	
	
	
	//Adding Periods to Page by area
	
	public void addPeriods_OLAP() {
		try {
			
			gen.clickAndHold_dragAnddrop(periods, pageByArea);
			Thread.sleep(3000);
			logger.log(Status.PASS, "Added periods in Pageby area");
			System.out.println("Added periods in Pageby area");
		} catch (Exception e) {
			System.out.println("exception occured" + e);
			logger.log(Status.FAIL, " Exception occured " + e);
		}
	}
	public void addMarkets_OLAP() {
		try {
			
			gen.clickAndHold_dragAnddrop(markets, pageByArea);
			Thread.sleep(3000);
			logger.log(Status.PASS, "Added Markets in Pageby area");
			System.out.println("Added Markets in Pageby area");
		} catch (Exception e) {
			System.out.println("exception occured" + e);
			logger.log(Status.FAIL, " Exception occured " + e);
		}
	}
	
	public void createConditionalFormat() {
		try {
			action.moveToElement(ConditionalFormatPlusBtn).build().perform();
			action.click(ConditionalFormatPlusBtn).build().perform();
			action.moveToElement(conditionalFormatNewBtn).click().build().perform();
			action.moveToElement(conditionalFormat_FactSelection).click().build().perform();
			Thread.sleep(1000);
			action.moveToElement(FactSelection_list1).click().build().perform();
			action.moveToElement(conditionalFormat_OperatorSelection).click().build().perform();
			Thread.sleep(1000);
			action.moveToElement(OperatorSelection_list3).click().build().perform();
			Thread.sleep(2000);
			action.moveToElement(ConditionalFormat_Up).click().build().perform();
			Thread.sleep(1000);
			action.sendKeys(Keys.BACK_SPACE).build().perform();
			action.sendKeys("2").build().perform();
			
			action.moveToElement(conditionalFormat_Add).click().build().perform();
			action.moveToElement(conditionalFormat_FactSelection2).click().build().perform();
			Thread.sleep(1000);
			action.moveToElement(FactSelection2_list2).click().build().perform();
			action.moveToElement(conditionalFormat_OperatorSelection2).click().build().perform();
			Thread.sleep(1000);
			action.moveToElement(OperatorSelection2_list3).click().build().perform();
			action.moveToElement(ConditionalFormat_Up2).click().build().perform();
			Thread.sleep(1000);
			action.sendKeys(Keys.BACK_SPACE).build().perform();
			action.sendKeys("1").build().perform();
			action.moveToElement(conditionalFormatOkBtn).click().build().perform();

			logger.log(Status.PASS, "Conditional Format is Created");
			System.out.println("Conditional Format is Created");

		} catch (Exception e) {
			System.out.println("exception occured" + e);
			logger.log(Status.FAIL, " Exception occured " + e);
		}
	}
	
	//Adding conditional format to Conditional Format table
	public void addConditionalFormat_table() {
		try {
			
			Thread.sleep(3000);
			gen.clickAndHold_dragAnddrop(conditionalFormat1, conditionalFormat_blankSpace);
			logger.log(Status.PASS, "Conditional Format added in Conditional Format table");
			System.out.println("Conditional Format added in Conditional Format table");
		} catch (Exception e) {
			System.out.println("exception occured" + e);
			logger.log(Status.FAIL, " Exception occured " + e);
		}
	}
	
	//NA enabled
	
	public void NA_Enabled() {
		try {
			action.moveToElement(settingsBtn).build().perform();
			action.click(settingsBtn).build().perform();
			Thread.sleep(2000);
			action.moveToElement(NA_Enabled).build().perform();
			action.click(NA_Enabled).build().perform();
			Thread.sleep(2000);
			action.moveToElement(conditionFomatOkBtn).build().perform();
			action.click(conditionFomatOkBtn).build().perform();
			
			logger.log(Status.PASS, "NA  is Enabled");
			System.out.println("NA  is Enabled");

		} catch (Exception e) {
			System.out.println("exception occured" + e);
			logger.log(Status.FAIL, " Exception ocuerd " + e);
			
		}
	}
	
	public void createCondition1() {
        try {
            action.moveToElement(conditionPlusBtn).build().perform();
            action.click(conditionPlusBtn).build().perform();

           action.moveToElement(conditionNewBtn).click().build().perform();
            action.moveToElement(conditionOkBtn).click().build().perform();

           logger.log(Status.PASS, "Condition is Created");
            System.out.println("Condition is Created");

       } catch (Exception e) {
            System.out.println("exception occured" + e);
            logger.log(Status.FAIL, " Exception occured " + e);
        }
    }
	public void createCondition1_10M() {
        try {
            action.moveToElement(conditionPlusBtn).build().perform();
            action.click(conditionPlusBtn).build().perform();

           action.moveToElement(conditionNewBtn).click().build().perform();
           
           Thread.sleep(5000);
           action.moveToElement(conditionLimitCount).build().perform();
           action.doubleClick(conditionLimitCount).build().perform();
           action.sendKeys(Keys.CLEAR).build().perform();
		   action.sendKeys("1000").build().perform();
           
            action.moveToElement(conditionOkBtn).click().build().perform();

           logger.log(Status.PASS, "Condition is Created");
            System.out.println("Condition is Created");

       } catch (Exception e) {
            System.out.println("exception occured" + e);
            logger.log(Status.FAIL, " Exception occured " + e);
        }
    }
	public void addConditionToConditionTable() {
        try {
            gen.clickAndHold_dragAnddrop(condition_Item1, Condition_area1);

           logger.log(Status.PASS, "Condition added in the condition area of table");
            System.out.println("Condition added in the condition area of table");
        } catch (Exception e) {
            System.out.println("exception occured" + e);
            logger.log(Status.FAIL, " Exception ocuerd " + e);
        }
    }
	
	//NA enabled
	  public void report_properties_enable()
	    {
	        try {
	        gen.click(report_properties_icon);
	        Thread.sleep(1000);
	        gen.click(NA_Enabled);
	        Thread.sleep(3000);
	        action.moveToElement(ok_button).build().perform();
	        action.doubleClick(ok_button).build().perform();
	        logger.log(Status.PASS, "NA enable done");
	        System.out.println("NA enable done");
	        }
	        catch(Exception e)
	        {
	            System.out.println("exception occured" + e);
	            logger.log(Status.FAIL, " Exception ocuerd " + e);
	        }
	    }
}
