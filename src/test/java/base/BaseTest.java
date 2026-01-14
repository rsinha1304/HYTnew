package base;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import configClass.ConfigReader;
import utils.DriverFactory;

public class BaseTest {
	
	
	//recommended try to save in test file
	public WebDriver driver;
	public Properties prop;

	@BeforeMethod
	public void setUp() {
		
		prop = ConfigReader.initProperties();
		driver = DriverFactory.initDriver(prop.getProperty("browserName"));
		driver.get(prop.getProperty("url"));
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
