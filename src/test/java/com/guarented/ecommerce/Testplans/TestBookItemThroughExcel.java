package com.guarented.ecommerce.Testplans;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

import com.aventstack.extentreports.Status;
import com.guaren.ecommerce.excelreader.Excel_Reader;
import com.guarented.ecommerce.pageUtils.Delivery1utls;
import com.guarented.ecommerce.pageUtils.HomePageUtils1;
import com.guarented.ecommerce.pageUtils.LoginPageUtils1;
import com.guarented.ecommerce.pageUtils.cartpageUtils1;
import com.guarented.ecommerce.pageUtils.productdetailsutils1;
import com.guarented.ecommerce.pages.emailconfiguration;
import com.guarented.reportsbaseclass.BaseTest;

import java.io.IOException;

public class TestBookItemThroughExcel extends BaseTest {
	@BeforeMethod
	
	public void setUP() throws IOException {
		init1();
	}
	
	public Object[][] getData(String ExcelName, String testcase) {
		Excel_Reader Data = new Excel_Reader(System.getProperty("user.dir")
				+ "//src//test//resources//" + ExcelName);
		int rowNum = Data.getRowCount(testcase);
		System.out.println(rowNum);
		int colNum = Data.getColumnCount(testcase);
		Object sampleData[][] = new Object[rowNum - 1][colNum];
		for (int i = 2; i <= rowNum; i++) {
			for (int j = 0; j < colNum; j++) {
				sampleData[i - 2][j] = Data.getCellData(testcase, j, i);
			}
		}
		return sampleData;
	}

	@DataProvider public Object[][] sendingproductsthroughexcelwithallfieldswithlogin(){ 
		  Object[][] data =getData("GuarentedData.xlsx", "productswithlogin"); 
		  return data; 
	 }

	@DataProvider public Object[][] sendingproductsthroughexcelwithallfieldswithoutlogin(){ 
		  Object[][] data =getData("GuarentedData.xlsx", "productswithallfields"); 
		  return data; 
	 }
	
	@Test(dataProvider = "sendingproductsthroughexcelwithallfieldswithlogin")
	public void sendingproductsthroughexcelwithallfieldswithlogin(String TestCaseName,String emailid,String password, String productname)
			throws Exception {
		test = extent.createTest("sendingproductsthroughexcelwithallfieldswithlogin started");
		System.out.println("sendingproductsthroughexcelwithallfieldswithlogin");
		Thread.sleep(3000);
		LoginPageUtils1 lu = new LoginPageUtils1();
	
		lu.loginToApplication(emailid,password);
		test.log(Status.INFO, "Login page ended");
		Thread.sleep(9000);
		HomePageUtils1 hpu=new HomePageUtils1();
		hpu.clickAndSendDataToSearchBar(productname);
		hpu.bookIteminGuarented();
		emailconfiguration ec=new emailconfiguration();
		ec.emailconfigurationmethod();
		test.log(Status.INFO,"sendingproductsthroughexcelwithallfieldswithlogin ended ");
		System.out.println("sendingproductsthroughexcelwithallfieldswithlogin ended");
		
		
	
	}
	@Test(dataProvider = "sendingproductsthroughexcelwithallfieldswithoutlogin")
	public void sendingproductsthroughexcelwithallfieldswithoutlogin(String TestCaseName,String username,String password, String productname,String cuspincode,String cusmobno,String Address,String societyname,String area )
			throws Exception {
		test = extent.createTest("sendingproductsthroughexcelwithallfieldswithoutlogin started");
		
		System.out.println("sendingproductsthroughexcelwithallfieldswithoutlogin");
		Thread.sleep(7000);
		
		HomePageUtils1 hpu=new HomePageUtils1();
		test.log(Status.INFO, "homepage started");
		hpu.clickAndSendDataToSearchBar(productname);
		Thread.sleep(6000);
		test.log(Status.INFO, "homepage ended");
		productdetailsutils1 pu=new productdetailsutils1();
		pu.validationsinproductdetailspage();
		pu.click_Addtocart_Button();
		pu.clickCheckoutButton();
		Thread.sleep(4000);
		test.log(Status.INFO, "product details ended");
		cartpageUtils1 cp=new cartpageUtils1();
		cp.validdationsincartpage();
		cp.click_Next_Buttonincart();
		Thread.sleep(6000);
		test.log(Status.INFO, "cart page ended");
		LoginPageUtils1 lu = new LoginPageUtils1();
		Thread.sleep(7000);
		lu.enterAllreadyRegisterUserEmail(username);
		lu.enterAllReadyRegisteredPassword(password);
		lu.clickonSubmitbutton();
		test.log(Status.INFO, "Login page ended");
		
		Thread.sleep(9000);
		cp.click_Next_Buttonincart();
		Thread.sleep(4000);
		Delivery1utls du=new Delivery1utls();
		du.sendcustomerdetailsindeliverypage(cuspincode, cusmobno, Address, societyname, area);
		test.log(Status.INFO,"sendingproductsthroughexcelwithallfieldswithoutlogin ");

		
	}}

		
		
		/*//hpu.bookIteminGuarented();
		emailconfiguration ec=new emailconfiguration();
		ec.emailconfigurationmethod();
		System.out.println("bookitemthroughsearch testcase through excel ended");
		*/
