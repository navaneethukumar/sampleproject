package com.guarented.ecommerce.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.guarented.ecommerce.TestBase.TestBase2;
import com.guarented.ecommerce.commonUtilss.CommonUtils1;

public class productdetailspage1 extends TestBase2 {
	
	CommonUtils1 cu = new CommonUtils1();
	String searchParamaterType;
	
	public By addtocartbutton = By.id("add_to_kart");
	public By checkoutbutton = By.id("checkout_btn");
	public By itemcostinproductdetailspage=By.xpath("//*[@id='fea']/div[1]/div[2]/div[1]/p[2]");
	
	public By knowmorebutton=By.xpath("//*[@id='fea']/div[1]/div[2]/div[4]/div[2]/a/button/span");
	public By productname=By.xpath("//*[@id='fea']/div[1]/div[2]/div[1]/div/div/h1");
	public By breadcumbsinproductdetailspage=By.xpath(".//*[@id='items']/div[1]/div/breadcrumbs/div/a[5]/p");
	public By renttoowntext=By.xpath(".//*[@id='fea']/div[4]/div[1]/div/div/p");
	public By verifymessage=By.id("select_19");
	
	
	public WebElement getaddtocartbutton() {
		cu.explicitWait(driver, addtocartbutton, 30L);
		return driver.findElement(addtocartbutton);
	}
	public WebElement getcheckoutbutton() {
		cu.explicitWait(driver, checkoutbutton, 30L);
		return driver.findElement(checkoutbutton);
	}
	public WebElement getitemcostinproductdetailspage() {
		cu.explicitWait(driver, itemcostinproductdetailspage, 30L);
		return driver.findElement(itemcostinproductdetailspage);
	}
	public WebElement getknowmorebutton() {
		cu.explicitWait(driver, knowmorebutton, 30L);
		return driver.findElement(knowmorebutton);
	}
	public WebElement getproductname() {
		cu.explicitWait(driver, productname, 30L);
		return driver.findElement(productname);
	}
	public WebElement getbreadcumbsinproductdetailspage() {
		cu.explicitWait(driver, breadcumbsinproductdetailspage, 30L);
		return driver.findElement(breadcumbsinproductdetailspage);
	}
	public WebElement getrenttoowntext() {
		cu.explicitWait(driver, renttoowntext, 30L);
		return driver.findElement(renttoowntext);
	}
	public WebElement getverifymessage() {
		cu.explicitWait(driver, verifymessage, 30L);
		return driver.findElement(verifymessage);
	}
	public void clickCheckoutButton() {
		System.out.println("Clicking the checkout button in product details page  ");
		getcheckoutbutton().click();
	}
	public void clickknowmorebutton(){
		System.out.println("Clicking the know more  button in product details page  ");
		getknowmorebutton().click();
		
	
	
	
}}
