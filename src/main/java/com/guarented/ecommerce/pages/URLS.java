package com.guarented.ecommerce.pages;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.guarented.ecommerce.TestBase.TestBase2;

public class URLS extends TestBase2 {
	@BeforeMethod
	public void setUP() throws IOException{
		init1();
		}
	@AfterMethod
	public void closebrowser(){
		driver.close();;
	}
	
		
	
	@Test
	public void furniture() throws InterruptedException{
		Thread.sleep(6000);
	driver.navigate().to("https://staging.guarented.com/rent/categories/furniture");
	Thread.sleep(16000);
	Assert.assertTrue(driver.getCurrentUrl().equals("https://staging.guarented.com/bangalore/furniture?nicks=furniture&parent=furniture"));
	System.out.println("furniturte passed");
	}
	
@Test
	public void appliances() throws InterruptedException{
	Thread.sleep(4000);
	driver.navigate().to("https://staging.guarented.com/rent/categories/appliances");
	Thread.sleep(16000);
	Assert.assertTrue(driver.getCurrentUrl().equals("https://staging.guarented.com/bangalore/appliances?nicks=appliances&parent=appliances"));
	System.out.println("appliances passed");
	}

@Test
public void diningset() throws InterruptedException{
Thread.sleep(4000);
driver.navigate().to("https://staging.guarented.com/rent/categories/furniture/furn-din-set");
Thread.sleep(16000);
Assert.assertTrue(driver.getCurrentUrl().equals("https://staging.guarented.com/bangalore/dining-set?nicks=furn-din-set&parent=furniture"));
System.out.println("dining set passed");
}
	
@Test
		public void sofas() throws InterruptedException{
	Thread.sleep(4000);
	driver.navigate().to("https://staging.guarented.com/rent/categories/furniture/furn-sofa");
	Thread.sleep(16000);
	Assert.assertTrue(driver.getCurrentUrl().equals("https://staging.guarented.com/bangalore/sofas?nicks=furn-sofa&parent=furniture"));
	System.out.println("sofas passed");
	}
 @Test
		
	public void beds() throws InterruptedException{
	 Thread.sleep(3000);
	driver.navigate().to("https://staging.guarented.com/rent/categories/furniture/furn-bed");
	Thread.sleep(14000);
	Assert.assertTrue(driver.getCurrentUrl().equals("https://staging.guarented.com/bangalore/beds?nicks=furn-bed&parent=furniture"));
	System.out.println("beds passed");}
		
		@Test
		public void recliners() throws InterruptedException{
			Thread.sleep(3000);
	driver.navigate().to("https://staging.guarented.com/rent/categories/furniture/furn-recl");
	Thread.sleep(13000);
	Assert.assertTrue(driver.getCurrentUrl().equals("https://staging.guarented.com/bangalore/recliners?nicks=furn-recl&parent=furniture"));
	System.out.println("recliners passed");}
	@Test
	public void studychairs() throws InterruptedException{
		Thread.sleep(3000);
	
	driver.navigate().to("https://staging.guarented.com/rent/categories/furniture/furn-stdy-chr");
	Thread.sleep(13000);
	Assert.assertTrue(driver.getCurrentUrl().equals("https://staging.guarented.com/bangalore/study-chairs?nicks=furn-stdy-chr&parent=furniture"));
	System.out.println("study chairs passed");}
	@Test
	public void mattresses() throws InterruptedException{
		Thread.sleep(3000);
		driver.navigate().to("https://staging.guarented.com/rent/categories/furniture/furn-mtrs");
	Thread.sleep(13000);
	Assert.assertTrue(driver.getCurrentUrl().equals("https://staging.guarented.com/bangalore/mattresses?nicks=furn-mtrs&parent=furniture"));
	System.out.println("mattresses  passed");}
	@Test
	public void storage() throws InterruptedException{
		Thread.sleep(3000);
	driver.navigate().to("https://staging.guarented.com/rent/categories/furniture/furn-strg");
	Thread.sleep(13000);
	Assert.assertTrue(driver.getCurrentUrl().equals("https://staging.guarented.com/bangalore/storage?nicks=furn-strg&parent=furniture"));
	System.out.println("storage  passed");}
	@Test
	public void studytable() throws InterruptedException{
		Thread.sleep(3000);
	driver.navigate().to("https://staging.guarented.com/rent/categories/furniture/furn-stdy-tbl");
	Thread.sleep(3000);
	Assert.assertTrue(driver.getCurrentUrl().equals("https://staging.guarented.com/bangalore/study-tables?nicks=furn-stdy-tbl&parent=furniture"));
	System.out.println("study table passed");}
	@Test
	public void furnpackages() throws InterruptedException{
		Thread.sleep(3000);
		driver.navigate().to("https://staging.guarented.com/rent/categories/furniture/furn-pack");
	Thread.sleep(13000);
	Assert.assertTrue(driver.getCurrentUrl().equals("https://staging.guarented.com/bangalore/packages?nicks=furn-pack&parent=furniture"));
	System.out.println("furn packages passed");}
	@Test
	public void applpackages() throws InterruptedException{
		Thread.sleep(3000);
		driver.navigate().to("https://staging.guarented.com/rent/categories/appliances/app-pack");
	Thread.sleep(13000);
	Assert.assertTrue(driver.getCurrentUrl().equals("https://staging.guarented.com/bangalore/packages?nicks=app-pack&parent=appliances"));
	System.out.println("appl packages passed");}
	@Test
	public void television() throws InterruptedException{
		Thread.sleep(3000);
	driver.navigate().to("https://staging.guarented.com/rent/categories/appliances/tv");
	Thread.sleep(13000);
	Assert.assertTrue(driver.getCurrentUrl().equals("https://staging.guarented.com/bangalore/television?nicks=tv&parent=appliances"));
	System.out.println("television  passed");}
	@Test
	public void fridge() throws InterruptedException{
		Thread.sleep(3000);
		driver.navigate().to("https://staging.guarented.com/rent/categories/appliances/fridge");
	Thread.sleep(13000);
	Assert.assertTrue(driver.getCurrentUrl().equals("https://staging.guarented.com/bangalore/refrigerator?nicks=fridge&parent=appliances"));
	System.out.println("refregirator passed");
	}
	@Test
	public void microwave() throws InterruptedException{
		Thread.sleep(3000);
	driver.navigate().to("https://staging.guarented.com/rent/categories/appliances/microwave");
	Thread.sleep(10000);
	Assert.assertTrue(driver.getCurrentUrl().equals("https://staging.guarented.com/bangalore/microwave?nicks=microwave&parent=appliances"));
	System.out.println("microwave  passed");}
	@Test
	public void washingmachine () throws InterruptedException{
		Thread.sleep(3000);
	driver.navigate().to("https://staging.guarented.com/rent/categories/appliances/washer");
	Thread.sleep(13000);
	Assert.assertTrue(driver.getCurrentUrl().equals("https://staging.guarented.com/bangalore/washing-machine?nicks=washer&parent=appliances"));
	System.out.println("washing machine  passed");}
	@Test
	public void tables () throws InterruptedException{
		Thread.sleep(3000);
	driver.navigate().to("https://staging.guarented.com/rent/categories/furniture/furn-tbl");
	Thread.sleep(13000);
	Assert.assertTrue(driver.getCurrentUrl().equals("https://staging.guarented.com/bangalore/tables?nicks=furn-tbl&parent=furniture"));
	System.out.println("tables   passed");}
	
	
	
	
	@Test
	public void elitteamillasinglebed () throws InterruptedException{
		Thread.sleep(3000);
	driver.navigate().to("https://staging.guarented.com/rent/product/furniture/elite-cmla-sng-bd");
	Thread.sleep(10000);
	Assert.assertTrue(driver.getCurrentUrl().equals("https://staging.guarented.com/bangalore/rent/elite-camilla-single-bed?param=elite-cmla-sng-bd"));
	System.out.println("elitte camilla single bed passed");}
	
	
	@Test
	public void fourglassdiningset () throws InterruptedException{
		Thread.sleep(3000);
	driver.navigate().to("https://staging.guarented.com/rent/product/furniture/furn-din-4-royal");
	Thread.sleep(10000);
	Assert.assertTrue(driver.getCurrentUrl().equals("https://staging.guarented.com/bangalore/rent/brand-new-4-seater-dining-table?param=furn-din-4-royal"));
	System.out.println("fourglassdiningset passed");}
	
	
	@Test
	public void elitedoublebed() throws InterruptedException {
		Thread.sleep(3000);
	driver.navigate().to("https://staging.guarented.com//rent/product/furniture/elite-cml-dbl-bd");
	Thread.sleep(10000);
	Assert.assertTrue(driver.getCurrentUrl().equals("https://staging.guarented.com/bangalore/rent/elite-camilla-double-bed?param=elite-cml-dbl-bd"));
	System.out.println("elite double bed passed");
	}

	@Test
	public void elitecoltonsinglebed() throws InterruptedException{
		Thread.sleep(3000);
	driver.navigate().to("https://staging.guarented.com/rent/product/furniture/elite-cltn-sng-bd");
	Thread.sleep(3000);
	Assert.assertTrue(driver.getCurrentUrl().equals("https://staging.guarented.com/bangalore/rent/elite-colton-single-bed?param=elite-cltn-sng-bd"));
	System.out.println("elite colton single bed passed");
	}
	@Test
	public void elitecoltondoublebed() throws InterruptedException{	
		Thread.sleep(3000);
		driver.navigate().to("https://staging.guarented.com/rent/product/furniture/elite-cltn-dbl-bd");
	
		Thread.sleep(10000);
		Assert.assertTrue(driver.getCurrentUrl().equals("https://staging.guarented.com/bangalore/rent/elite-colton-double-bed?param=elite-cltn-dbl-bd"));
		System.out.println("elite colton double bed passed");}
		
		
		@Test 
	public void brandnewsinglebed() throws InterruptedException{
		Thread.sleep(3000);
		driver.navigate().to("https://staging.guarented.com/rent/product/furniture/royal-sbed");
		Thread.sleep(10000);
		Assert.assertTrue(driver.getCurrentUrl().equals("https://staging.guarented.com/bangalore/rent/brand-new-single-bed?param=royal-sbed"));
		System.out.println("brandnewsinglebed passed");
	}
		@Test
		public void brandnewdoublebed() throws InterruptedException{	
			Thread.sleep(3000);
			driver.navigate().to("https://staging.guarented.com/rent/product/furniture/royal-dbed");
				Thread.sleep(10000);
				Assert.assertTrue(driver.getCurrentUrl().equals("https://staging.guarented.com/bangalore/rent/brand-new-double-bed?param=royal-dbed"));
				System.out.println("brandnewdoublebed passed");}
		
				
				@Test
		public void elite5sofa() throws InterruptedException{
			Thread.sleep(3000);
			driver.navigate().to("https://staging.guarented.com/rent/product/furniture/elite-sofa-5");
				Thread.sleep(3000);
				Assert.assertTrue(driver.getCurrentUrl().equals("https://staging.guarented.com/bangalore/rent/elite-sofa---5-seater?param=elite-sofa-5"));
				System.out.println("elite 5 sofa passed");}
				
				@Test
		public void elitesofa3() throws InterruptedException{
					Thread.sleep(3000);
				driver.navigate().to("https://staging.guarented.com/rent/product/furniture/elite-sofa-3");
				Thread.sleep(3000);
				Assert.assertTrue(driver.getCurrentUrl().equals("https://staging.guarented.com/bangalore/rent/elite-sofa---3-seater?param=elite-sofa-3"));
				System.out.println("elite sofa 3 passed");}
				
				@Test
			public void royalrecliner() throws InterruptedException{
				Thread.sleep(3000);
				driver.navigate().to("https://staging.guarented.com/rent/product/furniture/royal-recl");
				Thread.sleep(9000);
				Assert.assertTrue(driver.getCurrentUrl().equals("https://staging.guarented.com/bangalore/rent/brand-new-recliner?param=royal-recl"));
				System.out.println("royal recliner passed");}
				
				@Test
			public void brandnewstudychairs() throws InterruptedException{
				Thread.sleep(3000);
				driver.navigate().to("https://staging.guarented.com/rent/product/furniture/royal-stdy-chr");
				Thread.sleep(10000);
				Assert.assertTrue(driver.getCurrentUrl().equals("https://staging.guarented.com/bangalore/rent/brand-new-study-chair?param=royal-stdy-chr"));
				System.out.println("brandnewstudychairs passed");}
	
				
				@Test
			public void elitestudychairs() throws InterruptedException{
				Thread.sleep(3000);
				driver.navigate().to("https://staging.guarented.com/rent/product/furniture/elite-stdy-chr");
				Thread.sleep(10000);
				Assert.assertTrue(driver.getCurrentUrl().equals("https://staging.guarented.com/bangalore/rent/elite-study-chair?param=elite-stdy-chr"));
				System.out.println("elite study chairs passed");}
				
				
				@Test
			public void brandnewsinglematteress() throws InterruptedException{
				Thread.sleep(3000);
				driver.navigate().to("https://staging.guarented.com/rent/product/furniture/royal-sng-mat");
				Thread.sleep(13000);
				Assert.assertTrue(driver.getCurrentUrl().equals("https://staging.guarented.com/bangalore/rent/brand-new-single-mattress?param=royal-sng-mat"));
				System.out.println("brandnewsinglematteress passed");}
	
				
				@Test
			public void brandnewdoublemattresses() throws InterruptedException{
				Thread.sleep(3000);
				driver.navigate().to("https://staging.guarented.com/rent/product/furniture/royal-dbl-mat");
				Thread.sleep(10000);
				Assert.assertTrue(driver.getCurrentUrl().equals("https://staging.guarented.com/bangalore/rent/brand-new-double-mattress?param=royal-dbl-mat"));
				System.out.println("brandnewdoublemattresses passed");}
				
				

				@Test
			public void elitewardrobe() throws InterruptedException {
				Thread.sleep(3000);
				driver.navigate().to("https://staging.guarented.com/rent/product/furniture/elt-wrdrb");
				Thread.sleep(8000);
				Assert.assertTrue(driver.getCurrentUrl().equals("https://staging.guarented.com/bangalore/rent/elite-wardrobe?param=elt-wrdrb"));
				System.out.println("elite wardrobe ");}
	
				
				@Test
			public void sixglassdiningtable() throws InterruptedException{
				Thread.sleep(3000);
				driver.navigate().to("https://staging.guarented.com/rent/product/furniture/furn-din-6-gls");
				Thread.sleep(10000);
				Assert.assertTrue(driver.getCurrentUrl().equals("https://staging.guarented.com/bangalore/rent/elite-6-seater-dining-table%7Cglass-top?param=furn-din-6-gls"));
				System.out.println("6 glass dining table ");}
				
				@Test
			public void royalbroadbanddesk() throws InterruptedException{
				Thread.sleep(3000);
				driver.navigate().to("https://staging.guarented.com/rent/product/furniture/royal-brad-dsk");
				Thread.sleep(10000);
				Assert.assertTrue(driver.getCurrentUrl().equals("https://staging.guarented.com/bangalore/rent/brand-new-bradbury-desk?param=royal-brad-dsk"));
				System.out.println("royal  broad band desk passed");}
			
	
				
				@Test
			public void elitecentertable() throws InterruptedException{
					Thread.sleep(3000);
				driver.navigate().to("https://staging.guarented.com/rent/product/furniture/elt-ct");
				Thread.sleep(9000);
				Assert.assertTrue(driver.getCurrentUrl().equals("https://staging.guarented.com/bangalore/rent/elite-centre-table?param=elt-ct"));
				System.out.println("elite centertable passed");}
				
				@Test
			public void elitesttudytable() throws InterruptedException{
					Thread.sleep(3000);
				driver.navigate().to("https://staging.guarented.com/rent/product/furniture/elt-st");
				Thread.sleep(9000);
				Assert.assertTrue(driver.getCurrentUrl().equals("https://staging.guarented.com/bangalore/rent/elite-study-table?param=elt-st"));
				System.out.println("elite study table passed");}
	
				
				@Test
			public void elitebedtable() throws InterruptedException{
				Thread.sleep(3000);
				driver.navigate().to("https://staging.guarented.com/rent/product/furniture/elt-bt");
				Thread.sleep(9000);
				Assert.assertTrue(driver.getCurrentUrl().equals("https://staging.guarented.com/bangalore/rent/eite-bedside-table?param=elt-bt"));
				System.out.println("elite bed table passed");}
				
				
				@Test
			public void coltondoublebedroompackage() throws InterruptedException{
				Thread.sleep(3000);
				driver.navigate().to("https://staging.guarented.com/rent/product/furniture/cltn-dbl-pack");
				Thread.sleep(9000);
				Assert.assertTrue(driver.getCurrentUrl().equals("https://staging.guarented.com/bangalore/rent/colton-double-bedroom-package?param=cltn-dbl-pack"));
				System.out.println("coltondoublebedroompackage passed");}
				
				@Test
				public void coltonsinglebedroompackage() throws InterruptedException{
					Thread.sleep(3000);
					driver.navigate().to("https://staging.guarented.com/rent/product/furniture/cltn-sng-pack");
					Thread.sleep(9000);
					Assert.assertTrue(driver.getCurrentUrl().equals("https://staging.guarented.com/bangalore/rent/colton-single-bedroom-package?param=cltn-sng-pack"));
					System.out.println("coltonsinglebedroompackage passed");}
			
	
				
				@Test
			public void coltontwinpackage() throws InterruptedException{
				Thread.sleep(3000);
				driver.navigate().to("https://staging.guarented.com/rent/product/furniture/cltn-twn-pack");
				Thread.sleep(9000);
				Assert.assertTrue(driver.getCurrentUrl().equals("https://staging.guarented.com/bangalore/rent/colton-twin-bedroom-package?param=cltn-twn-pack"));
				System.out.println("colton twin package passed");}
				
				@Test
			public void brandnewstudystudypackage() throws InterruptedException{
				Thread.sleep(3000);
				driver.navigate().to("https://staging.guarented.com/rent/product/furniture/ryl-std-pack");
				Thread.sleep(9000);
				Assert.assertTrue(driver.getCurrentUrl().equals("https://staging.guarented.com/bangalore/rent/brand-new-study-package?param=ryl-std-pack"));
				System.out.println("brandnewstudystudypackage  passed");}
	
				
				@Test
			public void elitestudypackage() throws InterruptedException{
				Thread.sleep(3000);
				driver.navigate().to("https://staging.guarented.com/rent/product/furniture/elt-std-pack");
				Thread.sleep(9000);
				Assert.assertTrue(driver.getCurrentUrl().equals("https://staging.guarented.com/bangalore/rent/elite-study-package?param=elt-std-pack"));
				System.out.println("elite study package passed");}
				
				
				@Test
			public void smalltv() throws InterruptedException {
				Thread.sleep(3000);
				driver.navigate().to("https://staging.guarented.com/rent/product/appliances/tv-small");
				Thread.sleep(9000);
				Assert.assertTrue(driver.getCurrentUrl().equals("https://staging.guarented.com/bangalore/rent/led-tv(24-inch)?param=tv-small"));
				System.out.println("small tv passed");}
	
				
				@Test
			public void mediumtv() throws InterruptedException{
				Thread.sleep(3000);
				driver.navigate().to("https://staging.guarented.com/rent/product/appliances/tv-medium");
				Thread.sleep(9000);
				Assert.assertTrue(driver.getCurrentUrl().equals("https://staging.guarented.com/bangalore/rent/led-tv(32-inch)?param=tv-medium"));
				System.out.println("medium tv  passed");}
				
				@Test
			public void largetv() throws InterruptedException {
				Thread.sleep(3000);
				driver.navigate().to("https://staging.guarented.com/rent/product/appliances/tv-large");
				Thread.sleep(9000);
				Assert.assertTrue(driver.getCurrentUrl().equals("https://staging.guarented.com/bangalore/rent/led-tv(39-inch)?param=tv-large"));
				System.out.println("large tv  passed");}
	
				
				@Test
			public void toploadwashingmachine() throws InterruptedException{
				Thread.sleep(3000);
				driver.navigate().to("https://staging.guarented.com/rent/product/appliances/washer-fa-small");
				Thread.sleep(9000);
				Assert.assertTrue(driver.getCurrentUrl().equals("https://staging.guarented.com/bangalore/rent/top-loading-washing-machine?param=washer-fa-small"));
				System.out.println("toploadwashingmachine  passed");}
				
				@Test
			public void  frontloadashingmachine() throws InterruptedException {
				Thread.sleep(3000);
				driver.navigate().to("https://staging.guarented.com/rent/product/appliances/washer-sa-small");
				Thread.sleep(9000);
				Assert.assertTrue(driver.getCurrentUrl().equals("https://staging.guarented.com/bangalore/rent/front-loading-washing-machine?param=washer-sa-small"));
				System.out.println("frontloadashingmachine  passed");}
	
				
				@Test
			public void  brandnewtoploadwashingmachine() throws InterruptedException {
				Thread.sleep(3000);
				driver.navigate().to("https://staging.guarented.com/rent/product/appliances/ryl-washer-tl");
				Thread.sleep(9000);
				Assert.assertTrue(driver.getCurrentUrl().equals("https://staging.guarented.com/bangalore/rent/brand-new-top-load-washing-machine?param=ryl-washer-tl"));
				System.out.println("brandnewtoploadwashingmachine passed");}
				
				
				//@Test
			public void brandnewfrontloadwashingmachine() throws InterruptedException {
				Thread.sleep(3000);
				driver.navigate().to("https://staging.guarented.com/rent/product/appliances/ryl-washer-fl");
				Thread.sleep(9000);
				Assert.assertTrue(driver.getCurrentUrl().equals("https://staging.guarented.com/bangalore/rent/brand-new-front-load-washing-machine?param=ryl-washer-fl"));
				System.out.println("brandnewfrontloadwashingmachine passed");}
	
				
				@Test
			public void Doubledoorfridge() throws InterruptedException {
				Thread.sleep(3000);
				driver.navigate().to("https://staging.guarented.com/rent/product/appliances/fridge-dd");
				Thread.sleep(9000);
				Assert.assertTrue(driver.getCurrentUrl().equals("https://staging.guarented.com/bangalore/rent/double-door-fridge?param=fridge-dd"));
				System.out.println("double door fridge passed");}
				
				@Test
			public void fridgesingledoor() throws InterruptedException{ 
				Thread.sleep(3000);
				driver.navigate().to("https://staging.guarented.com/rent/product/appliances/fridge-sd");
				Thread.sleep(9000);
				Assert.assertTrue(driver.getCurrentUrl().equals("https://staging.guarented.com/bangalore/rent/single-door-refrigerator?param=fridge-sd"));
				System.out.println("fridge single door passed");}
	
				
				@Test
			public void brandnewsingledoor() throws InterruptedException{
				Thread.sleep(3000);
				driver.navigate().to("https://staging.guarented.com/rent/product/appliances/ryl-fridge-sd");
				Thread.sleep(9000);
				Assert.assertTrue(driver.getCurrentUrl().equals("https://staging.guarented.com/bangalore/rent/brand-new-single-door-refrigerator?param=ryl-fridge-sd"));
				System.out.println("brandnewsingledoor  passed");}
				
				
				@Test
			public void convectionmicrowave() throws InterruptedException {
				Thread.sleep(3000);
				driver.navigate().to("https://staging.guarented.com/rent/product/appliances/mw");
				Thread.sleep(9000);
				Assert.assertTrue(driver.getCurrentUrl().equals("https://staging.guarented.com/bangalore/rent/convection-microwave?param=mw"));
				System.out.println(" convection microwave passed");}
	
				
				@Test
			public void solomicrowave() throws InterruptedException {
				Thread.sleep(3000);
				driver.navigate().to("https://staging.guarented.com/rent/product/appliances/mw-solo");
				Thread.sleep(9000);
				Assert.assertTrue(driver.getCurrentUrl().equals("https://staging.guarented.com/bangalore/rent/solo-microwave?param=mw-solo"));
				System.out.println("solo microwave  passed");}
				
				
				@Test
			public void basicappliancespackage() throws InterruptedException {
				driver.navigate().to("https://staging.guarented.com/rent/product/appliances/app-pack-basic");
				Thread.sleep(3000);
				Assert.assertTrue(driver.getCurrentUrl().equals("https://staging.guarented.com/bangalore/rent/basic-appliance-package?param=app-pack-basic"));
				System.out.println("basicappliancespackage passed");}
	
				
				@Test
			public void basickitchenpackage() throws InterruptedException {
				Thread.sleep(3000);
				driver.navigate().to("https://staging.guarented.com/rent/product/appliances/app-pack-kit");
				Thread.sleep(9000);
				Assert.assertTrue(driver.getCurrentUrl().equals("https://staging.guarented.com/bangalore/rent/basic-kitchen-package?param=app-pack-kit"));
				System.out.println("basickitchenpackage passed");}
				
				@Test
			public void royalappliancespackage() throws InterruptedException {
				Thread.sleep(3000);
				driver.navigate().to("https://staging.guarented.com/rent/product/appliances/app-pack-royal");
				Thread.sleep(9000);
				Assert.assertTrue(driver.getCurrentUrl().equals("https://staging.guarented.com/bangalore/rent/royal-appliance-package?param=app-pack-royal"));
				System.out.println("royal appliances package passed");}
	
				
				@Test
			public void completepackage() throws InterruptedException {
				Thread.sleep(3000);
				driver.navigate().to("https://staging.guarented.com/rent/product/appliances/app-pack-comp");
				Thread.sleep(10000);
				Assert.assertTrue(driver.getCurrentUrl().equals("https://staging.guarented.com/bangalore/rent/complete-package?param=app-pack-comp"));
				System.out.println("application package passed");}
				
				@Test
			public void royalappliancepackage() throws InterruptedException {
				Thread.sleep(3000);
				driver.navigate().to("https://staging.guarented.com/rent/product/appliances/app-pack-royal");
				Thread.sleep(9000);
				Assert.assertTrue(driver.getCurrentUrl().equals("https://staging.guarented.com/bangalore/rent/royal-appliance-package?param=app-pack-royal"));
				System.out.println("royalappliancepackage passed");}}
	
				
		/*		//@Test
			public void appliances package {
				driver.navigate().to("https://staging.guarented.com/rent/product/appliances/app-pack-comp");
				Thread.sleep(3000);
				Assert.assertTrue(driver.getCurrentUrl().equals("https://staging.guarented.com/bangalore/rent/app-pack-comp"));
				System.out.println(" appliances package passed");}*/
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	


