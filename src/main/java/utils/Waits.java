package utils;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits {

	private final WebDriverWait wait;

    public Waits(WebDriver driver) {
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        this.wait.ignoring(StaleElementReferenceException.class);
    }


    // ---- WebElement-based waits (so @FindBy works cleanly) ----
    public WebElement waitForVisible(WebElement element) {
        return wait.until(ExpectedConditions.visibilityOf(element));
    }

    // for by locator supported code
    public WebElement waitForVisible(By locator) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }


    public WebElement clickable(WebElement element) {
        return wait.until(ExpectedConditions.elementToBeClickable(element));
    }
    public WebElement clickable(By locator) {
        return wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    // ---- Convenience actions with waiting ----
    public void click(WebElement element) {
        clickable(element).click();
    }
    
    public void alertIsVisible() {
    	wait.until(ExpectedConditions.alertIsPresent());
    }
	
}

