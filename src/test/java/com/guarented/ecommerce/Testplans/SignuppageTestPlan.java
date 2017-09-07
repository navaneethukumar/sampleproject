package com.guarented.ecommerce.Testplans;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.guaren.ecommerce.excelreader.Excel_Reader;
import com.guarented.ecommerce.pageUtils.LoginPageUtils1;
import com.guarented.reportsbaseclass.BaseTest;

public class SignuppageTestPlan extends BaseTest {
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
	@DataProvider public Object[][] SignupDatawithinvalid(){ 
		  Object[][] data =getData("GuarentedData.xlsx", "customersignupwithinvaliddetail"); 
		  return data; 
	 }
	@Test(dataProvider = "SignupDatawithinvalid")
	public void signupwithinvaliddetails(String TestCaseName, String fullname,
			String mobilenumber, String emailid,String password )
			throws InterruptedException {
		test = extent.createTest("signupwithinvaliddetails");
        Thread.sleep(6000);
		LoginPageUtils1 lu = new LoginPageUtils1();
		lu.clickonsignindropdown();
		lu.clicksigninbutton();
		Thread.sleep(4000);
		lu.clickonfirstsignup();
		
		lu.customerdetailsinsignuppage(fullname, mobilenumber, emailid, password);
		Thread.sleep(5000);
		lu.clickoncreateaccountsignupbutton();
	}
	@DataProvider public Object[][] SignupDatawithvaliddetails(){ 
		  Object[][] data =getData("GuarentedData.xlsx", "SignupDatawithvaliddetails"); 
		  return data; 
	 }
	@Test(dataProvider = "SignupDatawithvaliddetails")
	public void testproductsthroughexcel(String TestCaseName, String fullname,
			String mobilenumber, String emailid,String password )
			throws InterruptedException {
		test = extent.createTest("SignupDatawithvaliddetails");
      Thread.sleep(6000);
		LoginPageUtils1 lu = new LoginPageUtils1();
		lu.clickonsignindropdown();
		lu.clicksigninbutton();
		Thread.sleep(4000);
		lu.clickonfirstsignup();
		
		lu.customerdetailsinsignuppage(fullname, mobilenumber, emailid, password);
		Thread.sleep(5000);
		lu.clickoncreateaccountsignupbutton();
	}
	
	
	
	

}
