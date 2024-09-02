package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtility;

public class ManageContactPage {
	WebDriver driver;
	PageUtility pageutility = new PageUtility();
	public ManageContactPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@name='username']")
	WebElement usernamefield;
	@FindBy(xpath = "//input[@name='password']")
	WebElement passwordField;
	@FindBy(xpath = "//button[text()='Sign In']")
	WebElement signinbutton;
	@FindBy(xpath = "//a[contains(@href,'list-contact') and @class='small-box-footer']")
	WebElement managecontact;
	@FindBy(xpath = "//a[@role='button']")
	WebElement editcontactbutton;
	@FindBy(xpath = "//input[@id='phone']")
	WebElement phonefield;
	@FindBy(xpath = "//input[@id='email']")
	WebElement emailfield;
	@FindBy(xpath = "//textarea[@name ='address']")
	WebElement addressfield;
	@FindBy(xpath = "//textarea[@name='del_time']")
	WebElement deliverytimefield;
	@FindBy(xpath = "//input[@id='del_limit']")
	WebElement deliverychargelimitfield;
	@FindBy(xpath = "//button[@name='Update']")
	WebElement updatebutton;
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	WebElement contactupdatealert;
	
	public void enterUsernameInUsernameField(String username) {
		pageutility.enterValueIntoElement(usernamefield, username);
	}
	
	public void enterPassowrdInPasswordField(String password) {
		pageutility.enterValueIntoElement(passwordField, password);
	}
	
	public void clickOnSignInbutton() {
		pageutility.clickOnAnElement(signinbutton);
	}
	
	public void clickOnManageContact() {
		pageutility.clickOnAnElement(managecontact);
	}
	
	public void clickOnEditContactButton() {
		pageutility.clickOnAnElement(editcontactbutton);
	}
	
	public void enterPhoneNumber(String phonenumber) {
		pageutility.clearATextField(phonefield);
		pageutility.enterValueIntoElement(phonefield, phonenumber);
	}
	
	public void enterEmail(String email) {
		pageutility.clearATextField(emailfield);
		pageutility.enterValueIntoElement(emailfield, email);
	}
	
	public void enterAddress(String address) {
		pageutility.clearATextField(addressfield);
		pageutility.enterValueIntoElement(addressfield, address);
	}
	
	public void enterDeliveryTime(String deliverytime) {
		pageutility.clearATextField(deliverytimefield);
		pageutility.enterValueIntoElement(deliverytimefield, deliverytime);
	}
	
	public void enterDeliveryChargeLimit(String deliverychargelimit) {
		pageutility.clearATextField(deliverychargelimitfield);
		pageutility.enterValueIntoElement(deliverychargelimitfield, deliverychargelimit);
	}
	
	public void clickOnUpdateButton() {
		pageutility.javaScriptClick(driver, updatebutton);
	}
	
	public boolean isContactUpdateAlertDisplayed() {
		return pageutility.isAnElementDisplayed(contactupdatealert);
	}
	
}
