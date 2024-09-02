package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtility;

public class AdminUserPage {
	WebDriver driver;
	PageUtility pageutility = new PageUtility();
	public AdminUserPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@name='username']") 
	WebElement usernameField;
	@FindBy(xpath = "//input[@name='password']") 
	WebElement passwordField;
	@FindBy(xpath = "//button[text()='Sign In']") 
	WebElement signInButton;
	@FindBy(xpath = "//a[contains(@href,'list-admin') and contains(@class,'small')]") 
	WebElement adminUser;
	@FindBy(xpath = "//a[@onclick='click_button(1)']") 
	WebElement newUser;
	@FindBy(xpath = "//input[@id='username']") 
	WebElement adminUsernameField;
	@FindBy(xpath = "//input[@id='password']") 
	WebElement adminPasswordField;
	@FindBy(xpath = "//select[@id='user_type']") 
	WebElement adminUserTypeDropdown;
	@FindBy(xpath = "//button[@name='Create']") 
	WebElement adminSaveButton;
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']") 
	WebElement alertUserCreated;
	
	public void enterUsernameInUsernameField(String username) {
		pageutility.enterValueIntoElement(usernameField, username);
	}
	
	public void enterPasswordInPasswordField(String password) {
		pageutility.enterValueIntoElement(passwordField, password);
	}
	
	public void clickOnSignInButton() {
		pageutility.clickOnAnElement(signInButton);
	}
	
	public void clickOnAdminUsers() {
		pageutility.clickOnAnElement(adminUser);
	}
	
	public void clickOnNewButton() {
		pageutility.clickOnAnElement(newUser);
	}
	
	public void enterUsernameInAdminUserUsernameField(String newusername) {
		pageutility.enterValueIntoElement(adminUsernameField, newusername);
	}
	
	public void enterPasswordInAdminUserPasswordField(String newpassword) {
		pageutility.enterValueIntoElement(adminPasswordField, newpassword);
	}
	
	public void selectUserTypeOfNewUser() {
		pageutility.selectDropDownByValue(adminUserTypeDropdown, "staff");
	}
	
	public void clickOnSaveButton() {
		pageutility.clickOnAnElement(adminSaveButton);
	}
	
	public boolean isUserCreatedSuccessfullyAlertDisplayed() {
		return pageutility.isAnElementDisplayed(alertUserCreated);
	}
	
}
