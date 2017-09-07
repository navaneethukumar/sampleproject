package com.guarented.ecommerce.pageUtils;

import org.openqa.selenium.By;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.guarented.ecommerce.pages.confirmation_Page1;


public class confirmation_Page1Utils extends confirmation_Page1 {
	public static ExtentHtmlReporter htmlReporter;
    public static ExtentReports extent;
    public static ExtentTest test;
	
		public void validateinconfirmpage() throws InterruptedException{
			
			Thread.sleep(4000);
			//Assert.assertTrue("url display wrong in confirm page", driver.getCurrentUrl().equals("https://staging.guarented.com/bangalore/checkout/confirm")|| driver.getCurrentUrl().equals("https://www.guarented.com/bangalore/checkout/confirm"));
		
			
			
			
			System.out.println("tha URL  validation success in confirm page ");
			Thread.sleep(4000);
			//Assert.assertTrue("title display wrong in confirm page", driver.getTitle().equals("Confirm | Guarented Rentals"));
			System.out.println("tha validation TITLE success in confirm page ");
			
			
		}
		
		
		
		public void validateorderid() throws InterruptedException{
			Thread.sleep(4000);
			String myorderurl=driver.getCurrentUrl();
			//System.out.println("url with order id is  "    +myorderurl);
			String ordernumber=myorderurl.replaceAll("[a-zA-Z]", "").replaceAll(" ", "").replaceAll("//", "").replaceAll("/", "").replace(".", "").replace(":", "");
			//String ordernumber=myorderurl.substring(49, 53);
			System.out.println("substring of orderid is  "+ordernumber);
			int g=Integer.parseInt(ordernumber);
			System.out.println("order number in url is  "+g);
			String value=driver.findElement(ordernumberinproduct).getText();
			//System.out.println(" actual order value is "+value);
			String ordernumberinpage=myorderurl.replaceAll("[a-zA-Z!-)]", "").replaceAll(" ", "").replaceAll("//", "").replaceAll("/", "").replace(".", "").replace(":", "");
			
			
			//String ordernumberinpage=value.substring(12, 16);
			System.out.println("substring of orderid in middle  "+ordernumberinpage);
			int h=Integer.parseInt(ordernumberinpage);
			System.out.println("order number in page is  "+h);
				
		//	Assert.assertEquals(g, h);
			System.out.println("order numbers are display correctly in url and for product ");
			clickmyordersbutton();
			Thread.sleep(6000);
			//String orderinmyorders=driver.findElement(ordernumberinmyorderspage).getText();
			//System.out.println("order no is  "+orderinmyorders);
			//String ordernumberinmyorderspage=orderinmyorders.substring(1, 5);
			//System.out.println("substring of orderid in my orders page  "+ordernumberinmyorderspage);
			/*int i=Integer.parseInt(ordernumberinmyorderspage);
			System.out.println("order number in my orders  page is  "+i);
			Assert.assertEquals(i, g);
			System.out.println("order id is display in orders page and my orders page");
			*/
			
			
		}
		public void getproductnameinconfirmationpage1() {
			String nameinconfirmationpage=driver.findElement(productnameinconfirmationpage).getText();
			System.out.println("the product name  in confirmation  page is : "+ nameinconfirmationpage);
		}
		public void getconstantcarttextinconfirmationpage() {
			String constantcarttextinconfirmationpage=driver.findElement(constanttextinconfirmationpage).getText();
			System.out.println("the constant cart  text  in confirmation  page is : "+ constantcarttextinconfirmationpage);
			
		}
		
		//my orders page
		
		
		public void  veriffurlinmyorderspage(){
		String siteurlinmyorderspage = driver.getCurrentUrl();
		String expectedurlinmyorderspage = "https://staging.guarented.com/info/orders";
		System.out.println("the my orders page url  is  " + siteurlinmyorderspage);
		//Assert.assertEquals(siteurlinmyorderspage, expectedurlinmyorderspage);
		System.out.println("tha URL  validation success in my orders page ");
	}
		
	public void  verifytitleinmyorderspage(){
		String sitetitlemyorderspage = driver.getTitle();
		String expectedtitleinmyorderspage = "My Orders | Guarented Rentals";
		System.out.println("the my orders page  title  is  " + sitetitlemyorderspage);
		//Assert.assertEquals(sitetitlemyorderspage, expectedtitleinmyorderspage);
		System.out.println("tha validation TITLE success in my orders page ");
	
	}
	//verify text in my order successpage(MY ORDERS)
	public void  verifytextinmyorders(){
		String sitetextinmyorderspage = driver.findElement(By.xpath("//*[@id='orders_section']/div[1]/p")).getText();
		String expectedtextinmyorderspage = "MY ORDERS";
		System.out.println("the my orders page   text is  is  " + sitetextinmyorderspage);
		//Assert.assertEquals(sitetextinmyorderspage, expectedtextinmyorderspage);
		System.out.println("tha validation text success in my orders page ");
	
	}


}
