package pageObjectModel;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleResultPage {

	// variables
	WebDriver browserObject;
	// locators
	By firstResult = By.xpath("(//h3[@class='LC20lb'])[1]");
	// keywords

	public GoogleResultPage(WebDriver browserObject) {
		this.browserObject = browserObject;
	}
	
	public void assertResult(String result)
	{
		WebElement element = browserObject.findElement(firstResult);
		assertEquals(element.getText(), result);
	}

}
