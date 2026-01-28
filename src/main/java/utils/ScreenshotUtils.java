package utils;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenshotUtils {
	
	public static String captureScreenshot(WebDriver driver, String ssName) {
		
		String timeStamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd_HH:mm:ss"));
		
		
		String folderPath = System.getProperty("user.dir")+ File.separator + "Screenshot";
		
		File folder = new File(folderPath);
		if(!folder.exists()) {
			folder.mkdir();
		}
		
		
		
		String filePath =folderPath + File.separator + ssName + "_" + timeStamp + ".png";
		
		
		
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File(filePath);
		
		try {
			FileUtils.copyFile(src, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return filePath;
		
	}

}
