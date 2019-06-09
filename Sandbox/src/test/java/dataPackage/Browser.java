package dataPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Browser {
	
	static WebDriver  browserObject;

	public static void setBrowser(String browserName)
	{
		if(browserName.equalsIgnoreCase("chrome"))
		{
			ChromeOptions opt = new ChromeOptions();
			opt.addArguments("--disable-notifications");
			System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
			browserObject= new ChromeDriver(opt);
		}else
			if(browserName.equalsIgnoreCase("firefox"))
			{
				FirefoxOptions opt = new FirefoxOptions();
				opt.addPreference("dom.webnotifications.enabled", false);
				System.setProperty("webdriver.gecko.driver", "src/test/resources/geckodriver.exe");
				browserObject= new FirefoxDriver(opt);
			}
		
		browserObject.manage().window().maximize();
	}
	
	
	public static WebDriver getBrowser()
	{
		return browserObject;
	}
}
