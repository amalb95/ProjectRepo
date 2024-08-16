package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageContactPage {
	WebDriver driver;
	public ManageContactPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@name='username']")WebElement usernamefield;
	@FindBy(xpath = "//input[@name='password']")WebElement passwordField;
	@FindBy(xpath = "//button[text()='Sign In']")WebElement signinbutton;
	@FindBy(xpath = "//a[contains(@href,'list-contact') and @class='small-box-footer']")WebElement managecontact;
	@FindBy(xpath = "//a[@role='button']")WebElement editcontactbutton;
	@FindBy(xpath = "//input[@id='phone']")WebElement phonefield;
	@FindBy(xpath = "//input[@id='email']")WebElement emailfield;
	@FindBy(xpath = "//textarea[@name ='address']")WebElement addressfield;
	@FindBy(xpath = "//textarea[@name='del_time']")WebElement deliverytimefield;
	@FindBy(xpath = "//input[@id='del_limit']")WebElement deliverychargelimitfield;
	@FindBy(xpath = "//button[@name='Update']")WebElement updatebutton;
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")WebElement contactupdatealert;
	
	public void enterUsernameInUsernameField(String username) {
		usernamefield.sendKeys(username);
	}
	
	public void enterPassowrdInPasswordField(String password) {
		passwordField.sendKeys(password);
	}
	
	public void clickOnSignInbutton() {
		signinbutton.click();
	}
	
	public void clickOnManageContact() {
		managecontact.click();
	}
	
	public void clickOnEditContactButton() {
		editcontactbutton.click();
	}
	
	public void enterPhoneNumber(String phonenumber) {
		phonefield.clear();
		phonefield.sendKeys(phonenumber);
	}
	
	public void enterEmail(String email) {
		emailfield.clear();
		emailfield.sendKeys(email);
	}
	
	public void enterAddress(String address) {
		addressfield.clear();
		addressfield.sendKeys(address);
	}
	
	public void enterDeliveryTime(String deliverytime) {
		deliverytimefield.clear();
		deliverytimefield.sendKeys(deliverytime);
	}
	
	public void enterDeliveryChargeLimit(String deliverychargelimit) {
		deliverychargelimitfield.clear();
		deliverychargelimitfield.sendKeys(deliverychargelimit);
	}
	
	public void clickOnUpdateButton() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", updatebutton);
	}
	
	public boolean isContactUpdateAlertDisplayed() {
		return contactupdatealert.isDisplayed();
	}
	
}
