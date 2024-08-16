package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageSubCategoryPage {
	WebDriver driver;
	public ManageSubCategoryPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@name='username']") WebElement usernamefield;
	@FindBy(xpath="//input[@name='password']") WebElement passwordfield;
	@FindBy(xpath="//button[text()='Sign In']") WebElement signinbutton;
	//@FindBy(xpath="//div[@class=\"os-content\"]//p[contains(text(),'Manage Category')]") WebElement managecategoryoption;
	@FindBy(xpath="//a[contains(@href,'sub-category') and contains(@class,'small')]") WebElement subcategoryoption;
	@FindBy(xpath="//span[contains(@class,'badge bg-')]") WebElement status;
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']") WebElement subcategorystatusalert;
	
	public void enterUsernameInUsernameField(String username) {
		usernamefield.sendKeys(username);
	}
	
	public void enterPasswordInPasswordField(String password) {
		passwordfield.sendKeys(password);
	}
	
	public void clickOnSignInButton() {
		signinbutton.click();
	}
	
	public void clickOnSubCategory() {
		subcategoryoption.click();
	}
	
	public void clickOnStatus() {
		status.click();
	}
	
	public boolean isSubCategoryStatusDisplayed() {
		return subcategorystatusalert.isDisplayed();
	}
}
