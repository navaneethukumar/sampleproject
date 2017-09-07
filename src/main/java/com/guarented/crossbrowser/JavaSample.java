package com.guarented.crossbrowser;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.guarented.ecommerce.pageUtils.LoginPageUtils1;

import java.io.IOException;
import java.net.URL;

	public class JavaSample {
		WebDriver driver;

	  public static final String USERNAME = "abhimanyudikshit1";
	  public static final String AUTOMATE_KEY = "vdKD8LX3uf6geTeXoXkL";
	  public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";

	  //public static void main(String[] args) throws Exception {
		  
		  @BeforeMethod
			public void setUP() throws IOException{

	    DesiredCapabilities caps = new DesiredCapabilities().chrome();
	    caps.setPlatform(Platform.WIN8);
	    
	   /* caps.setCapability("browser", "IE");
	    caps.setCapability("browser_version", "14.0");
	    caps.setCapability("os", "Windows");
	    caps.setCapability("os_version", "windows7");*/
	    caps.setCapability("browserstack.debug", "true");

	    driver = new RemoteWebDriver(new URL(URL), caps);}
	   
	    
	   /* driver.get("https://staging.guarented.com/");
	    Thread.sleep(8000);*/
		  
		  @Test
		  public void search() throws InterruptedException{
	    System.out.println("url is  "+this.driver.getCurrentUrl());
	    LoginPageUtils1 lpu=new LoginPageUtils1();
		lpu.loginToApplication("naresh@guarented.com", "neethu23");
		Thread.sleep(5000);}
	    
	
	    
	    
	    
	    
	    
	    
	  
	    //WebElement element = driver.findElement(By.name("q"));

	/*    element.sendKeys("BrowserStack");
	    element.submit();*/

	 /*   System.out.println(driver.getTitle());
	    driver.quit();*/

	  
	}


