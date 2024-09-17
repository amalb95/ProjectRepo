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

	@FindBy(xpath = "//a[contains(@href,'sub-category') and contains(@class,'small')]")
	private WebElement subcategoryoption;
	@FindBy(xpath = "//a[@onclick='click_button(1)']")
	private WebElement addnewbutton;
	@FindBy(xpath = "//select[@id='cat_id']")
	private WebElement categorydropdown;
	@FindBy(xpath = "//input[@id='subcategory']")
	private WebElement subcategoryfield;
	@FindBy(xpath = "//input[@id='main_img']")
	private WebElement subcategoryimage;
	@FindBy(xpath = "//button[text()='Save']")
	private WebElement newsubcategorysavebutton;
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement newsubcategoryalert;
	@FindBy(xpath = "//span[contains(@class,'badge bg-')]")
	private WebElement status;
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement subcategorystatusalert;

	public ManageSubCategoryPage clickOnSubCategory() {
		pageutility.clickOnAnElement(subcategoryoption);
		return this;
	}

	public ManageSubCategoryPage clickOnNewSubCategory() {
		pageutility.clickOnAnElement(addnewbutton);
		return this;
	}

	public ManageSubCategoryPage selectCategoryDropDown() {
		pageutility.selectDropDownByVisibleText(categorydropdown, "Appliances");
		return this;
	}

	public ManageSubCategoryPage enterSubCategory(String subcategory) {
		pageutility.enterValueIntoElement(subcategoryfield, subcategory);
		return this;
	}

	public ManageSubCategoryPage chooseImageForSubCategory() {
		fileuploadutility.fileUploadUsingSendKeys(subcategoryimage, Constants.SUBCATEGORYIMAGE);
		return this;
	}

	public LogoutPage clickOnSavebutton() {
		pageutility.javaScriptClick(driver, newsubcategorysavebutton);
		return new LogoutPage(driver);
	}

	public boolean isAlertDisplayed() {
		return pageutility.isAnElementDisplayed(newsubcategoryalert);
	}

	public LogoutPage clickOnStatus() {
		pageutility.clickOnAnElement(status);
		return new LogoutPage(driver);
	}

	public boolean isStatusDisplayed() {
		return pageutility.isAnElementDisplayed(subcategorystatusalert);
	}
}
