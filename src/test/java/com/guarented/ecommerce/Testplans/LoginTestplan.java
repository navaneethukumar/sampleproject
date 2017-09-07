package com.guarented.ecommerce.Testplans;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.guaren.ecommerce.excelreader.Excel_Reader;
import com.guarented.ecommerce.pageUtils.HomePageUtils1;
import com.guarented.ecommerce.pageUtils.LoginPageUtils1;
import com.guarented.reportsbaseclass.BaseTest;

public class LoginTestplan  extends BaseTest{
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
	@DataProvider
	public Object[][] LoginDatawithvaliddetails() {
		Object[][] data = getData("GuarentedData.xlsx", "Loginwithvaliddetails");
		return data;
	}
	@Test(dataProvider = "LoginDatawithvaliddetails")
	public void customerdetailsinLoginpagewithvaliddetails(String TestCaseName,String email,String password )
			throws InterruptedException {
		test = extent.createTest("LoginDatawithvaliddetails");
		
		Thread.sleep(6000);
		LoginPageUtils1 lu = new LoginPageUtils1();
		
		lu.clickonsignindropdown();
		lu.clicksigninbutton();
        lu.enterAllreadyRegisterUserEmail(email);
        
		lu.enterAllReadyRegisteredPassword(password);
		lu.clickonSubmitbutton();
		HomePageUtils1 hu=new HomePageUtils1();
		hu.verifyGuarentedtextinhomepage();
		
		System.out.println("homepage text verified");
		
	}
	@DataProvider
	public Object[][] LoginDatawithinvaliddetails() {
		Object[][] data = getData("GuarentedData.xlsx", "Loginwithinvaliddetails");
		return data;
	}
	@Test(dataProvider = "LoginDatawithinvaliddetails")
	public void customerdetailsinLoginpagewithinvaliddetails(String TestCaseName,String email,String password )
			throws InterruptedException {
		test = extent.createTest("customerdetailsinLoginpagewithinvaliddetails");
		
		Thread.sleep(6000);
		LoginPageUtils1 lu = new LoginPageUtils1();
		
		lu.clickonsignindropdown();
		lu.clicksigninbutton();
        lu.enterAllreadyRegisterUserEmail(email);
        
		lu.enterAllReadyRegisteredPassword(password);
		lu.clickonSubmitbutton();
		HomePageUtils1 hu=new HomePageUtils1();
		hu.verifyGuarentedtextinhomepage();
		test.log(Status.INFO, "homepage  text verified");
		
		
		System.out.println("homepage text verified");
		
	}
	

	
	
	
	

}
