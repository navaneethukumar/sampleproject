package com.guarented.ecommerce.pageUtils;

import org.openqa.selenium.By;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.guarented.ecommerce.commonUtilss.CommonUtils1;
import com.guarented.ecommerce.pages.cartpage1;


public class cartpageUtils1 extends cartpage1 {
CommonUtils1 cu = new CommonUtils1();



public static ExtentHtmlReporter htmlReporter;
public static ExtentReports extent;
public static ExtentTest test;

	public void getpricedetailsofproductincart(){
         calculatepriceofproduct();
		getpriceincartpage();
		getrefundablepriceincart();
		gettotalcostincartpage();
	}
		public void calculatePricewithquantityincrese(){
			String value=driver.findElement(By.xpath("//*[@id='cart_table']/tbody/tr/td[4]/div/span[2]/p")).getText();
			System.out.println("value is   "+value);
			int m=Integer.parseInt(value);
			System.out.println("converted cart value is "+m);
			for(m=0;m<10;){
				calculatepriceofproduct();
				clickingforincresingquantityincartpage();
				System.out.println("success");
				m++;
				}
			
		}
		public void calculatePricewithquantityincresewithquantity(){
		
				calculatepriceofproduct();
				clickingforincresingquantityincartpage();
				System.out.println("success");
				
			
		}

		public void calculatePricewithquantityinquantitymultiple() throws InterruptedException{
			productdetailsutils1 pd=new productdetailsutils1();
			HomePageUtils1 hu=new HomePageUtils1();
			Thread.sleep(5000);
			calculatepriceofproduct();/*
			clickContinueshoppingButtonincart();*/
			
			hu.clickProductsButt();
			Thread.sleep(5000);

			
		
			driver.findElement(By.xpath(".//*[@id='product']/div[3]/div/div[2]/div/div[4]/a[2]/div/md-card/img")).click();
			productdetailsutils1 pdu=new productdetailsutils1();
			pdu.click_Addtocart_Button();
			pdu.clickCheckoutButton();
			
			String price=driver.findElement(By.xpath("//*[@id='cart_table']/tbody/tr[2]/td[2]")).getText();
			//System.out.println("price is "+price);
			//System.out.println("actual price is "+Actualprice);
			String pricedouble=price.replaceAll("[a-zA-Z]", "").replaceAll(" ", "");
			//System.out.println("product price in cart page is "+price);
             int a = Integer.parseInt(pricedouble);
			System.out.println("product  double price in cart page is: "+a);
			
			
			String price1=driver.findElement(By.xpath("//*[@id='cart_table']/tbody/tr[2]/td[3]")).getText();
			//System.out.println("price1 is "+price1);
			String refundpricecart=price1.replaceAll("[a-zA-Z!-)]", "").trim();
			//System.out.println("product refundable  price in cart page is "+refundpricecart);
			int b = Integer.parseInt(refundpricecart);
			System.out.println("product  double refundable  price in cart page is: "+b);
		String price2=driver.findElement(By.xpath("//*[@id='cart_table']/tbody/tr[2]/td[5]")).getText();
		//	System.out.println("price 2 is "+price2);
			String totalpriceincart=price2.replaceAll("[a-zA-Z]", "").replaceAll(" ", "").trim();
			//System.out.println("product total price in cart page is "+totalpriceincart);
			int c = Integer.parseInt(totalpriceincart);
			System.out.println("product double total price in cart page is: "+c);
			
			String mainprice=driver.findElement(By.xpath("//*[@id='cart-section']/div/div[4]/div[3]/p[2]fdsfsddzddcdsdddddd")).getText();
			Assert.assertTrue(mainprice.contains(refundpricecart));
			//test.log(Status.PASS, "main price displaying correctly");
			
			
		
			//logger.log(LogStatus.PASS, " cart Title verified");
			System.out.println("mainprice is "+mainprice);

		}

		public void calculatePricewithquantitydecrease(){
			String value=driver.findElement(By.xpath("//*[@id='cart_table']/tbody/tr/td[4]/div/span[2]/p")).getText();
			System.out.println("value is   "+value);
			int m=Integer.parseInt(value);
			System.out.println("converted cart value is "+m);
			for(m=0;m<10;){
				
				calculatepriceofproduct();
				clickingforincresingquantityincartpage();
				
				System.out.println("success");
				m++;
				}
			
		}


	public void validdationsincartpage() throws InterruptedException{
		Thread.sleep(3000);
	String expectedurlinstaging = "https://staging.guarented.com/bangalore/checkout/cart";
	String expectedurlinprod = "https://www.guarented.com/bangalore/checkout/cart";
	Assert.assertTrue(driver.getCurrentUrl().equals(expectedurlinstaging)|| driver.getCurrentUrl().equals(expectedurlinprod) ,"url display wrong in catr page");
	
	//test.log(Status.PASS, "URL  validation success in cart page");
	System.out.println(" URL  validation success in cart page ");
	Thread.sleep(4000);
	String expectedtitleincartpage = "Cart | Guarented Rentals";
     Assert.assertTrue( driver.getTitle().equals(expectedtitleincartpage), "title display wrong in cart page");
	System.out.println("TITLE success in cart page ");
	//test.log(Status.PASS, "TITLE success in cart page");
	
	
	}
	
	
	
	public void nameoftheproductncartpage() {
		String nameofproductincart=driver.findElement(productnameincartpage).getText();
			System.out.println("the name of product in cart page "+nameofproductincart);
			}
	
	
	public void calculatepriceofproduct(){
String Actualprice=driver.findElement(itemprice).getText();
	
	//System.out.println("actual price is "+Actualprice);
	String price=Actualprice.replaceAll("[a-zA-Z]", "").replaceAll(" ", "");
	//System.out.println("product price in cart page is "+price);


	int x = Integer.parseInt(price);
	System.out.println("product price in cart page is: "+x);
	
	
	
	
	String refundprice=driver.findElement(itemrefundmoney).getText();
	//System.out.println("refund money is "+refundprice);
	String refundpricecart=refundprice.replaceAll("[a-zA-Z!-)]", "").trim();
	//System.out.println("product refundable  price in cart page is "+refundpricecart);
	int y = Integer.parseInt(refundpricecart);
	System.out.println("product refundable  price in cart page is: "+y);
	
	String totalprice=driver.findElement(producttotalcost).getText();
	//System.out.println("productprice is " +totalprice);
	String totalpriceincart=totalprice.replaceAll("[a-zA-Z]", "").replaceAll(" ", "").trim();
	//System.out.println("product total price in cart page is "+totalpriceincart);
	int z = Integer.parseInt(totalpriceincart);
	System.out.println("product total price in cart page is: "+z);
	
	int k=x+y;
	Assert.assertEquals(k, z, "prices are calculated wrong of price+ refundable price=totalprice ");
	System.out.println(" total value of product (product price+refundable price) is calculated correctly  " +x+ "+ "+y+ "="+ k);
	//test.log(Status.PASS, "total value of product (product price+refundable price) is calculated correctly  " +x+ "+ "+y+ "="+ k);

	}
	public void validaterpicerelatedtoQuantityinCart() throws Exception{
		productdetailsutils1 pdu=new productdetailsutils1();
		//validations
	
		pdu.getdetailsofselectedproduct();
		pdu.verifyproductname();
		
		pdu.click_Addtocart_Button();
		Thread.sleep(2000);
		pdu.clickCheckoutButton();
		Thread.sleep(4000);
		cartpageUtils1 cpu=new cartpageUtils1();
		Thread.sleep(3000);
	cpu.calculatePricewithquantityincrese();

	}
	public void validaterpicerelatedtoQuantityindoublequantity() throws Exception{
		productdetailsutils1 pdu=new productdetailsutils1();
	
		pdu.getdetailsofselectedproduct();
		pdu.verifyproductname();
	pdu.click_Addtocart_Button();
		Thread.sleep(2000);
		pdu.clickCheckoutButton();
		Thread.sleep(4000);
		cartpageUtils1 cpu=new cartpageUtils1();
		Thread.sleep(3000);
	calculatePricewithquantityinquantitymultiple();
		
	
	
	
	}
}
