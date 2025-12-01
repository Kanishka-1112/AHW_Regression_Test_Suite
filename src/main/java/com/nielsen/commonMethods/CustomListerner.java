package com.nielsen.commonMethods;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import com.aventstack.extentreports.Status;

public class CustomListerner extends BaseMethod implements ITestListener{


	public void onTestStart(ITestResult result) {

	}

	public void onTestSuccess(ITestResult result) {

	}

	public void onTestFailure(ITestResult result) {
		logger.log(Status.FAIL, "Test Case "+result.getMethod().getMethodName()+" is Failed");
		logger.log(Status.FAIL, result.getThrowable());

		Date date = new Date() ;
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss") ;

		File Source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String Screenshotpath=System.getProperty("user.dir")+"Screenshot\\screenshot_"+result.getMethod().getMethodName()+"_"+dateFormat.format(date)+".png";
		File Destination =new File(Screenshotpath);

		try {
			FileUtils.copyFile(Source, Destination);
		} catch (IOException e) {
			e.printStackTrace();
		}				
		try {
			logger.addScreenCaptureFromPath(Screenshotpath, "Screenshot for failure testcase");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub

	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub

	}

	public void onStart(ITestContext context) {
		//report = ExtentReportsetup.ExtendReportcreation();

	}

	public void onFinish(ITestContext context) {
		//report.flush();

	}


}
