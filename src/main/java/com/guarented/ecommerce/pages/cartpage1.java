package com.guarented.ecommerce.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.guarented.ecommerce.TestBase.TestBase2;
import com.guarented.ecommerce.commonUtilss.CommonUtils1;


public class cartpage1 extends TestBase2{
	CommonUtils1 cu = new CommonUtils1();


	
	public By NEXT_button = By.id("action-button cart_next");
	public By continue_shopping_button = By.id("action-button continue_shop");
	public By itemprice=By.xpath("//*[@id='cart_table']/tbody/tr/td[2]");
	public By itemrefundmoney=By.xpath("//*[@id='cart_table']/tbody/tr/td[3]");
	public  By producttotalcost=By.xpath("//*[@id='cart_table']/tbody/tr/td[5]");
	public By addsymbolincartpage=By.xpath("//*[@id='cart_table']/tbody/tr/td[4]/div/span[3]/i");
	public By removesymbolincartpage=By.xpath("//*[@id='cart_table']/tbody/tr/td[4]/div/span[1]/i");
	public By productnameincartpage=By.xpath("//*[@id='cart_table']/tbody/tr/td[1]/div/span[2]/p[1]");
	
	//detailspage
	public By productname2=By.xpath("//*[@id='fea']/div[1]/div[2]/div[1]/div/div/h1");
	
	
	
	
	
	public WebElement getNextButtonicCart() {
		cu.explicitWait(driver, NEXT_button, 30L);
		return driver.findElement(NEXT_button);
	}
	public WebElement getContinue_Shopping_Button() {
		cu.explicitWait(driver, continue_shopping_button, 30L);
		return driver.findElement(continue_shopping_button);
	}
	public WebElement getItemPriceCart() {
		cu.explicitWait(driver, itemprice, 30L);
		return driver.findElement(itemprice);
	}
	public WebElement getitemrefundmoneyincart() {
		cu.explicitWait(driver, itemrefundmoney, 30L);
		return driver.findElement(itemrefundmoney);
	}
	public WebElement getproducttotalcostinCart() {
		cu.explicitWait(driver, producttotalcost, 30L);
		return driver.findElement(producttotalcost);
	}
	public WebElement getaddsymbolincartpageinCart() {
		cu.explicitWait(driver, addsymbolincartpage, 30L);
		return driver.findElement(addsymbolincartpage);
	}
	public WebElement getremovesymbolincartpageinCart() {
		cu.explicitWait(driver, removesymbolincartpage, 30L);
		return driver.findElement(removesymbolincartpage);
	}
	public WebElement getproductnameincartpageinCart() {
		cu.explicitWait(driver, productnameincartpage, 30L);
		return driver.findElement(productnameincartpage);
	}
	public void click_Next_Buttonincart() {
		//cu.explicitWait(driver, NEXT_button, 30L);
		System.out.println("Clicking the next button in cart page ");
getNextButtonicCart().click();
		
	}
	public void clickContinueshoppingButtonincart() {
		System.out.println("Clicking the continue shopping button in cart page  ");
		getContinue_Shopping_Button().click();
	}
	public void getpriceincartpage() {
	String itmeprice=getItemPriceCart().getText();
		//System.out.println("the item price in cart page "+itmeprice);
		}
	public void getrefundablepriceincart() {
		String itmeprice=getitemrefundmoneyincart().getText();
			//System.out.println("the item refundable price in cart page "+itmeprice);
			}
	public void gettotalcostincartpage(){
String totalitmepriceincartpage=driver.findElement(producttotalcost).getText();
		//System.out.println("the item cost(refundable+actual) price in cart page "+totalitmepriceincartpage);
		
	}
	public void clickingforincresingquantityincartpage(){

System.out.println("clicking + symbol in cart page");
getaddsymbolincartpageinCart().click();
				
			}
	public void clickingfordecreaseingquantityincartpage(){

		System.out.println("clicking _ symbol in cart page");
		getremovesymbolincartpageinCart().click();
						
					}

	
	
	
}
