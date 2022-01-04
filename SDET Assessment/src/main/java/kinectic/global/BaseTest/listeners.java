package kinectic.global.BaseTest;

import java.io.IOException;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import kinectic.global.Pages.BasePageObject;

public class listeners  implements ITestListener {

	public WebDriver driver;
	public Logger log;

	BasePageObject b = new BasePageObject(driver, log);

	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub
		// hey i am done
	}

	public void onStart(ITestContext result) {
		// TODO Auto-generated method stub
		//
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub

	}

	public void onTestFailure(ITestResult result, WebDriver driver) {
		// TODO Auto-generated method stub
		// screenshot

		try {
			b.getScreenshot(result.getName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub

	}

	public void onTestStart(ITestResult result, WebDriver driver) {
		// TODO Auto-generated method stub
		try {
			b.getScreenshot(result.getName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void onTestSuccess(ITestResult arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

}
