package com.guarented.ecommerce.pageUtils;

import org.testng.Assert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;


import com.guarented.ecommerce.commonUtilss.CommonUtils1;
import com.guarented.ecommerce.pages.productdetailspage1;


public class productdetailsutils1 extends productdetailspage1{

	CommonUtils1 cu=new CommonUtils1();
	public static ExtentHtmlReporter htmlReporter;
    public static ExtentReports extent;
    public static ExtentTest test;
	
	public void click_Addtocart_Button() {
	cu.explicitWait(driver, addtocartbutton, 30L);
	System.out.println("Clicking the add to cart button in product details page  ");
		driver.findElement(addtocartbutton).click();
		
		
	}
		public void getdetailsofselectedproduct(){
			getproductpriceinproductdetailspage();
			getproductnameinproductdetailspage();
			getbreadcumbpathinproductdetailspage();			
		
			
	}
	
	public void getproductpriceinproductdetailspage(){
		String productpriceinproductpage=driver.findElement(itemcostinproductdetailspage).getText();
		System.out.println("item price in productdetails page   "+productpriceinproductpage);
	}
	
	
	public void getproductnameinproductdetailspage(){
		String productnameindetailspage=driver.findElement(productname).getText();
		System.out.println("the product name in product details page is : "+productnameindetailspage);
		
	}
	public void getbreadcumbpathinproductdetailspage(){
		String productnameindetailspage=driver.findElement(breadcumbsinproductdetailspage).getText();
		System.out.println("the breadcumb path in product details page is : "+productnameindetailspage);
		
	}
	public void getrenttoownconstanttext(){
		String renttoownconstanttextindetailspage=driver.findElement(renttoowntext).getText();
		System.out.println("the constant text in product details page is : "+renttoownconstanttextindetailspage);
		Assert.assertTrue(renttoownconstanttextindetailspage.equalsIgnoreCase("Rent to Own"));
		
	}
	public void getverifymessage1(){
		String verifymessagetext=driver.findElement(verifymessage).getText();
		//System.out.println("constant text in product details page is : "+ verifymessagetext);
		
	}
	public void verifyproductname() throws InterruptedException{
		Thread.sleep(5000);
		String productnameindetailspage=driver.findElement(productname).getText().toLowerCase();
		String breadcumbtext=driver.findElement(breadcumbsinproductdetailspage).getText().toLowerCase();
		System.out.println("product names are equal in breadcumbs and product details page");
		
		Assert.assertEquals(productnameindetailspage,breadcumbtext, "product names are not equal");
		//test.log(Status.INFO, " product names are equal in breadcumbs and product details page");
			}
	
	public void validationsinproductdetailspage() throws InterruptedException{
		productdetailsutils1 pd=new productdetailsutils1();
		Thread.sleep(4000);
        Assert.assertTrue(driver.getCurrentUrl().contains("https://staging.guarented.com/bangalore/rent/")|| driver.getCurrentUrl().contains("https://www.guarented.com/bangalore/rent/"));
    	//test.log(Status.INFO, "url verified successful in product details page");
    //	test.log(Status.PASS,);
        
        System.out.println("tha URL  validation success in product details page ");
		String expectedtitle = getproductname().getText();
		System.out.println("expected productt details page  title  is "+expectedtitle);
		//test.log(Status.INFO, "Login page ended");
		//Assert.assertTrue(driver.getTitle().contains(expectedtitle));
		System.out.println("the  actual  product details page title  is  " + driver.getTitle());
	//Assert.assertTrue(driver.getTitle().contains(expectedtitle)|| driver.getTitle().contains("Double Door Refridgerator On Rent In Bangalore - GuaRented Rentals"), "title mismatch in product details page");
	
		/*if(isElementPresent(expectedtitle))
		{
		System.out.println("title found");
		}
		else
		{
		System.out.println("title not found");
		}*/
	
		
		
		
		
		//test.log(Status.INFO, " TITLE success in product details page");
	
	//System.out.println("TITLE success in product details page ");
		
	/*}
	private boolean isElementPresent(String expectedtitle) {
		// TODO Auto-generated method stub
		return false;
	}
*/
		
		
		
		
	
	

	
	
	
}}
