package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasicControl {
	
	WebDriver driver;
	
	By first_Name = By.xpath("//input[@id='firstName']");
	By last_Name = By.xpath("//input[@id='lastName']");
	By genderMale = By.xpath("//input[@id='malerb']");
	By lang = By.xpath("//input[@id='englishchbx']");
	By enterEmail = By.xpath("//input[@id='email']");
	By password = By.xpath("//input[@id='password']");
	By registerBtn = By.xpath("//button[@id='registerbtn']");
	By clearBtn = By.xpath("//button[@id='clearbtn']");
	By link = By.xpath("//a[@id='navigateHome']");
	
	
	public BasicControl(WebDriver driver) {
		this.driver=driver;
	}
	
	public void enterNames(String first, String last) {
		driver.findElement(first_Name).sendKeys(first);
		driver.findElement(last_Name).sendKeys(last);
		
	}
	
	public void selectGender() {
		driver.findElement(genderMale).click();
	}
	
	public void enterEmailAndPassword(String email, String pass) {
		driver.findElement(enterEmail).sendKeys(email);
		driver.findElement(password).sendKeys(pass);
	}

}
