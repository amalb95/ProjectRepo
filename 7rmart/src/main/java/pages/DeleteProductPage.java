package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtility;

public class DeleteProductPage {
	WebDriver driver;
	PageUtility pageutility = new PageUtility();
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
		//usernamefield.sendKeys(username);
		pageutility.enterValueIntoElement(usernamefield, username);
	}
	
	public void enterPasswordOnPasswordField(String password) {
		//passwordfield.sendKeys(password);
		pageutility.enterValueIntoElement(passwordfield, password);
	}
	
	public void clickOnSignInButton() {
		//signinbutton.click();
		pageutility.clickOnAnElement(signinbutton);
	}
	
	public void clickOnManageProduct() {
		//manageproduct.click();
		pageutility.clickOnAnElement(manageproduct);
	}
	
	public void clickOnDeleteButton() {
		//deletebutton.click();
		pageutility.clickOnAnElement(deletebutton);
	}
	
	public void acceptDeleteAlert() {
		//driver.switchTo().alert().accept();
		pageutility.acceptAlert(driver);
	}
	
	public boolean isDeleteAlertDisplayed(){
		//return deleteproductalert.isDisplayed();
		return pageutility.isAnElementDisplayed(deleteproductalert);
	}
}
