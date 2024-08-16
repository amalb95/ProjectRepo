package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddNewUserPage {
	WebDriver driver;
	public AddNewUserPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@name='username']") WebElement usernameField;
	@FindBy(xpath = "//input[@name='password']") WebElement passwordField;
	@FindBy(xpath = "//button[text()='Sign In']") WebElement signInButton;
	@FindBy(xpath = "//a[contains(@href,'list-admin')]") WebElement adminUser;
	@FindBy(xpath = "//a[@onclick='click_button(1)']") WebElement newUser;
	@FindBy(xpath = "//input[@id='username']") WebElement adminUsernameField;
	@FindBy(xpath = "//input[@id='password']") WebElement adminPasswordField;
	@FindBy(xpath = "//select[@id='user_type']") WebElement adminUserTypeDropdown;
	@FindBy(xpath = "//button[@name='Create']") WebElement adminSaveButton;
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']") WebElement alertUserCreated;
	
	public void enterUsernameInUsernameField(String username) {
		usernameField.sendKeys(username);
	}
	
	public void enterPasswordInPasswordField(String password) {
		passwordField.sendKeys(password);
	}
	
	public void clickOnSignInButton() {
		signInButton.click();
	}
	
	public void clickOnAdminUsers() {
		adminUser.click();
	}
	
	public void clickOnNewButton() {
		newUser.click();
	}
	
	public void enterUsernameInAdminUserUsernameField(String newusername) {
		adminUsernameField.sendKeys(newusername);
	}
	
	public void enterPasswordInAdminUserPasswordField(String newpassword) {
		adminPasswordField.sendKeys(newpassword);
	}
	
	public void selectUserTypeOfNewUser() {
		Select select = new Select(adminUserTypeDropdown);
		select.selectByValue("staff");
	}
	
	public void clickOnSaveButton() {
		adminSaveButton.click();
	}
	
	public boolean isUserCreatedSuccessfullyAlertDisplayed() {
		return alertUserCreated.isDisplayed();
	}
	
}
