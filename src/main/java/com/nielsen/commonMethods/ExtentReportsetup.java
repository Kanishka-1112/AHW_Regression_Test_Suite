package com.nielsen.commonMethods;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportsetup extends BaseMethod {

	public static ExtentReports ExtendReportcreation() {

		SimpleDateFormat format = new SimpleDateFormat("dd-MM-YY HH-mm-ss");
		Date date = new Date();
		String ActualDate = format.format(date);
		ExtentSparkReporter sparkReport = new ExtentSparkReporter(System.getProperty("user.dir") + "/test-output/OutputReport/Extentreport_" + ActualDate + ".html");
		//ExtentSparkReporter sparkReport = new ExtentSparkReporter(System.getProperty("user.dir") + "/test-output/Extentreport.html");
		report = new ExtentReports();
		report.attachReporter(sparkReport);
		return report;
	}

	public static String takeSnapShot(String screenshotName) throws Exception {

		File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		String FinalPath = System.getProperty("user.dir") + "/test-output/Screenshots/" + screenshotName + dateName
				+ ".png";
		System.out.println(FinalPath);
		FileUtils.copyFile(screenshot, new File(FinalPath));
		return FinalPath;
	}

	public static void reportLogger(boolean condition, String message, Object expected, Object actual)
			throws Exception {
		if (condition)
			logger.log(Status.PASS,
					"<b><font color=green>" + message + "</font></b>" + "<br><b><font color=green>Expected:</font></b>"
							+ expected + "</br><b><font color=green>Actual:</font></b>" + actual + "</br>");
		else
			logger.log(Status.FAIL,
					"<b><font color=red>" + message + "</font></b>" + "<br><b><font color=green>Expected:</font></b>"
							+ expected + "</br><b><font color=red>Actual:</font></b>" + actual + "</br>",
					MediaEntityBuilder.createScreenCaptureFromPath(takeSnapShot(message)).build());

	}

	public static void reportLoggerWithScreenshot(boolean condition, String message, Object expected, Object actual)
			throws Exception {
		if (condition)
			logger.log(Status.PASS,
					"<b><font color=green>" + message + "</font></b>" + "<br><b><font color=green>Expected:</font></b>"
							+ expected + "</br><b><font color=green>Actual:</font></b>" + actual + "</br>",
					MediaEntityBuilder.createScreenCaptureFromPath(takeSnapShot(message)).build());
		else
			logger.log(Status.FAIL,
					"<b><font color=red>" + message + "</font></b>" + "<br><b><font color=green>Expected:</font></b>"
							+ expected + "</br><b><font color=red>Actual:</font></b>" + actual + "</br>",
					MediaEntityBuilder.createScreenCaptureFromPath(takeSnapShot(message)).build());

	}

	public static void reportLogger(boolean condition, String message) throws Exception {
		if (condition)
			logger.log(Status.PASS, "<b><font color=green>" + message + "</font></b><br>");
		else
			logger.log(Status.FAIL, "<b><font color=red>" + message + "</font></b><br>",
					MediaEntityBuilder.createScreenCaptureFromPath(takeSnapShot(message.replace(":", ""))).build());

	}

	public static void reportLoggerWithScreenshot(boolean condition, String message) throws Exception {
		if (condition)
			logger.log(Status.PASS, "<b><font color=green>" + message + "</font></b><br>",
					MediaEntityBuilder.createScreenCaptureFromPath(takeSnapShot(message)).build());
		else
			logger.log(Status.FAIL, "<b><font color=red>" + message + "</font></b><br>",
					MediaEntityBuilder.createScreenCaptureFromPath(takeSnapShot(message)).build());

	}

}
