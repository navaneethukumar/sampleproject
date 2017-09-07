package com.guarented.ecommerce.Testplans;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.guarented.ecommerce.pageUtils.HomePageUtils1;
import com.guarented.ecommerce.pageUtils.LoginPageUtils1;
import com.guarented.ecommerce.pageUtils.cartpageUtils1;
import com.guarented.ecommerce.pageUtils.productdetailsutils1;
import com.guarented.reportsbaseclass.BaseTest;

public class CartPageTestPlan extends BaseTest {
	
	
	@BeforeMethod
	public void setUP() throws IOException{
		init1();
		}
	
	
	
	    @Test
		public void calculatepricereletedtoquantity() throws Exception{
	    	 test = extent.createTest("calculatepricereletedtoquantity");
	    
			LoginPageUtils1 lpu=new LoginPageUtils1();
			lpu.loginToApplication("naresh@guarented.com", "neethu23");
			Thread.sleep(5000);
			test.log(Status.INFO,"home page ended");
			
			HomePageUtils1 hpu=new HomePageUtils1();
			Thread.sleep(3000);
			hpu.verifyGuarentedtextinhomepage();
			test.log(Status.INFO, " home page Title verified");
			//test.log(LogStatus.PASS,);
			Thread.sleep(3000);
			hpu.clickProductsButt();
			Thread.sleep(5000);
			driver.findElement(By.xpath(".//*[@id='product']/div[3]/div/div[2]/div/div[4]/a[2]/div/md-card/img")).click();

			Thread.sleep(5000);
			cartpageUtils1 cpu=new cartpageUtils1();
			test.log(Status.INFO, "cart finished ");
			//test.log(LogStatus.INFO,);
			cpu.validaterpicerelatedtoQuantityinCart();
	}
	    @Test
		public void calculatepricereletedtowithallquantity() throws Exception{
	    	 test = extent.createTest("calculatepricereletedtowithallquantity");
	        LoginPageUtils1 lpu=new LoginPageUtils1();
			lpu.loginToApplication("naresh@guarented.com", "neethu23");
			Thread.sleep(5000);
			test.log(Status.INFO,"home page ended");
			HomePageUtils1 hpu=new HomePageUtils1();
			Thread.sleep(3000);
			hpu.verifyGuarentedtextinhomepage();
			test.log(Status.INFO, " home page Title verified");
			Thread.sleep(3000);
			hpu.clickProductsButt();
			Thread.sleep(5000);
			driver.findElement(By.xpath(".//*[@id='product']/div[3]/div/div[2]/div/div[4]/a[2]/div/md-card/img")).click();

			Thread.sleep(5000);
			productdetailsutils1 pdu=new productdetailsutils1();
			pdu.validationsinproductdetailspage();
			pdu.click_Addtocart_Button();
			pdu.clickCheckoutButton();
			cartpageUtils1 cpu=new cartpageUtils1();
			test.log(Status.INFO, "cart finished ");
			cpu.validdationsincartpage();
		
	}

	
	@Test
	public void calculatepricereletedtoquantitywithdouble() throws Exception{
		 test = extent.createTest("calculatepricereletedtoquantitywithdouble");
		LoginPageUtils1 lpu=new LoginPageUtils1();
		lpu.loginToApplication("naresh@guarented.com", "neethu23");
		Thread.sleep(5000);
		HomePageUtils1 hpu=new HomePageUtils1();
		Thread.sleep(3000);
		hpu.verifyGuarentedtextinhomepage();
		test.log(Status.INFO,"home page text verified");
		Thread.sleep(3000);
		hpu.clickProductsButt();
		Thread.sleep(5000);
		test.log(Status.INFO,"home page ended");
		//test.log(LogStatus.INFO, "cart findcvcddvished ");
		driver.findElement(By.xpath(".//*[@id='product']/div[3]/div/div[2]/div/div[4]/a[2]/div/md-card/img")).click();

		Thread.sleep(5000);
		cartpageUtils1 cpu=new cartpageUtils1();
		test.log(Status.INFO, "cart startreddd ");
		//test.log(LogStatus.INFO,);
		cpu.validaterpicerelatedtoQuantityindoublequantity();
		test.log(Status.INFO, "cart finished ");
		//test.log(LogStatus.INFO,;
}


}
