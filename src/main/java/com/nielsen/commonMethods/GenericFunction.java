package com.nielsen.commonMethods;

import java.io.File;
import java.io.IOException;
import java.math.BigInteger;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.aventstack.extentreports.Status;

public class GenericFunction extends BaseMethod {

	String path = System.getProperty("user.dir");

	public void dataInsert(WebElement tcObject, String tcData) {
		try {
			wait.until(ExpectedConditions.visibilityOf(tcObject));
			String eleType = tcObject.getAttribute("type");
			System.out.println("Type is " + eleType);
			if (eleType != null) {
				if (eleType.equalsIgnoreCase("text") || eleType.equalsIgnoreCase("password")) {

					try {
						tcObject.click();
						tcObject.clear();
						tcObject.sendKeys(tcData);
						if (eleType.equalsIgnoreCase("password")) {
							logger.log(Status.PASS, "Password is inserted in the textbox ");

						} else {
							logger.log(Status.PASS, tcData + " is inserted in the textbox ");
						}
					} catch (Exception e) {
						e.printStackTrace();
						logger.log(Status.FAIL, "Step failed due to the exception occured as " + e);
					}

				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void ValidateData(WebElement tcObject, String tcData) throws Exception {

		wait.until(ExpectedConditions.visibilityOfAllElements(tcObject));
		String var = tcObject.getText().trim();
		if (var.equalsIgnoreCase(tcData)) {
			System.out.println("tcObject value is " + var);
			try {
				Assert.assertEquals(var, tcData);
				log.info("testdata is equal to the " + tcObject.getText());
			} catch (Exception e) {
				e.printStackTrace();
				logger.log(Status.FAIL, "step failed due to the exception occured as " + e);
			}
		} else {
			String var1 = tcObject.getAttribute("value").trim();
			System.out.println("tcObject value is " + var1);
			try {
				Assert.assertEquals(var1, tcData);
				logger.log(Status.INFO, tcData + " is equal to the " + var1);
			} catch (Exception e) {
				e.printStackTrace();
				logger.log(Status.FAIL, "step failed due to the exception occured as " + e);
			}
		}

	}

	public void ValidateTitle(String tcData) {
		String actualTitle = driver.getTitle();

		try {
			Assert.assertEquals(actualTitle, tcData);
			logger.log(Status.INFO, "Actual title and Expected tiles are equal");
		} catch (Exception e) {
			e.printStackTrace();
			logger.log(Status.FAIL, "step failed due to the exception occured as " + e);
		}

	}

	public void takeSucesssnapshot(String methodName) {
		Date date = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
		File Source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(Source,
					new File("Screenshot\\Pass\\screenshot_" + methodName + "_" + dateFormat.format(date) + ".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			logger.log(Status.FAIL, "step failed due to the exception occured as " + e);
		}

	}

	public List<String> getDropDownValuesAsList(WebElement element) {

		Select sel = new Select(element);

		List<WebElement> dropDown_Values = sel.getOptions();
		List<String> actaulValues = new ArrayList<String>();

		for (WebElement ref : dropDown_Values) {
			actaulValues.add(ref.getText());
		}
		return actaulValues;
	}

	public void selectDropDownValues(WebElement element, String value) throws Exception {

		Select sel = new Select(element);
		try {
			sel.selectByVisibleText(value);
		} catch (Exception e) {
			throw new Exception(value + " is not present in the dropdown for the WebElement: " + element);
		}
	}

	public void selectRadioButton(List<WebElement> element, String value) {

		for (WebElement ele : element) {
			if (ele.getText().equalsIgnoreCase(value)) {
				ele.click();
				logger.log(Status.INFO, " Able to click on the radio button " + ele.getText());
				break;
			}
		}
	}

	public void selectCheckBox(List<WebElement> element, String checkboxvalue) {

		try {
			String[] checkBoxArray = checkboxvalue.split(",");
			for (String str : checkBoxArray) {
				for (WebElement ele : element) {
					String Value = ele.getText().trim();
					if (Value.equalsIgnoreCase(str)) {
						((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", ele);
						ele.click();
						logger.log(Status.PASS, " Able to click on the element " + Value);
						break;
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			logger.log(Status.FAIL, "Not Able to click on the element ");
		}

	}

	public void DropDownValues_withoutSelect(List<WebElement> element, String value) throws Exception {

		for (WebElement ele : element) {
			if (ele.getText().equalsIgnoreCase(value) && value != null) {
				Thread.sleep(500);
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", ele);
				wait.until(ExpectedConditions.visibilityOf(ele));
				ele.click();
				// logger.log(Status.INFO," Able to click on the checkbox "+ele.getText());
				System.out.println("dropdown value is selected");
				// ele.sendKeys(Keys.ENTER);
				break;
			}
		}
	}

	public void Get_Childwindow() {
		try {
			String parent = driver.getWindowHandle();
			// Set<String> allWindowHandles = driver.getWindowHandles();
			Set<String> allWindows = driver.getWindowHandles();
			for (String child : allWindows) {
				if (!parent.equals(child)) {
					// driver.switchTo().window(child);
					// driver.switchTo().window(parent);
					// driver.close();
					driver.switchTo().window(child);
					logger.log(Status.PASS, "Switched to another tab");
					log.info("Switched to another tab");
				}
			}

		} catch (Exception e) {
			logger.log(Status.FAIL, " Exception ocuerd while opening the report in new tab " + e);
		}

	}

	public void Get_Parentwindow() {
		try {
			String parent = driver.getWindowHandle();
			// Set<String> allWindowHandles = driver.getWindowHandles();
			Set<String> allWindows = driver.getWindowHandles();
			for (String child : allWindows) {
				if (!parent.equals(child)) {
					// driver.switchTo().window(child);
					driver.switchTo().window(child);
					// driver.close();

					logger.log(Status.PASS, "Switched to another tab");
					log.info("Switched to another tab");
				}
			}

		} catch (Exception e) {
			logger.log(Status.FAIL, " Exception ocuerd while opening the report in new tab " + e);
		}

	}

	public void Get_Parentwindow_CloseCurrentWindow() {
		try {
			String currentWindow = driver.getWindowHandle();

			Set<String> allWindows = driver.getWindowHandles();
			for (String child : allWindows) {
				if (!currentWindow.equals(child)) {
					driver.switchTo().window(child);
					driver.switchTo().window(currentWindow);
					//driver.switchTo().window(child);

					driver.close();
					driver.switchTo().window(child);
					logger.log(Status.PASS, "Switched to another tab");
					log.info("Switched to another tab");
				}
			}
		} catch (Exception e) {
			logger.log(Status.FAIL, " Exception ocuerd while opening the report in new tab " + e);
		}

	}
	
	public void Get_Parentwindow_CloseCurrentWindow1() {
		try {
			String currentWindow = driver.getWindowHandle();

			Set<String> allWindows = driver.getWindowHandles();
			for (String child : allWindows) {
				if (!currentWindow.equals(child)) {
					//driver.switchTo().window(child);
					driver.switchTo().window(currentWindow);
					driver.switchTo().window(child);

					driver.close();
					driver.switchTo().window(currentWindow);
					logger.log(Status.PASS, "Switched to another tab");
					log.info("Switched to another tab");
				}
			}
		} catch (Exception e) {
			logger.log(Status.FAIL, " Exception ocuerd while opening the report in new tab " + e);
		}

	}


	public WebElement expandRootElement(String element) throws Exception {

		WebElement ele = null;
		try {
			Thread.sleep(5000);
			ele = (WebElement) ((JavascriptExecutor) driver).executeScript("return " + element);
		} catch (Exception e) {
			e.printStackTrace();
			logger.log(Status.FAIL, " Not able to find the shadow root element " + element);
		}
		return ele;
	}

	@SuppressWarnings("unchecked")
	public List<WebElement> getShadowWebElementList(String jsPath) {
		return (List<WebElement>) getFromJSExecutor(driver, jsPath);
	}

	public List<WebElement> getAppsList(String appsList) {
		return getShadowWebElementList(appsList);
	}

	public void Launch_ApphomePage(String appsList, String appName) {
		List<WebElement> appLists = getAppsList(appsList);
		for (WebElement app : appLists) {
			if (app.getText().trim().equalsIgnoreCase(appName)) {
				app.click();
				logger.log(Status.INFO, " Able to click on the App " + appName);
				break;
			}
		}
	}

	public Object getFromJSExecutor(WebDriver driver, String script) {
		try {
			JavascriptExecutor je = ((JavascriptExecutor) driver);

			String executeScript = "let jsLocator;" + "try{" + "jsLocator=" + script + ";" + "}catch(e){"
					+ "jsLocator='JS Locator Not Found';" + "}" + "return jsLocator;";

			boolean checkPageLoad = false, checkElementNotNull = false, checkElementLoad = false;
			int counter = 0, pageLoadTimeOut = 30, explicitWaitTimeOut = 30;

			while (counter < pageLoadTimeOut) {
				Thread.sleep(1000);
				if (je.executeScript("return document.readyState").toString().equals("complete")) {
					checkPageLoad = true;
					break;
				}
				counter++;
			}
			if (!checkPageLoad)

				counter = 0;
			while (counter < explicitWaitTimeOut && checkPageLoad) {
				Thread.sleep(1000);
				if (je.executeScript(executeScript) != null) {
					checkElementNotNull = true;
					break;
				}
				counter++;
			}
			if (checkPageLoad && !checkElementNotNull)

				counter = 0;
			while (counter < explicitWaitTimeOut && checkElementNotNull) {
				Thread.sleep(1000);
				if (!je.executeScript(executeScript).toString().equals("JS Locator Not Found")) {
					checkElementLoad = true;
					break;
				}
				counter++;
			}
			if (checkPageLoad && checkElementNotNull && checkElementLoad)
				return je.executeScript(executeScript);
			else
				return null;

		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}

	public void Switch_to_Frame(WebElement element) {
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(element));
	}

	public void Switch_back_frame() {

	}

	public void Select_Date(WebElement element, String Date) {
		wait.until(ExpectedConditions.visibilityOf(element));
		((JavascriptExecutor) driver).executeScript("arguments[0].setAttribute('Value','" + Date + "');", element);

	}

	public void Validate_Checkbox_Values(List<WebElement> element, String value) {
		String[] checkBoxArray = value.split(",");
		for (String str : checkBoxArray) {
			for (WebElement ele : element) {
				if (ele.getText().equalsIgnoreCase(str)) {
					if (ele.getAttribute("checked").equalsIgnoreCase("true")) {
						Assert.assertEquals(ele.getText(), str);
						logger.log(Status.INFO, " Checkbox is checked for application name " + ele.getText());
						System.out.println(ele.getText() + " is selected");
						break;
					} else {
						System.out.println("Checkbox for All apps values are not selected");
					}
				}
			}
		}
	}

	public void validate_List_of_Elements(List<WebElement> element, String value) {
		int count = 0;
		try {
			String[] checkBoxArray = value.trim().split(",");
			int arraylength = checkBoxArray.length;
			for (String str : checkBoxArray) {
				for (WebElement ele : element) {
					System.out.println(ele.getText());
					if (ele.getText().trim().equalsIgnoreCase(str)) {
						count = count + 1;
						break;
					}
				}
			}
			if (count == arraylength) {
				logger.log(Status.PASS, " List of elements are displayed as per the user expection");
				log.info("All template names are displayed");
			} else {
				logger.log(Status.FAIL, " List of elements are not displayed as per the user expection");
			}

		} catch (Exception e) {
			e.printStackTrace();
			logger.log(Status.FAIL, "step failed due to the exception occured as " + e);
			logger.log(Status.FAIL, "Expected values in the application are not same as user provided list");
		}
	}

	public void Validate_Element_Available(WebElement element) {

		try {
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
			element.isDisplayed();
			element.click();
			logger.log(Status.INFO, element.getText() + " is clicked ");
		} catch (Exception e) {
			e.printStackTrace();
			logger.log(Status.FAIL, " Element is not clicked  ");
		}
	}

	public boolean Validate_Element_Available(WebElement element, String testdata) {
		boolean Flag = false;
		try {
			if (element.getText().equalsIgnoreCase(testdata)) {
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
				element.isDisplayed();
				Flag = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
			logger.log(Status.INFO, testdata + " is not displayed");
			System.out.println("Element is not displayed due to exception " + e);
		}
		return Flag;
	}

	public boolean Validate_Boolean_Element_Available(WebElement element) {
		boolean Flag = false;
		try {
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
			Flag = element.isDisplayed();
		} catch (Exception e) {
			// e.printStackTrace();
			// logger.log(Status.INFO,"Searching element is not displayed");
		}
		return Flag;
	}

	public void Validate_Element_NotAvailable(WebElement element, String testdata) {
		try {
			if (!(element.getText().equalsIgnoreCase(testdata))) {
				boolean Flag = !(element.isDisplayed());
				logger.log(Status.INFO, testdata + " is not displayed ");
			}
		} catch (Exception e) {
			e.printStackTrace();
			logger.log(Status.INFO, testdata + " is not displayed ");
		}
	}

	public void Alaphabetical_Sort(List<WebElement> element) {

		List ActualValues = new ArrayList();
		List temp = new ArrayList();
		for (WebElement ele : element) {
			ActualValues.add(ele.getText());
		}
		temp.addAll(ActualValues);
		Collections.sort(temp, String.CASE_INSENSITIVE_ORDER);
		try {
			Assert.assertTrue(ActualValues.equals(temp));
			logger.log(Status.PASS, "Templates names are sorted in alaphabetical order");
		} catch (Exception e) {
			e.printStackTrace();
			logger.log(Status.FAIL, "step failed due to the exception occured as " + e);
		}
	}

	public void Select_Calender(WebElement NextYear, By Next20Year, By Next12Months, By elementDateMonth,
			String Value) {

		JavascriptExecutor jse = (JavascriptExecutor) driver;

		String Date = Value.split("-")[0];
		String Month = Value.split("-")[1];
		String Year = Value.split("-")[2];

		try {
			NextYear.click();
			Thread.sleep(3000);
			List<WebElement> NextYears = driver.findElements(Next20Year);
			System.out.println("Year Size is " + NextYears.size());
			for (WebElement NYears : NextYears) {
				if (NYears.getText().trim().equalsIgnoreCase(Year)) {
					NYears.click();
					Thread.sleep(3000);
					List<WebElement> Nextmonths = driver.findElements(Next12Months);
					System.out.println("Month Size is " + Nextmonths.size());
					for (WebElement Nmonths : Nextmonths) {
						if (Nmonths.getText().trim().equalsIgnoreCase(Month)) {
							Nmonths.click();
							Thread.sleep(3000);
							List<WebElement> eleDate = driver.findElements(elementDateMonth);
							for (WebElement eDates : eleDate) {
								if (eDates.getText().trim().equalsIgnoreCase(Date)) {
									eDates.click();
									System.out.println("Date is slected as " + eDates.getText());
									break;
								}
							}
							break;
						}
					}
					break;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			logger.log(Status.FAIL, "step failed due to the exception occured as " + e);
		}
	}

	public void Validate_Click_dropdown(List<WebElement> drpdownvalues, WebElement element, WebElement ele,
			WebElement drpicon, String Values) {

		String[] checkBoxArray = Values.trim().split(",");
		try {
			for (WebElement drp : drpdownvalues) {
				for (String str : checkBoxArray) {
					if (drp.getText().trim().equalsIgnoreCase(str)) {
						drp.click();
						logger.log(Status.PASS, drp.getText() + " is selected");
						Thread.sleep(1000);
						element.isDisplayed();
						element.click();
						logger.log(Status.PASS, element.getText() + " is displayed");
						Thread.sleep(1000);
						ele.isDisplayed();
						logger.log(Status.PASS, ele.getText() + " is displayed");
						break;
					}
				}
				drpicon.click();
				Thread.sleep(1000);
			}
		} catch (Exception e) {
			e.printStackTrace();
			logger.log(Status.FAIL, "step failed due to the exception occured as " + e);
		}
	}

	public boolean Validate_Element_Is_Enabled(WebElement element) {
		boolean Flag = false;
		try {
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
			Flag = element.isEnabled();
		} catch (Exception e) {
			e.printStackTrace();
			logger.log(Status.INFO, "Element is not enabled by defaulty");
		}
		return Flag;

	}

	public void Validate_List_elemnt_Is_disabled(List<WebElement> element) {
		try {
			for (WebElement ele : element) {
				String Disabled_value = ele.getAttribute("aria-disabled");
				if (Disabled_value.equalsIgnoreCase("true")) {
					logger.log(Status.PASS, ele.getText().trim()
							+ " is disabled after expanding the filter template by section on clikcing More filters option");
				} else {
					logger.log(Status.FAIL, ele.getText().trim()
							+ " is not disabled after expanding the filter template by section on clikcing More filters option");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			logger.log(Status.FAIL,
					"Exception Occured on checking the tempalte are disabled after expanding the filter template by section on clikcing More filters option");
		}
	}

	public void Validate_Tick_Mark_Is_Enabled(List<WebElement> Templatename, List<WebElement> Tickmarktemplate,
			String List_Template) {
		try {
			String[] Template_Array = List_Template.trim().split(",");
			for (String str : Template_Array) {
				for (WebElement name : Templatename) {
					for (WebElement tickmark : Tickmarktemplate) {
						if ((tickmark.isDisplayed()) && (name.getText().trim().equalsIgnoreCase(str))) {
							logger.log(Status.PASS, "Tick Mark is enabled for the selection " + name.getText().trim());
							break;
						}
					}
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
			logger.log(Status.FAIL, "Exception is occured while checking the tick Mark is enabled for the selections ");
		}
	}

	public List<String> Storing_Values_Available(List<WebElement> element) {

		List<String> all_elements_text = null;
		try {
			all_elements_text = new ArrayList<String>();
			for (int i = 0; i < element.size(); i++) {
				// loading text of each element in to array all_elements_text
				all_elements_text.add(element.get(i).getText().trim());
			}
		} catch (Exception e) {
			logger.log(Status.FAIL, "Exception is occured while storing the filters available");
		}
		return all_elements_text;
	}

	public void Validate_Userdefined_Values_displyed_After_Cancel(List<WebElement> element, List<String> str) {
		try {
			for (String value : str) {
				for (WebElement ele : element) {
					if (ele.getText().trim().equalsIgnoreCase(value)) {
						logger.log(Status.PASS,
								"After Clikcing Cancel Button the value showing in the filter template is " + value);
						break;
					}
				}
			}
		} catch (Exception e) {
			logger.log(Status.FAIL, "Exception is occured while compairing the filter values");
		}
	}

	public void Validate_Element_Active_Staus(List<WebElement> Templatename, String Values) {
		int count = 0;
		String[] namearray = Values.trim().split(",");
		int size = namearray.length;
		int webelement_length = Templatename.size();
		try {
			for (WebElement ele : Templatename) {
				for (String templatename : namearray) {
					if (ele.getText().trim().equalsIgnoreCase(templatename)) {
						count = count + 1;
						break;
					}
				}
			}
			Thread.sleep(3000);
//			if (size == count) {
//				logger.log(Status.PASS, "The user defined template is showing as active");
//			} else {
//				logger.log(Status.FAIL, "The user defined template is not showing as active");
//			}
			if (size == webelement_length) {
				logger.log(Status.PASS,
						"Only the user defined template is active and the other templates remaining inactive");
			} else {
				logger.log(Status.FAIL,
						"After enabling user defined template some other templates some other template are also active");
			}
		} catch (Exception e) {
			logger.log(Status.FAIL, "Exception is occured while unchecking the tick marks");
		}

	}

	public void Enabling_user_selected_Star_Icon(String user_template_name) {
		try {
			String[] user_templatename = user_template_name.split(",");
			int count = user_templatename.length;
			for (int i = 0; i < count; i++) {
				String value = user_templatename[i].trim();
				WebElement star_icons = driver.findElement(By.xpath(
						"//crf-rc-reports-templates//crf-rc-report-section[@data-test='section-all-report']//crf-report-card//*[@class='card-content']//span[normalize-space(text())='"
								+ value + "']//preceding::nd-icon[1]"));
				String status = star_icons.getAttribute("icon").trim();
				if (status.equalsIgnoreCase("nlsn:favorite")) {
					((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", star_icons);
					star_icons.click();
					logger.log(Status.PASS, "Clicked on the star icon of the report " + user_templatename[i]);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			logger.log(Status.FAIL, "Exception is occured while unchecking the tick marks");
		}
	}

	public void Validate_kebobmenu_Checkbox(List<WebElement> templatelist) {
		try {
			// int count=templatelist.size();
			for (WebElement list : templatelist) {
				int i = 1;
				String kebob_element = "document.querySelector('crf-rc-reports-templates > div > div > crf-rc-reports-templates-view-all > div > crf-rc-report-section > div > div.report-group > crf-report-card:nth-child("
						+ i
						+ ") > nd-card > div.card-title-wrapper > div > div > crf-rc-action-menu > nd-menu-button > nd-icon-button').shadowRoot.querySelector('#icon')";
				String checkbox_element = "document.querySelector('crf-rc-reports-templates > div > div > crf-rc-reports-templates-view-all > div > crf-rc-report-section > div > div.report-group > crf-report-card:nth-child("
						+ i
						+ ") > nd-card > div.card-content > div.card-content-footer>nd-checkbox').shadowRoot.querySelector('#checkboxContainer')";
				WebElement kebob_menu = expandRootElement(kebob_element);
				WebElement checkbox = expandRootElement(checkbox_element);
				boolean Kebob_flag = Validate_Boolean_Element_Available(kebob_menu);
				boolean checkbox_flag = Validate_Boolean_Element_Available(checkbox);
				if ((Kebob_flag == true) && (checkbox_flag == true)) {
					logger.log(Status.PASS, " Kebob Menu is displayed for all the report");
					logger.log(Status.PASS, " Checkbox is displayed for all the report");
				} else {
					logger.log(Status.FAIL, "Kebob Menu is not displayed for all the report " + Kebob_flag);
					logger.log(Status.FAIL, "Checkbox is not displayed for all the report " + checkbox_flag);
				}
				i = i + 1;

			}
		} catch (Exception e) {
			e.printStackTrace();
			logger.log(Status.FAIL,
					" Exception ocuerd while validating the kebob menu and checkbox under my favorite section " + e);
		}
	}

	public boolean Compairing_two_list_are_equal(List<String> firstlist, List<String> secondlist) {
		boolean isEqualAllValues = true;
		try {
			isEqualAllValues = firstlist.equals(secondlist);
		} catch (Exception e) {
			e.printStackTrace();
			logger.log(Status.FAIL, " Exception ocuerd while compairing two list " + e);
		}
		return isEqualAllValues;
	}

	public void Enable_the_checkbox(int count) {
		try {
			// Click the checkbox of 3 template
			for (int i = 1; i <= count; i++) {
				String checkbox_element = "document.querySelector('crf-rc-reports-templates > div > div > crf-rc-reports-templates-view-all > div > crf-rc-report-section > div > div.report-group > crf-report-card:nth-child("
						+ i
						+ ") > nd-card > div.card-content > div.card-content-footer>nd-checkbox').shadowRoot.querySelector('#checkboxContainer')";
				WebElement checkbox = expandRootElement(checkbox_element);
				checkbox.click();
			}
		} catch (Exception e) {
			e.printStackTrace();
			logger.log(Status.FAIL, " Exception ocuerd while enabling the checkbox " + e);
		}
	}

	public void validate_checkbox_is_Enabled(int count, List<WebElement> checkboxenabled_list) {
		try {
			int value = 0;
			for (WebElement checkbox : checkboxenabled_list) {
				String enabled_flag = checkbox.getAttribute("aria-checked");
				if (enabled_flag.equalsIgnoreCase("true")) {
					value = value + 1;
				}
			}
			if (count == value) {
				logger.log(Status.PASS, " Under build flow section checkbox is enabled for the selected reports ");
				log.info("Under build flow section checkbox is enabled for the selected reports");
			} else {
				logger.log(Status.FAIL, " Under build flow section checkbox is not enabled for all the reports ");
			}
		} catch (Exception e) {
			e.printStackTrace();
			logger.log(Status.FAIL,
					" Exception ocuerd while validating the checkbox is enabled on the build flow section " + e);
		}
	}

	public void checking_star_icon_is_notenabled(List<WebElement> star_icon_list) {
		try {
			int count = 0, i = 0;
			for (WebElement staricon_enabled : star_icon_list) {
				i = i + 1;
				String status = staricon_enabled.getAttribute("icon").trim();
				if (status.equalsIgnoreCase("nlsn:favorite_fill")) {
					count = count + 1;
				}
			}
			if (count < i) {
				logger.log(Status.PASS, "Build flow section is having the unfavorited template");
			} else {
				logger.log(Status.FAIL, "Build flow section is not having the unfavorited template");
			}
		} catch (Exception e) {
			e.printStackTrace();
			logger.log(Status.FAIL, " Exception ocuerd at the my favorite section validation " + e);
		}
	}

	public void Disabling_all_star_icon_Under_Myfavorite(List<WebElement> staricon_list) {
		try {
			for (WebElement ele : staricon_list) {
				String status = ele.getAttribute("icon").trim();
				if (status.equalsIgnoreCase("nlsn:favorite_fill")) {
					ele.click();
					logger.log(Status.PASS, "Removed all the favorited reports from my favorite");
					log.info("Removed all the favorited reports from my favorite");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			logger.log(Status.FAIL, " Exception ocuerd at the my favorite section validation " + e);
		}
	}

	public void uncheck_the_checkbox_in_build_flow(List<WebElement> checkbox_list) {
		try {
			for (WebElement checkbox : checkbox_list) {
				String checkbox_status = checkbox.getAttribute("aria-checked");
				if (checkbox_status.equalsIgnoreCase("true")) {
					((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", checkbox);
					checkbox.click();
					logger.log(Status.PASS, "untick the chekmark in build flow section");
					log.info("untick the chekmark in build flow section");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			logger.log(Status.FAIL, " Exception ocuerd while clearing the checkbox from build flow section " + e);
		}
	}

	public void Enable_the_checkbox_inTemplate_homepage(int count) {
		try {
			// Click the checkbox of 3 template
			for (int i = 2; i <= count + 1; i++) {
				String checkbox_element = "document.querySelector('crf-rc-report-section[data-test=\"section-all-report\"] >div.report-section >div.report-group >crf-report-card:nth-child("
						+ i
						+ ") >nd-card >#card-body-content >div.card-content-footer >nd-checkbox').shadowRoot.querySelector('#checkboxContainer')";
				WebElement checkbox = expandRootElement(checkbox_element);
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", checkbox);
				checkbox.click();
				logger.log(Status.PASS, "Checkbox is enabled for the user defined template");
			}
		} catch (Exception e) {
			e.printStackTrace();
			logger.log(Status.FAIL, " Exception ocuerd while enabling the checkbox in template home page" + e);
		}
	}

	public void Enable_the_checkbox_inTemplate_homepage_Ominishopper(String Data) {
		try {
			// Click the checkbox of 3 template
			String[] Value = Data.split(",");
			for (String element : Value) {
				String checkbox_element = "document.querySelector('crf-rc-report-section[data-test=\"section-all-report\"] >div.report-section >div.report-group >crf-report-card >nd-card[data-test="
						+ element
						+ "] >#card-body-content >div.card-content-footer >nd-checkbox').shadowRoot.querySelector('#checkboxContainer')";
				WebElement checkbox = expandRootElement(checkbox_element);
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", checkbox);
				checkbox.click();
				logger.log(Status.PASS, "Checkbox is enabled for the user defined template");
			}
		} catch (Exception e) {
			e.printStackTrace();
			logger.log(Status.FAIL, " Exception ocuerd while enabling the checkbox in template home page" + e);
		}
	}

	public void disable_the_checkbox_shopping_cart(String Data) {
		try {
			// Click the checkbox of 3 template
			String[] Value = Data.split(",");
			for (String element : Value) {
				String checkbox_element = "document.querySelector('crf-rc-report-section[data-test=\\\"section-all-report\\\"] >div.report-section >div.report-group >crf-report-card >nd-card[data-test="
						+ element
						+ "]>#card-body-content >div.card-content-footer >nd-checkbox').shadowRoot.querySelector('#checkboxContainer')";
				WebElement checkbox = expandRootElement(checkbox_element);
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", checkbox);
				checkbox.click();
				logger.log(Status.PASS, "Checkbox is enabled for the user defined template");
			}
		} catch (Exception e) {
			e.printStackTrace();
			logger.log(Status.FAIL, " Exception ocuerd while enabling the checkbox in template home page" + e);
		}
	}

	public String casecovertion(String Name) {
		String firstLetterCapitalizedName = null;
		try {
			String firstLetStr = Name.substring(0, 1);
			String remLetStr = Name.substring(1);
			firstLetStr = firstLetStr.toUpperCase();
			firstLetterCapitalizedName = firstLetStr + remLetStr;
		} catch (Exception e) {
			e.printStackTrace();
			logger.log(Status.FAIL, " Exception ocuerd while converting the case" + e);
		}
		return firstLetterCapitalizedName;
	}

	public void waitForElement(WebElement WebElementName) {
		try {
			wait.until(ExpectedConditions.visibilityOf(WebElementName));
			wait.until(ExpectedConditions.elementToBeClickable(WebElementName));
		} catch (Exception e) {

		}
	}

	public String generateRandomString() {
		String projectName = new BigInteger(20, new SecureRandom()).toString(32);
		return projectName;
	}

	// Double click method added By Aleena
	public void doubleClick(WebElement button) {

		try {
			wait.until(ExpectedConditions.visibilityOf(button));
			wait.until(ExpectedConditions.elementToBeClickable(button));
			Actions action = new Actions(driver);
			action.moveToElement(button).doubleClick().build().perform();
			logger.log(Status.INFO, " Able to Doubleclick on the element");
		} catch (Exception e) {
			e.printStackTrace();
			logger.log(Status.FAIL, " Not able to Doubleclick on the element " + button.getText());
			logger.log(Status.FAIL, "step failed due to the exception occured as " + e);
		}

	}

	public boolean Validate_Boolean_NotElement_Available(WebElement element) {
		boolean Flag = false;
		try {
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
			Flag = !(element.isDisplayed());
		} catch (Exception e) {
			// e.printStackTrace();
			logger.log(Status.INFO, "Searching element is displayed");
		}
		return Flag;
	}

	public void descending_Sort(List<WebElement> element) {

		List ActualValues = new ArrayList();
		List temp = new ArrayList();
		for (WebElement ele : element) {
			ActualValues.add(ele.getText());
		}
		System.out.println(ActualValues);
		temp.addAll(ActualValues);
		Collections.sort(temp, String.CASE_INSENSITIVE_ORDER.reversed());
		System.out.println(temp);
		try {
			Assert.assertTrue(ActualValues.equals(temp));
			logger.log(Status.PASS, "Templates names are sorted in alaphabetical order");
		} catch (Exception e) {
			e.printStackTrace();
			logger.log(Status.FAIL, "step failed due to the exception occured as " + e);
		}
	}

	public String Validate_Element_Is_Disabled(WebElement element) {
		String Flag = "";
		try {
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
			Flag = element.getAttribute("aria-disabled");
		} catch (Exception e) {
			e.printStackTrace();
			logger.log(Status.INFO, "Element is enabled by default");
		}
		return Flag;

	}

	public void ValidateTitle() {
		String tcData = "NIQ Adhoc Web";
		String actualTitle = driver.getTitle();

		try {
			Assert.assertEquals(actualTitle, tcData);
			logger.log(Status.INFO, "Actual title and Expected titles are equal");
			System.out.println(actualTitle);
		} catch (Exception e) {
			e.printStackTrace();
			logger.log(Status.FAIL, "step failed due to the exception occured as " + e);
			
		}
	}
	
	public boolean validate_element_selected(String element) {
		boolean element_selected = false;
		try {
			element_selected = Boolean.parseBoolean(element);
		} catch (Exception e) {
			e.printStackTrace();
			logger.log(Status.FAIL, " Exception ocuerd while converting the case" + e);
		}
		return element_selected;
	}

	public void isElementPresent(WebElement element, String elementName) {

		try {
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
			element.isDisplayed();
			logger.log(Status.PASS, elementName + " is displayed ");
		} catch (Exception e) {
			e.printStackTrace();
			logger.log(Status.FAIL, " Element is not displayed ");
		}
	}

	public void waitForInvisibilityElement(WebElement WebElementName) {
		try {
			// WebDriverWait wait = new WebDriverWait(this.driver, 15);
			wait.until(ExpectedConditions.invisibilityOf(WebElementName));
		} catch (Exception e) {

		}
	}

	public void actionsMoveToElementSendKeys(String text) {
		Actions actions = new Actions(driver);
		actions.sendKeys(text).perform();
		actions.sendKeys(Keys.ENTER).perform();
	}

	public void dragAnddrop(WebElement source, WebElement target) {
		Actions actions = new Actions(driver);
		actions.dragAndDrop(source, target).build().perform();
	}

	public void actionsMoveToElement(WebElement target) {
		Actions actions = new Actions(driver);
		actions.moveToElement(target).perform();
	}

	public String getRGBFromElement(WebElement element, String attribute) {
		return element.getCssValue(attribute);
	}

	public void click(WebElement ele) {
		int attempts = 0;
		while (attempts++ < 1) {
			try {
				WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
				wait.until(ExpectedConditions.and(ExpectedConditions.elementToBeClickable(ele)));

				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(false)", ele);
				Actions actions = new Actions(driver);
				actions.moveToElement(ele).perform();
				ele.click();
				Thread.sleep(2000);
				break;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public void clickAndHold_dragAnddrop(WebElement source, WebElement target) {
		Actions action = new Actions(driver);
		action.moveToElement(source).build().perform();
		action.clickAndHold(source).build().perform();
		action.moveToElement(target).build().perform();
		action.release(target).build().perform();
	}

}
