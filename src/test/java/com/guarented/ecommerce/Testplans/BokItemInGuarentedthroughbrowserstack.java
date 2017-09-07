package com.guarented.ecommerce.Testplans;

import java.io.IOException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.guarented.ecommerce.TestBase.TestBase2;
import com.guarented.ecommerce.pageUtils.HomePageUtils1;
import com.guarented.ecommerce.pageUtils.LoginPageUtils1;

public class BokItemInGuarentedthroughbrowserstack extends TestBase2 {
	
	
	
	  public static final String USERNAME = "abhimanyudikshit1";
	  public static final String AUTOMATE_KEY = "vdKD8LX3uf6geTeXoXkL";
	  public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";
	
	
	
	@BeforeMethod
	public void setUP() throws IOException{
		DesiredCapabilities caps = new DesiredCapabilities().firefox();
	    caps.setPlatform(Platform.WIN8);
	    
	   /* caps.setCapability("browser", "IE");
	    caps.setCapability("browser_version", "14.0");
	    caps.setCapability("os", "Windows");
	    caps.setCapability("os_version", "windows7");*/
	    caps.setCapability("browserstack.debug", "true");

	    driver = new RemoteWebDriver(new URL(URL), caps);
		}

	
	
	
	
	

	@Test
	public void bookIteminGuarentedthroughProducts1() throws Exception{
		driver.get("https://staging.guarented.com/");
		Thread.sleep(8000);
		LoginPageUtils1 lpu=new LoginPageUtils1();
		lpu.loginToApplication("naresh@guarented.com", "neethu23");
		Thread.sleep(5000);
		HomePageUtils1 hpu=new HomePageUtils1();
		Thread.sleep(3000);
		hpu.verifyGuarentedtextinhomepage();
		Thread.sleep(3000);
		hpu.clickProductsButt();
		Thread.sleep(5000);
		driver.findElement(By.xpath(".//*[@id='product']/div[3]/div/div[2]/div/div[2]/a[2]/div/md-card/img")).click();
		Thread.sleep(5000);
		hpu.bookIteminGuarented();
}
	
	
	
	
@Test
public void bookIteminGuarentedthroughSearch() throws Exception{
	LoginPageUtils1 lpu=new LoginPageUtils1();
	lpu.loginToApplication("naresh@guarented.com", "neethu23");
	Thread.sleep(3000);
	HomePageUtils1 hpu=new HomePageUtils1();
	hpu.clickAndSendDataToSearchBar("basic kitchen package");
	hpu.bookIteminGuarented();
}	
}
