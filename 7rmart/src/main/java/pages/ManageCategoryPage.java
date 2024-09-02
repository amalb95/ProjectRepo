package pages;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import constants.Constants;
import utilities.FileUploadUtility;
import utilities.PageUtility;

public class ManageCategoryPage {
	WebDriver driver;
	PageUtility pageutility = new PageUtility();
	FileUploadUtility fileuploadutility = new FileUploadUtility();
	public ManageCategoryPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@name='username']")
	WebElement usernamefield;
	@FindBy(xpath = "//input[@name='password']")
	WebElement passwordField;
	@FindBy(xpath = "//button[text()='Sign In']")
	WebElement signinbutton;
	@FindBy(xpath="//a[contains(@href,'list-category') and contains(@class,'small')]")
	WebElement managecategoryoption;
	@FindBy(xpath="//a[@onclick='click_button(1)']")
	WebElement addnewcategory;
	@FindBy(xpath="//input[@id='category']")
	WebElement categorynamefield;
	@FindBy(xpath="//div[@class='ms-selectable']/ul/li/span")
	WebElement group;
	@FindBy(xpath="//input[@id='main_img']")
	WebElement categoryimage;
	@FindBy(xpath="//input[@name='top_menu' and @value='yes']")
	WebElement showontopmenuyes;
	@FindBy(xpath="//input[@name='show_home' and @value='yes']")
	WebElement showonleftmenuyes;
	@FindBy(xpath="//button[text()='Save']")
	WebElement savebutton;
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")
	WebElement newcategoryalert;
	
	public void enterUsernameInUsernameField(String username) {
		pageutility.enterValueIntoElement(usernamefield, username);
	}
	
	public void enterPassowrdInPasswordField(String password) {
		pageutility.enterValueIntoElement(passwordField, password);
	}
	
	public void clickOnSignInbutton() {
		pageutility.clickOnAnElement(signinbutton);
	}
	
	public void clickOnManageCategory() {
		pageutility.clickOnAnElement(managecategoryoption);
	}
	
	public void clickOnNewCategory() {
		pageutility.clickOnAnElement(addnewcategory);
	}
	
	public void enterCategoryName(String categoryname) {
		pageutility.enterValueIntoElement(categorynamefield, categoryname);
	}
	
	public void selectGroupofcategory() {
		pageutility.clickOnAnElement(group);
	}
	
	public void selectCategoryImage() throws AWTException {
		//fileuploadutility.fileuploadUsingRobertClass(categoryimage, Constants.CATEGORYIMAGE);
		fileuploadutility.fileUploadUsingSendKeys(categoryimage, Constants.CATEGORYIMAGE);
	}
	
	public void showOnTopMenuSelect() {
		pageutility.javaScriptClick(driver, showontopmenuyes);
	}
	
	public void showOnLeftMenuSelect() {
		pageutility.javaScriptClick(driver, showonleftmenuyes);
	}
	
	public void clickOnSaveButton() {
		pageutility.javaScriptClick(driver, savebutton);
	}
	
	public boolean isNewCategoryAlertDisplayed() {
		return pageutility.isAnElementDisplayed(newcategoryalert);
	}
}
