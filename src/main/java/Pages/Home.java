package Pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseClass.Testbase;

public class Home extends Testbase  {
	
	// Page elements needed
	
	
	// Preloader
	@FindBy(id = "preloader")
	WebElement Preloader;
	
	// phone number - top left of the page
	@FindBy(linkText = "+1 (289) 499-4040")
	WebElement PhoneLink;
	
	// email id = top left of the page
	@FindBy(linkText = "info@roicians.com")
	WebElement EmailLink;
	
	// all social media links = top right
	@FindBy(className = "fa-facebook")
	List<WebElement> FacebookLinks;
	
	@FindBy(className = "fa-twitter")
	List<WebElement> TwitterLinks;
	
	@FindBy(className = "fa-youtube")
	List<WebElement> YoutubeLinks;
	
	@FindBy(className = "fa-instagram")
	List<WebElement> InstagramLinks;
	
	@FindBy(className = "fa-linkedin")
	List<WebElement> LinkedInLinks;
	
	// services link = right under first carsoul
	//@FindBy(xpath = "//section[2]//child::div[contains(@class, 'col-lg-3')][1]/a")
	@FindBy(xpath = "//section[2]//child::div[contains(@class, 'col-lg-3')][1]")
	WebElement ServiceLink;
	
	// training link = right under first carsoul
	@FindBy(xpath = "//section[2]//child::div[contains(@class, 'col-lg-3')][2]")
	WebElement TrainingLink;
	
	// career link = right under first carsoul
	@FindBy(xpath = "//section[2]//child::div[contains(@class, 'col-lg-3')][3]")
	WebElement CareerLink;
	// events link = right under first carsoul
	@FindBy(xpath = "//section[2]//child::div[contains(@class, 'col-lg-3')][4]")
	WebElement EventsLink;
	
	// More about us = under above links
	@FindBy(xpath = "//a[contains(@class, 'btn-dark')][1]")
	WebElement MoreAboutUs;
	
	// contact us = under above links
	@FindBy(xpath = "//a[contains(@class, 'btn-dark')][2]")
	WebElement ContactUs;
	
	// web and development div = our services section
	@FindBy(xpath = "//section[4]//div[contains(@class, 'col-md-3')][1]")
	WebElement WebDevelopmentServiceCont;
	@FindBy(xpath = "//section[4]//div[contains(@class, 'col-md-3')][1]//a[contains(text(), 'Read More')]")
	WebElement WebDevelopmentServiceReadMore;
	
	// software testing div = our services section
	@FindBy(xpath = "//section[4]//div[contains(@class, 'col-md-3')][2]")
	WebElement SoftwareTestingServiceCont;
	@FindBy(xpath = "//section[4]//div[contains(@class, 'col-md-3')][2]//a[contains(text(), 'Read More')]")
	WebElement SoftwareTestingServiceReadMore;
	
	// it consultancy div = our services section
	@FindBy(xpath = "//section[4]//div[contains(@class, 'col-md-3')][3]")
	WebElement ItConsultancyServiceCont;
	@FindBy(xpath = "//section[4]//div[contains(@class, 'col-md-3')][3]//a[contains(text(), 'Read More')]")
	WebElement ItConsultancyServiceReadMore;
	
	// training div = out services section
	@FindBy(xpath = "//section[4]//div[contains(@class, 'col-md-3')][4]")
	WebElement TrainingServiceCont;
	@FindBy(xpath = "//section[4]//div[contains(@class, 'col-md-3')][4]//a[contains(text(), 'Read More')]")
	WebElement TrainingServiceReadMore;
	
	// Service navigation menu bar
	@FindBy(xpath = "//ul[contains(@class, 'menuzord-menu')]/li[4]")
	WebElement ServicesNavMenu;
	
	// web development link = services in nav bar
	@FindBy(xpath = "//ul[contains(@class, 'menuzord-menu')]/li[4]/ul/li[1]/a")
	WebElement WebDevServicesNavMenu;
	
	// software testing = services in nav bar
	@FindBy(xpath = "//ul[contains(@class, 'menuzord-menu')]/li[4]/ul/li[2]/a")
	WebElement SoftwareTestingServicesNavMenu;
	
	// it consultancy = services in nav bar
	@FindBy(xpath = "//ul[contains(@class, 'menuzord-menu')]/li[4]/ul/li[3]/a")
	WebElement ItConsultancyServicesNavMenu;
	
	// training = serviecs in nav bar
	@FindBy(xpath = "//ul[contains(@class, 'menuzord-menu')]/li[4]/ul/li[4]/a")
	WebElement TrainingServicesNavMenu;
	
	// other courses carousal
	@FindBy(xpath = "//section[5]//div[@class='owl-stage']/div")
	List<WebElement> CarousalOtherCourses;
	
	// left arrow button = top of other courses carousal
	@FindBy(xpath = "//section[5]//div[@class='owl-prev']")
	WebElement OtherCoursesLeftBtn;
	
	// right arrow button = top of other courses carousal
	@FindBy(xpath = "//section[5]//div[@class='owl-next']")
	WebElement OtherCoursesRightBtn;
	
	// read more link = "who are we" section
	@FindBy(xpath = "//section[6]//a[contains(text(), 'Read More')]")
	WebElement WhoAreWeReadMoreLink;
	
	// testimony carousal
	@FindBy(xpath = "//section[8]//div[@class='owl-stage']/div")
	List<WebElement> CarousalReviews;
	
	// video tutorial section = incomplete description of all the elem needed
	@FindBy(xpath = "//section[@id='about']//div[@class='owl-stage']/div")
	List<WebElement> TutorialsCarousal;
	
	// left arrow button = top of video tutorial carousal
	// right arrow button = top of video tutorial carousal
	

	// Upcoming events
	@FindBy(xpath = "//div[contains(@class, 'bxslider')]/div")
	List<WebElement> UpcomingEvents;
	
	// left arrow button = top of upcoming events carousal
	@FindBy(xpath = "//div[@class='bx-controls-direction']//a[@class='bx-prev']")
	WebElement UpcomingEventLeftBtn;
	
	// right arrow button = top of upcoming events carousal
	@FindBy(xpath = "//div[@class='bx-controls-direction']//a[@class='bx-next']")
	WebElement UpcomingEventRightBtn;
	
	// more events link = upcoming events
	@FindBy(xpath = "//section[@id='about']//a[contains(text(), 'more events')]")
	WebElement UpcomingEventsReadMore;
	
	// phone number = "We can help you" section
	@FindBy(xpath = "//section[11]//a")
	WebElement WeCanHelpYouPhoneLink;
	
	// read more link = footer, under roicians icon
	@FindBy(xpath = "//footer//a[contains(text(), 'Read more')]")
	WebElement FooterReadMore;
	
	// all social media links = footer, under roicians icon
	@FindBy(xpath = "//footer//*[contains(@class, 'fa-facebook')]")
	WebElement FooterFacebookLink;
	
	@FindBy(xpath = "//footer//*[contains(@class, 'fa-twitter')]")
	WebElement FooterTwitterLink;
	
	@FindBy(xpath = "//footer//*[contains(@class, 'fa-youtube')]")
	WebElement FooterYoutubeLink;
	
	@FindBy(xpath = "//footer//*[contains(@class, 'fa-instagram')]")
	WebElement FooterInstagramLink;
	
	@FindBy(xpath = "//footer//*[contains(@class, 'fa-linkedin')]")
	WebElement FooterLinkedInLink;
	
	
	// subscribe email id text field = footer
	@FindBy(id = "subscribeEmail")
	WebElement SubscribeEmailField;
	
	// Subscribe email's send button = footer
	@FindBy(xpath = "//*[@id = 'footer-mailchimp-subscription-form']//button")
	WebElement SubscribeEmailBtn;
	
	// Subscribe email's msg
	@FindBy(xpath = "//*[@id = 'footer-mailchimp-subscription-form']//p[contains(@class, 'show-message')]")
	WebElement SubscribeEmailMsg;
	
	public void initElements() {
		PageFactory.initElements(driver, this);
	}
	
	
	public boolean pageLoaded() {
		return !Preloader.isDisplayed();
	}
	
	public boolean isHeaderPhoneClickable() {
		return (PhoneLink.isEnabled() && PhoneLink.isDisplayed());
	}
	
	
	public boolean isHeaderEmailClickable() {
		return (EmailLink.isEnabled() && EmailLink.isDisplayed());
	}
	
	
	public void clickHomeFacebookLink() {
		FacebookLinks.get(0).click();
	}
	
	public void clickHomeTwitterLink() {
		TwitterLinks.get(0).click();
	}
	
	public void clickHomeYoutubeLink() {
		YoutubeLinks.get(0).click();
	}
	
	public void clickHomeInstagramLink() {
		InstagramLinks.get(0).click();
	}
	
	public void clickHomeLinkedInLink() {
		LinkedInLinks.get(0).click();
	}
	
	
	public void clickHomeServicesLink() {
		ServiceLink.click();
	}
	
	public void clickHomeTrainingLink() {
		TrainingLink.click();
	}
	
	public void clickHomeCareerLink() {
		CareerLink.click();
	}
	
	public void clickHomeEventsLink() {
		EventsLink.click();
	}
	
	public void clickMoreAboutUsLink() {
		MoreAboutUs.click();
	}
	
	public void clickContactUsBtnLink() {
		ContactUs.click();
	}
	
	public void clickWebDevServiceReadMore() {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", WebDevelopmentServiceCont);
		Actions action = new Actions(driver);
		action.moveToElement(WebDevelopmentServiceCont).pause(1000L).moveToElement(WebDevelopmentServiceReadMore).click().build().perform();	
	}
	
	public void clickSoftwareTestingServiceReadMore() {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", SoftwareTestingServiceCont);
		Actions action = new Actions(driver);
		action.moveToElement(SoftwareTestingServiceCont).pause(1000L).moveToElement(SoftwareTestingServiceReadMore).click().build().perform();	
	}
	
	public void clickItConsultancyServiceReadMore() {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", ItConsultancyServiceCont);
		Actions action = new Actions(driver);
		action.moveToElement(ItConsultancyServiceCont).pause(1000L).moveToElement(ItConsultancyServiceReadMore).click().build().perform();	
	}
	
	public void clickTrainingServiceCont() {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", TrainingServiceCont);
		Actions action = new Actions(driver);
		action.moveToElement(TrainingServiceCont).pause(1000L).moveToElement(TrainingServiceReadMore).click().build().perform();
	}
	
	public void clickWebDevNavMenu() {
		Actions action = new Actions(driver);
		action.moveToElement(ServicesNavMenu).pause(1000L).moveToElement(WebDevServicesNavMenu).click().build().perform();
	}
	
	public void clickSoftwareTestingNavMenu() {
		Actions action = new Actions(driver);
		action.moveToElement(ServicesNavMenu).pause(1000L).moveToElement(SoftwareTestingServicesNavMenu).click().build().perform();
	}
	
	public void clickItConsultancyNavMenu() {
		Actions action = new Actions(driver);
		action.moveToElement(ServicesNavMenu).pause(1000L).moveToElement(ItConsultancyServicesNavMenu).click().build().perform();
	}
	
	public void clickTrainingNavMenu() {
		Actions action = new Actions(driver);
		action.moveToElement(ServicesNavMenu).pause(1000L).moveToElement(TrainingServicesNavMenu).click().build().perform();
	}
	
	public List<WebElement> getVisibleCoursesInCarousal() {
		List<WebElement> visibleElements = new ArrayList<WebElement>();
		
		for (WebElement course : CarousalOtherCourses) {
            if(course.isDisplayed()) {
            	visibleElements.add(course);
            }
        }
		return visibleElements;
	}
	
	public void clickOtherCoursesLeftBtn() {
		OtherCoursesLeftBtn.click();
	}
	
	public void clickOtherCoursesRightBtn() {
		OtherCoursesRightBtn.click();
	}
	
	public void clickWhoAreWeReadMoreLink() {
		WhoAreWeReadMoreLink.click();
	}
	
	public int getVisibleReview() {
		List<WebElement> visibleReviews = new ArrayList<WebElement>();
		for (WebElement review : CarousalReviews) {
            if(hasClass(review, "active")) {
            	visibleReviews.add(review);
            }
        }
		
		return visibleReviews.size();
	}
	
	
	public List<String> getTutorialIds(){
		List<String> tutorials = new ArrayList<String>();
		
		for (WebElement tutorial : TutorialsCarousal) {
			if(!hasClass(tutorial, "cloned")) {
	            tutorials.add(tutorial.findElement(By.xpath("div/img")).getAttribute("id"));
            }
        }
		
		return tutorials;
	}
	
	
	public void clickUpcomingEventsLeftBtn() {
		UpcomingEventLeftBtn.click();
	}
	
	
	public void clickUpcomingEventsRightBtn() {
		UpcomingEventRightBtn.click();
	}
	
	public void clickMoreEventsLink() {
		UpcomingEventsReadMore.click();
	}
	
	public List<WebElement> getVisibleUpcomingEvents(){
		List<WebElement> events = new ArrayList<WebElement>();
		
		for (WebElement event : UpcomingEvents) {
			if(event.isDisplayed()) {
	            events.add(event);
            }
        }
		
		return events;
	}
	
	
	public boolean isWeCanHelpYouPhoneClickable() {
		return (WeCanHelpYouPhoneLink.isEnabled() && WeCanHelpYouPhoneLink.isDisplayed());
	}
	
	
	public void clickHomeFooterFacebookLink() {
		FooterFacebookLink.click();
	}
	
	public void clickHomeFooterTwitterLink() {
		FooterTwitterLink.click();
	}
	
	public void clickHomeFooterYoutubeLink() {
		FooterYoutubeLink.click();
	}
	
	public void clickHomeFooterInstagramLink() {
		FooterInstagramLink.click();
	}
	
	public void clickHomeFooterLinkedInLink() {
		FooterLinkedInLink.click();
	}
	
	
	public void enterSubscribeEmail(String email) {
		SubscribeEmailField.sendKeys(email);
	}
	
	
	public void clickSubscribeEmailBtn() {
		SubscribeEmailBtn.click();
	}
	
	
	public String getSubscribeEmailMsg() {
		return SubscribeEmailMsg.getText();
	}
	
	
	
	
	
	// Util functions
	public boolean hasClass(WebElement element, String classToLookFor) {
	    String classes = element.getAttribute("class");
	    for (String c : classes.split(" ")) {
	        if (c.equals(classToLookFor)) {
	            return true;
	        }
	    }
	    
	    return false;
	}
	
}