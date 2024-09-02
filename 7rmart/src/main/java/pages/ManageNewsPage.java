package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtility;

public class ManageNewsPage {
	WebDriver driver;
	PageUtility pageutility = new PageUtility();
	public ManageNewsPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@placeholder='Username']")
	WebElement usernameField;
	@FindBy(xpath="//input[@placeholder='Password']")
	WebElement passwordField;
	@FindBy(xpath="//button[text()='Sign In']")
	WebElement loginbutton;
	@FindBy(xpath ="//a[contains(@href,'list-news') and @class='small-box-footer']")
	WebElement managenews;
	@FindBy(xpath="//a[@class='btn btn-rounded btn-danger']")
	WebElement newbutton;
	@FindBy(xpath="//textarea[@id='news']")
	WebElement enterthenews;
	@FindBy(xpath="//button[text()='Save']")
	WebElement savebutton;
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")
	WebElement newsalert;
	
	public void enterUsernameOnUsernameField(String username) {
		pageutility.enterValueIntoElement(usernameField, username);
	}
	
	public void enterPasswordOnPasswordField(String password) {
		pageutility.enterValueIntoElement(passwordField, password);
	}
	
	public void clickOnSignInButton() {
		pageutility.clickOnAnElement(loginbutton);
	}
	
	public void clickOnManageNews() {
		pageutility.clickOnAnElement(managenews);
	}
	
	public void clickOnAddNewNews() {
		pageutility.clickOnAnElement(newbutton);
	}
	
	public void enterTheNewsInNewsField(String news) {
		pageutility.enterValueIntoElement(enterthenews, news);
	}
	
	public void clickOnSaveButton() {
		pageutility.clickOnAnElement(savebutton);
	}
	
	public boolean isAlertDisplayed() {
		return pageutility.isAnElementDisplayed(newsalert);
	}
	
}