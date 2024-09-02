package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.FileUploadUtility;
import utilities.PageUtility;

public class FooterTextPage {
	WebDriver driver;
	PageUtility pageutility = new PageUtility();
	FileUploadUtility fileuploadutility = new FileUploadUtility();
	public FooterTextPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@name='username']") 
	WebElement usernamefield;
	@FindBy(xpath="//input[@name='password']") 
	WebElement passwordfield;
	@FindBy(xpath="//button[text()='Sign In']") 
	WebElement signinbutton;
	@FindBy(xpath="//a[contains(@href,'footertext') and contains(@class,'small')]") 
	WebElement footertextpage;
	@FindBy(xpath="//td[text()='Trivandrum']//parent::tr//td[4]//a") 
	WebElement editbuttonforarsenal;
	@FindBy(xpath="//textarea[@placeholder='Enter the Address']") 
	WebElement addressfield;
	@FindBy(xpath="//input[@id='email']") 
	WebElement emailfield;
	@FindBy(xpath="//input[@id='phone']") 
	WebElement phonefield;
	@FindBy(xpath="//button[@name='Update']") 
	WebElement updatebutton;
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']") 
	WebElement footertextalert;
	
	public void enterUsernameInUsernameField(String username) {
		pageutility.enterValueIntoElement(usernamefield, username);
	}
	
	public void enterPasswordInPasswordField(String password) {
		pageutility.enterValueIntoElement(passwordfield, password);
	}
	
	public void clickOnSignInButton() {
		pageutility.clickOnAnElement(signinbutton);
	}
	
	public void clickOnFooterText() {
		pageutility.clickOnAnElement(footertextpage);
	}
	
	public void clickOnEditButton() {
		pageutility.clickOnAnElement(editbuttonforarsenal);
	}
	
	public void enterValueInAddressField(String address) {
		pageutility.clearATextField(addressfield);
		pageutility.enterValueIntoElement(addressfield, address);
	}
	
	public void enterValueInEmailField(String email) {
		pageutility.clearATextField(emailfield);
		pageutility.enterValueIntoElement(emailfield, email);
	}
	
	public void enterValueInPhoneNumberField(String phonenumber) {
		pageutility.clearATextField(phonefield);
		pageutility.enterValueIntoElement(phonefield, phonenumber);
	}
	
	public void clickOnUpdateButton() {
		pageutility.clickOnAnElement(updatebutton);
	}
	
	public boolean footerTextAlert() {
		return pageutility.isAnElementDisplayed(footertextalert);
	}
}
