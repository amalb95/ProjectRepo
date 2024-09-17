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

	@FindBy(xpath = "//a[contains(@href,'list-admin') and contains(@class,'small')]")
	private WebElement adminUser;
	@FindBy(xpath = "//a[@onclick='click_button(1)']")
	private WebElement newUser;
	@FindBy(xpath = "//input[@id='username']")
	private WebElement adminUsernameField;
	@FindBy(xpath = "//input[@id='password']")
	private WebElement adminPasswordField;
	@FindBy(xpath = "//select[@id='user_type']")
	private WebElement adminUserTypeDropdown;
	@FindBy(xpath = "//button[@name='Create']")
	private WebElement adminSaveButton;
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement alertUserCreated;

	public AdminUserPage clickOnAdminUsers() {
		pageutility.clickOnAnElement(adminUser);
		return this;
	}

	public AdminUserPage clickOnNewButton() {
		pageutility.clickOnAnElement(newUser);
		return this;
	}

	public AdminUserPage enterUsernameInUsernameField(String newusername) {
		pageutility.enterValueIntoElement(adminUsernameField, newusername);
		return this;
	}

	public AdminUserPage enterPasswordInPasswordField(String newpassword) {
		pageutility.enterValueIntoElement(adminPasswordField, newpassword);
		return this;
	}

	public AdminUserPage selectTypeOfNewUser() {
		pageutility.selectDropDownByValue(adminUserTypeDropdown, "staff");
		return this;
	}

	public FooterTextPage clickOnSaveButton() {
		pageutility.clickOnAnElement(adminSaveButton);
		return new FooterTextPage(driver);
	}

	public boolean isAlertDisplayed() {
		return pageutility.isAnElementDisplayed(alertUserCreated);
	}

}
