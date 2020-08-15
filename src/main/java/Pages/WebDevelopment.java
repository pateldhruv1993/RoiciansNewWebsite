package Pages;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseClass.Testbase;

public class WebDevelopment extends Testbase {

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

	// Our portfolio div = images carousal
	@FindBy(xpath = "//div[@class='owl-stage']//div[contains(@class, 'active')]")
	WebElement PortfolioPic;

	@FindBy(xpath = "//div[contains(@class, 'mfp-content')]")
	WebElement PortfolioPicViewerCont;
	
	@FindBy(xpath = "//section[@id = 'gallery']")
	WebElement PortfolioCarousal;
	
	public void initElements() {
		PageFactory.initElements(driver, this);
	}

	public boolean isHeaderPhoneClickable() {
		return (PhoneLink.isEnabled() && PhoneLink.isDisplayed());
	}

	public boolean isHeaderEmailClickable() {
		return (EmailLink.isEnabled() && EmailLink.isDisplayed());
	}

	public void clickWebDevFacebookLink() {
		FacebookLinks.get(0).click();
	}

	public void clickWebDevTwitterLink() {
		TwitterLinks.get(0).click();
	}

	public void clickWebDevYoutubeLink() {
		YoutubeLinks.get(0).click();
	}

	public void clickWebDevInstagramLink() {
		InstagramLinks.get(0).click();
	}

	public void clickWebDevLinkedInLink() {
		LinkedInLinks.get(0).click();
	}
	
	public void clickWebDevPortfolioPic() {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", PortfolioCarousal);
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PortfolioPic.click();
	}
	
	public boolean isWebDevPhotoViwerOpen() {
		if(PortfolioPicViewerCont.isDisplayed() && PortfolioPicViewerCont.isEnabled()) {
			return true;
		} else {
			return false;
		}
	}
}
