package com.nielsen.commonMethods;

import java.lang.reflect.Method;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
//import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.nielsen.pageObjectsRegression.DSPageFrenchReg;
import com.nielsen.pageObjectsRegression.DSPageReg;
import com.nielsen.pageObjectsRegression.DSPageRegFun;
import com.nielsen.pageObjectsRegression.DSPageReg_2M;
import com.nielsen.pageObjectsRegression.DSPageReg_ME;
import com.nielsen.pageObjectsRegression.LayoutPageFrenchReg;
import com.nielsen.pageObjectsRegression.LayoutPageReg;
import com.nielsen.pageObjectsRegression.LayoutPageRegFun;
import com.nielsen.pageObjectsRegression.LayoutPageReg_2M;
import com.nielsen.pageObjectsRegression.LayoutPageReg_ME;
import com.nielsen.pageObjectsRegression.Login_LandingPageReg;
import com.nielsen.pageObjectsRegression.ReportPageFrenchReg;
import com.nielsen.pageObjectsRegression.ReportPageReg;
import com.nielsen.pageObjectsRegression.ReportPageReg_2M;
import com.nielsen.pageObjectsRegression.ReportPageReg_ME;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseMethod {

	public static WebDriver driver;
	public static ExtentReports report;
	public static ExtentTest logger;
	public static WebDriverWait wait;
	public static Logger log = Logger.getLogger("BaseClass");
	// public Actions action = new Actions(driver);

	public static GenericFunction gen;

	public static Login_LandingPageReg loginLandingReg;
	public static DSPageReg dsPageReg;
	public static DSPageRegFun dsPageRegFun;
	public static LayoutPageReg layoutPageReg;
	public static LayoutPageRegFun layoutPageRegFun;
	public static ReportPageReg reportPageReg;
	public static DSPageFrenchReg dsPageFrenchReg;
	public static LayoutPageFrenchReg layoutPageFrenchReg;
	public static ReportPageFrenchReg reportPageFrenchReg;
    
	public static DSPageReg_2M dsPageReg2M;
	public static LayoutPageReg_2M layoutPageReg2M;
	public static ReportPageReg_2M reportPageReg2M;
	
	public static DSPageReg_ME dsPageReg_ME;
	public static LayoutPageReg_ME layoutPageReg_ME;
	public static ReportPageReg_ME reportPageReg_ME;
	// public static CommonFunction cf;
	/*
	 * @BeforeSuite(alwaysRun = true) // @Parameters({"portfolioName"}) public void
	 * setup(String portfolioName) throws Exception { //
	 * configFileWriter.setConfigsFileProperty("portfolioName", portfolioName);
	 * ReadConfig.loadConfigFile(); report =
	 * ExtentReportsetup.ExtendReportcreation(); setUpBrowser(); Launchurl(); wait =
	 * new WebDriverWait(driver, 30); }
	 */

	@BeforeSuite(alwaysRun = true)
	public void setup() throws Exception {
		ReadConfig.loadConfigFile();
		report = ExtentReportsetup.ExtendReportcreation();
		setUpBrowser();
		Launchurl();
		wait = new WebDriverWait(driver, Duration.ofSeconds(30));

	}

	@BeforeClass(alwaysRun = true)
	public void Launchurl() {
		driver.get(ReadConfig.readConfigFile("Url"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}

	@BeforeMethod(alwaysRun = true)
	public void InitalizeVarriable(Method method) {
		logger = report.createTest(method.getName());

		gen = new GenericFunction();

		loginLandingReg = new Login_LandingPageReg();
		dsPageReg = new DSPageReg();
		layoutPageReg = new LayoutPageReg();
		reportPageReg = new ReportPageReg();
		dsPageFrenchReg = new DSPageFrenchReg();
		layoutPageFrenchReg = new LayoutPageFrenchReg();
		reportPageFrenchReg = new ReportPageFrenchReg();

	}

	@AfterMethod(alwaysRun = true)
	public void afterMehod() throws Exception {
		report.flush();
	}

	public void setUpBrowser() throws Exception {
		String browser = ReadConfig.readConfigFile("BrowserName");
		switch (browser.trim().toUpperCase()) {
		case "CHROME":
			WebDriverManager.chromedriver().setup();

			// For adding capabilities to ChromeOptions
			ChromeOptions chromeOptions = new ChromeOptions();

			driver = new ChromeDriver(chromeOptions);
			System.out.println("Browser: Chrome browser");
			break;
		case "FIREFOX":
			// WebDriverManager.firefoxdriver().setup();
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\1948942\\eclipse-workspace\\geckodriver-v0.31.0-win64\\geckodriver.exe");
			FirefoxOptions firefoxOptions = new FirefoxOptions();
			firefoxOptions.setCapability("marionette", true);
			driver = new FirefoxDriver(firefoxOptions);
			// driver = new FirefoxDriver();
			System.out.println("Browser: Firefox browser");
			break;
		case "EDGE":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			System.out.println("Browser: Edge browser");
			break;
		default:
			System.out.println(browser
					+ "- Browser is NOT Supported. Please use any of the browser from following for you test execution - Chrome, Edge");
			Assert.assertTrue(false);
		}
		driver.manage().deleteAllCookies();
		// driver.get("edge://settings/clearBrowserData");
		 // driver.findElement(By.xpath("//settings-ui")).sendKeys(Keys.ENTER);
		 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}

	public void cleanUpBrowser() throws InterruptedException {
		driver.close();
	
		Thread.sleep(2000);
		driver.quit();
		Thread.sleep(2000);
	}
}
