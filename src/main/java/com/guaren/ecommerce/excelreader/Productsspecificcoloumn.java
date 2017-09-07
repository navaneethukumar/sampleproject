package com.guaren.ecommerce.excelreader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


	public class Productsspecificcoloumn {

		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");        
	
			
		//	System.setProperty("webdriver.gecko.driver","D:\\geckodriver.exe"); 
	   //    System.setProperty("webdriver.gecko.driver","C:\\Users\\user\\Downloads\\geckodriver-v0.18.0-win64\\geckodriver.exe");
		WebDriver driver=new ChromeDriver();
	       Thread.sleep(10000);
			
			driver.get("https://staging.guarented.com/");
			driver.manage().window().maximize();
			
			
			Thread.sleep(10000);
			driver.findElement(By.xpath("//*[@id='profile_white']")).click();
			//login drodown
			driver.findElement(By.xpath("//*[@id='profile_tab']/ul/li[1]/a")).click();
			Thread.sleep(3000);
			//email
			driver.findElement(By.xpath("//*[@id='input_14']")).sendKeys("naresh@guarented.com");
			//password
			driver.findElement(By.xpath("//*[@id='input_15']")).sendKeys("neethu23");
			//submit
			driver.findElement(By.xpath("//*[@id='tab-content-12']/div/md-content/form/button")).click();
			//text in home page
			Thread.sleep(10000);
			driver.findElement(By.xpath("//*[@id='cart_tab']/md-icon")).click();
			Thread.sleep(5000);
			int r=driver.findElements(By.xpath(".//*[@id='cart_table']/tbody/tr")).size();

			System.out.println("rows are  "+r);
			int c=driver.findElements(By.xpath(".//*[@id='cart_table']/thead/tr/th")).size();
			System.out.println("coloums are  "+c);
			for(int i=1;i<=r;i++){
				for(int j=1;j<=c;j++){
					System.out.print(driver.findElement(By.xpath(".//*[@id='cart_table']/tbody/tr["+i+"]/td["+j+"]")).getText()+"   ");
					
				}
				System.out.println();
			}
			
			 
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
	/*		
			int r=driver.findElements(By.xpath(".//*[@id='cart_table']/tbody/tr")).size();
int statuscount=0;
			System.out.println("rows are  "+r);
			for(int i=1;i<=r;i++){
				String status=driver.findElement(By.xpath(".//*[@id='cart_table']/tbody/tr[" +i+ "]/td[1]")).getText();
			System.out.println("statusdata is  "+status);
			if(status.equals("Elite Camilla Single Bed)")){
				statuscount=statuscount+1;
			}
			
			}
			*/
			
			
			
			
			/*driver.findElement(By.xpath("//span[contains(text(),'PRODUCTS')]")).click();
			//1st image
			Thread.sleep(5000);
			driver.findElement(By.xpath(".//*[@id='product']/div[3]/div/div[2]/div/div[1]/a[2]/div/md-card/img")).click();
			//add to cart button
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id='fea']/div[2]/div[2]/button[1]")).click();
			//String confirmation_message_toaddingcart=driver.findElement(By.xpath(".//*[@id='fea']/md-toast/div/div/p[1]")).getText();
			//System.out.println("confirmation message is "+confirmation_message_toaddingcart);
			driver.findElement(By.xpath("//*[@id='fea']/div[2]/div[2]/button[2]")).click();	   
			driver.findElement(By.xpath("//*[@id='fea']/div[2]/div[2]/button[2]")).click();
			Thread.sleep(5000);
			int r=driver.findElements(By.xpath(".//*[@id='cart_table']/tbody/tr")).size();

			System.out.println("rows are  "+r);
			int c=driver.findElements(By.xpath(".//*[@id='cart_table']/thead/tr/th")).size();
			System.out.println("coloums are  "+c);
			for(int i=1;i<=r;i++){
				for(int j=1;j<=c;j++){
					System.out.print(driver.findElement(By.xpath(".//*[@id='cart_table']/tbody/tr["+i+"]/td["+j+"]")).getText()+"   ");
					
				}
				System.out.println();
			}*/

		
	/*By mySelector = By.xpath("//span[@class='ng-scope']");
			
			List<WebElement> myElements = driver.findElements(mySelector);
			for(WebElement e : myElements) {
			  System.out.println("values are  "+  e.getText());
			  Thread.sleep(6000);
			  
			  
			  			  
			
			if( e.getText().equals("NEXT"))
				e.click();
			}*/
			
/*
			driver.findElement(By.xpath("//*[@id='cart_tab']/md-icon")).click();
			Thread.sleep(5000);
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			//driver.manage().deleteAllCookies();
			
			
			
			
			
			
			/*Set<Cookie> cookie=driver.manage().getCookies();
			Iterator<Cookie>cookieset=cookie.iterator();
			while(cookieset.hasNext()){
				System.out.println("the cookies are "+cookieset.next());
			}
			
			
			
			
			
		//WebElement ele=	driver.findElement(By.id("cart_table"));
			
			
			
			
			/*List<WebElement>ele=driver.findElements(By.tagName("tr"));
	
	         System.out.println("rows are  "+ele.size());
	         List<WebElement>elebodyrows=driver.findElements(By.xpath(".//*[@id='cart_table']/tbody/tr"));
	     	
	         System.out.println("rows are  "+elebodyrows.size());
	         List<WebElement>eletds=driver.findElements(By.tagName("td"));
	     	
	         System.out.println("rows are  "+eletds.size());
	         
	         */
	         
	         
	         
	         
	         
			
			
			
			
			
			
			
			/*String value1=driver.findElement(By.xpath(".//*[@id='container']/div[2]/div/div[1]/h1")).getText();
			String expected1="GUARENTED";
			System.out.println("the page validation is  "+value1);
			Assert.assertEquals(value1, expected1);
			System.out.println("tha validation success in home page ");
			
			driver.findElement(By.xpath("//span[contains(text(),'PRODUCTS')]")).click();
			//1st image
			Thread.sleep(5000);
			driver.findElement(By.xpath(".//*[@id='product']/div[3]/div/div[2]/div/div[1]/a[2]/div/md-card/img")).click();
			//add to cart button
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id='fea']/div[2]/div[2]/button[1]")).click();
			//String confirmation_message_toaddingcart=driver.findElement(By.xpath(".//*[@id='fea']/md-toast/div/div/p[1]")).getText();
			//System.out.println("confirmation message is "+confirmation_message_toaddingcart);
			driver.findElement(By.xpath("//*[@id='fea']/div[2]/div[2]/button[2]")).click();	   
			driver.findElement(By.xpath("//*[@id='fea']/div[2]/div[2]/button[2]")).click();
			Thread.sleep(5000);

		
	By mySelector = By.xpath("//span[@class='ng-scope']");
			
			List<WebElement> myElements = driver.findElements(mySelector);
			for(WebElement e : myElements) {
			  System.out.println("values are  "+  e.getText());
			  Thread.sleep(6000);
			  
			  
			  			  
			
			if( e.getText().equals("NEXT"))
				e.click();
			}
			//mobile number
			Thread.sleep(6000);
			driver.findElement(By.xpath("//*[@id='input_55']")).sendKeys("3434343434");
			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@id='input_59']")).sendKeys("3434");
			Thread.sleep(5000);
	By mySelector1 = By.xpath("//*[@id='action-button']");
			
			List<WebElement> myElements1 = driver.findElements(mySelector);
			for(WebElement e1 : myElements1) {
			  System.out.println("values are payment  "+  e1.getText());
			  Thread.sleep(6000);
			  
			  if( e1.getText().equals("NEXT"))
				e1.click();
			}
			Thread.sleep(5000);
			//card on delivery
			driver.findElement(By.xpath("//*[@id='radio_10']/div[1]/div")).click();
		
		
		
		
*/		}


}
