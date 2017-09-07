package com.guarented.ecommerce.pageUtils;


import org.openqa.selenium.By;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.guarented.ecommerce.commonUtilss.CommonUtils1;
import com.guarented.ecommerce.pages.Homepage1;


public class HomePageUtils1 extends Homepage1 {
	CommonUtils1 commonUtils = new CommonUtils1();
	
	
	
	public static ExtentHtmlReporter htmlReporter;
    public static ExtentReports extent;
    public static ExtentTest test;
	
	
	public void bookitemthroughproducts() throws InterruptedException
	{
		clickProductsButt();
		
	driver.findElement(By.xpath("//*[@id='product']/div[3]/div/div[2]/div/div[5]/a[1]/img")).click();
	
	
		}
	public void bookIteminGuarented() throws Exception{
		productdetailsutils1 pdu=new productdetailsutils1();
		//validations
	pdu.validationsinproductdetailspage();
	pdu.getdetailsofselectedproduct();
	//pdu.verifyproductname();
	pdu.click_Addtocart_Button();
	pdu.clickCheckoutButton();
	test.log(Status.INFO, "product details page ended");
	//test.log(Status.PASS,);

cartpageUtils1 cpu=new cartpageUtils1();
cpu.validdationsincartpage();
cpu.nameoftheproductncartpage();
cpu.calculatepriceofproduct();
cpu.click_Next_Buttonincart();
test.log(Status.INFO, "cart  page ended");
//test.log(Status.PASS,);


Delivery1utls dvu=new Delivery1utls();
		dvu.validationsindeliverypage();
		dvu.enetrthealldetailsofcustomerinndeliverypage();
        dvu.clicknextbuttonindelivery();
    	test.log(Status.INFO, "delivery  page ended");
        
		//test.log(Status.PASS,);
 
        confirmation_Page1Utils cp=new confirmation_Page1Utils();
      cp.validateinconfirmpage();
		cp.selectcardondeliveryradiobutton();
		cp.clickplaceorderbuttonbutton();
		cp.validateorderid();
	}
public void bookitemthroughwholesearch() throws InterruptedException
	{
		clickWholeSearchIcon();
		Thread.sleep(2000);
		
		System.out.println("select furniture");
		driver.findElement(By.xpath("//*[@id='dialogContent_search_box']/div/div[2]/div[1]/div[1]/md-card/img")).click();
		Thread.sleep(3000);
		}
	
	public void bookitemthroughcartwhencartempty() throws InterruptedException
	{
		clickCartsymbol();
         Thread.sleep(2000);
		String actualmessage="There are no items in your cart";
		Assert.assertTrue(actualmessage.contentEquals("There are no items in your cart"), "the empty message not displayed as cart is empty");
		//test.log(Status.PASS, "the cart is empty message is display success when cart in empty");
		test.log(Status.INFO,"the cart is empty message is display success when cart in empty");
         System.out.println("the cart is empty message is display success when cart in empty");
         //click on rent now button in cart
        driver.findElement(By.xpath("//*[@id='empty-cart']/div[2]/button/span")).click();
         Thread.sleep(3000);
         driver.findElement(By.xpath(".//*[@id='product']/div[3]/div/div[2]/div/div[4]/a[2]/div/md-card/img")).click();
         
		}

		public void  verifyurlinordersuccesspage(){
			String siteurlordersuccesspage = driver.getCurrentUrl();
			System.out.println("the ordersuccess page  url  is  " + siteurlordersuccesspage);
			Assert.assertTrue(siteurlordersuccesspage.contains("https://staging.guarented.com/info/completeorder/"));
		//	test.log(Status.PASS, "url success in order success page ");
			test.log(Status.INFO,"url success in order success page ");
			System.out.println();
		}
		public void  verifytitleinordersuccesspage(){
			String sitetitleordersuccesspage = driver.getTitle();
			//String expectedtitleinordersuccesspage = "Address | Guarented Rentals";
			System.out.println("the ordersuccess page  title  is  " + sitetitleordersuccesspage);
			//Assert.assertEquals(sitetitleordersuccesspage, expectedtitleinordersuccesspage);
			//System.out.println("tha validation TITLE success in order success page ");
		
		}
		//order success page
		//verify text in my order successpage(Thank You)
		public void  verifytextinordersuccesspage(){
			String sitetextordersuccesspage = driver.findElement(By.xpath("//*[@id='complete']/div/p[1]")).getText();
			String expectedtextinordersuccesspage = "Thank You";
			System.out.println("the ordersuccess page  text is  is  " + sitetextordersuccesspage);
			Assert.assertEquals(sitetextordersuccesspage, expectedtextinordersuccesspage);
			test.log(Status.INFO, "validation text success in order success page ");
			//test.log(Status.PASS,);
			System.out.println("validation text success in order success page ");
		
		}
		
		
}

