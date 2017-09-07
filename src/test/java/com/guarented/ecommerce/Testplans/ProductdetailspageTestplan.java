package com.guarented.ecommerce.Testplans;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.guarented.ecommerce.pageUtils.HomePageUtils1;
import com.guarented.ecommerce.pageUtils.productdetailsutils1;
import com.guarented.reportsbaseclass.BaseTest;

public class ProductdetailspageTestplan extends BaseTest {
	
	
	
	
	@BeforeMethod
	public void setUP() throws IOException{
		init1();
		}
	 
	@Test
	public void scrooldowninproductdetailspage() throws Exception{
		
	    test = extent.createTest("scrooldowninproductdetailspage");
		
		
		System.out.println("bookitemthroughwholesearch testcase started");
	/*	LoginPageUtils1 lpu=new LoginPageUtils1();
		lpu.loginToApplication("naresh@guarented.com", "neethu23");*/
		
		Thread.sleep(5000);
		HomePageUtils1 hpu=new HomePageUtils1();
		Thread.sleep(3000);
		hpu.verifyGuarentedtextinhomepage();
		Thread.sleep(5000);
		String cartnumberinhomepage= driver.findElement(By.xpath("//*[@id='cart_tab']/span/p")).getText();
		//System.out.println("with out login cart number is in homepage  "+cartnumberinhomepage);
		String expectedcartnumberinhomepage="0";
		Assert.assertEquals(cartnumberinhomepage, expectedcartnumberinhomepage);
		System.out.println("cart is displaying zero correctly with out login in homepage");
	
		hpu.clickProductsButt();
		Thread.sleep(7000);
		//cart number with out login
		String cartnumber= driver.findElement(By.xpath("//*[@id='cart_tab']/span/p")).getText();
		//System.out.println("with out login cart number is  "+cartnumber);
		String expectedcartnumber="0";
		Assert.assertEquals(cartnumber, expectedcartnumber);
		System.out.println("cart is displaying zero correctly with out login in products page ");
		WebElement element =driver.findElement(By.xpath("//*[@id='product']/div[3]/div/div[2]/div/div[26]/a[2]/div/md-card/img"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='product']/div[3]/div/div[2]/div/div[21]/a[3]/div/h2")).click();
		productdetailsutils1 pu=new productdetailsutils1();
		Thread.sleep(5000);
		pu.verifyproductname();
		pu.validationsinproductdetailspage();
		String cartnumberinproductsdetails= driver.findElement(By.xpath("//*[@id='cart_tab']/span/p")).getText();
		//System.out.println("with out login cart number is  "+cartnumberinproductsdetails);
		String expectedcartnumberinproductsdetails="0";
		Assert.assertEquals(cartnumberinproductsdetails, expectedcartnumberinproductsdetails);
		System.out.println("cart is displaying zero correctly with out login in products details page ");
		String consatnttext=driver.findElement(By.xpath("//*[@id='fea']/div[1]/div[2]/div[2]/div[1]/p[1]")).getText();
		//System.out.println("ttext is  " +consatnttext);
		Assert.assertTrue(consatnttext.contains("Plan Options:"));
		System.out.println("paln options text is verified in productt details page ");
		driver.findElement(By.xpath("//*[@id='fea']/div[2]/div[1]/div/div[2]/img")).click();
		Assert.assertTrue(consatnttext.contains("Plan Options:"));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='fea']/div[2]/div[1]/div/div[3]/img")).click();
		Assert.assertTrue(consatnttext.contains("Plan Options:"));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='fea']/div[2]/div[1]/div/div[4]/img")).click();
		Assert.assertTrue(consatnttext.contains("Plan Options:"));
		Thread.sleep(2000);
		System.out.println("images are changing correctly in product details page");
		Thread.sleep(4000);
		//.//*[@class='md-text ng-binding']
		driver.findElement(By.id("select_19")).click();
		Thread.sleep(2000);
		
		List<WebElement>dropdownfields=driver.findElements(By.xpath(".//*[@class='md-text ng-binding']"));
		System.out.println("dropdownfields "+dropdownfields.size());

	dropdownfields.get(0).click();
	System.out.println("passed");
	Thread.sleep(6000);
	pu.verifyproductname();
	
	driver.navigate().back();
	Thread.sleep(6000);
	//driver.findElement(By.id("select_19")).click();
	
	
	//dropdownfields.get(1).click();

		
		
		
		
		
		
		
		
	/*	WebElement ele=driver.findElement(By.cssSelector("body"));
		ele.sendKeys("\uE00F");
		Thread.sleep(8000);
		driver.findElement(By.xpath("//*[@id='radio_24']/div[1]/div[2]")).click();
		Thread.sleep(2000);
		String secondradioconstanttext=driver.findElement(By.xpath("//*[@id='fea']/div[4]/div[1]/div/div/div/div/div[3]/div/div/div[1]/p")).getText();
		Assert.assertTrue(secondradioconstanttext.contains("Rent for as long as you want to!"));
		driver.findElement(By.xpath("//*[@id='radio_25']/div[1]/div[3]")).click();
		Thread.sleep(2000);
		String thirdradioconstanttext=driver.findElement(By.xpath("//*[@id='fea']/div[4]/div[1]/div/div/div/div/div[4]/div/div/div[1]/p")).getText();
		Assert.assertTrue(thirdradioconstanttext.contains("Buy what you are renting! Pay the difference and its yours!"));
		driver.findElement(By.xpath("//*[@id='radio_26']/div[1]/div[4]")).click();
		Thread.sleep(2000);
		String fortthradioconstanttext=driver.findElement(By.xpath("//*[@id='fea']/div[4]/div[1]/div/div/div/div/div[5]/div/div/div[1]/p")).getText();
		Assert.assertTrue(fortthradioconstanttext.contains("Additional 6 months free warranty!"));
		
		System.out.println("radio buttons slides perfectt in product detaiils page");
		*/
		//*[@id="radio_24"]/div[1]/div[1]
		//*[@id="radio_25"]/div[1]/div[2]
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*List<WebElement> list=driver.findElements(By.tagName("img"));
		System.out.println("number of images in page is  "+list.size());
		for(int i=0;i<list.size();i++)
		{*/
			/*if(!list.get(i).getAttribute("src").equals(" ")&&!(list.get(i).getAttribute("src")==null)){
				System.out.println(list.get(i).getAttribute("src"));
			}*/
		}		

		
	
				
			
		
		

		/*  //Find total No of images on page and print In console.
		    List<WebElement> total_images = driver.findElements(By.tagName("img"));
		    System.out.println("Total Number of images found on page = " + total_images.size());

		    //for loop to open all images one by one to check response code.
		    boolean isValid = false;
		    for (int i = 0; i < total_images.size(); i++) {
		     String url = total_images.get(i).getAttribute("src");

		     if (url != null) {

		      //Call getResponseCode function for each URL to check response code.
		      isValid = getResponseCode(url);

		      //Print message based on value of isValid which Is returned by getResponseCode function.
		      if (isValid) {
		       System.out.println("Valid image:" + url);
		       System.out.println("----------XXXX-----------XXXX----------XXXX-----------XXXX----------");
		       System.out.println();
		      } else {
		       System.out.println("Broken image ------> " + url);
		       System.out.println("----------XXXX-----------XXXX----------XXXX-----------XXXX----------");
		       System.out.println();
		      }
		     } else {    
		      //If <a> tag do not contain href attribute and value then print this message
		      System.out.println("String null");
		      System.out.println("----------XXXX-----------XXXX----------XXXX-----------XXXX----------");
		      System.out.println();
		      continue;
		     }
		    }
		}

	private boolean getResponseCode(String url) {
		// TODO Auto-generated method stub
		return true;
	} 
		*/
		
		
		
		
		
		
		
		
		/*
		 WebElement Image = driver.findElement(By.xpath("//*[@id='product']/div[3]/div/div[2]/div/div[24]/a[3]/div/h2"));
	        
	        //Used points class to get x and y coordinates of element.
	        Point point = Image.getLocation();
	        int xcord = point.getX();
	        System.out.println("Element's Position from left side Is "+xcord +" pixels.");
	        int ycord = point.getY();
	        System.out.println("Element's Position from top side Is "+ycord +" pixels.");
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,50)", "");
		Thread.sleep(5000);
		//Robot robot = new Robot();
		Thread.sleep(3000);
	//	robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		//robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
		
		*/
		
		
		
		
		/*hpu.bookIteminGuarented();
		emailconfiguration ec=new emailconfiguration();
		ec.emailconfigurationmethod();
		System.out.println("bookitemthroughwholesearch testcase ended");*/
}	
	
	
	
	

	
	


