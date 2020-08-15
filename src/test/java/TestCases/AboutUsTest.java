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

import Pages.AboutUs;

public class AboutUsTest extends AboutUs{

	
	public AboutUsTest() {
		super();// to call parent class/super class constructor we write super keyword,

		// this will call properties from testbase class.
	}
	
	
	
	@BeforeMethod
	public void setprop() throws InterruptedException {
		initiate();// First with super keyword it will call properties like System.setproperty and
					// then will switch to initiate method()
		driver.navigate().to("https://simartechnologies.com/004/Edu/about_us/");

		// This is to explicitly wait for the "preloader" to be invisible before proceeding with the tests
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("preloader")));
		
		initElements();
	}


	@Test(priority = 1, enabled = true) 
	public void AboutUsPhoneLink(){
		Assert.assertTrue(isHeaderPhoneClickable());
	}
	
	
	@Test(priority = 2, enabled = true)
	public void AboutUsEmailLink() {
		Assert.assertTrue(isHeaderEmailClickable());
	}
	
	
	@Test(priority = 3, enabled = true)
	public void AboutUsFacebookLink() {
		clickAboutUsFacebookLink();
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
	public void AboutUsTwitterLink() {
		clickAboutUsTwitterLink();
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
	public void AboutUsYoutubeLink() {
		clickAboutUsYoutubeLink();
		try {
			switchTabs(driver, 2, 1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.titleIs("Roicians Tech - YouTube"));
	}
	
	@Test(priority = 6, enabled = true)
	public void AboutUsInstagramLink() {
		clickAboutUsInstagramLink();
		try {
			switchTabs(driver, 2, 1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.titleIs("Roicians (@roicians) • Instagram photos and videos"));
	}
	
	@Test(priority = 7, enabled = true)
	public void AboutUsLinkedInLink() {
		clickAboutUsLinkedInLink();
		try {
			switchTabs(driver, 2, 1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.titleIs("Roicians | LinkedIn"));
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
