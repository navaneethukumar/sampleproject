package com.guarented.ecommerce.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.guarented.ecommerce.TestBase.TestBase2;
import com.guarented.ecommerce.commonUtilss.CommonUtils1;

public class Homepage1 extends TestBase2 {
	
	CommonUtils1 cu=new CommonUtils1();
	
	public By products_in_navbar = By.id("rental_tab");
	public By renttoown_in_navbar = By.id("faq_tab own_tab");
	public By main_search_in_navbar = By.id("home_search2");
	public By whole_search_in_navbar = By.id("search_clr");
	public By cart_icon_in_navbar = By.id("cart_white");
	
	public By G_Button_in_navbar = By.id("logo");
	public By searchtextboxinwholesearch=By.id("input_0");
	public By productname=By.xpath( ".//*[@id='product']/div[3]/div/div[2]/div/div[2]/a[2]/div/md-card/img");
	
	public WebElement getproducts_in_navbar() {
		cu.explicitWait(driver, products_in_navbar, 30L);
		return driver.findElement(products_in_navbar);
	}
	public WebElement getrenttoown_in_navbar() {
		cu.explicitWait(driver, renttoown_in_navbar, 30L);
		return driver.findElement(renttoown_in_navbar);
	}
	public WebElement getmain_search_in_navbar() {
		cu.explicitWait(driver, main_search_in_navbar, 30L);
		return driver.findElement(main_search_in_navbar);
	}
	public WebElement getwhole_search_in_navbar() {
		cu.explicitWait(driver, whole_search_in_navbar, 30L);
		return driver.findElement(whole_search_in_navbar);
	}
	public WebElement getcart_icon_in_navbar() {
		cu.explicitWait(driver, cart_icon_in_navbar, 30L);
		return driver.findElement(cart_icon_in_navbar);
	}
	public WebElement getG_Button_in_navbar() {
		cu.explicitWait(driver, G_Button_in_navbar, 30L);
		return driver.findElement(G_Button_in_navbar);
	}
	public WebElement getsearchtextboxinwholesearch() {
		cu.explicitWait(driver, searchtextboxinwholesearch, 30L);
		return driver.findElement(searchtextboxinwholesearch);
	}
	public WebElement getproductname() {
		cu.explicitWait(driver, productname, 30L);
		return driver.findElement(productname);
	}
	
	
	
	
	public void bookitemthroughproducts() throws InterruptedException
	{
		
		CommonUtils1.waitForElementToBeVisible(driver, products_in_navbar);
		clickProductsButt();
		//Thread.sleep(8000);
		
		CommonUtils1.waitForElementToBeVisible(driver, productname);
driver.findElement(productname).click();
	
		
	    // Thread.sleep(3000);
}
	
	public void verifyGuarentedtextinhomepage(){
		
		String value1 = driver.findElement(By.xpath(".//*[@id='container']/div[2]/div/div[1]/h1")).getText();
		String expected1 = "GUARENTED";
		System.out.println("the page validation is  " + value1);
		Assert.assertEquals(value1, expected1);
		System.out.println("tha validation success in home page ");
	}
	
	public void click_G_Button() {
		System.out.println("Clicking the G button in navigation bar ");
		getG_Button_in_navbar().click();
	}
	public void clickProductsButt() {
		System.out.println("Clicking the Products button in navigation bar ");
		getproducts_in_navbar().click();
	}

	public void clickSearchButton() {
		System.out.println("Clicking the Search button in navigation bar ");
		getmain_search_in_navbar().click();
	}
	public void clickAndSendDataToSearchBar(String search) throws InterruptedException {
		System.out.println("Clicking the Search button in navigation bar ");
		driver.findElement(main_search_in_navbar).click();
		Thread.sleep(2000);
		driver.findElement(main_search_in_navbar).sendKeys(search);
		//with login
		driver.findElement(By.xpath("//*[@id='ul-21']/li/md-autocomplete-parent-scope/span[2] | //*[@id='ul-1']/li/md-autocomplete-parent-scope/span[2]")).click();
		//driver.findElement(By.xpath("//*[@id='ul-1']/li/md-autocomplete-parent-scope/span[2] | //*[@id='ul-1']/li")).click();
		//driver.findElement(By.xpath("//*[contains(text(),'Solo Microwave')]")).click();
				//*[contains(text(),'Solo Microwave')]
	}
	public void clickAndSendDataToWholeSearchBar(String search) throws InterruptedException {
		System.out.println("Clicking the  whole Search button in navigation bar ");
		driver.findElement(searchtextboxinwholesearch).click();
		
		driver.findElement(searchtextboxinwholesearch).sendKeys(search);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='dialogContent_search_box']/div/div/div[1]/div[1]/md-card/img")).click();
		
	
		
		
		
	
		
		
	}
	public void sendindatainsearchSearchButton() {
		System.out.println("sending data in search bar ");
		getmain_search_in_navbar().sendKeys("t");
	}


	public void clickWholeSearchIcon() {
		System.out.println("Clicking the whole  Search icon in navigation bar ");
		getwhole_search_in_navbar().click();
	}

	public void clickRenttoown() {
		System.out.println("Clicking the rent to own in navigation bar");
		driver.findElement(renttoown_in_navbar).click();
	}
	public void clickCartsymbol() {
		System.out.println("Clicking the cart symbol");
		getcart_icon_in_navbar().click();
	}
	public void bookitemthroughsearch() throws InterruptedException
	{
		clickSearchButton();
		Thread.sleep(2000);
		sendindatainsearchSearchButton();
		Thread.sleep(2000);
		System.out.println("taking 1 st element");
		driver.findElement(By.xpath("//*[@id='ul-21']/li[1]")).click();}
	public void bookitemthroughRENTINOWN() throws InterruptedException
	{
		clickRenttoown();
		Thread.sleep(2000);
		System.out.println("select furniture");
		driver.findElement(By.xpath(".//*[@id='second_nav_bar']/ul/li[1]/button/p")).click();
		Thread.sleep(3000);
		
		System.out.println("select 1 st item");
		
		String imagename=driver.findElement(By.xpath("//*[@id='product']/div[3]/div/div[2]/div/div[1]/a[3]/div/h2")).getText();
		System.out.println("value is "+imagename);
		System.out.println("taking 1 st element");
		driver.findElement(By.xpath(".//*[@id='product']/div[3]/div/div[2]/div/div[1]/a[2]/div/md-card/img")).click();
		/*String name=driver.findElement(By.xpath(".//*[@id='product']/div[3]/div/div[2]/div/div[1]/a[2]/div/md-card/img")).getText();
	System.out.println("name is "+name);*/
		
		Thread.sleep(8000);	
	//String url=driver.getCurrentUrl();
	/*System.out.println("url is  "+url);
	String expected=driver.findElement(By.xpath("//*[@id='fea']/div[1]/div[2]/div[1]/div/div/h1")).getText();
	System.out.println("expected is  "+expected  );
	Assert.assertTrue("the selected item is not displaying in product details page", url.equalsIgnoreCase(expected));
	System.out.println("selected item is correct display in product details page");
	
	*/
	}}
	
		
	

	
	