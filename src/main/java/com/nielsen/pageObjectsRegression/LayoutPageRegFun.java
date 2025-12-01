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

public class LayoutPageRegFun extends BaseMethod {

	public Actions action = new Actions(driver);

	@FindBy(xpath = "//span[text()='Hierarchies']")
	public WebElement Hierarchiesleftpanel;

	@FindBy(xpath = "(//span[text()='Hierarchies']/ancestor::tr/following-sibling::tr)[1]")
	public WebElement allHierarchies;

	@FindBy(xpath = "//div[text()='ROWS']//ancestor::td[@class='x-table-layout-cell ']")
	public WebElement Rowstable;

	@FindBy(xpath = "//span[text()='Characteristics']")
	public WebElement characteristisleftpanel;

	@FindBy(xpath = "(//span[text()='Characteristics']/ancestor::tr/following-sibling::tr)[1]")
	public WebElement countryallCharacteristics;

	@FindBy(xpath = "//div[text()='CHARACTERISTICS']//ancestor::td[@class='x-table-layout-cell ']")
	public WebElement characteristitable;

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

	@FindBy(xpath = "//div[@class='x-tree-view x-fit-item x-tree-view-draggable x-unselectable']/table/tbody/tr[3]/td[2]")
	public WebElement markets_Characteristics;

	@FindBy(xpath = "//div[@class='x-tree-view x-fit-item x-tree-view-draggable x-unselectable']/table/tbody/tr[4]/td[2]")
	public WebElement mktChar_All;

	@FindBy(xpath = "//div[@class='x-tree-view x-fit-item x-tree-view-draggable x-unselectable']/table/tbody/tr[6]/td[2]")
	public WebElement mktChar_All2;

	@FindBy(xpath = "//span[text()='Products']")
	public WebElement products;

	@FindBy(xpath = "//div[@class='x-tree-view x-fit-item x-tree-view-draggable x-unselectable']/table/tbody/tr[4]/td[2]")
	public WebElement Products_Characteristics;

	@FindBy(xpath = "//div[@class='x-tree-view x-fit-item x-tree-view-draggable x-unselectable']/table/tbody/tr[5]/td[2]")
	public WebElement Products_Characteristics2;

	@FindBy(xpath = "//div[@class='x-tree-view x-fit-item x-tree-view-draggable x-unselectable']/table/tbody/tr[4]/td[2]")
	public WebElement Products_Sum;

	@FindBy(xpath = "//div[@class='x-tree-view x-fit-item x-tree-view-draggable x-unselectable']/table/tbody/tr[5]/td[2]")
	public WebElement ProdChar_All;
	

	@FindBy(xpath = "//div[@class='x-tree-view x-fit-item x-tree-view-draggable x-unselectable']/table/tbody/tr[6]/td[2]")
	public WebElement ProdChar_All1;

	@FindBy(xpath = "//div[@class='x-tree-view x-fit-item x-tree-view-draggable x-unselectable']/table/tbody/tr[7]/td[2]")
	public WebElement ProdChar_All2;

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

	// Custom Expressions
	@FindBy(xpath = "//span[text()='Custom Expressions']")
	public WebElement custom_Expressions;

	@FindBy(xpath = "(//span[text()='Facts'])[2]")
	public WebElement custom_Expressions_Facts;

	@FindBy(xpath = "(//span[text()='Facts'])[2]//following::tr[1]")
	public WebElement custom_Facts1;

	@FindBy(xpath = "//span[text()='Custom Expressions']/following::td[1]")
	public WebElement custom_Expressions_Add;

	@FindBy(xpath = "//span[text()='New']")
	public WebElement custom_Expressions_New;

	@FindBy(xpath = "(//div[@class='x-trigger-index-0 x-form-trigger x-form-arrow-trigger x-form-trigger-first'])[1]")
	public WebElement custom_ExpressionsBuilder_DropDown;

	@FindBy(xpath = "//li[text()='Markets']")
	public WebElement custom_ExpressionsBuilder_Markets;

	@FindBy(xpath = "//li[text()='Products']")
	public WebElement custom_ExpressionsBuilder_Products;

	@FindBy(xpath = "//li[text()='Periods']]")
	public WebElement custom_ExpressionsBuilder_Periods;

	@FindBy(xpath = "//li[text()='Facts']")
	public WebElement custom_ExpressionsBuilder_Facts;

	@FindBy(xpath = "//div[@class='x-btn-wrap x-btn-split x-btn-split-right']")
	public WebElement insertPromptButton;

	@FindBy(xpath = "(//div[@class='x-box-inner x-vertical-box-overflow-body'])[2]")
	public WebElement insertPrompt;

	@FindBy(xpath = "(//div[@class='x-btn x-unselectable x-box-item x-toolbar-item x-btn-custombtn-small x-icon x-btn-icon x-btn-custombtn-small-icon'])[1]")
	public WebElement operatorPlus;

	@FindBy(xpath = "(//div[@class='x-btn x-unselectable x-box-item x-toolbar-item x-btn-custombtn-small x-icon x-btn-icon x-btn-custombtn-small-icon'])[2]")
	public WebElement operatorMinus;

	@FindBy(xpath = "(//div[@class='x-btn x-unselectable x-box-item x-toolbar-item x-btn-custombtn-small x-icon x-btn-icon x-btn-custombtn-small-icon'])[3]")
	public WebElement operatorMultiple;

	@FindBy(xpath = "(//div[@class='x-btn x-unselectable x-box-item x-toolbar-item x-btn-custombtn-small x-icon x-btn-icon x-btn-custombtn-small-icon'])[4]")
	public WebElement operatorDivide;

	@FindBy(xpath = "(//div[@class='x-btn x-unselectable x-box-item x-toolbar-item x-btn-custombtn-small x-icon x-btn-icon x-btn-custombtn-small-icon'])[5]")
	public WebElement operator_OpenBracket;

	@FindBy(xpath = "(//div[@class='x-btn x-unselectable x-box-item x-toolbar-item x-btn-custombtn-small x-icon x-btn-icon x-btn-custombtn-small-icon'])[6]")
	public WebElement operator_CloseBracket;

	@FindBy(xpath = "//div[@class='rb-ddtext-dz']")
	public WebElement customExpressionTexteditor;

	@FindBy(xpath = "//span[text()='OK']")
	public WebElement customExpressionOK;

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

	@FindBy(xpath = "//div[@class='x-container x-box-item x-container-awaf-grey-gradient x-layout-fit']//table//tr[4]")
	public WebElement pageByArea2;

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

	@FindBy(xpath = "//div[text()='CHARACTERISTICS']//ancestor::td[@class='x-table-layout-cell ']")
	public WebElement table_Characteristics;

	@FindBy(xpath = "//div[text()='CHARACTERISTICS']//ancestor::td[@class='x-table-layout-cell ']/descendant::table/tbody/tr[1]/td[1]")
	public WebElement table_Characteristics1;

	@FindBy(xpath = "//div[text()='COLUMNS']//following::td[@class='rb-ddz-right rb-ddz-append rb-selection-drop-view rb-selection-drop-tip rb-selection-record'][2]")
	public WebElement table_Columns_Facts;

	// Add Conditions in Columns of table
	@FindBy(xpath = "(//td[@class='rb-ddz-bottom rb-ddz-nest-below rb-selection-drop-view rb-selection-drop-tip rb-selection-record'])[6]")
	public WebElement table_Columns4;

	// Add Conditions in rows of table
	@FindBy(xpath = "(//td[@class='rb-ddz-right rb-ddz-nest-below rb-selection-drop-view rb-selection-drop-tip rb-selection-record'])[6]")
	public WebElement table_Rows;

	@FindBy(xpath = "//div[text()='ROWS']//ancestor::td//table/tbody/tr[1]/td[1]")
	public WebElement rows_Characteristics;

	@FindBy(xpath = "//div[text()='ROWS']//ancestor::td//table/tbody/tr[1]/td[7]")
	public WebElement rows_Characteristics1;
	
	@FindBy(xpath = "(//div[text()='ROWS']//ancestor::td//button[@class='rb-selection-menu-btn'])[2]")
	public WebElement table_rows_products;
	
	
	@FindBy(xpath = "//span[text()='Remove from Layout']")
	public WebElement remove_ProductsFromRow;
	

	// Add custom expression in table
	@FindBy(xpath = "(//td[@class='rb-ddz-right rb-ddz-append rb-selection-drop-view rb-selection-drop-tip rb-selection-record'])[11]")
	public WebElement table_Columns5;

	// add custom grp
	@FindBy(xpath = "(//td[@class='rb-ddz-right rb-ddz-append rb-selection-drop-view rb-selection-drop-tip rb-selection-record'])[9]")
	public WebElement table_Columns6;

	// pivot area
	@FindBy(xpath = "(//div[text()='PIVOT']//ancestor::div[@class='x-container x-container-default x-layout-fit'])[4]")
	public WebElement table_Pivot;

	// Table kebab
	@FindBy(xpath = "//div[@id='button-1086']")
	public WebElement table_Kebab;

	@FindBy(xpath = "(//span[text()='View Full Screen'])[4]")
	public WebElement table_ViewFullScreen;

	@FindBy(xpath = "(//span[text()='View Full Screen'])[2]")
	public WebElement table_ViewFullScreen1;

	// list mode
	@FindBy(xpath = "(//input[@class='x-form-field x-form-radio x-form-cb'])[2]")
	public WebElement list_Mode;

	@FindBy(xpath = "(//div[@class='x-btn x-unselectable x-box-item x-btn-default-small x-noicon x-btn-noicon x-btn-default-small-noicon'])[6]")
	public WebElement list_Mode_Continue_Btn;

	// Check Align in List Mode
	@FindBy(xpath = "//label[contains(text(),'Align')]")
	public WebElement list_Mode_Align;

	@FindBy(xpath = "//label[contains(text(),'Merge Rows')]")
	public WebElement list_Mode_MergeRows;

	@FindBy(xpath = "//label[contains(text(),'Merge Columns')]")
	public WebElement list_Mode_MergeColumns;

	@FindBy(xpath = "//label[contains(text(),'Sub Total')]")
	public WebElement list_Mode_SubTotal;

	@FindBy(xpath = "//label[contains(text(),'Grand Total')]")
	public WebElement list_Mode_GrandTotal;

	@FindBy(xpath = "//label[contains(text(),'Show Totals')]")
	public WebElement list_Mode_ShowTotals;

	// show totals
	@FindBy(xpath = "(//td[@class='x-form-item-body x-form-cb-wrap'])[18]")
	public WebElement showTotals;

	// sub total and grand total
	@FindBy(xpath = "(//td[@class='x-form-item-body x-form-cb-wrap'])[20]")
	public WebElement subTotal;

	@FindBy(xpath = "(//td[@class='x-form-item-body x-form-cb-wrap'])[21]")
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

	// pagecontainer
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

	// ---------- Note - Check xpaths

	@FindBy(xpath = "(//table[@class='rb-pane-table rb-h-center'])[11]")
	public WebElement pgContainerTable_Rows;

	@FindBy(xpath = "(//td[@class='rb-ddz-left rb-ddz-nest-above rb-selection-drop-view rb-selection-drop-tip rb-selection-record'])[3]")
	public WebElement pgContainerTable_Rows1;

	@FindBy(xpath = "(//table[@class='rb-pane-table rb-h-center'])[10]")
	public WebElement pgContainerTable_Columns;

	@FindBy(xpath = "(//td[@class='rb-ddz-bottom rb-ddz-nest-below rb-selection-drop-view rb-selection-drop-tip rb-selection-record'])[4]")
	public WebElement pgContainerTable_Columns1;

	// ----------

	@FindBy(xpath = "(//label[text()='Table-2']/ancestor::div[@class='x-box-inner x-horizontal-box-overflow-body']//div/div[3]/div)[2]")
	public WebElement pgContainerTable_Kebab1;

	@FindBy(xpath = "//label[text()='Table-2']//following::div[@class='x-menu-item-icon minimizeScreenIconCls ']")
	public WebElement pgContainerTable_ViewMinimizeScreen;

	@FindBy(xpath = "//span[@class='x-btn-icon-el rb-properties-icon ']")
	public WebElement reportProperties_Setting;

	@FindBy(xpath = "//label[text()='Enabled']")
	public WebElement na_Enabled;

	@FindBy(xpath = "//div[@class='x-panel x-fit-item x-window-item x-panel-default']//span[@class='x-btn-icon-el  ']")
	public WebElement reportProperties_OK;

	public LayoutPageRegFun() {
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

	// verify the report is getting rendered with Align option selected
	public void validate_ListMode_WithAlign() {
		try {
			action.moveToElement(table_Kebab).build().perform();
			action.click(table_Kebab).build().perform();
			Thread.sleep(5000);
			action.moveToElement(list_Mode).build().perform();
			action.click(list_Mode).build().perform();
			Thread.sleep(2000);
//			action.moveToElement(list_Mode_Continue_Btn).build().perform();
//			action.click(list_Mode_Continue_Btn).build().perform();
//			Thread.sleep(2000);
//			action.moveToElement(table_Kebab).build().perform();
//			action.click(table_Kebab).build().perform();
			Thread.sleep(1000);
//			String s = "x-field x-table-plain x-form-item x-box-item x-field-default x-vbox-form-item x-form-cb-checked x-form-dirty";
//			action.moveToElement(list_Mode_Align).build().perform();
//			if (list_Mode_Align.getAttribute("class").equalsIgnoreCase(s)) {
//				System.out.println("Align option Already Checked");
//			} else {
//				action.click(list_Mode_Align).build().perform();
//				System.out.println("Align option Checked");
//			}

			logger.log(Status.PASS, "Report changed to List Mode");
			System.out.println("Report changed to List Mode");
			Thread.sleep(2000);
			WebElement layout_header = driver.findElement(By.xpath("//div[@class='x-lbl-TITLE']"));
			action.moveToElement(layout_header).build().perform();
			action.click(layout_header).build().perform();
			Thread.sleep(2000);
		} catch (Exception e) {
			System.out.println("exception occured" + e);
			logger.log(Status.FAIL, " Exception ocuerd " + e);
		}
	}

	public void run_Report() {
		try {

			WebElement runReport = driver.findElement(By.xpath("//span[text()='RUN REPORT']"));
			Thread.sleep(5000);
			wait.until(ExpectedConditions.elementToBeClickable(runReport));
			if (runReport.isDisplayed()) {
				log.info("Run botton is displayed");
				action.moveToElement(runReport).build().perform();
				Thread.sleep(5000);
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

	// Single Characteristics selection in Characteristics DZ
	public void addProdSingle_Characterstics() {
		try {

			gen.doubleClick(products);
			Thread.sleep(3000);
			action.moveToElement(Products_Characteristics).build().perform();
			gen.click(Products_Characteristics);
			gen.doubleClick(Products_Characteristics);
			Thread.sleep(3000);
			gen.clickAndHold_dragAnddrop(ProdChar_All, table_Characteristics);
			Thread.sleep(2000);
			logger.log(Status.PASS, "Product Single Characteristics added in Characteristics table");
			System.out.println("Product Single Characteristics added in Characteristics table");
		} catch (Exception e) {
			System.out.println("exception occured" + e);
			logger.log(Status.FAIL, " Exception occured " + e);
		}
	}

	// Multiple Characteristics selection from Different Dimension in Row DZ
	public void multipleCharacteristics_Diff_Dim_RowDZ() {
		try {

			action.moveToElement(markets).build().perform();
			gen.doubleClick(markets);
			Thread.sleep(3000);
			action.moveToElement(markets_Characteristics).build().perform();
			gen.click(markets_Characteristics);
			gen.doubleClick(markets_Characteristics);
			Thread.sleep(3000);
			gen.clickAndHold_dragAnddrop(mktChar_All, rows_Characteristics);
			Thread.sleep(2000);
			gen.click(markets_Characteristics);
			gen.doubleClick(markets_Characteristics);
			gen.doubleClick(markets);
			Thread.sleep(2000);
			gen.doubleClick(products);
			Thread.sleep(3000);
			action.moveToElement(Products_Characteristics).build().perform();
			gen.click(Products_Characteristics);
			gen.doubleClick(Products_Characteristics);
			Thread.sleep(3000);
			gen.clickAndHold_dragAnddrop(ProdChar_All, rows_Characteristics1);
			Thread.sleep(2000);
			logger.log(Status.PASS, "Product Single Characteristics added in Characteristics table");
			System.out.println("Product Single Characteristics added in Characteristics table");
		} catch (Exception e) {
			System.out.println("exception occured" + e);
			logger.log(Status.FAIL, " Exception occured " + e);
		}
	}

	// Verify Characteristics selections can be nested in Characteristics DZ
	public void multipleCharacteristics_Diff_Dim() {
		try {

			action.moveToElement(markets).build().perform();
			gen.doubleClick(markets);
			Thread.sleep(3000);
			action.moveToElement(markets_Characteristics).build().perform();
			gen.click(markets_Characteristics);
			gen.doubleClick(markets_Characteristics);
			Thread.sleep(3000);
			gen.clickAndHold_dragAnddrop(mktChar_All, table_Characteristics);
			Thread.sleep(2000);
			gen.click(markets_Characteristics);
			gen.doubleClick(markets_Characteristics);
			gen.doubleClick(markets);
			Thread.sleep(2000);
			gen.doubleClick(products);
			Thread.sleep(3000);
			action.moveToElement(Products_Characteristics).build().perform();
			gen.click(Products_Characteristics);
			gen.doubleClick(Products_Characteristics);
			Thread.sleep(3000);
			gen.clickAndHold_dragAnddrop(ProdChar_All, table_Characteristics1);
			Thread.sleep(2000);
			logger.log(Status.PASS, "Multiple Characteristics from different Dimension added in Characteristics table");
			System.out.println("Multiple Characteristics from different Dimension added in Characteristics table");
		} catch (Exception e) {
			System.out.println("exception occured" + e);
			logger.log(Status.FAIL, " Exception occured " + e);
		}
	}

	// Multiple Product Characteristics Folder selections in Characteristics
	// Dropzone and Period & Market Prompt in OLAP
	public void productCharDz_Period_Market_OLAP() {
		try {

			action.moveToElement(products).build().perform();
			gen.click(products);
			gen.doubleClick(products);
			Thread.sleep(3000);
			action.moveToElement(Products_Characteristics).build().perform();
			gen.click(Products_Characteristics);
			gen.doubleClick(Products_Characteristics);
			Thread.sleep(3000);
			gen.clickAndHold_dragAnddrop(ProdChar_All, table_Characteristics1);
			Thread.sleep(2000);
			action.moveToElement(markets).build().perform();
			gen.click(markets);
			gen.clickAndHold_dragAnddrop(markets, pageByArea);
			Thread.sleep(2000);
			action.moveToElement(periods).build().perform();
			gen.click(periods);
			gen.clickAndHold_dragAnddrop(periods, pageByArea2);

			logger.log(Status.PASS, "Product Single Characteristics added in Characteristics table");
			System.out.println("Product Single Characteristics added in Characteristics table");
		} catch (Exception e) {
			System.out.println("exception occured" + e);
			logger.log(Status.FAIL, " Exception occured " + e);
		}
	}

	// Market & Period Prompt in OLAP
	public void market_Period_OLAP() {
		try {

			action.moveToElement(markets).build().perform();
			gen.click(markets);
			gen.clickAndHold_dragAnddrop(markets, pageByArea);
			Thread.sleep(2000);
			action.moveToElement(periods).build().perform();
			gen.click(periods);
			gen.clickAndHold_dragAnddrop(periods, pageByArea2);

			logger.log(Status.PASS, "Market & Period Prompt added in OLAP");
			System.out.println("Market & Period Prompt added in OLAP");
		} catch (Exception e) {
			System.out.println("exception occured" + e);
			logger.log(Status.FAIL, " Exception occured " + e);
		}
	}

	// fact & Period Prompt in OLAP
	public void fact_Period_OLAP() {
		try {

			action.moveToElement(facts).build().perform();
			gen.click(facts);
			gen.clickAndHold_dragAnddrop(facts, pageByArea);
			Thread.sleep(2000);
			action.moveToElement(periods).build().perform();
			gen.click(periods);
			gen.clickAndHold_dragAnddrop(periods, pageByArea2);

			logger.log(Status.PASS, "Market & Period Prompt added in OLAP");
			System.out.println("Market & Period Prompt added in OLAP");
		} catch (Exception e) {
			System.out.println("exception occured" + e);
			logger.log(Status.FAIL, " Exception occured " + e);
		}
	}

	// without Align and Merge
	public void validate_ListMode_WithoutAlign() {
		try {
			action.moveToElement(table_Kebab).build().perform();
			action.click(table_Kebab).build().perform();
			Thread.sleep(5000);
			action.moveToElement(list_Mode).build().perform();
			action.click(list_Mode).build().perform();
			Thread.sleep(2000);

			action.moveToElement(list_Mode_Align).build().perform();
			action.click(list_Mode_Align).build().perform();
			Thread.sleep(2000);
			action.moveToElement(list_Mode_MergeRows).build().perform();
			action.click(list_Mode_MergeRows).build().perform();

			logger.log(Status.PASS, "Report changed to List Mode & without Align and Merge");
			System.out.println("Report changed to List Mode & without Align and Merge");
			Thread.sleep(2000);
			WebElement layout_header = driver.findElement(By.xpath("//div[@class='x-lbl-TITLE']"));
			action.moveToElement(layout_header).build().perform();
			action.click(layout_header).build().perform();
			Thread.sleep(2000);
		} catch (Exception e) {
			System.out.println("exception occured" + e);
			logger.log(Status.FAIL, " Exception ocuerd " + e);
		}
	}

	// without Align and Merge
	public void withoutAlign_withoutMerge() {
		try {
			action.moveToElement(table_Kebab).build().perform();
			action.click(table_Kebab).build().perform();
			Thread.sleep(5000);
//				action.moveToElement(list_Mode).build().perform();
//				action.click(list_Mode).build().perform();
//				Thread.sleep(2000);

			action.moveToElement(list_Mode_MergeRows).build().perform();
			action.click(list_Mode_MergeRows).build().perform();
			Thread.sleep(2000);
			action.moveToElement(list_Mode_MergeColumns).build().perform();
			action.click(list_Mode_MergeColumns).build().perform();
			Thread.sleep(2000);
			action.moveToElement(list_Mode_Align).build().perform();
			action.click(list_Mode_Align).build().perform();
			Thread.sleep(2000);

			action.moveToElement(chartsAndObjects).build().perform();
			action.click(chartsAndObjects).build().perform();
			Thread.sleep(1000);

			logger.log(Status.PASS, "Report changed to List Mode & without Align and Merge");
			System.out.println("Report changed to List Mode & without Align and Merge");

			Thread.sleep(2000);
		} catch (Exception e) {
			System.out.println("exception occured" + e);
			logger.log(Status.FAIL, " Exception ocuerd " + e);
		}
	}

	// without Align and with Sub Total and Grand Total
	public void validate_ListMode_WithoutAlign_WithTotal() {
		try {
			action.moveToElement(table_Kebab).build().perform();
			action.click(table_Kebab).build().perform();
			Thread.sleep(5000);
			action.moveToElement(list_Mode).build().perform();
			action.click(list_Mode).build().perform();
			Thread.sleep(2000);

			action.moveToElement(list_Mode_Align).build().perform();
			action.click(list_Mode_Align).build().perform();
			Thread.sleep(2000);
			action.moveToElement(list_Mode_MergeRows).build().perform();
			action.click(list_Mode_MergeRows).build().perform();
			Thread.sleep(2000);
			action.moveToElement(list_Mode_SubTotal).build().perform();
			action.click(list_Mode_SubTotal).build().perform();
			Thread.sleep(2000);
			action.moveToElement(list_Mode_GrandTotal).build().perform();
			action.click(list_Mode_GrandTotal).build().perform();
			Thread.sleep(2000);

			logger.log(Status.PASS, "Report changed to List Mode & without Align and with Sub Total and Grand Total");
			System.out.println("Report changed to List Mode & without Align and with Sub Total and Grand Total");
			Thread.sleep(2000);
			WebElement layout_header = driver.findElement(By.xpath("//div[@class='x-lbl-TITLE']"));
			action.moveToElement(layout_header).build().perform();
			action.click(layout_header).build().perform();
			Thread.sleep(2000);
		} catch (Exception e) {
			System.out.println("exception occured" + e);
			logger.log(Status.FAIL, " Exception ocuerd " + e);
		}
	}

	// Characteristics selection in Characteristics DZ and NA's Enabled
	public void Single_Characterstics_NAEnabled() {
		try {

			action.moveToElement(reportProperties_Setting).build().perform();
			gen.click(reportProperties_Setting);
			Thread.sleep(3000);
			action.moveToElement(na_Enabled).build().perform();
			gen.click(na_Enabled);
			Thread.sleep(3000);
			action.moveToElement(reportProperties_OK).build().perform();
			gen.click(reportProperties_OK);
			Thread.sleep(3000);
			logger.log(Status.PASS, "Report Properties NA's Enabled");
			System.out.println("Report Properties NA's Enabled");
			action.moveToElement(products).build().perform();
			gen.click(products);
			gen.doubleClick(products);
			Thread.sleep(3000);
			action.moveToElement(Products_Characteristics).build().perform();
			gen.click(Products_Characteristics);
			gen.doubleClick(Products_Characteristics);
			Thread.sleep(3000);
			gen.clickAndHold_dragAnddrop(ProdChar_All, table_Characteristics);
			Thread.sleep(2000);
			logger.log(Status.PASS, "Product Single Characteristics added in Characteristics table and NA's Enabled");
			System.out.println("Product Single Characteristics added in Characteristics table and NA's Enabled");
		} catch (Exception e) {
			System.out.println("exception occured" + e);
			logger.log(Status.FAIL, " Exception occured " + e);
		}
	}

	// all operators applied in custom expression builder

	public void customExpressionBuilder_AllOperators() {
		try {

			action.moveToElement(expressions).build().perform();
			gen.click(expressions);
			gen.doubleClick(expressions);
			Thread.sleep(3000);
			action.moveToElement(custom_Expressions).build().perform();
			gen.click(custom_Expressions);
			gen.doubleClick(custom_Expressions);
			Thread.sleep(3000);
			action.moveToElement(custom_Expressions_Add).build().perform();
			gen.click(custom_Expressions_Add);
			gen.doubleClick(custom_Expressions_Add);
			Thread.sleep(3000);
			action.moveToElement(custom_Expressions_New).build().perform();
			gen.click(custom_Expressions_New);
			gen.doubleClick(custom_Expressions_New);
			Thread.sleep(3000);
			action.moveToElement(customExpressionTexteditor).build().perform();
			gen.click(customExpressionTexteditor);
			action.moveToElement(operator_OpenBracket).build().perform();
			gen.click(operator_OpenBracket);
			customExpressionTexteditor.sendKeys("0");
			gen.click(operatorPlus);
			customExpressionTexteditor.sendKeys("1");
			gen.click(operator_CloseBracket);
			gen.click(operatorDivide);
			customExpressionTexteditor.sendKeys("1");
			gen.click(operatorMultiple);
			customExpressionTexteditor.sendKeys("1");
			gen.click(operatorMinus);
			customExpressionTexteditor.sendKeys("1");
			gen.click(operatorPlus);
			Thread.sleep(3000);
			action.moveToElement(custom_ExpressionsBuilder_DropDown).build().perform();
			gen.click(custom_ExpressionsBuilder_DropDown);
			action.moveToElement(custom_ExpressionsBuilder_Markets).build().perform();
			gen.click(custom_ExpressionsBuilder_Markets);

			action.moveToElement(insertPromptButton).build().perform();
			gen.click(insertPromptButton);
			action.moveToElement(insertPrompt).build().perform();
			gen.click(insertPrompt);
			Thread.sleep(3000);
			action.moveToElement(customExpressionOK).build().perform();
			gen.click(customExpressionOK);
			Thread.sleep(2000);

			logger.log(Status.PASS, "Successfully operators applied in custom expression builder");
			System.out.println("Successfully operators applied in custom expression builder");
		} catch (Exception e) {
			System.out.println("exception occured" + e);
			logger.log(Status.FAIL, " Exception occured " + e);
		}
	}

	// all operators applied in custom expression builder

	public void customExpressionBuilder_AllOperators_Fact() {
		try {

			action.moveToElement(expressions).build().perform();
			gen.click(expressions);
			gen.doubleClick(expressions);
			Thread.sleep(3000);
			action.moveToElement(custom_Expressions).build().perform();
			gen.click(custom_Expressions);
			gen.doubleClick(custom_Expressions);
			Thread.sleep(3000);
			action.moveToElement(custom_Expressions_Add).build().perform();
			gen.click(custom_Expressions_Add);
			gen.doubleClick(custom_Expressions_Add);
			Thread.sleep(3000);
			action.moveToElement(custom_Expressions_New).build().perform();
			gen.click(custom_Expressions_New);
			gen.doubleClick(custom_Expressions_New);
			Thread.sleep(3000);
			action.moveToElement(customExpressionTexteditor).build().perform();
			gen.click(customExpressionTexteditor);
			action.moveToElement(operator_OpenBracket).build().perform();
			Thread.sleep(2000);
			gen.click(operator_OpenBracket);
			Thread.sleep(2000);
			customExpressionTexteditor.sendKeys("0");
			Thread.sleep(2000);
			gen.click(operatorPlus);
			Thread.sleep(2000);
			customExpressionTexteditor.sendKeys("1");
			Thread.sleep(2000);
			gen.click(operator_CloseBracket);
			Thread.sleep(2000);
			gen.click(operatorDivide);
			Thread.sleep(2000);
			customExpressionTexteditor.sendKeys("1");
			Thread.sleep(2000);
			gen.click(operatorMultiple);
			Thread.sleep(2000);
			customExpressionTexteditor.sendKeys("1");
			Thread.sleep(2000);
			gen.click(operatorMinus);
			Thread.sleep(2000);
			customExpressionTexteditor.sendKeys("1");
			Thread.sleep(2000);
			gen.click(operatorPlus);
			Thread.sleep(3000);
			action.moveToElement(facts).build().perform();
			gen.click(facts);
			gen.doubleClick(facts);
			Thread.sleep(2000);
			action.moveToElement(factsGroupFolder).build().perform();
			gen.click(factsGroupFolder);
			gen.doubleClick(factsGroupFolder);
			action.moveToElement(factsGroup).build().perform();
			gen.click(factsGroup);
			gen.doubleClick(factsGroup);
			action.moveToElement(factsFolder).build().perform();
			gen.click(factsFolder);
			gen.doubleClick(factsFolder);
			action.moveToElement(factsSubFolder).build().perform();
			gen.click(factsSubFolder);
			gen.doubleClick(factsSubFolder);
			Thread.sleep(3000);
			gen.clickAndHold_dragAnddrop(factsVal1, customExpressionTexteditor);
			Thread.sleep(2000);

			action.moveToElement(customExpressionOK).build().perform();
			gen.click(customExpressionOK);
			Thread.sleep(2000);

			action.moveToElement(custom_Expressions_Facts).build().perform();
			gen.click(custom_Expressions_Facts);
			gen.doubleClick(custom_Expressions_Facts);
			action.moveToElement(custom_Facts1).build().perform();
			gen.click(custom_Facts1);
			Thread.sleep(3000);
			gen.clickAndHold_dragAnddrop(custom_Facts1, table_Columns_Facts);
			Thread.sleep(2000);

			logger.log(Status.PASS, "Successfully operators applied in custom expression builder");
			System.out.println("Successfully operators applied in custom expression builder");
		} catch (Exception e) {
			System.out.println("exception occured" + e);
			logger.log(Status.FAIL, " Exception occured " + e);
		}
	}

	// group by combine should be used in expression builder
	public void customExpressionBuilder_groupByCombine() {
		try {

			action.moveToElement(expressions).build().perform();
			gen.click(expressions);
			gen.doubleClick(expressions);
			Thread.sleep(3000);
			action.moveToElement(custom_Expressions).build().perform();
			gen.click(custom_Expressions);
			gen.doubleClick(custom_Expressions);
			Thread.sleep(3000);
			action.moveToElement(custom_Expressions_Add).build().perform();
			gen.click(custom_Expressions_Add);
			gen.doubleClick(custom_Expressions_Add);
			Thread.sleep(3000);
			action.moveToElement(custom_Expressions_New).build().perform();
			gen.click(custom_Expressions_New);
			gen.doubleClick(custom_Expressions_New);

			Thread.sleep(3000);
			action.moveToElement(custom_ExpressionsBuilder_DropDown).build().perform();
			gen.click(custom_ExpressionsBuilder_DropDown);
			Thread.sleep(3000);
			action.moveToElement(custom_ExpressionsBuilder_Markets).build().perform();
			gen.click(custom_ExpressionsBuilder_Markets);
			Thread.sleep(3000);
			action.moveToElement(insertPromptButton).build().perform();
			gen.click(insertPromptButton);
			action.moveToElement(insertPrompt).build().perform();
			gen.click(insertPrompt);
			Thread.sleep(3000);
			action.moveToElement(customExpressionOK).build().perform();
			gen.click(customExpressionOK);
			Thread.sleep(2000);

			logger.log(Status.PASS, "Successfully  added groupby combine custom expression builder");
			System.out.println("Successfully  added groupby combine custom expression builder");
		} catch (Exception e) {
			System.out.println("exception occured" + e);
			logger.log(Status.FAIL, " Exception occured " + e);
		}
	}

	// Multiple SUM(Characteristics) Selection and Multiple Characteristics
	// Selection for Product as Fixed Item in Row and Characteristics Selections for
	// Product as Fixed Item in Characteristics DZ
	public void productMultipleSumCharselection() {
		try {
			gen.doubleClick(products);
			Thread.sleep(3000);
			action.moveToElement(Products_Sum).build().perform();
			gen.click(Products_Sum);
			Thread.sleep(3000);
//			gen.clickAndHold_dragAnddrop(Products_Sum, rows_Characteristics);
//			Thread.sleep(2000);
//			action.moveToElement(Products_Sum).build().perform();
//			gen.doubleClick(Products_Sum);
			action.moveToElement(Products_Characteristics2).build().perform();
			gen.click(Products_Characteristics2);
			gen.doubleClick(Products_Characteristics2);
			Thread.sleep(3000);
			gen.clickAndHold_dragAnddrop(ProdChar_All1, table_Characteristics);
			Thread.sleep(2000);
			logger.log(Status.PASS,
					"Product Multiple SUM(Characteristics) and Multiple Characteristics added in Row and Characteristics DZ");
			System.out.println(
					"Product Multiple SUM(Characteristics) and Multiple Characteristics added in Row and Characteristics DZ");
		} catch (Exception e) {
			System.out.println("exception occured" + e);
			logger.log(Status.FAIL, " Exception occured " + e);
		}
	}
	
	public void productMultipleSumCharselection1() {
		try {
			
			action.moveToElement(table_rows_products).build().perform();
			gen.click(table_rows_products);
			Thread.sleep(3000);
			action.moveToElement(remove_ProductsFromRow).build().perform();
			gen.click(remove_ProductsFromRow);
			
			gen.doubleClick(products);
			Thread.sleep(3000);
			action.moveToElement(Products_Sum).build().perform();
			gen.click(Products_Sum);
			Thread.sleep(3000);
			gen.clickAndHold_dragAnddrop(Products_Sum, rows_Characteristics);
			Thread.sleep(2000);
//			action.moveToElement(Products_Sum).build().perform();
//			gen.doubleClick(Products_Sum);
			
			Thread.sleep(2000);
			logger.log(Status.PASS,
					"Product Multiple SUM(Characteristics) and Multiple Characteristics added in Row and Characteristics DZ");
			System.out.println(
					"Product Multiple SUM(Characteristics) and Multiple Characteristics added in Row and Characteristics DZ");
		} catch (Exception e) {
			System.out.println("exception occured" + e);
			logger.log(Status.FAIL, " Exception occured " + e);
		}
	}

	// Adding Product characteristics folders to characteristics DZ

	public void addProdCharacterstics_All() {
		try {

			gen.doubleClick(products);
			Thread.sleep(2000);
			gen.click(Products_Characteristics);
			gen.doubleClick(Products_Characteristics);
			Thread.sleep(2000);
			gen.clickAndHold_dragAnddrop(ProdChar_All, table_Characteristics);
			Thread.sleep(3000);
			gen.clickAndHold_dragAnddrop(ProdChar_All2, table_Characteristics1);
			Thread.sleep(2000);
			action.moveToElement(products).build().perform();
			gen.doubleClick(products);
			Thread.sleep(2000);
			logger.log(Status.PASS, "Product Characteristics All folder added in Characteristics table");
			System.out.println("Product Characteristics All folder added in Characteristics table");
		} catch (Exception e) {
			System.out.println("exception occured" + e);
			logger.log(Status.FAIL, " Exception occured " + e);
		}
	}

	// Adding Market characteristics folders to characteristics DZ
	public void addMktCharacterstics_All() {
		try {

			gen.doubleClick(markets);
			Thread.sleep(2000);
			gen.click(markets_Characteristics);
			gen.doubleClick(markets_Characteristics);
			Thread.sleep(2000);
			gen.clickAndHold_dragAnddrop(mktChar_All, table_Characteristics);
			Thread.sleep(3000);
			gen.clickAndHold_dragAnddrop(mktChar_All2, table_Characteristics1);
			Thread.sleep(2000);
			action.moveToElement(markets).build().perform();
			gen.doubleClick(markets);
			Thread.sleep(2000);
			logger.log(Status.PASS, "Market Characteristics All folder added in Characteristics table");
			System.out.println("Market Characteristics All folder added in Characteristics table");
		} catch (Exception e) {
			System.out.println("exception occured" + e);
			logger.log(Status.FAIL, " Exception occured " + e);
		}
	}

	// enable Show Total
	public void enable_ShowTotal() {
		try {

			action.moveToElement(table_Kebab).build().perform();
			Thread.sleep(1000);
			gen.click(table_Kebab);
			Thread.sleep(4000);
			action.moveToElement(list_Mode_ShowTotals).build().perform();
			gen.click(list_Mode_ShowTotals);
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

	public void enable_SubTotal_GrandTotal() {
		try {
			action.moveToElement(table_Kebab).click().build().perform();
			Thread.sleep(1000);
			action.moveToElement(list_Mode_SubTotal).build().perform();
			action.click(list_Mode_SubTotal).build().perform();
			Thread.sleep(2000);
			action.moveToElement(list_Mode_GrandTotal).build().perform();
			action.click(list_Mode_GrandTotal).build().perform();
			Thread.sleep(2000);

			action.click(chartsAndObjects).build().perform();
			logger.log(Status.PASS, "SubTotal and GrandTotal enabled");
			System.out.println("SubTotal and GrandTotal enabled");

			action.moveToElement(chartsAndObjects).build().perform();
			action.click(chartsAndObjects).build().perform();
			Thread.sleep(1000);

		} catch (Exception e) {
			System.out.println("exception occured" + e);
			logger.log(Status.FAIL, " Exception ocuerd " + e);
		}
	}

	public void Add_producthierarchiesInrows() {
		try {
			//gen.doubleClick(products);
			Thread.sleep(2000);
			// action.doubleClick(characteristisleftpanel).build().perform();
			// gen.doubleClick(characteristisleftpanel);
			action.moveToElement(Hierarchiesleftpanel).build().perform();
			action.doubleClick(Hierarchiesleftpanel).build().perform();
			Thread.sleep(3000);
			gen.clickAndHold_dragAnddrop(allHierarchies, Rowstable);
			logger.log(Status.PASS, "produt Hierarchies  Data added in row");
			System.out.println("produt Hierarchies  Data added in row");

		} catch (Exception e) {
			System.out.println("exception occured" + e);
			logger.log(Status.FAIL, " Exception ocuerd " + e);
		}

	}

	public void Add_productcharacteristis() {
		try {
			gen.doubleClick(products);
			Thread.sleep(2000);
			// action.doubleClick(characteristisleftpanel).build().perform();
			// gen.doubleClick(characteristisleftpanel);
			action.moveToElement(characteristisleftpanel).build().perform();
			action.doubleClick(characteristisleftpanel).build().perform();
			Thread.sleep(3000);
			gen.clickAndHold_dragAnddrop(countryallCharacteristics, characteristitable);
			logger.log(Status.PASS, "produt Data added in charecteristics box");
			System.out.println("product Data added in charecteristics box");
		} catch (Exception e) {
			System.out.println("exception occured" + e);
			logger.log(Status.FAIL, " Exception ocuerd " + e);
		}
	}

}
