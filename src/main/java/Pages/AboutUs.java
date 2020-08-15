package Pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseClass.Testbase;

public class AboutUs extends Testbase {

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

	// text cont = next to images carousal

	public void initElements() {
		PageFactory.initElements(driver, this);
	}
	
	
	public boolean isHeaderPhoneClickable() {
		return (PhoneLink.isEnabled() && PhoneLink.isDisplayed());
	}
	
	
	public boolean isHeaderEmailClickable() {
		return (EmailLink.isEnabled() && EmailLink.isDisplayed());
	}
	
	
	public void clickAboutUsFacebookLink() {
		FacebookLinks.get(0).click();
	}
	
	public void clickAboutUsTwitterLink() {
		TwitterLinks.get(0).click();
	}
	
	public void clickAboutUsYoutubeLink() {
		YoutubeLinks.get(0).click();
	}
	
	public void clickAboutUsInstagramLink() {
		InstagramLinks.get(0).click();
	}
	
	public void clickAboutUsLinkedInLink() {
		LinkedInLinks.get(0).click();
	}
}
