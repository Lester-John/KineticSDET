package kinectic.global.Pages;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.logging.log4j.Logger;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePageObject {
	
	protected WebDriver driver;
	protected Logger log;

	public BasePageObject(WebDriver driver, Logger log) {
		this.driver = driver;
		this.log = log;
	}
	
	//Open page with given URL
	protected void openUrl(String url) {
		driver.get(url);
	}
	
	//Find object using given Locator
	protected WebElement find(By locator) {
		return driver.findElement(locator);	
	}
	
	//Find Object using LinkText
	public WebElement selectText(String text) {
		return driver.findElement(By.linkText(text));
	}
	
	//Click on element with given locator when its visible
	protected void click(By locator) {
		waitForVisibilityOf(locator, 10);
		find(locator).click();
	}
	
	//Type given text in to element with given locator
	protected void type(String text, By locator) {
		waitForVisibilityOf(locator, 5);
		find(locator).sendKeys(text);
	}
	
	//Get URL of current page from browser
	public void getCurrentUrl() {
		driver.getCurrentUrl();
	}
	
	//SendKeys to window
	protected void enterKey(String text, By locator) {
		type(text, locator);
	}
	
	//Hover over given locator
	protected void hover(By locator) {
		Actions builder = new Actions(driver);
		WebElement element = find(locator);
		builder.moveToElement(element).build().perform();	
	}
	
	//Select from given drop down
	protected void select(String text, By locator) {
		Select select = new Select(find(locator));
		select.selectByVisibleText(text);
	}
	
	//Select from a given a-tag select dropdown
	protected void atagSelect(String text, By locator) {
		click(locator);
	}
	
	//Find all elements using given locator
	protected List<WebElement> findAll(By locator){
		return driver.findElements(locator);
	}
	
	//Verify if given locator is displayed
	protected boolean isVisible(By locator) {
		waitForVisibilityOf(locator, 5);
		return find(locator).isDisplayed();
	}
	
	//Javascript to scroll to the bottom of the page
	protected void scrollDown() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	}
	
	//Take a screenshot of current browser
	public void getScreenshot(String result) throws IOException
	{
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File desk = new File("C://Data//TestAutomation//ScreenShots//"+result+"screenshot.png");
		FileUtils.copyFile(src, desk);
	}
	
	//**Wait for specific ExpectedCondition for the given amount of time in seconds
	
	private void waitFor(ExpectedCondition<WebElement> condition, Integer timeOutInSeconds) {
		timeOutInSeconds = timeOutInSeconds != null ? timeOutInSeconds : 30;
		WebDriverWait wait = new WebDriverWait(driver, timeOutInSeconds);
		wait.until(condition);
	}
	
	//Wait for given number of seconds for element with given locator to be visible on the page
	
	protected void waitForVisibilityOf(By locator, Integer...timeOutInSeconds) {
		int attempts = 0;
		while(attempts < 2) {
			try {
				waitFor(ExpectedConditions.visibilityOfElementLocated(locator), (timeOutInSeconds.length > 0? timeOutInSeconds[0] : null));
				break;
			} catch (StaleElementReferenceException e) {	
			}
			attempts++;
		}
	}


}
