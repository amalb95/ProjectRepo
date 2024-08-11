package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageNewsPage {
	WebDriver driver;
	public ManageNewsPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@placeholder='Username']")WebElement usernameField;
	@FindBy(xpath="//input[@placeholder='Password']")WebElement passwordField;
	@FindBy(xpath="//button[text()='Sign In']")WebElement loginbutton;
	@FindBy(xpath ="//a[contains(@href,'list-news') and @class='small-box-footer']")WebElement managenews;
	@FindBy(xpath="//a[@class='btn btn-rounded btn-danger']")WebElement newbutton;
	@FindBy(xpath="//textarea[@id='news']")WebElement enterthenews;
	@FindBy(xpath="//button[text()='Save']")WebElement savebutton;
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")WebElement newsalert;
	
	public void enterUsernameOnUsernameField(String username) {
		usernameField.sendKeys(username);
	}
	
	public void enterPasswordOnPasswordField(String password) {
		passwordField.sendKeys(password);
	}
	
	public void clickOnSignInButton() {
		loginbutton.click();
	}
	
	public void clickOnManageNews() {
		managenews.click();
	}
	
	public void clickOnAddNewNews() {
		newbutton.click();
	}
	
	public void enterTheNewsInNewsField(String news) {
		enterthenews.sendKeys(news);
	}
	
	public void clickOnSaveButton() {
		savebutton.click();
	}
	
	public boolean isAlertDisplayed() {
		return newsalert.isDisplayed();
	}
	
}
