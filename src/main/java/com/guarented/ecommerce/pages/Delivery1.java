package com.guarented.ecommerce.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.guarented.ecommerce.TestBase.TestBase2;
import com.guarented.ecommerce.commonUtilss.CommonUtils1;

public class Delivery1 extends TestBase2 {
	
	CommonUtils1 cu = new CommonUtils1();
	public By mobile_number_fieldindeliverypage = By.id("address_mbl");
	public By pincode_fieldindeliverypage = By.id("address_pin");
	public By nextbuttonindeliveryindeliverypage = By.xpath("//*[@id='action-button']");
	public By backbuttonindeliveryindeliverypage = By.id("//*[@id='action-button']");
	public By houseNumberindeliverypage=By.name("house");
	public By areaindeliverypage=By.name("area");	
	public By societynameindeliverypage=By.name("street");
	
	
	
	
	
	public WebElement getmobile_number_field() {
		cu.explicitWait(driver, mobile_number_fieldindeliverypage, 30L);
		return driver.findElement(mobile_number_fieldindeliverypage);
	}
	public WebElement getpincode_field() {
		cu.explicitWait(driver, pincode_fieldindeliverypage, 30L);
		return driver.findElement(pincode_fieldindeliverypage);
	}
	public WebElement getnextbuttonindelivery() {
		cu.explicitWait(driver, nextbuttonindeliveryindeliverypage, 30L);
		return driver.findElement(nextbuttonindeliveryindeliverypage);
	}
	public WebElement getbackbuttonindelivery() {
		cu.explicitWait(driver, backbuttonindeliveryindeliverypage, 30L);
		return driver.findElement(backbuttonindeliveryindeliverypage);
	}
	public WebElement getaddress() {
		cu.explicitWait(driver, houseNumberindeliverypage, 30L);
		return driver.findElement(houseNumberindeliverypage);
	}
	public WebElement getarea() {
		cu.explicitWait(driver, areaindeliverypage, 30L);
		return driver.findElement(areaindeliverypage);
	}
	public WebElement getsocietynameindeliverypage() {
		cu.explicitWait(driver, societynameindeliverypage, 30L);
		return driver.findElement(societynameindeliverypage);
	}

	
	
	
	
	 
	public void entermobilenumber() {
		System.out.println("Entering the mobile number field in delivery page ");
		getmobile_number_field().sendKeys("2323232323");
	}
	public void enterpincodefield() {
		System.out.println("Entering the pincode in delivery page ");
		getpincode_field().sendKeys("500010");
	}
	 
		public void clicknextbuttonindelivery() throws InterruptedException {
         By mySelector = By.xpath("//*[@id='action-button']");
		  
		  List<WebElement> myElements1 = driver.findElements(mySelector);
		  for(WebElement e1 : myElements1) {
		  System.out.println("values are payment  "+ e1.getText());
		  Thread.sleep(6000);
		  
		  if( e1.getText().equals("NEXT")) e1.click(); }
		}
		public void clickbackbutton() {
			System.out.println("clicking the back button in delivery page  ");
			getbackbuttonindelivery().click();
		}
		
		
		
		
		

}
