package com.guarented.ecommerce.Testplans;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.guarented.ecommerce.pageUtils.Home_footerPageutils;
import com.guarented.reportsbaseclass.BaseTest;

public class HomePageFooterLinksTestPlan extends BaseTest {
	
	@BeforeMethod
	public void setUP() throws IOException{
		init1();
		}
	@AfterClass
	public void closebrowser(){
		driver.close();
	}
	 
	@Test
	public void verifyHomePageSocialSiteIcons() throws InterruptedException{
		 test=extent.createTest("verifyHomePageSocialSiteIcons");
		Home_footerPageutils hft=new Home_footerPageutils();
		
		hft.windowscrolldowninhomepage();
	//facebook icon
			hft.clickFacebookIcon1();
			String parentHandle = driver.getWindowHandle();
	        hft.childwindow();
			System.out.println("Guaranted facebook url  is "+driver.getCurrentUrl());
			Assert.assertTrue(driver.getCurrentUrl().contains("https://www.facebook.com/guarented/"), "facebook url display wrong");
			System.out.println("face book url verified successfully");
			driver.close();
		    driver.switchTo().window(parentHandle);
			hft.windowscrolldowninhomepage();
			//instagram icon
			hft.clickInstagramIcon();
	         hft.childwindow();
			System.out.println("instagramurl "+driver.getCurrentUrl());
			Assert.assertTrue(driver.getCurrentUrl().equals("https://www.instagram.com/goguarented/"), "instagram url display wrong");
			System.out.println("instagram url verified successfully");
			driver.close();
			driver.switchTo().window(parentHandle);
			//twitter icon
			hft.clickTwitterIcon();
	        hft.childwindow();
			System.out.println("twitter  url "+driver.getCurrentUrl());
			Assert.assertTrue(driver.getCurrentUrl().equals("https://twitter.com/guarented"), "twitter url display wrong");
			System.out.println("INC 24 url verified successfully");
			driver.close();
			driver.switchTo().window(parentHandle);
			//medium icon
			hft.clickMediumIcon();
	        hft.childwindow();
			System.out.println("medium url "+driver.getCurrentUrl());
			Assert.assertTrue(driver.getCurrentUrl().equals("https://medium.com/@guarented"), "medium url display wrong");
			System.out.println("medium url verified successfully");
			driver.close();
			driver.switchTo().window(parentHandle);
			//google plus icon
			hft.clickGooglePlusIcon();
	        hft.childwindow();
			System.out.println("google plus url " + driver.getCurrentUrl());
			Assert.assertTrue(driver.getCurrentUrl().equals("https://plus.google.com/+GuaRentedRentalsBengaluru"), "google plus  url display wrong");
			System.out.println("google plus url verified successfully");
			driver.close();
			driver.switchTo().window(parentHandle);
			}
		@Test
		public void verifyhomepagefooterlinksofHome_Appliances_on_Rent() throws InterruptedException{
			test = extent.createTest("verifyhomepagefooterlinksofHome_Appliances_on_Rent");
			
			
			Home_footerPageutils hft=new Home_footerPageutils();	
			hft.windowscrolldowninhomepage();
			
			//washing machine on rent 
			hft.clickwashingmachinesonrent();
			String parentHandle = driver.getWindowHandle();
	        hft.childwindow();
			System.out.println("washing machine on rent url  is "+driver.getCurrentUrl());
			Assert.assertTrue(driver.getCurrentUrl().contains("https://staging.guarented.com/bangalore/washing-machine?nicks=washer"), "washing machine on rent url display wrong");
			System.out.println("washing machine url verified successfully");
			driver.close();
		    driver.switchTo().window(parentHandle);
			hft.windowscrolldowninhomepage();
			//refregirators on rent
			hft.clickrefrigeratorsonrent();
	         hft.childwindow();
			System.out.println("refregirators on rent url "+driver.getCurrentUrl());
			Assert.assertTrue(driver.getCurrentUrl().equals("https://staging.guarented.com/bangalore/refrigerator?nicks=fridge&parent=appliances"), "refregirators on rent url display wrong");
			System.out.println("refregirators on rent url verified successfully");
			driver.close();
			driver.switchTo().window(parentHandle);
			//microwaves on rent
			hft.clickmicrowavesonrent();
	        hft.childwindow();
			System.out.println("micro waves on rent  url "+driver.getCurrentUrl());
			Assert.assertTrue(driver.getCurrentUrl().equals("https://staging.guarented.com/bangalore/microwave?nicks=microwave&parent=appliances"), "micro waves on rent url display wrong");
			System.out.println("micro waves on rent url verified successfully");
			driver.close();
			driver.switchTo().window(parentHandle);
			//television on rent
			hft.clicktelevisionsonrent();
	        hft.childwindow();
			System.out.println("television on rent  url "+driver.getCurrentUrl());
			Assert.assertTrue(driver.getCurrentUrl().equals("https://staging.guarented.com/bangalore/television?nicks=tv&parent=appliances"), "television on rent url display wrong");
			System.out.println("television on rent url verified successfully");
			driver.close();
			driver.switchTo().window(parentHandle);
				}
		@Test
		public void verifyhomepagefooterlinksofHome_Furniture_on_Rent() throws InterruptedException{
			test = extent.createTest("verifyhomepagefooterlinksofHome_Furniture_on_Rent");
			
			Home_footerPageutils hft=new Home_footerPageutils();
			hft.windowscrolldowninhomepage();
		
			//sofas on rent 
			hft.clicksofasonrent();
			String parentHandle = driver.getWindowHandle();
	        hft.childwindow();
			System.out.println("sofas on rent   url  is "+driver.getCurrentUrl());
			Assert.assertTrue(driver.getCurrentUrl().contains("https://staging.guarented.com/bangalore/sofas?nicks=furn-sofa"), "sofas on rent url display wrong");
			System.out.println("sofas on rent  url verified successfully");
			driver.close();
		    driver.switchTo().window(parentHandle);
			hft.windowscrolldowninhomepage();
			//beds on rent
			hft.clickbedsonrent();
	         hft.childwindow();
			System.out.println("beds on rent url "+driver.getCurrentUrl());
			Assert.assertTrue(driver.getCurrentUrl().equals("https://staging.guarented.com/bangalore/beds?nicks=furn-bed&parent=furniture"), "beds on rent url display wrong");
			System.out.println("bedson rent url verified successfully");
			driver.close();
			driver.switchTo().window(parentHandle);
			//mattresses on rent
			hft.clickmatressesonrent();
	        hft.childwindow();
			System.out.println("mattresses on rent  url "+driver.getCurrentUrl());
			Assert.assertTrue(driver.getCurrentUrl().equals("https://staging.guarented.com/bangalore/mattresses?nicks=furn-mtrs&parent=furniture"), "mattresses on rent url display wrong");
			System.out.println("mattresses on rent url verified successfully");
			driver.close();
			driver.switchTo().window(parentHandle);
			//recliners on rent
			hft.clickreclinersonrent();
	        hft.childwindow();
			System.out.println("recliners on rent  url "+driver.getCurrentUrl());
			Assert.assertTrue(driver.getCurrentUrl().equals("https://staging.guarented.com/bangalore/recliners?nicks=furn-recl&parent=furniture"), "recliners on rent url display wrong");
			System.out.println("recliners on rent url verified successfully");
			driver.close();
			driver.switchTo().window(parentHandle);
			//study chairs on rent
			hft.clickstudychairsonrent();
	        hft.childwindow();
			System.out.println("study chairs  on rent  url "+driver.getCurrentUrl());
			Assert.assertTrue(driver.getCurrentUrl().equals("https://staging.guarented.com/bangalore/study-chairs?nicks=furn-stdy-chr&parent=furniture"), "study chairs on rent  url display wrong");
			System.out.println("study chairs on rent url verified successfully");
			
		
				}
		
		
		
	}


