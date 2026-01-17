package utils;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits {

	public static WebDriver driver;
	public static WebDriverWait wait;
	
	public Waits() {
		this.driver=driver;
		this.wait= new WebDriverWait(driver,Duration.ofSeconds(5));
	}
	
	public static void waitForVisible(WebElement ele) {
		wait.until(ExpectedConditions.visibilityOf(ele));
		
	}
	
	
	
}
