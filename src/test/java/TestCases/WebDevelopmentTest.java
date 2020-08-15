package TestCases;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pages.WebDevelopment;

public class WebDevelopmentTest extends WebDevelopment{
	
	
	public WebDevelopmentTest() {
		super();// to call parent class/super class constructor we write super keyword,

		// this will call properties from testbase class.
	}
	
	
	
	@BeforeMethod
	public void setprop() throws InterruptedException {
		initiate();// First with super keyword it will call properties like System.setproperty and
					// then will switch to initiate method()
		driver.navigate().to("https://simartechnologies.com/004/Edu/Services/web_design_and_development");

		// This is to explicitly wait for the "preloader" to be invisible before proceeding with the tests
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("preloader")));
		
		initElements();
	}


	@Test(priority = 1, enabled = true) 
	public void WebDevPhoneLink(){
		Assert.assertTrue(isHeaderPhoneClickable());
	}
	
	
	@Test(priority = 2, enabled = true)
	public void WebDevEmailLink() {
		Assert.assertTrue(isHeaderEmailClickable());
	}
	
	
	@Test(priority = 3, enabled = true)
	public void WebDevFacebookLink() {
		clickWebDevFacebookLink();
		try {
			switchTabs(driver, 2, 1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.titleIs("Roicians - Home | Facebook"));
	}
	
	
	@Test(priority = 4, enabled = true)
	public void WebDevTwitterLink() {
		clickWebDevTwitterLink();
		try {
			switchTabs(driver, 2, 1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.titleIs("Roicians (@roicians) / Twitter"));
	}
	
	
	@Test(priority = 5, enabled = true)
	public void WebDevLinkedInLink() {
		clickWebDevLinkedInLink();
		try {
			switchTabs(driver, 2, 1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.titleIs("Roicians | LinkedIn"));
	}
	
	
	@Test(priority = 6, enabled = true)
	public void WebDevYoutubeLink() {
		clickWebDevYoutubeLink();
		try {
			switchTabs(driver, 2, 1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.titleIs("Roicians Tech - YouTube"));
	}
	
	@Test(priority = 7, enabled = true)
	public void WebDevInstagramLink() {
		clickWebDevInstagramLink();
		try {
			switchTabs(driver, 2, 1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.titleIs("Roicians (@roicians) • Instagram photos and videos"));
	}
	
	
	@Test(priority = 8, enabled = true)
	public void WebDevPhotoViewer() {
		//check if div with id='fullResImage' is available
		clickWebDevPortfolioPic();
		Assert.assertTrue(isWebDevPhotoViwerOpen());
	}
	
	@AfterMethod
	public void close() {
		driver.quit();
	}
	
	
	
	public static void switchTabs(WebDriver driver, int expectedWindowsCount,int SwitchtoWindow) throws Exception {
	    (new WebDriverWait(driver, 30)).until(ExpectedConditions.numberOfWindowsToBe(expectedWindowsCount));
	    ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
	    driver.switchTo().window(tabs2.get(SwitchtoWindow));
	}
}
