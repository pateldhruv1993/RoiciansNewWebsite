package TestCases;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.Home;


public class HomeTest extends Home {

	
	public HomeTest() {
		super();// to call parent class/super class constructor we write super keyword,

		// this will call properties from testbase class.
	}


	@BeforeMethod
	public void setprop() throws InterruptedException {
		initiate();// First with super keyword it will call properties like System.setproperty and
					// then will switch to initiate method()
		driver.navigate().to("https://simartechnologies.com/004/Edu/");

		// This is to explicitly wait for the "preloader" to be invisible before proceeding with the tests
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("preloader")));
		
		initElements();
	}

	
	// Could not find any way to check for "Launch Application" window in selenium so just checking if the phone link exists and is clickable
	@Test(priority = 1, enabled = true) 
	public void homePhoneLink(){
		Assert.assertTrue(isHeaderPhoneClickable());
	}
	
	
	@Test(priority = 2, enabled = true)
	public void homeEmailLink() {
		Assert.assertTrue(isHeaderEmailClickable());
	}
	
	@Test(priority = 3, enabled = true)
	public void homeFacebookLink() {
		clickHomeFacebookLink();
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
	public void homeTwitterLink() {
		clickHomeTwitterLink();
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
	public void homeYoutubeLink() {
		clickHomeYoutubeLink();
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
	public void homeInstagramLink() {
		clickHomeInstagramLink();
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
	public void homeLinkedInLink() {
		clickHomeLinkedInLink();
		try {
			switchTabs(driver, 2, 1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.titleIs("Roicians | LinkedIn"));
	}
	
	
	@Test(priority = 8, enabled = true)
	public void homeServiceLink() {
		clickHomeServicesLink();
		String redirectURL=driver.getCurrentUrl();
		Assert.assertEquals(redirectURL,"https://simartechnologies.com/004/Edu/Services");
	}
	
	
	@Test(priority = 9, enabled = true)
	public void homeTrainingLink() {
		clickHomeTrainingLink();
		String redirectURL=driver.getCurrentUrl();
		Assert.assertEquals(redirectURL,"https://simartechnologies.com/004/Edu/courses");
	}
	
	@Test(priority = 10, enabled = true)
	public void homeCarrerLink() {
		clickHomeCareerLink();
		String redirectURL=driver.getCurrentUrl();
		Assert.assertEquals(redirectURL,"https://simartechnologies.com/004/Edu/careers");
	}
	
	@Test(priority = 11, enabled = true)
	public void homeEventsLink() {
		clickHomeEventsLink();
		String redirectURL=driver.getCurrentUrl();
		Assert.assertEquals(redirectURL,"https://simartechnologies.com/004/Edu/Events");
	}
	
	@Test(priority = 12, enabled = true)
	public void homeMoreAboutUsLink() {
		clickMoreAboutUsLink();
		String redirectURL=driver.getCurrentUrl();
		Assert.assertEquals(redirectURL,"https://simartechnologies.com/004/Edu/about_us");
	}
	
	@Test(priority = 13, enabled = true)
	public void homeContactUsBtnLink() {
		clickContactUsBtnLink();
		String redirectURL=driver.getCurrentUrl();
		Assert.assertEquals(redirectURL,"https://simartechnologies.com/004/Edu/contact_us");
	}
	
	
	@Test(priority = 14, enabled = true)
	public void homeWebDevServiceReadMore() {
		clickWebDevServiceReadMore();
		(new WebDriverWait(driver, 30)).until(ExpectedConditions.urlToBe("https://simartechnologies.com/004/Edu/Services/web_design_and_development"));
	}
	
	@Test(priority = 15, enabled = true)
	public void homeSoftwareTestingServiceReadMore() {
		clickSoftwareTestingServiceReadMore();
		(new WebDriverWait(driver, 30)).until(ExpectedConditions.urlToBe("https://simartechnologies.com/004/Edu/Services/software_testing"));
	}
	
	@Test(priority = 16, enabled = true)
	public void homeItConsultancyServiceReadMore() {
		clickItConsultancyServiceReadMore();
		(new WebDriverWait(driver, 30)).until(ExpectedConditions.urlToBe("https://simartechnologies.com/004/Edu/Services/it_consulting"));
	}
	
	@Test(priority = 17, enabled = true)
	public void homeTrainingServiceReadMore() {
		clickTrainingServiceCont();
		(new WebDriverWait(driver, 30)).until(ExpectedConditions.urlToBe("https://simartechnologies.com/004/Edu/Services/training"));
	}
	
	@Test(priority = 18, enabled = true)
	public void homeWebDevServiceNavMenu() {
		clickWebDevNavMenu();
		(new WebDriverWait(driver, 30)).until(ExpectedConditions.urlToBe("https://simartechnologies.com/004/Edu/Services/web_design_and_development"));
	}
	
	@Test(priority = 19, enabled = true)
	public void homeSoftwareTestingServiceNavMenu() {
		clickSoftwareTestingNavMenu();
		(new WebDriverWait(driver, 30)).until(ExpectedConditions.urlToBe("https://simartechnologies.com/004/Edu/Services/software_testing"));
	}
	
	@Test(priority = 20, enabled = true)
	public void homeItConsultancyServiceNavMenu() {
		clickItConsultancyNavMenu();
		(new WebDriverWait(driver, 30)).until(ExpectedConditions.urlToBe("https://simartechnologies.com/004/Edu/Services/it_consulting"));
	}
	
	@Test(priority = 21, enabled = true)
	public void homeTrainingServiceNavMenu() {
		clickTrainingNavMenu();
		(new WebDriverWait(driver, 30)).until(ExpectedConditions.urlToBe("https://simartechnologies.com/004/Edu/Services/training"));
	}
	
	
	@Test(priority = 22, enabled = true)
	public void homeOtherCoursesCarousal() {
		Assert.assertEquals(getVisibleCoursesInCarousal().size(), 4);
	}
	
	/*
	 * Revist this later!
	 * 
	@Test(priority = 23, enabled = true)
	public void homeOtherCoursesCarousalLeftBtn() {
		List<WebElement> oldVisibleElms = getVisibleCoursesInCarousal();
		List<WebElement> oldVisibleElms2 = getVisibleCoursesInCarousal();
		System.out.println(oldVisibleElms.equals(oldVisibleElms2));
		clickOtherCoursesLeftBtn();
		
		try {
			Thread.sleep(0);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		List<WebElement> newVisibleElms = getVisibleCoursesInCarousal();
		System.out.println(oldVisibleElms.equals(newVisibleElms));
	}
	
	
	@Test(priority = 24, enabled = true)
	public void homeOtherCoursesCarousalRightBtn() {
		
	}
	*/
	
	@Test(priority = 25, enabled = true)
	public void homeWhoWeAreReadMoreLink() {
		clickWhoAreWeReadMoreLink();
		(new WebDriverWait(driver, 30)).until(ExpectedConditions.urlToBe("https://simartechnologies.com/004/Edu/about_us"));
	}
	
	
	@Test(priority = 26, enabled = true)
	public void homeReviewCarousal() {
		Assert.assertEquals(getVisibleReview(), 1);
	}
	
	
	@Test(priority = 27, enabled = true)
	public void homeVideoTutorial() {
		// get all the divs that DONT have cloned class in it. owl-item
		// check that all the IDs in those divs are unique
		List<String> videoIdList = getTutorialIds();
		Set<String> videoIdSet = new HashSet<String>(videoIdList);
		
		if(videoIdSet.size() < videoIdList.size()){
		    /* There are duplicates */
			Assert.fail("Same video tutorial seen multiple times");
		}
	}
	
	
	@Test(priority = 28, enabled = true)
	public void homeUpcomingEventsLeftBtn() {
		List<WebElement> a = getVisibleUpcomingEvents();
		clickUpcomingEventsLeftBtn();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		List<WebElement> b = getVisibleUpcomingEvents();
		Assert.assertNotEquals(a, b);
	}
	
	
	@Test(priority = 29, enabled = true)
	public void homeUpcomingEventsRightBtn() {
		List<WebElement> a = getVisibleUpcomingEvents();
		clickUpcomingEventsRightBtn();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		List<WebElement> b = getVisibleUpcomingEvents();
		Assert.assertNotEquals(a, b);
	}
	
	
	@Test(priority = 30, enabled = true)
	public void homeUpcomingEventsMoreEventsLink() {
		clickMoreEventsLink();
		(new WebDriverWait(driver, 30)).until(ExpectedConditions.urlToBe("https://simartechnologies.com/004/Edu/Events"));
	}
	
	
	@Test(priority = 31, enabled = true) 
	public void homeWeCanHelpYouPhoneLink(){
		Assert.assertTrue(isHeaderPhoneClickable());
	}
	
	
	@Test(priority = 32, enabled = true)
	public void homeFooterFacebookLink() {
		clickHomeFooterFacebookLink();
		try {
			switchTabs(driver, 2, 1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.titleIs("Roicians - Home | Facebook"));
	}
	
	
	@Test(priority = 33, enabled = true)
	public void homeFooterTwitterLink() {
		clickHomeFooterTwitterLink();
		try {
			switchTabs(driver, 2, 1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.titleIs("Roicians (@roicians) / Twitter"));
	}
	
	
	
	@Test(priority = 34, enabled = true)
	public void homeFooterYoutubeLink() {
		clickHomeFooterYoutubeLink();
		try {
			switchTabs(driver, 2, 1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.titleIs("Roicians Tech - YouTube"));
	}
	
	@Test(priority = 35, enabled = true)
	public void homeFooterInstagramLink() {
		clickHomeFooterInstagramLink();
		try {
			switchTabs(driver, 2, 1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.titleIs("Roicians (@roicians) • Instagram photos and videos"));
	}
	
	@Test(priority = 36, enabled = true)
	public void homeFooterLinkedInLink() {
		clickHomeFooterLinkedInLink();
		try {
			switchTabs(driver, 2, 1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.titleIs("Roicians | LinkedIn"));
	}
	
	
	@Test(priority = 38, enabled = true)
	public void homeFooterSubscribeBadEmail() {
		enterSubscribeEmail("thisIsaBad Email @gmail.com");
		clickSubscribeEmailBtn();
		
		Assert.assertEquals(getSubscribeEmailMsg(), "Please enter valid email");
	}
	
	
	@Test(priority = 39, enabled = true)
	public void homeFooterSubscribeGoodEmail() {
		enterSubscribeEmail("positiveEmail@gmail.com");
		clickSubscribeEmailBtn();
		String message = getSubscribeEmailMsg();
		
		if(message.equals("You have been subscribed successfully.") || message.equals("Email already exist!")) {
		} else {
			Assert.fail();
		}
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
