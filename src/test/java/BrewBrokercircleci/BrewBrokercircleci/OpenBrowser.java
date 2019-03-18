package BrewBrokercircleci.BrewBrokercircleci;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OpenBrowser {
	
	WebDriver driver;
	
	@Test
	public void openBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://brewbroker.com/");
	}

}
