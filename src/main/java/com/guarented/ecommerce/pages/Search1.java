package com.guarented.ecommerce.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.guarented.ecommerce.TestBase.TestBase2;
import com.guarented.ecommerce.commonUtilss.CommonUtils1;
 public class Search1 extends TestBase2 {
	
		public By searchedPamameterResultList=By.xpath(".//*[@id='ul-1']/li/md-autocomplete-parent-scope/span[2]");
		public By universalSearchBar=By.id("home_search2");
		CommonUtils1 cu = new CommonUtils1();
		
		
		
		
		
		public WebElement getsearchedPamameterResultList() {
			cu.explicitWait(driver, searchedPamameterResultList, 30L);
			return driver.findElement(searchedPamameterResultList);
		}
		public WebElement getuniversalSearchBar() {
			cu.explicitWait(driver, universalSearchBar, 30L);
			return driver.findElement(universalSearchBar);
		}
		
		
		
		public List<WebElement> getSearchedPamameterResultList() throws InterruptedException{
				System.out.println("list of the dropdown search");
	    
			return driver.findElements(searchedPamameterResultList);
		}
		public WebElement getUniversalSearchBar(){
			System.out.println("clicking universal search bar");
	    	return this.driver.findElement(universalSearchBar);
	    }

	 }
