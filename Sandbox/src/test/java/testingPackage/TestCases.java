package testingPackage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.Parameters;

import dataPackage.Browser;
import pageObjectModel.GoogleHomePage;
import pageObjectModel.GoogleResultPage;

import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;

public class TestCases {
	WebDriver browserObject;
	String query="twitter";
	String result = "Login on Twitter";
	String URL="https://www.google.com/ncr";
	
	 @BeforeClass
	  @Parameters("browserName")
	  public void beforeClass(String browserName) {
		  Browser.setBrowser(browserName);
		  browserObject=Browser.getBrowser();
	  }
	 
  @Test
  public void f() {
	  GoogleHomePage homePage = new GoogleHomePage(browserObject);
	  GoogleResultPage resultPage = new GoogleResultPage(browserObject);
	  
	  homePage.navigateToURL(URL);
	  homePage.search(query);
	  resultPage.assertResult(result);
  }

 

  @AfterClass
  public void afterClass() {
  }

}
