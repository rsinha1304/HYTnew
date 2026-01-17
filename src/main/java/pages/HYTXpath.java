package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HYTXpath {
	
	public WebDriver driver;
	
	public HYTXpath(WebDriver driver) {
		this.driver=driver;
	}

	@FindBy(xpath="//input[@name='name' and @maxlength='10']")
	WebElement firstName;
	
	@FindBy(xpath="//label[text()='Last Name']/following-sibling::input[@name='name']")
	WebElement lastName;
	
	public void enterFirstName() {
		firstName.sendKeys("john");
	}
	
	public void enterLastName() {
		lastName.sendKeys("Doe");
	}
	
}
