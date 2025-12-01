package com.nielsen.pageObjectsRegression;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.aventstack.extentreports.Status;
import com.nielsen.commonMethods.BaseMethod;

public class Login_LandingPageReg extends BaseMethod {

	@FindBy(xpath = "//input[@id='input27']")
	public WebElement userName;

	@FindBy(xpath = "//*[contains(@class,'button-primary')][@type='submit']")
	public WebElement next;

	@FindBy(xpath = "//input[@type='password']")
	public WebElement passwordField;

	@FindBy(xpath = "//input[@class='button button-primary']")
	public WebElement submit;

	@FindBy(xpath = "//a[text()='AD HOC WEB - New Interface']")
	public WebElement adhocweb;

	@FindBy(xpath = "(//div[@class='ngx-ellipsis-inner'])[1]")
	public WebElement build_reports;

	@FindBy(xpath = "(//nd-card[@class='card-container'])[3]")
	public WebElement viewFavourites_Lp;

	@FindBy(xpath = "(//nd-card[@class='card-container'])[2]")
	public WebElement viewSavedReport_Lp;

	@FindBy(xpath = "(//nd-icon[@class='favorite-icon'])[1]")
	public WebElement addToFav_icon;

	@FindBy(xpath = "(//nd-icon[@class='favorite-icon'])[2]")
	public WebElement addToFav_icon1;

	@FindBy(xpath = "//nd-spinner")
	public List<WebElement> spinner;

	@FindBy(xpath = "//table[@class='milonictable']//img[@alt='Language']")
	public WebElement LanguageIcon;

	@FindBy(xpath = "(//div[@class='mmenucontainer'])[5]//tr[@id='pTR35']")
	public WebElement german;

	@FindBy(xpath = "(//div[@class='mmenucontainer'])[5]//tr[@id='pTR45']")
	public WebElement portuguese;

	@FindBy(xpath = "(//div[@class='mmenucontainer'])[8]//tr[@id='pTR69']")
	public WebElement french;

	@FindBy(xpath = "(//div[@class='mmenucontainer'])[5]//tr[@id='pTR47']")
	public WebElement spanish;

	@FindBy(xpath = "(//div[@class='mmenucontainer'])[5]//tr[@id='pTR42']")
	public WebElement norway;

	@FindBy(xpath = "(//div[@class='mmenucontainer'])[5]//tr[@id='pTR23']")
	public WebElement danish;

	@FindBy(xpath = "(//div[@class='mmenucontainer'])[5]//tr[@id='pTR38']")
	public WebElement italy;

	@FindBy(xpath = "(//div[@class='mmenucontainer'])[8]//tr[@id='pTR67']")
	public WebElement english;

	@FindBy(xpath = "//tr[@class='saved-list ng-star-inserted']")
	public WebElement fav_Report1;

	public String dropdown_portfolio = "document.querySelector('#portfolioClientCombobox').shadowRoot.querySelector('#input')";
	public String dropdown_DBLevel1 = "document.querySelector('#dataContextCombobox').shadowRoot.querySelector('#input')";
	public String dropdown_DBLevel2 = "document.querySelector('#dataContextCombobox2').shadowRoot.querySelector('#input')";
	public String fav_popup = "document.querySelector('#gotofavourites').shadowRoot.querySelector('#icon')";
	public String viewFav_savedReport = "document.querySelector('#gotofavourites').shadowRoot.querySelector('#icon')";
	public String savedReport_searchBar = "document.querySelector('#savedsearchInput').shadowRoot.querySelector('#ndInput').shadowRoot.querySelector('#nativeInput')";
	// public String favReport_searchBarSym =
	// "document.querySelector('#favsearchInput').shadowRoot.querySelector('#ndInput').shadowRoot.querySelector('#container').shadowRoot.querySelector('div.input-wrapper')";
	public String favReport_searchBarSym = "document.querySelector('#favsearchInput').shadowRoot.querySelector('#ndInput').shadowRoot.querySelector('#nativeInput')";

	public String savedreport_ItemVerification = "document.querySelector(body > app-root > div > ng-component > app-saved-reports-container > div > mat-sidenav-container > mat-sidenav-content > app-main-menu > div > div.saved-content.ng-star-inserted > app-saved-content > div > table > tbody > tr > td:nth-child(1) > div > span')";
	public String home_Btn = "document.querySelector('#homebutton').shadowRoot.querySelector('#icon')";
	public Actions action = new Actions(driver);
	public String reportName = "AUTOMATION1";
	@FindBy(xpath = "(//table[contains(@class,'saved-table')]//span)[1]")
	public WebElement firstReportFromTable;

	public Login_LandingPageReg() {
		PageFactory.initElements(driver, this);
		this.driver = driver;

	}

	public void ValidateLogincheck(String emailid, String password) throws Exception {
		try {
			gen.dataInsert(userName, emailid);
			gen.click(next);
			gen.dataInsert(passwordField, password);
			gen.click(submit);

		} catch (Exception e) {
			e.printStackTrace();
			logger.log(Status.FAIL, " Exception occured on login in to application " + e);
		}
	}

	public void Validate_Landingpage_Mousehovering() {
		try {

			Thread.sleep(3000);
			gen.waitForElement(adhocweb);
			// moving to the element
			// ((JavascriptExecutor)
			// driver).executeScript("arguments[0].scrollIntoView(true);", ele);
			// actions.moveToElement(ele).build().perform();

			gen.click(adhocweb);

			logger.log(Status.PASS, "Clicked on adhocweb page");
			System.out.println("Clicked on adhocweb page");

		} catch (Exception e) {
			System.out.println(" Exception ocuerd " + e);
			logger.log(Status.FAIL, " Exception ocuerd " + e);
		}
	}

	public void changeLanguage(String language) {
		try {
			//gen.ValidateTitle("Nielsen Answers");
			action.moveToElement(LanguageIcon).click().build().perform();

			switch (language) {
			case "German":
				action.moveToElement(german).click().build().perform();

				Thread.sleep(30000);
				System.out.println("Language changed to German");
				logger.log(Status.INFO, "Language changed to German");
				break;

			case "Portuguese":
				action.moveToElement(portuguese).click().build().perform();

				Thread.sleep(30000);
				System.out.println("Language changed to Portuguese");
				logger.log(Status.INFO, "Language changed to Portuguese");
				break;

			case "French":
				action.moveToElement(french).click().build().perform();

				Thread.sleep(30000);
				System.out.println("Language changed to French");
				logger.log(Status.INFO, "Language changed to French");
				break;

			case "Spanish":
				action.moveToElement(spanish).click().build().perform();

				Thread.sleep(30000);
				System.out.println("Language changed to Spanish");
				logger.log(Status.INFO, "Language changed to Spanish");
				break;

			case "Danish":
				action.moveToElement(danish).click().build().perform();

				Thread.sleep(30000);
				System.out.println("Language changed to Danish");
				logger.log(Status.INFO, "Language changed to Danish");
				break;

			case "Norway":
				action.moveToElement(norway).click().build().perform();

				Thread.sleep(30000);
				System.out.println("Language changed to Norway");
				logger.log(Status.INFO, "Language changed to Norway");
				break;

			case "Italy":
				action.moveToElement(italy).click().build().perform();

				Thread.sleep(30000);
				System.out.println("Language changed to Italy");
				logger.log(Status.INFO, "Language changed to Italy");
				break;

			case "English":
				action.moveToElement(english).click().build().perform();

				Thread.sleep(30000);
				System.out.println("Language changed to English");
				logger.log(Status.INFO, "Language changed to English");
				break;

			default:
				System.out.println("Language not found");
				logger.log(Status.INFO, "Language not found");
			}

		} catch (Exception e) {
			System.out.println("exception occured");
			logger.log(Status.FAIL, " Click Language exception" + e);
		}
	}

	public void Validate_Portfolio_Selections(String portfolioName, String dbLevel1, String dbLevel2) throws Throwable {
		try {
			driver.switchTo().frame(0);
			Thread.sleep(5000);
			WebElement dropdownPortfolio = gen.expandRootElement(dropdown_portfolio);
			dropdownPortfolio.click();
			Thread.sleep(2000);
			logger.log(Status.PASS, "Clicked on dropdown portfolio");
			dropdownPortfolio.clear();
			Thread.sleep(1000);
			dropdownPortfolio.click();
			Thread.sleep(1000);
			action.sendKeys(portfolioName).build().perform();
			action.sendKeys(Keys.ENTER).build().perform();
//			action.sendKeys(Keys.ENTER).build().perform();
			logger.log(Status.PASS, "Portfolio selection is done");
			System.out.println("Portfolio selection is done");
			try {
				wait.until(ExpectedConditions.invisibilityOfAllElements(spinner));
			} catch (Exception e) {

			}

			Thread.sleep(2000);
			WebElement db1 = gen.expandRootElement(dropdown_DBLevel1);
			db1.click();
			Thread.sleep(1000);
			logger.log(Status.PASS, "Clicked on dropdown portfolio");
			db1.clear();
			Thread.sleep(1000);
			db1.click();
			Thread.sleep(1000);
			action.sendKeys(dbLevel1).build().perform();
			action.sendKeys(Keys.ENTER).build().perform();
			logger.log(Status.PASS, "DB Level1 selection is done");
			System.out.println("DB Level1 selection is done");
			try {
				wait.until(ExpectedConditions.invisibilityOfAllElements(spinner));
			} catch (Exception e) {

			}

			Thread.sleep(2000);
			WebElement db2 = gen.expandRootElement(dropdown_DBLevel2);
			db2.click();
			Thread.sleep(1000);
			logger.log(Status.PASS, "Clicked on dropdown portfolio");
			db2.clear();
			Thread.sleep(1000);
			db2.click();
			Thread.sleep(1000);
			action.sendKeys(dbLevel2).build().perform();
			action.sendKeys(Keys.ENTER).build().perform();
			logger.log(Status.PASS, "DB Level2 selection is done");
			System.out.println("DB Level2 selection is done");
			try {
				wait.until(ExpectedConditions.invisibilityOfAllElements(spinner));
			} catch (Exception e) {

			}
		}

		catch (Exception e) {
			logger.log(Status.FAIL, " Exception ocuerd " + e);
		}
	}

	public void build_Reports() {
		try {
			build_reports.click();
			logger.log(Status.PASS, "Build report is Clicked");
			System.out.println("Build report is Clicked");
			gen.Get_Childwindow();
		} catch (Exception e) {
			logger.log(Status.FAIL, " Exception ocuerd " + e);
		}
	}

	public void view_FavouriteReports() {
		try {
			Actions action = new Actions(driver);
			action.moveToElement(viewFavourites_Lp).build().perform();
			gen.click(viewFavourites_Lp);
			Thread.sleep(1000);
			System.out.println("Viewed Favourite Report");
			logger.log(Status.PASS, "View favourite reports clicked");
		} catch (Exception e) {
			logger.log(Status.FAIL, " Exception ocuerd " + e);
		}
	}

	public void viewSavedReports(String reportName) {
		try {

			gen.click(viewSavedReport_Lp);
			Thread.sleep(1000);
			WebElement searchBar_savedReport = gen.expandRootElement(savedReport_searchBar);

			gen.click(searchBar_savedReport);
			action.sendKeys(reportName).build().perform();
			action.sendKeys(Keys.ENTER).build().perform();

			Thread.sleep(3000);

			try {
				WebElement searchedFirstReportFromTable = firstReportFromTable;

				if (searchedFirstReportFromTable.getText().trim().equals(reportName)) {
					logger.log(Status.PASS, "Saved Report is available in Saved report List");
					System.out.println("Saved Report is available in Saved report List");
				} else {
					logger.log(Status.FAIL, "Saved Report is not available in Saved report List");
					System.out.println("Saved Report is not available in Saved report List");
				}
			} catch (Exception e) {
				logger.log(Status.FAIL, " Exception ocuerd, expected record " + reportName);
			}
           gen.click(firstReportFromTable);
           
			System.out.println("Saved Report Verified");
			logger.log(Status.PASS, "Saved Report Verified");
			Thread.sleep(5000);

		} catch (Exception e) {
			logger.log(Status.FAIL, " Exception ocuerd " + e);
		}
	}
	public void viewSavedReports1(String reportName) {
		try {

			gen.click(viewSavedReport_Lp);
			Thread.sleep(1000);
			WebElement searchBar_savedReport = gen.expandRootElement(savedReport_searchBar);

			gen.click(searchBar_savedReport);
			action.sendKeys(Keys.BACK_SPACE).build().perform();
			action.sendKeys(reportName).build().perform();
			action.sendKeys(Keys.ENTER).build().perform();

			Thread.sleep(3000);

			try {
				WebElement searchedFirstReportFromTable = firstReportFromTable;

				if (searchedFirstReportFromTable.getText().trim().equals(reportName)) {
					logger.log(Status.PASS, "Saved Report is available in Saved report List");
					System.out.println("Saved Report is available in Saved report List");
				} else {
					logger.log(Status.FAIL, "Saved Report is not available in Saved report List");
					System.out.println("Saved Report is not available in Saved report List");
				}
			} catch (Exception e) {
				logger.log(Status.FAIL, " Exception ocuerd, expected record " + reportName);
			}
			  gen.click(firstReportFromTable);
			System.out.println("Saved Report Verified");
			logger.log(Status.PASS, "Saved Report Verified");
			Thread.sleep(5000);

		} catch (Exception e) {
			logger.log(Status.FAIL, " Exception ocuerd " + e);
		}
	}
	public void addToFavouriteReports(String reportName) {
		try {
			Thread.sleep(2000);
			gen.waitForElement(addToFav_icon);
			action.moveToElement(addToFav_icon).click().build().perform();

			Thread.sleep(3000);
			System.out.println("Added to favourites");
			logger.log(Status.PASS, "Added to favourites");

			WebElement viewFav_Btn = gen.expandRootElement(fav_popup);
			gen.waitForElement(viewFav_Btn);
			action.moveToElement(viewFav_Btn).click().build().perform();

			Thread.sleep(3000);
			WebElement searchBar_favReport = gen.expandRootElement(favReport_searchBarSym);
			gen.waitForElement(searchBar_favReport);
			action.moveToElement(searchBar_favReport).click().build().perform();
			action.sendKeys(Keys.ENTER).build().perform();
			gen.waitForElement(fav_Report1);
			action.moveToElement(fav_Report1).build().perform();
			gen.click(fav_Report1);
			
			System.out.println("Favourite Report Verified");
			logger.log(Status.PASS, "Favourite Report Verified");
			Thread.sleep(5000);

		} catch (Exception e) {
			logger.log(Status.FAIL, " Exception ocuerd " + e);
		}
	}

	public void moveToHomePage() {
		try {
			Actions action = new Actions(driver);
			// driver.switchTo().frame(0);
			WebElement homeButton = gen.expandRootElement(home_Btn);
			action.moveToElement(homeButton).build().perform();
			gen.click(homeButton);
			Thread.sleep(1000);
			System.out.println("Home page displayed");
			logger.log(Status.PASS, "Home page displayed");
		} catch (Exception e) {
			logger.log(Status.FAIL, " Exception ocuerd " + e);
		}
	}

}
