package com.guarented.ecommerce.Testplans;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.guarented.ecommerce.pageUtils.HomePageUtils1;
import com.guarented.ecommerce.pageUtils.LoginPageUtils1;
import com.guarented.ecommerce.pages.emailconfiguration;
import com.guarented.reportsbaseclass.BaseTest;

public class BokItemInGuarented extends BaseTest {

	
	
	@BeforeMethod
	public void setUP() throws IOException{
		init1();
		}
	 
	@Test
	public void bookIteminGuarentedthroughwholesearch() throws Exception{
		
	    test = extent.createTest("bookIteminGuarentedthroughwholesearch");
		
		
		System.out.println("bookitemthroughwholesearch testcase started");
		LoginPageUtils1 lpu=new LoginPageUtils1();
		lpu.loginToApplication("naresh@guarented.com", "neethu23");
		
		Thread.sleep(5000);
		HomePageUtils1 hpu=new HomePageUtils1();
		Thread.sleep(3000);
		hpu.verifyGuarentedtextinhomepage();
		Thread.sleep(5000);
	hpu.clickWholeSearchIcon();
		Thread.sleep(5000);
		hpu.clickAndSendDataToWholeSearchBar("front loading washing machine");
		Thread.sleep(5000);
		hpu.bookIteminGuarented();
		emailconfiguration ec=new emailconfiguration();
		ec.emailconfigurationmethod();
		System.out.println("bookitemthroughwholesearch testcase ended");
}	
	
@Test
public void bookIteminGuarentedthroughSearch() throws Exception{
	 test=extent.createTest("bookitemthroughsearch testcase started");
	System.out.println("bookitemthroughsearch testcase started");
	LoginPageUtils1 lpu=new LoginPageUtils1();
	lpu.loginToApplication("naresh@guarented.com", "neethu23");
	Thread.sleep(3000);
	HomePageUtils1 hpu=new HomePageUtils1();
	test.log(Status.INFO,"home page ended");
	//test.log(LogStatus.INFO, );
	Thread.sleep(3000);
	hpu.verifyGuarentedtextinhomepage();
	Thread.sleep(8000);
	hpu.clickAndSendDataToSearchBar("solo microwave");
	hpu.bookIteminGuarented();
	emailconfiguration ec=new emailconfiguration();
	ec.emailconfigurationmethod();
	test.log(Status.INFO,"email sent successfully");
	//test.log(LogStatus.INFO, );
	System.out.println("bookitemthroughsearch testcase ended");
}

///@Test(priority = 3, enabled = true, description = "book item through products")
@Test
public void bookIteminGuarentedthroughproducts() throws Exception{
	 test=extent.createTest("bookitemthroughproducts testcase started");

	System.out.println("bookitemthroughproducts testcase started");
	LoginPageUtils1 lpu=new LoginPageUtils1();
	lpu.loginToApplication("naresh@guarented.com", "neethu23");
	Thread.sleep(3000);
	HomePageUtils1 hpu=new HomePageUtils1();
	Thread.sleep(3000);
	
	hpu.verifyGuarentedtextinhomepage();
	Thread.sleep(9000);
	hpu.bookitemthroughproducts();
	hpu.bookIteminGuarented();
	System.out.println("bookitemthroughproducts testcase ended");
}
@Test
public void bookIteminGuarentedthroughRENTTOOWN() throws Exception{
	 test=extent.createTest("bookitemthroughrenttoown testcase started");
	 System.out.println("bookitemthroughrenttoown testcase started");
	LoginPageUtils1 lpu=new LoginPageUtils1();
	lpu.loginToApplication("naresh@guarented.com", "neethu23");
	Thread.sleep(3000);
	HomePageUtils1 hpu=new HomePageUtils1();
	Thread.sleep(3000);
	hpu.verifyGuarentedtextinhomepage();
	Thread.sleep(9000);
	hpu.clickRenttoown();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//*[@id='second_nav_bar']/ul/li[1]/button/p")).click();
	//click tables
	//Thread.sleep(5000);
	//driver.findElement(By.xpath("//*[@id='accordiongroup-919-5479-panel']/div/p[9]")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath(".//*[@id='product']/div[3]/div/div[2]/div/div[2]/a[2]/div/md-card/img")).click();
     hpu.bookIteminGuarented();
     System.out.println("bookitemthroughrenttoown testcase ended");
}

//(priority = 4, enabled = true, description = "book item through cart when cart is empty")
@Test		
public void bookitemthroughcartwhencartisempty() throws Exception{
	 test=extent.createTest("bookitemthroughcartwhencartisempty testcase started");
	System.out.println("bookitemthroughcartwhencartisempty testcase started");
	LoginPageUtils1 lpu=new LoginPageUtils1();
	lpu.loginToApplication("naresh@guarented.com", "neethu23");
	Thread.sleep(3000);
			Thread.sleep(5000);
			HomePageUtils1 hpu=new HomePageUtils1();
			hpu.verifyGuarentedtextinhomepage();
			Thread.sleep(3000);
			Thread.sleep(9000);
			hpu.bookitemthroughcartwhencartempty();
			hpu.bookIteminGuarented();
			System.out.println("bookitemthroughcartwhencartisempty testcase ended");
		}
		
		
		
		
		
		
}
		
