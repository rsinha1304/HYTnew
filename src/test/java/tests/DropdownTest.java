package tests;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.DropdownPractice;

public class DropdownTest extends BaseTest{
	
	@Test
	public void dropDownTest() {
		
		driver.get(prop.getProperty("dropdownurl"));
		
		DropdownPractice dp = new DropdownPractice(driver);
		
		dp.selectCourseName("Java");
		dp.selectIDEName("Eclipse");
	}

}
