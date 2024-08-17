package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtility;

public class AddNewUserPage {
	WebDriver driver;
	PageUtility pageutility = new PageUtility();
	public AddNewUserPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@name='username']") WebElement usernameField;
	@FindBy(xpath = "//input[@name='password']") WebElement passwordField;
	@FindBy(xpath = "//button[text()='Sign In']") WebElement signInButton;
	@FindBy(xpath = "//a[contains(@href,'list-admin') and contains(@class,'small')]") WebElement adminUser;
	@FindBy(xpath = "//a[@onclick='click_button(1)']") WebElement newUser;
	@FindBy(xpath = "//input[@id='username']") WebElement adminUsernameField;
	@FindBy(xpath = "//input[@id='password']") WebElement adminPasswordField;
	@FindBy(xpath = "//select[@id='user_type']") WebElement adminUserTypeDropdown;
	@FindBy(xpath = "//button[@name='Create']") WebElement adminSaveButton;
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']") WebElement alertUserCreated;
	
	public void enterUsernameInUsernameField(String username) {
		//usernameField.sendKeys(username);
		pageutility.enterValueIntoElement(usernameField, username);
	}
	
	public void enterPasswordInPasswordField(String password) {
		//passwordField.sendKeys(password);
		pageutility.enterValueIntoElement(passwordField, password);
	}
	
	public void clickOnSignInButton() {
		//signInButton.click();
		pageutility.clickOnAnElement(signInButton);
	}
	
	public void clickOnAdminUsers() {
		//adminUser.click();
		pageutility.clickOnAnElement(adminUser);
	}
	
	public void clickOnNewButton() {
		//newUser.click();
		pageutility.clickOnAnElement(newUser);
	}
	
	public void enterUsernameInAdminUserUsernameField(String newusername) {
		//adminUsernameField.sendKeys(newusername);
		pageutility.enterValueIntoElement(adminUsernameField, newusername);
	}
	
	public void enterPasswordInAdminUserPasswordField(String newpassword) {
		//adminPasswordField.sendKeys(newpassword);
		pageutility.enterValueIntoElement(adminPasswordField, newpassword);
	}
	
	public void selectUserTypeOfNewUser() {
		//Select select = new Select(adminUserTypeDropdown);
		//select.selectByValue("staff");
		pageutility.selectDropDownByValue(adminUserTypeDropdown, "staff");
	}
	
	public void clickOnSaveButton() {
		//adminSaveButton.click();
		pageutility.clickOnAnElement(adminSaveButton);
	}
	
	public boolean isUserCreatedSuccessfullyAlertDisplayed() {
		//return alertUserCreated.isDisplayed();
		return pageutility.isAnElementDisplayed(alertUserCreated);
	}
	
}
