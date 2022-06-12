package Hooks;

import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.dietician.factory.DriverFactory;
import com.dietician.util.ConfigReader;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class ApplicationHooks {
	DriverFactory df;
	WebDriver driver;
	ConfigReader config;
	Properties prop;
	
	@Before(order=0)
	public void getProperty()
	{
		config = new ConfigReader();
		prop = config.init_prop();
		
	}
	@Before(order =1)
	public void launchbrowser()
	{
		String broName= prop.getProperty("browser");
		df = new DriverFactory();
		driver = df.init_driver(broName);		
	}
	
	@After(order=0)
	public void quitbrowser()
	{
		driver.quit();
	}
	@After(order=1)
	public void screenshot(Scenario scenario)
		{
	//method to Take screenshot
		if(scenario.isFailed())
		{
			String ScreenshotName= scenario.getName().replaceAll("", "-");
			byte [] sourcePath = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);//Jenkins accepts Bytes but not file
			scenario.attach(sourcePath, "image/png",ScreenshotName);				
		}
	}
	}
	
	

