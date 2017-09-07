package com.guarented.ecommerce.commonUtilss;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonUtils1 {
	public static final long maxWaitTime=300; //in seconds
	
	static long TIMEOUT_S = 60;
	static int INT_TIMEOUT_S = Integer.parseInt(Long.toString(TIMEOUT_S));
	static long WAIT_TIMEOUT = 30L;
	public CommonUtils1() {

	}
	
	public boolean isElementPreset(By object,WebDriver driver) {

		try {
			return driver.findElement(object).isDisplayed();
		} catch (Exception e) {
			return false;
		}

	}
	
	public static void waitForSeconds(WebDriver driver, int waitTime) {
		driver.manage().timeouts().implicitlyWait(waitTime, TimeUnit.SECONDS);
	}
	public static void waitForElementToBeVisible(final WebDriver driver, final By locator) throws RuntimeException {
		Wait<WebDriver> wait = new WebDriverWait(driver, WAIT_TIMEOUT);
		try {
			wait.until(new ExpectedCondition<WebElement>() {
				public WebElement apply(WebDriver driver) {
					// driver.switchTo().defaultContent();
					WebElement element = driver.findElement(locator);
					if (element.isDisplayed()) {
						return element;
					}
					return null;
				}
			});
		} catch (Exception e) {
			throw new RuntimeException(
					"Exception while waiting for " + locator + ". Exception:" + e + " on " + driver.getCurrentUrl());
		}
	}



	public WebElement addedItemInList(String ID, WebDriver driver) {
		Select sel = new Select(driver.findElement(By.id(ID)));
		return sel.getOptions().get(0);

	}

	public void removeItemFromList(String ID, WebDriver driver) {

		addedItemInList(ID, driver).click();
		Actions act = new Actions(driver);
		act.doubleClick(addedItemInList(ID, driver)).build().perform();
	}

	public String addedItemText(String ID, WebDriver driver) {
		return addedItemInList(ID, driver).getText().trim();
	}

	public void clickItemFromList(String itemText, WebDriver driver) {
		//Logging.log("clicking item from List");
		driver.findElement(By.xpath("//div[text()='" + itemText + "']"))
				.click();
	}

	public void clickByDefaultSelectedItemInDropDownList(WebDriver driver) {

		driver.findElement(
				By.xpath(".//div[@class='x-combo-list-item x-combo-selected']"))
				.click();
	}

	public String textofByDefaultSelectedItemInDropDownList(WebDriver driver) {

		return driver
				.findElement(
						By.xpath(".//div[@class='x-combo-list-item x-combo-selected']"))
				.getText();
	}
	
	/**
	 * 
	 * @param driver
	 * @return
	 * This method returns the list of parent and child windows, 0th element will be parent window and 1st element will be child window
	 */
	public ArrayList<String> getWindows(WebDriver driver){
		String parentWindow,childWindow;
		Set<String> set=driver.getWindowHandles();
		Iterator<String> it=set.iterator();
		parentWindow=it.next();
		childWindow=it.next();
		ArrayList<String>al=new ArrayList<String>();
		al.add(parentWindow);
		al.add(childWindow);
		return al;
	}
	
	/**
	 * 
	 * @param driver
	 * @param seconds
	 * An implicit wait is to tell WebDriver to poll the DOM for a certain amount of time.
	 */
	public void implicitWait(WebDriver driver,Long seconds){
		driver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);		
	}
	
	/**
	 * 
	 * @param driver
	 * @param elementTowait
	 * @param seconds
	 * An explicit wait is code you define to wait for a certain condition to occur before proceeding further in the code.
	 */
	public void explicitWait(WebDriver driver,By elementTowait,Long seconds){
		//System.out.println("Waiting for Element for maximum "+seconds+" seconds");
		new WebDriverWait(driver, seconds)
		  .until(ExpectedConditions.presenceOfElementLocated(elementTowait));		
	}
	
	/**
	 * 
	 * @param driver
	 * @param elementTowait
	 * @param maxWaitTime
	 * An explicit unified wait for whole application
	 */
	
	public void explicitWait(WebDriver driver,By elementTowait){
		System.out.println("Waiting for Element for maximum "+maxWaitTime+" seconds");
		new WebDriverWait(driver, maxWaitTime)
		  .until(ExpectedConditions.presenceOfElementLocated(elementTowait));		
	}
	
	/*public String getCustomerName(){
		String customerName=ContextManager.getThreadContext().getInstance();
		return customerName;
	}
	*/
	public void moveVerticalScrollBar(WebDriver driver, int pix ){
		WebElement scrollbar=driver.findElement(By.xpath("//div[@class='ps-scrollbar-y']"));
		//WebElement scrollbar=driver.findElement(By.xpath("//div[@class='scroller-advance-search']"));
		
		Actions action = new Actions(driver);		
		action.clickAndHold(scrollbar).moveByOffset(0, pix).release().perform();
		
	}
	
	public void mouseOverToElement(WebDriver driver, WebElement we){
		Actions action = new Actions(driver);
		action.moveToElement(we).build().perform();
	}
	
	public void selectANDOperator(WebDriver driver){
		driver.findElement(By.xpath("//span[text()='AND']")).click();
	}
	
	public void selectOROperator(WebDriver driver){
		driver.findElement(By.xpath("//span[text()='OR']")).click();
	}
	
	public String[] getMatchCloudArray(String commaSeparatedCloudString){
		String []cloudArr=commaSeparatedCloudString.split(",");
		for(String cloud:cloudArr){
		System.out.println("Cloud String : "+cloud);
		//Logging.log("Cloud String : "+cloud);
		}
		return cloudArr;
	}

	
	public static void getpagetime(){
		
	WebDriver driver;
		long start=System.currentTimeMillis();
		System.out.println("start time is "+start);
		//driver.get("https://www.guarented.com/");
		long finaltime=System.currentTimeMillis();
		System.out.println("final time is "+finaltime);
		long pagetime=finaltime-start;
		System.out.println("page time to load the page is "+pagetime);
			}
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");        
        WebDriver driver = new ChromeDriver(); 
        long start=System.currentTimeMillis();
		System.out.println("start time is "+start);
		driver.get("https://staging.guarented.com/");
		driver.manage().window().maximize();
		long finaltime=System.currentTimeMillis();
		System.out.println("final time is "+finaltime);
		long pagetime=finaltime-start;
		System.out.println("page time to load the page is "+pagetime);
			}
        
		
		
	
	
	
	
	
	
	
	}
