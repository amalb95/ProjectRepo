package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtility;

public class ManageProductPage {
	WebDriver driver;
	PageUtility pageutility = new PageUtility();
	public ManageProductPage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@placeholder='Username']")
	WebElement usernamefield;
	@FindBy(xpath = "//input[@placeholder='Password']")
	WebElement passwordfield;
	@FindBy(xpath = "//button[text()='Sign In']")
	WebElement signinbutton;
	@FindBy(xpath = "//a[contains(@href,'list-product') and contains(@class,'small')]")
	WebElement manageproduct;
	@FindBy(xpath = "//a[contains(@class,'danger ')]")
	WebElement deletebutton;
	@FindBy(xpath = "//div[@class ='alert alert-success alert-dismissible']")
	WebElement deleteproductalert;
	
	
	public void enterUsernameOnUsernameField(String username) {
		pageutility.enterValueIntoElement(usernamefield, username);
	}
	
	public void enterPasswordOnPasswordField(String password) {
		pageutility.enterValueIntoElement(passwordfield, password);
	}
	
	public void clickOnSignInButton() {
		pageutility.clickOnAnElement(signinbutton);
	}
	
	public void clickOnManageProduct() {
		pageutility.clickOnAnElement(manageproduct);
	}
	
	public void clickOnDeleteButton() {
		pageutility.clickOnAnElement(deletebutton);
	}
	
	public void acceptDeleteAlert() {
		pageutility.acceptAlert(driver);
	}
	
	public boolean isDeleteAlertDisplayed(){
		return pageutility.isAnElementDisplayed(deleteproductalert);
	}
}
