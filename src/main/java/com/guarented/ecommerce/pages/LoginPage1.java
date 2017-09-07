package com.guarented.ecommerce.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.guarented.ecommerce.TestBase.TestBase2;
import com.guarented.ecommerce.commonUtilss.CommonUtils1;

public class LoginPage1 extends TestBase2 {
	CommonUtils1 cu = new CommonUtils1();

	public By logindropdownbutton = By.id("profile_white");
	public By loginbutton = By.id("login_btn");
	public By allreadyRegEmailAddr = By.name("user");
	
	
	public By allReadyRegPass = By.name("password");
	
	public By submitbutton = By.xpath("//*[@id='tab-content-12']/div/md-content/form/button | html/body/div[6]/md-dialog/md-dialog-content/div/div[2]/md-content/md-tabs/md-tabs-content-wrapper/md-tab-content[1]/div/md-content/form/button");

	// /signup
	public By createAccFullnameinsignup = By.id("input_16");
	public By createAccMobileinsignup = By.id("input_17");
	public By createAccEmailAddrinsignup = By.id("input_18");
	public By createAccPasswordinsignup = By.id("input_19");
	public By firstsignup = By
			.xpath(".//*[@id='dialogContent_login_dialog_parent']/div/div[2]/md-content/md-tabs/md-tabs-wrapper/md-tabs-canvas/md-pagination-wrapper/md-tab-item[2]/span");
	public By createaccountsignupbutton = By
			.xpath("//*[@id='tab-content-13']/div/md-content/button/span");

	public WebElement getfirstsignup() {
		cu.explicitWait(driver, firstsignup, 30L);
		return driver.findElement(firstsignup);
	}
	public WebElement getcreateaccountsignupbutton() {
		cu.explicitWait(driver, createaccountsignupbutton, 30L);
		return driver.findElement(createaccountsignupbutton);
	}

	public WebElement getlogindropdownbutton() {
		cu.explicitWait(driver, logindropdownbutton, 30L);
		return driver.findElement(logindropdownbutton);
	}

	public WebElement getloginbutton() {
		cu.explicitWait(driver, loginbutton, 30L);
		return driver.findElement(loginbutton);
	}

	public WebElement getallreadyRegEmailAddr() {
		cu.explicitWait(driver, allreadyRegEmailAddr, 30L);
		return driver.findElement(allreadyRegEmailAddr);
	}

	public WebElement getallReadyRegPass() {
		cu.explicitWait(driver, allReadyRegPass, 30L);
		return driver.findElement(allReadyRegPass);
	}

	public WebElement getsubmitbutton() {
		cu.explicitWait(driver, submitbutton, 30L);
		return driver.findElement(submitbutton);
	}

	

	

	public WebElement getcreateAccFullnameinsignup() {
		cu.explicitWait(driver, createAccFullnameinsignup, 30L);
		return driver.findElement(createAccFullnameinsignup);
	}

	public WebElement getcreateAccMobileinsignup() {
		cu.explicitWait(driver, createAccMobileinsignup, 30L);
		return driver.findElement(createAccMobileinsignup);
	}

	public WebElement getcreateAccEmailAddrinsignup() {
		cu.explicitWait(driver, createAccEmailAddrinsignup, 30L);
		return driver.findElement(createAccEmailAddrinsignup);
	}

	public WebElement getcreateAccPasswordinsignup() {
		cu.explicitWait(driver, createAccPasswordinsignup, 30L);
		return driver.findElement(createAccPasswordinsignup);
	}

	/**
	 * This method will enter email address to create an account text box. In
	 * Login Page
	 * 
	 * @param emailAddress
	 */

	public void clickonsignindropdown() {
		System.out.println(("clicking on sign in dropdown button"));
		getlogindropdownbutton().click();

	}

	public void clicksigninbutton() {
		System.out.println(("clicking on sign in button"));
		getloginbutton().click();

	}

	public void enterAllreadyRegisterUserEmail(String emailAddress) {
		System.out
				.println(("entering email addredd to all ready registered user text box"));
		getallreadyRegEmailAddr().sendKeys(emailAddress);
	}

	public void enterAllReadyRegisteredPassword(String password) {
		System.out.println(("enterign password to password text box"));
		getallReadyRegPass().sendKeys(password);
	}

	public void clickonSubmitbutton() {
		System.out.println(("clicking on submit button"));
		getsubmitbutton().click();
	}

	

	public void loginToApplication() {
		clickonsignindropdown();
		clicksigninbutton();
		enterAllreadyRegisterUserEmail("naresh@guarented.com");
		enterAllReadyRegisteredPassword("neethu23");
		clickonSubmitbutton();
	}

	public void loginToApplication(String Email, String Password) throws InterruptedException {
		clickonsignindropdown();
		clicksigninbutton();
		Thread.sleep(4000);
		enterAllreadyRegisterUserEmail(Email);
		Thread.sleep(4000);
		enterAllReadyRegisteredPassword(Password);
		Thread.sleep(4000);
		clickonSubmitbutton();
	}

	public void enterallfieldsToCraeteAccount(String fullname,
			String emailAddress, String password) {
		System.out.println(("entering all fields to create an account"));
		System.out.println("enter fullname");
		driver.findElement(createAccFullnameinsignup).sendKeys(fullname);
		System.out.println("enter fullname finished");
		System.out.println("enter mobno");
		driver.findElement(createAccMobileinsignup).sendKeys("34343434343");
		System.out.println("enter mob fin");
		driver.findElement(createAccEmailAddrinsignup).sendKeys(emailAddress);
		driver.findElement(createAccPasswordinsignup).sendKeys(password);
		// driver.findElement(finalsignupbutton).click();
	}

	/*
	 * public void clickOnCreateAnAccoun(){
	 * System.out.println(("Clicking on create an account"));
	 * driver.findElement(createAnAccount).click(); }
	 */

	/**
	 * This Method is used for login to application
	 */

	/*
	 * public void loginToApplication(String Email, String Password){
	 * clickonSignIn(); enterAllreadyRegisterUserEmail(Email);
	 * enterAllReadyRegisteredPassword(Password); clickonSignInToAccount(); }
	 * 
	 * 
	 * 
	 * public void logout(){ try{ boolean isdisplayed =
	 * driver.findElement(signOut).isDisplayed(); if(isdisplayed){
	 * driver.findElement(signOut).click(); } } catch(Exception e){
	 * Assert.assertTrue(false, "sign out buttom is not displayed"); }
	 */

}
