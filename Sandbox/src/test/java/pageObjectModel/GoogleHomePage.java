package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class GoogleHomePage {

	//variables
	WebDriver browserObject;
	//locators
	By searchbar=By.name("q") ;
	//keywords
	
	
	public GoogleHomePage(WebDriver browserObject) {
		this.browserObject=browserObject;
	}
	
	public void navigateToURL(String URL)
	{
		browserObject.navigate().to(URL);
	}
	
	public void search(String query)
	{
		browserObject.findElement(searchbar).sendKeys(query);
		browserObject.findElement(searchbar).sendKeys(Keys.ENTER);
	}
}
