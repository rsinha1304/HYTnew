package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AlertPractice {

	
	//add new page and the element
	
	WebDriver driver;
	
	@FindBy(xpath="//button[@id='alertBox']")
	private WebElement alertBox;
	
	
	public AlertPractice(WebDriver driver) {
		this.driver = driver;
	}
	
	public void clickOnAlertBox() {
		alertBox.click();
		driver.switchTo().alert().accept();
	}
	
	
	
}
