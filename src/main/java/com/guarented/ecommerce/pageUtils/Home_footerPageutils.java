package com.guarented.ecommerce.pageUtils;

import org.openqa.selenium.JavascriptExecutor;

import com.guarented.ecommerce.pages.Home_footerPage1;

public class Home_footerPageutils  extends Home_footerPage1{

	

	public void windowscrolldowninhomepage() throws InterruptedException{
		JavascriptExecutor jse = (JavascriptExecutor) driver; 
		jse.executeScript("window.scrollBy(0,2450)", "");
		Thread.sleep(5000);
	}
	public void childwindow(){
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle); // 
			}
	}
	
	
	
	
	
	
	
	
	public void clickFacebookIcon1() {
		System.out.println("Clicking the facebook icon ");
		driver.findElement(facebook_icon).click();
	}
	public void clickInstagramIcon() {
		System.out.println("Clicking the instagram icon  field");
		driver.findElement(instagram_icon).click();
	}
	
	public void clickTwitterIcon() {
		System.out.println("Clicking the Twitter icon ");
		driver.findElement(twitter_icon).click();
	}
	
	public void clickGooglePlusIcon() {
		System.out.println("Clicking google plus icon ");
		driver.findElement(google_plus_icon).click();
	}
	
	public void clickMediumIcon() {
		System.out.println("Clicking the medium icon ");
		driver.findElement(medium_icon).click();
	}
	//footer links
	public void clickstudychairsonrent() {
		System.out.println("Clicking the studychainsonrent icon ");
		driver.findElement(studychainsonrent).click();
		String URL16="https://www.guarented.com/bangalore/furn-stdy-chr";
	}
	public void clickmatressesonrent() {
		System.out.println("Clicking the matressesonrent icon ");
		driver.findElement(matressesonrent).click();
		String URL15="https://www.guarented.com/bangalore/furn-mtrs";
	}	
	public void clickbedsonrent() {
		System.out.println("Clicking the bedsonrent icon ");
		driver.findElement(bedsonrent).click();
		String URL14="https://www.guarented.com/bangalore/furn-bed";
	}
	public void clicksofasonrent() {
		System.out.println("Clicking the sofasonrent icon ");
		driver.findElement(sofasonrent).click();
		String URL13="https://www.guarented.com/bangalore/furn-sofa";
	}
	public void clickreclinersonrent() {
		System.out.println("Clicking the reclinersonrent icon ");
		driver.findElement(reclinersonrent).click();
		String URL10="https://www.guarented.com/bangalore/furn-recl";
	}
	public void clicktelevisionsonrent() {
		System.out.println("Clicking the televisionsonrent icon ");
		driver.findElement(televisionsonrent).click();
		String URL7="https://www.guarented.com/bangalore/tv";
	}
	public void clickmicrowavesonrent() {
		System.out.println("Clicking the microwavesonrent icon ");
		driver.findElement(microwavesonrent).click();
		String URL6="https://www.guarented.com/bangalore/microwave";
	}
	public void clickrefrigeratorsonrent() {
		System.out.println("Clicking the refrigeratorsonrent icon ");
		driver.findElement(refrigeratorsonrent).click();
	String URL5="https://www.guarented.com/bangalore/fridge";
	}
	public void clickwashingmachinesonrent() {
		System.out.println("Clicking the washingmachinesonrent icon ");
		driver.findElement(washingmachinesonrent).click();
		String URL4="https://www.guarented.com/bangalore/washer";
	}
	
	}
