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
		//usernamefield.sendKeys(username);
		pageutility.enterValueIntoElement(usernamefield, username);
	}
	
	public void enterPassowrdInPasswordField(String password) {
		//passwordField.sendKeys(password);
		pageutility.enterValueIntoElement(passwordField, password);
	}
	
	public void clickOnSignInbutton() {
		//signinbutton.click();
		pageutility.clickOnAnElement(signinbutton);
	}
	
	public void clickOnManageContact() {
		//managecontact.click();
		pageutility.clickOnAnElement(managecontact);
	}
	
	public void clickOnEditContactButton() {
		//editcontactbutton.click();
		pageutility.clickOnAnElement(editcontactbutton);
	}
	
	public void enterPhoneNumber(String phonenumber) {
		//phonefield.clear();
		//phonefield.sendKeys(phonenumber);
		pageutility.clearATextField(phonefield);
		pageutility.enterValueIntoElement(phonefield, phonenumber);
	}
	
	public void enterEmail(String email) {
		//emailfield.clear();
		//emailfield.sendKeys(email);
		pageutility.clearATextField(emailfield);
		pageutility.enterValueIntoElement(emailfield, email);
	}
	
	public void enterAddress(String address) {
		//addressfield.clear();
		//addressfield.sendKeys(address);
		pageutility.clearATextField(addressfield);
		pageutility.enterValueIntoElement(addressfield, address);
	}
	
	public void enterDeliveryTime(String deliverytime) {
		//deliverytimefield.clear();
		//deliverytimefield.sendKeys(deliverytime);
		pageutility.clearATextField(deliverytimefield);
		pageutility.enterValueIntoElement(deliverytimefield, deliverytime);
	}
	
	public void enterDeliveryChargeLimit(String deliverychargelimit) {
		//deliverychargelimitfield.clear();
		//deliverychargelimitfield.sendKeys(deliverychargelimit);
		pageutility.clearATextField(deliverychargelimitfield);
		pageutility.enterValueIntoElement(deliverychargelimitfield, deliverychargelimit);
	}
	
	public void clickOnUpdateButton() {
		//JavascriptExecutor js = (JavascriptExecutor)driver;
		//js.executeScript("arguments[0].click();", updatebutton);
		pageutility.javaScriptClick(driver, updatebutton);
	}
	
	public boolean isContactUpdateAlertDisplayed() {
		//return contactupdatealert.isDisplayed();
		return pageutility.isAnElementDisplayed(contactupdatealert);
	}
	
}
