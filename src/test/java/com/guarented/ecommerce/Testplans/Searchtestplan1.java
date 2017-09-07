package com.guarented.ecommerce.Testplans;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;

import com.guaren.ecommerce.excelreader.Excel_Reader;
import com.guarented.ecommerce.pages.Search1;
import com.guarented.reportsbaseclass.BaseTest;

public class Searchtestplan1 extends BaseTest {
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
	 /*@DataProvider public Object[][] searchData(){ Object[][] data =
			  getData("searchDatathroughbooking.xlsx", "Search keywords"); return data; }
			  
			  
			 
			  @Test(dataProvider = "searchDatathroughbooking") public void
			  TestSearchThroughexcelwithoutlogin(String TestCaseName,String
			  Categoryname,String Search,String Searchcriteria) throws
			  InterruptedException{ Thread.sleep(6000); Homepage1 gh=new Homepage1();
			  
			  Thread.sleep(8000); Searchtestplan1 sp=new Searchtestplan1();
			  sp.validateAutoSuggestionInUniversalSearch(Search,Searchcriteria);
			  
			  }*/
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	Search1 sh = new Search1();
	int i;

	public void typeInUniversalSearch(String searchParameter) {
		Search1 sh = new Search1();
		sh.getUniversalSearchBar().click();
		System.out.println("taking the keyword");
		sh.getUniversalSearchBar().sendKeys(searchParameter);

	}

	public void validateAutoSuggestionInUniversalSearch(String searchString,
			String cloud) throws InterruptedException {
		Search1 sh = new Search1();
		typeInUniversalSearch(searchString);
		List<WebElement> list = sh.getSearchedPamameterResultList();
		System.out.println("Auto Suggest List size : " + list.size());
		for (int i = 0; i < list.size(); i++)
			System.out.println("list of product values are : "
					+ list.get(i).getText());
		Assert.assertTrue(list.size() >= 1,
				"Auto Suggest List is not Available for : " + searchString);
		String searchcriteria = cloud;
		System.out.println("product keywords from testdata is "
				+ searchcriteria);
		String[] str = searchcriteria.split(",");

		for (String temp : str) {
			System.out.println("single value from testdata is " + temp);

			List<WebElement> Stringvalue = list;
			for (WebElement temp1 : Stringvalue) {
				System.out.println("all the  product names in dropdown "
						+ temp1.getText());

				if (temp1.getText().toLowerCase().contains(temp)) {
					System.out
							.println("success with category with keyword is  "
									+ temp);

				}
			}
		}
	}
}
