package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import constants.Constants;
import utilities.FileUploadUtility;
import utilities.PageUtility;

public class ManageSubCategoryPage {
	WebDriver driver;
	PageUtility pageutility = new PageUtility();
	FileUploadUtility fileuploadutility = new FileUploadUtility();
	public ManageSubCategoryPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@name='username']") 
	WebElement usernamefield;
	@FindBy(xpath="//input[@name='password']") 
	WebElement passwordfield;
	@FindBy(xpath="//button[text()='Sign In']") 
	WebElement signinbutton;
	@FindBy(xpath="//a[contains(@href,'sub-category') and contains(@class,'small')]") 
	WebElement subcategoryoption;
	@FindBy(xpath="//a[@onclick='click_button(1)']") 
	WebElement addnewbutton;
	@FindBy(xpath="//select[@id='cat_id']") 
	WebElement categorydropdown;
	@FindBy(xpath="//input[@id='subcategory']") 
	WebElement subcategoryfield;
	@FindBy(xpath="//input[@id='main_img']") 
	WebElement subcategoryimage;
	@FindBy(xpath="//button[text()='Save']") 
	WebElement newsubcategorysavebutton;
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']") 
	WebElement newsubcategoryalert;
	@FindBy(xpath="//span[contains(@class,'badge bg-')]") 
	WebElement status;
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']") 
	WebElement subcategorystatusalert;
	
	public void enterUsernameInUsernameField(String username) {
		pageutility.enterValueIntoElement(usernamefield, username);
	}
	
	public void enterPasswordInPasswordField(String password) {
		pageutility.enterValueIntoElement(passwordfield, password);
	}
	
	public void clickOnSignInButton() {
		pageutility.clickOnAnElement(signinbutton);
	}
	
	public void clickOnSubCategory() {
		pageutility.clickOnAnElement(subcategoryoption);
	}
	
	public void clickOnNewSubCategoryButton() {
		pageutility.clickOnAnElement(addnewbutton);
	}
	
	public void selectCategoryDropDown() {
		pageutility.selectDropDownByVisibleText(categorydropdown, "Appliances");
	}
	
	public void enterSubCategory(String subcategory) {
		pageutility.enterValueIntoElement(subcategoryfield, subcategory);
	}
	
	public void chooseImageForSubCategory() {
		fileuploadutility.fileUploadUsingSendKeys(subcategoryimage, Constants.SUBCATEGORYIMAGE);
	}
	
	public void clickOnSavebutton() {
		pageutility.javaScriptClick(driver, newsubcategorysavebutton);
	}
	
	public boolean isNewSubCategoryAlertDisplayed() {
		return pageutility.isAnElementDisplayed(newsubcategoryalert);
	}
	
	public void clickOnStatus() {
		pageutility.clickOnAnElement(status);
	}
	
	public boolean isSubCategoryStatusDisplayed() {
		return pageutility.isAnElementDisplayed(subcategorystatusalert);
	}
}
