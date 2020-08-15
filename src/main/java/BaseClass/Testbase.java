package BaseClass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Utility.TestUtil;

public class Testbase {
	public static Properties props;
	public static WebDriver driver;
	
	public Testbase() {
		props = new Properties();
		try {
			FileInputStream file = new FileInputStream("C:\\Users\\DhruvPC\\eclipse-workspace\\RoiciansNewWebsite\\src\\main\\java\\Environment\\config.properties");
			props.load(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void initiate() {
		String BrowserName = props.getProperty("browser");
		System.out.println("THE BROWSER NAME IS ::::::" + BrowserName);
		
		if(BrowserName.equals("Firefox")) {
			System.setProperty("webdriver.gecko.driver", "H:\\SeleniumWebDriver\\geckodriver.exe");
		} else {
			System.out.println("No compatible webdriver found for the given BrowserName");
		}
		
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.page_timeout, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.implict_wait, TimeUnit.SECONDS);
		
	}

}
