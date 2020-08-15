package Pages;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseClass.Testbase;

public class Services extends Testbase {

	// Page elements needed

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

	
	@FindBy(xpath = "//div[@class='main-timeline']//h4[contains(text(), 'Web Designing & Development')]")
	WebElement WebDevelopmentLink;
	
	@FindBy(xpath ="//div[@class='row'][1]")
	WebElement TimelineCont;
	
	
	public void initElements() {
		PageFactory.initElements(driver, this);
	}

	public boolean isHeaderPhoneClickable() {
		return (PhoneLink.isEnabled() && PhoneLink.isDisplayed());
	}

	public boolean isHeaderEmailClickable() {
		return (EmailLink.isEnabled() && EmailLink.isDisplayed());
	}

	public void clickServicesFacebookLink() {
		FacebookLinks.get(0).click();
	}

	public void clickServicesTwitterLink() {
		TwitterLinks.get(0).click();
	}

	public void clickServicesYoutubeLink() {
		YoutubeLinks.get(0).click();
	}

	public void clickServicesInstagramLink() {
		InstagramLinks.get(0).click();
	}

	public void clickServicesLinkedInLink() {
		LinkedInLinks.get(0).click();
	}

	public void clickWebDevelopmentLink() {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", TimelineCont);

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebDevelopmentLink.click();
	}
}
