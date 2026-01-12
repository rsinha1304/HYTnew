package configClass;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {

	static Properties prop;
	
	public static Properties initProperties() {
		prop = new Properties();
		
		FileInputStream file;
		try {
			file = new FileInputStream("src/test/java/resource/config.properties");
			prop.load(file);
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		return prop;
			
	}
}
