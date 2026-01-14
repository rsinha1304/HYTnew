package tests;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.BasicControl;

public class BasicTest extends BaseTest{
	
	@Test
	public void basicControlTest() {
		
		driver.get(prop.getProperty("basicurl"));
		
		BasicControl bc = new BasicControl(driver);
		
		bc.enterNames(prop.getProperty("firstName"), prop.getProperty("lastName"));
		
		bc.selectGender();
		
		bc.enterEmailAndPassword("email", "password");
		
	}

}
