package com.dietician.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {

	public WebDriver driver;
	public static ThreadLocal<WebDriver> tlDriver = new ThreadLocal<>();
	public WebDriver init_driver(String browser)
	{
		
    if(browser == null)
    {
       System.out.println("browser null -" + browser);
    }
    else
    {
    	System.out.println("browser -" + browser);
    	
    }
    
	if(browser.equals("chrome"))
	{
	WebDriverManager.chromedriver().setup();
	tlDriver.set(new ChromeDriver());
	}
	else if(browser.equals("firefox"))
	{
	WebDriverManager.chromedriver().setup();
	tlDriver.set(new FirefoxDriver());
	}
	else if(browser.equals("safari"))
	{
	WebDriverManager.chromedriver().setup();
	tlDriver.set(new FirefoxDriver());
	}

	getDriver().manage().deleteAllCookies();
	getDriver().manage().window().maximize();
	return getDriver();
	}
	
	public static synchronized WebDriver getDriver()
	{
		 return tlDriver.get();
	}
	
	
			
	
}
