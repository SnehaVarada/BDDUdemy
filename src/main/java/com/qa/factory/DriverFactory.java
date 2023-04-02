package com.qa.factory;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {
	
 public WebDriver driver;
	
	public static ThreadLocal <WebDriver> tlDriver = new ThreadLocal<>();
	
	/*
	 * This method is used to initialize the threadlocal driver on the basis of
	 * given browser
	 * 
	 * @param browser
	 * 
	 * @return
	 */
	
	public WebDriver init_driver(String browser)
	{
		System.out.println("browser value is: "+browser);
		
		if(browser.equals("chrome")) 
		{
			WebDriverManager.chromedriver().setup();
			tlDriver.set(new ChromeDriver());
		}

		else if(browser.equals("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			tlDriver.set(new FirefoxDriver());
		}
		else
		{
			System.out.println("Please pass the correct browser value: "+browser);
		}
		getDriver().manage().deleteAllCookies();
		getDriver().manage().window().maximize();
		//driver.manage().timeouts().getImplicitWaitTimeout(Duration.ofSeconds(5));
		return getDriver();
	}	
	
	// This is used to get the driver with threadlocal
	//@return
	public static synchronized WebDriver getDriver()
	{
    return tlDriver.get();
}
}