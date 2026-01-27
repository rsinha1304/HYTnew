package pages;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class DropdownPractice {
	
	private WebDriver driver;
	private WebDriverWait wait;
	private Select select;
	
	public DropdownPractice(WebDriver driver) {
		this.driver=driver;
		this.wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		PageFactory.initElements(driver,this);
		
	}
	
	@FindBy(xpath="//select[@id='course']")
	WebElement courseName;
	
	@FindBy(xpath="//select[@id='ide']")
	WebElement IDEName;
	
	
	public void selectCourseName(String text) {
		wait.until(ExpectedConditions.visibilityOf(courseName));
		select = new Select(courseName);
		select.selectByVisibleText(text);
	}
	
	public void selectIDEName(String text) {
		wait.until(ExpectedConditions.visibilityOf(IDEName));
		select = new Select(IDEName);
		select.selectByVisibleText(text);
	}
	
	

}
