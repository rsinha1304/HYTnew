package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AlertPractice {

	
	//add new page and the element use explicit wait after utils update
	
	WebDriver driver;
	
	@FindBy(xpath="//button[@id='alertBox']")
	private WebElement alertBox;
	
	@FindBy(xpath="//button[@id='confirmBox']")
	private WebElement confirmBox;
	
	@FindBy(xpath="//button[@id='promptBox']")
	private WebElement promptBox;
	
	
	public AlertPractice(WebDriver driver) {
		this.driver = driver;
	}
	
	public void clickOnAlertBox() {
		alertBox.click();
		driver.switchTo().alert().accept();
	}
	
	public void confirmTheAlertBox() {
		confirmBox.click();
		driver.switchTo().alert().accept();
	}
	
	public void sendKeysToPromptBox() {
		promptBox.click();
		driver.switchTo().alert().sendKeys("Hello World");
	}
	
	
}
