package com.guarented.ecommerce.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.guarented.ecommerce.TestBase.TestBase2;
import com.guarented.ecommerce.commonUtilss.CommonUtils1;

public class confirmation_Page1 extends TestBase2 {
	public By cardondeliveryradiobutton = By.id("card_delivery");
	public By placeorderbutton = By.id("place_order_btn action-button");
	public By myordersbutton = By.id("complete_btn");
	public By productnameinconfirmationpage=By.xpath(".//*[@id='total_amount']/div/div[2]/p[1]");
	public By constanttextinconfirmationpage=By.xpath(".//*[@id='confirmation']/div/div[3]/div[1]/div[1]/p");
	public By ordernumberinproduct=By.xpath("//*[@id='complete']/div/p[2]");
	public By ordernumberinmyorderspage=By.xpath("//*[@id='tab-content-68']/div/md-content/div[1]/div/div[2]/div[1]/div[1]/p[2] | //*[@id='tab-content-77']/div/md-content/div[1]/div/div[2]/div[1]/div[1]/p[2] | //*[@id='tab-content-41']/div/md-content/div[1]/div/div[2]/div[1]/div[1]/p[2]");

	CommonUtils1 cu = new CommonUtils1();

	
	public WebElement getcardondeliveryradiobutton() {
		cu.explicitWait(driver, cardondeliveryradiobutton, 30L);
		return driver.findElement(cardondeliveryradiobutton);
	}
	public WebElement getplaceorderbutton_Button() {
		cu.explicitWait(driver, placeorderbutton, 30L);
		return driver.findElement(placeorderbutton);
	}
	public WebElement getmyordersbutton() {
		cu.explicitWait(driver, myordersbutton, 30L);
		return driver.findElement(myordersbutton);
	}
	public WebElement getconstanttextinconfirmationpage() {
		cu.explicitWait(driver, constanttextinconfirmationpage, 30L);
		return driver.findElement(constanttextinconfirmationpage);
	}
	public WebElement getproductnameinconfirmationpage() {
		cu.explicitWait(driver, productnameinconfirmationpage, 30L);
		return driver.findElement(productnameinconfirmationpage);
	}
	public WebElement getordernumberinproduct() {
		cu.explicitWait(driver, ordernumberinproduct, 30L);
		return driver.findElement(ordernumberinproduct);
	}
	public WebElement getordernumberinmyorderspage() {
		cu.explicitWait(driver, ordernumberinmyorderspage, 30L);
		return driver.findElement(ordernumberinmyorderspage);
	}
	public void selectcardondeliveryradiobutton() {
		System.out.println("select the cart on delivery in confirmation page ");
		getcardondeliveryradiobutton().click();
	}
	public void clickplaceorderbuttonbutton() {
		System.out.println("clicking the place order button in confirmation page  ");
		getplaceorderbutton_Button().click();
	}
	
	public void clickmyordersbutton() {
		System.out.println("clicking the myorders  button  ");
		getmyordersbutton().click();
		}
	
	
	



	

	 
}
