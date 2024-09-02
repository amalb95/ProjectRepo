package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtility;

public class LogoutPage {
	WebDriver driver;
	PageUtility pageutility = new PageUtility();
	public LogoutPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver , this);
	}
	
	@FindBy(xpath="//input[@type='text']") 
	WebElement usernameField;
	@FindBy(xpath="//input[@type='password']") 
	WebElement passwordField;
	@FindBy(xpath="//button[@type='submit']") 
	WebElement loginButton;
	@FindBy(xpath="//img[@src='https://groceryapp.uniqassosiates.com/public/assets/admin/dist/img/avatar5.png']") 
	WebElement adminImage;
	@FindBy(xpath="//a[contains(@href,'logout') and contains(@class,'dropdown')]") 
	WebElement logout;
	
	public void enterUsernameOnUsernameField(String username) {
		pageutility.enterValueIntoElement(usernameField, username);
	}
	
	public void enterPasswordOnPasswordField(String password) {
		pageutility.enterValueIntoElement(passwordField, password);
	}
	
	public void clickOnSignInButton() {
		pageutility.clickOnAnElement(loginButton);
	}
	
	public void clickOnAdminButton() {
		pageutility.clickOnAnElement(adminImage);
	}
	
	public void clickOnlogoutButton() {
		pageutility.clickOnAnElement(logout);
	}
	
	public boolean checkIfLoginButtonIsDisplayed() {
		return pageutility.isAnElementDisplayed(loginButton);
	}
}
