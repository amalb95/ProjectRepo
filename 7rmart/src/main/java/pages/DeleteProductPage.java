package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeleteProductPage {
	WebDriver driver;
	public DeleteProductPage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@placeholder='Username']")
	WebElement usernamefield;
	@FindBy(xpath = "//input[@placeholder='Password']")
	WebElement passwordfield;
	@FindBy(xpath = "//button[text()='Sign In']")
	WebElement signinbutton;
	@FindBy(xpath = "//a//p[text()='Manage Product']")
	WebElement manageproduct;
	@FindBy(xpath = "//a[contains(@class,'danger ')]")
	WebElement deletebutton;
	@FindBy(xpath = "//div[@class ='alert alert-success alert-dismissible']")
	WebElement deleteproductalert;
	
	
	public void enterUsernameOnUsernameField(String username) {
		usernamefield.sendKeys(username);
	}
	
	public void enterPasswordOnPasswordField(String password) {
		passwordfield.sendKeys(password);
	}
	
	public void clickOnSignInButton() {
		signinbutton.click();
	}
	
	public void clickOnManageProduct() {
		manageproduct.click();
	}
	
	public void clickOnDeleteButton() {
		deletebutton.click();
	}
	
	public void acceptDeleteAlert() {
		driver.switchTo().alert().accept();
	}
	
	public boolean isDeleteAlertDisplayed(){
		return deleteproductalert.isDisplayed();
	}
}
