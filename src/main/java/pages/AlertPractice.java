package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.Waits;

public class AlertPractice {

	
	private WebDriver driver;
	private Waits wait;

	
	@FindBy(xpath="//button[@id='alertBox']")
	private WebElement alertBox;
	
	@FindBy(xpath="//button[@id='confirmBox']")
	private WebElement confirmBox;
	
	@FindBy(xpath="//button[@id='promptBox']")
	private WebElement promptBox;
	
	
	
	public AlertPractice(WebDriver driver) {
		this.driver = driver;
		this.wait= new Waits(driver);
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	public void clickOnAlertBox() {
		alertBox.click();
		wait.alertIsVisible();
		driver.switchTo().alert().accept();
	}
	
	public void confirmTheAlertBox() {
		confirmBox.click();
		wait.alertIsVisible();
		driver.switchTo().alert().accept();
	}
	
	public void sendKeysToPromptBox() {
		promptBox.click();
		wait.alertIsVisible();
		driver.switchTo().alert().sendKeys("Hello World");
	}
	
	
}
