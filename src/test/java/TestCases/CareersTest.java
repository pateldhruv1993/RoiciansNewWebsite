package TestCases;


import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pages.Careers;

public class CareersTest extends Careers{
	
	public CareersTest() {
		super();// to call parent class/super class constructor we write super keyword,

		// this will call properties from testbase class.
	}
	
	
	@BeforeMethod
	public void setprop() throws InterruptedException {
		initiate();// First with super keyword it will call properties like System.setproperty and
					// then will switch to initiate method()
		driver.navigate().to("https://simartechnologies.com/004/Edu/careers/");

		// This is to explicitly wait for the "preloader" to be invisible before proceeding with the tests
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("preloader")));
		initElements();
	}


	@Test(priority = 1, enabled = true) 
	public void CareerEmailValidation(){
		sendEmail("fake email @gmail");
		sendLastName("");
		Assert.assertEquals(getEmailError(), "Please enter a valid email address.");
	}
	
	
	@Test(priority = 2, enabled = true) 
	public void CareerPhoneValidation(){
		sendPhone("124");
		sendLastName("");
		Assert.assertEquals(getPhoneError(), "Phone number should be 10 number");
	}
	
	
	@Test(priority = 3, enabled = true) 
	public void CareerGenderDropdown(){
		List<WebElement> options = getGenders();
		
		
		if(options.get(0).getAttribute("value").equals("Male") && options.get(1).getAttribute("value").equals("Female")) {
			
		} else {
			Assert.fail();
		}
	}
	
	
	@Test(priority = 4, enabled = true) 
	public void CareerJobPostDropdown(){
		List<WebElement> options = getGenders();
		
		if(options.size() < 2) {
			Assert.fail();
		}
	}
	
	
	@Test(priority = 5, enabled = true) 
	public void CareerFirstName(){
		sendLastName("Patel");
		sendEmail("pateldhruv1993@gmail.com");
		sendPhone("4653921222");
		sendMessage("The message for my job application.");
		sendResume("C:\\Users\\DhruvPC\\Downloads\\Travel Medicare.pdf");
		submitForm();
		Assert.assertEquals(getFirstNameError(), "This field is required.");
	}
	
	@Test(priority = 6, enabled = true) 
	public void CareerEmail(){
		sendFirstName("Dhruv");
		sendLastName("Patel");
		sendPhone("4653921222");
		sendMessage("The message for my job application.");
		sendResume("C:\\Users\\DhruvPC\\Downloads\\Travel Medicare.pdf");
		submitForm();
		Assert.assertEquals(getEmailError(), "This field is required.");
	}
	
	
	@Test(priority = 7, enabled = true) 
	public void CareerPhone(){
		sendFirstName("Dhruv");
		sendLastName("Patel");
		sendEmail("pateldhruv1993@gmail.com");
		sendMessage("The message for my job application.");
		sendResume("C:\\Users\\DhruvPC\\Downloads\\Travel Medicare.pdf");
		submitForm();
		Assert.assertEquals(getPhoneError(), "This field is required.");
	}
	
	@Test(priority = 8, enabled = true) 
	public void CareerMessage(){
		sendFirstName("Dhruv");
		sendLastName("Patel");
		sendEmail("pateldhruv1993@gmail.com");
		sendPhone("4653921222");
		sendResume("C:\\Users\\DhruvPC\\Downloads\\Travel Medicare.pdf");
		submitForm();
		Assert.assertEquals(getMessageError(), "This field is required.");
	}
	
	@Test(priority = 9, enabled = true) 
	public void CareerResume(){
		sendFirstName("Dhruv");
		sendLastName("Patel");
		sendEmail("pateldhruv1993@gmail.com");
		sendPhone("4653921222");
		sendMessage("The message for my job application.");
		submitForm();
		Assert.assertEquals(getResumeError(), "This field is required.");
	}
	
	
	@Test(priority = 10, enabled = true) 
	public void CareerCompleteSubmission(){
		sendFirstName("Dhruv");
		sendLastName("Patel");
		sendEmail("fakeemail@gmail.com");
		sendPhone("4653921222");
		sendMessage("The message for my job application.");
		sendResume("C:\\Users\\DhruvPC\\Downloads\\Resume.txt");
		submitForm();
		Assert.assertEquals(getFormSubmissionSuccessMessage(), "You have applied for job successfully.");
	}
	
	
	@AfterMethod
	public void close() {
		driver.quit();
	}
}
