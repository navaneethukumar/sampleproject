package com.guarented.ecommerce.pageUtils;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.guarented.ecommerce.pages.Delivery1;

public class Delivery1utls extends Delivery1 {

	public static ExtentHtmlReporter htmlReporter;
    public static ExtentReports extent;
    public static ExtentTest test;
	

	public void sendcustomerdetailsindeliverypage(String pincode,String mobilenumber,String address,String Societyname, String area) throws InterruptedException {
	//	DecimalFormat decimalFormat = new DecimalFormat("#");
		
		/*	String dfp = decimalFormat.parse((pincode)).toString();
			String dfm = decimalFormat.parse(mobilenumber).toString();*/
			
			
			
			getpincode_field().sendKeys(pincode);
			Thread.sleep(2000);
			getmobile_number_field().sendKeys((mobilenumber));
			
			getaddress().sendKeys(address);
			Thread.sleep(2000);
			getsocietynameindeliverypage().sendKeys(Societyname);
			getarea().sendKeys(area);
			Thread.sleep(3000);

			
		/*} catch (ParseException e) {
			e.printStackTrace();
		}*/
	}


	public void enetrthealldetailsofcustomerinndeliverypage() {

		entermobilenumber();

		enterpincodefield();
	}

	public void entermobilenumber() {
		System.out.println("Entering the mobile number field in delivery page ");
		driver.findElement(mobile_number_fieldindeliverypage).sendKeys("2323232323");
	}

	public void enterpincodefield() {
		System.out.println("Entering the pincode in delivery page ");
		driver.findElement(pincode_fieldindeliverypage).sendKeys("500010");
	}

	public void validationsindeliverypage() throws InterruptedException {
		Thread.sleep(4000);
		String expectedurlindeliverypageinstaging = "https://staging.guarented.com/bangalore/checkout/address";
		String expectedurlindeliverypageinprod = "https://www.guarented.com/bangalore/checkout/address";
		Assert.assertTrue(driver.getCurrentUrl().equals(expectedurlindeliverypageinstaging)|| driver.getCurrentUrl().equals(expectedurlindeliverypageinprod),"url display wrong in delivery page");
		//test.log(Status.PASS, "URL  validation success in delivery page");
		
		
		
		System.out.println(" URL  validation success in delivery page ");
		Thread.sleep(4000);
		Assert.assertTrue(driver.getTitle().equals("Address | Guarented Rentals"),"title display wrong in delivery page");
		
		
		
		//test.log(Status.PASS,"TITLE success in delivery page ");
		System.out.println("TITLE success in delivery page ");

	}

	public void clicknextbuttonindelivery() throws InterruptedException {
		By mySelector = By.xpath("//*[@id='action-button']");

		List<WebElement> myElements1 = driver.findElements(mySelector);
		for (WebElement e1 : myElements1) {
			// System.out.println("values are payment  "+ e1.getText());
			Thread.sleep(3000);

			if (e1.getText().equals("NEXT")) {
				e1.click();

			}
		}
	}

	

	}

