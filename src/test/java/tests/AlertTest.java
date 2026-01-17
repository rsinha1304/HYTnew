package tests;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.AlertPractice;

public class AlertTest extends BaseTest{
	
	@Test
	public void alertPracticeTest() {
		
		driver.get(prop.getProperty("alerturl"));
		AlertPractice ap = new AlertPractice(driver);
		ap.clickOnAlertBox();
		ap.confirmTheAlertBox();
		ap.sendKeysToPromptBox();
	}
	
	
	

}
