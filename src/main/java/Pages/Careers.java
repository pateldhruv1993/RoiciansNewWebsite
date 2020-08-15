package Pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import BaseClass.Testbase;

public class Careers extends Testbase {
	
	// Page elements needed
	
	// first name = text field
	@FindBy (name = "first_name")
	WebElement FirstNameText;
	@FindBy (id = "first_name-error")
	WebElement FirstNameErrorText;
	
	// last name = text field
	@FindBy(name = "last_name")
	WebElement LastNameText;
	
	// email = text field
	@FindBy (name = "email")
	WebElement EmailText;
	@FindBy (id = "email-error")
	WebElement EmailErrorText;
	
	// phone = text field
	@FindBy (name = "Phone")
	WebElement PhoneText;
	@FindBy (id = "Phone-error")
	WebElement PhoneErrorText;
	
	// gender = drop down menu
	@FindBy (name = "gender")
	WebElement GenderDropdown;
	
	// job post = drop down menu
	@FindBy (name = "job_post")
	WebElement JobPostDropdown;
	
	// message = text area
	@FindBy (name = "message")
	WebElement MessageTextarea;
	@FindBy(id = "message-error")
	WebElement MessageErrorTextarea;
	
	// resume upload btn
	@FindBy (id = "file")
	WebElement ResumeFile;
	@FindBy(id = "file-error")
	WebElement ResumeFileError;
	
	// apply now btn = right under the form
	@FindBy(xpath = "//button[contains(text(), 'Apply Now')]")
	WebElement ApplyBtn;
	
	
	// Success message if form was subitted correctl
	@FindBy(xpath = "//section[2]//div[contains(@class, 'alert-success')]")
	
	WebElement FormSubmissionSuccess;
	
	public void initElements() {
		PageFactory.initElements(driver, this);
	}

	public void sendFirstName(String firstName) {
		FirstNameText.sendKeys(firstName);
	}
	
	public String getFirstNameError() {
		return FirstNameErrorText.getText();
	}
	
	public void sendLastName(String lastName) {
		LastNameText.sendKeys(lastName);
	}
	
	public void sendEmail(String email) {
		EmailText.sendKeys(email);
	}

	public String getEmailError() {
		return EmailErrorText.getText();
	}
	
	public void sendPhone(String phone) {
		PhoneText.sendKeys(phone);
	}
	
	
	public String getPhoneError() {
		return PhoneErrorText.getText();
	}
	
	public void selectGender(String gender) {
		Select genderSelect = new Select(GenderDropdown);
		genderSelect.selectByValue(gender);
	}
	
	public List<WebElement> getGenders(){
		Select genderSelect = new Select(GenderDropdown);
		return genderSelect.getOptions();
	}
	
	public void selectJob(String job) {
		Select jobSelect = new Select(JobPostDropdown);
		jobSelect.selectByValue(job);
	}
	
	public List<WebElement> getJobPosts(){
		Select jobSelect = new Select(JobPostDropdown);
		return jobSelect.getOptions();
	}
	
	public void sendMessage(String msg) {
		MessageTextarea.sendKeys(msg);
	}
	
	public String getMessageError() {
		return MessageErrorTextarea.getText();
	}
	
	public void sendResume(String fileLoc) {	
		ResumeFile.sendKeys(fileLoc);
	}
	
	public String getResumeError() {
		return ResumeFileError.getText();
	}
	
	
	public String getFormSubmissionSuccessMessage() {
		return FormSubmissionSuccess.getText();
	}
	
	public void submitForm() {
		ApplyBtn.click();
	}
}