package com.guarented.ecommerce.pageUtils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.guarented.ecommerce.commonUtilss.CommonUtils1;
import com.guarented.ecommerce.pages.LoginPage1;

public class LoginPageUtils1 extends LoginPage1{
	CommonUtils1 cu=new CommonUtils1();
	public static ExtentHtmlReporter htmlReporter;
    public static ExtentReports extent;
    public static ExtentTest test;
	
	
	

	public void clickonsignindropdown(){
		System.out.println(("clicking on sign in dropdown button"));
		driver.findElement(logindropdownbutton).click();
		
		
	}
	public void clickonfirstsignup(){
		System.out.println(("clicking on  1st signup button"));
		driver.findElement(firstsignup).click();
		
		
	}
	public void clickoncreateaccountsignupbutton(){
		System.out.println(("clicking on  last signup button"));
		driver.findElement(createaccountsignupbutton).click();
		
		
	}
	public void  clicksigninbutton(){
		System.out.println(("clicking on sign in button"));
		driver.findElement(loginbutton).click();
		
	}
	public void enterAllreadyRegisterUserEmail(String emailAddress){
		System.out.println(("entering email addredd to all ready registered user text box"));
		driver.findElement(allreadyRegEmailAddr).sendKeys(emailAddress);
	}
	


	public void enterAllReadyRegisteredPassword(String password){
		System.out.println(("enterign password to password text box"));
		driver.findElement(allReadyRegPass).sendKeys(password);
	}
	public void clickonSubmitbutton(){
		System.out.println(("clicking on submit button"));
		driver.findElement(submitbutton).click();
	}
	public void customerdetailsinsignuppage(String fullname,
			String mobilenumber, String emailid,String password) throws InterruptedException {
		
		Thread.sleep(5000);
		getcreateAccFullnameinsignup().sendKeys(fullname);
		Thread.sleep(5000);
		getcreateAccMobileinsignup().sendKeys((mobilenumber));
		Thread.sleep(5000);
		
			getcreateAccEmailAddrinsignup().sendKeys(emailid);
			Thread.sleep(3000);
		getcreateAccPasswordinsignup().sendKeys(password);
		Thread.sleep(5000);
	}
public void loginToApplication(){
		clickonsignindropdown();
		clicksigninbutton();
		enterAllreadyRegisterUserEmail("naresh@guarented.com");
		enterAllReadyRegisteredPassword("neethu23");
		clickonSubmitbutton();
	}

	
	
	
	
	
	
	
	
	
}
