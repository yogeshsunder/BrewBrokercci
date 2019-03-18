package BrewBrokercircleci.BrewBrokercircleci;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class OpenBrowser {
	
	WebDriver driver;
	
	@Test
	public void openBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("headless");
		options.addArguments("window-size=1400,800");
	
		driver = (WebDriver) new ChromeDriver(options);
		//driver=(WebDriver) new ChromeDriver();
		
		
		driver.get("https://brewbroker.com/");
	}

}
