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

	@FindBy(xpath = "//a[contains(@href,'list-category') and contains(@class,'small')]")
	private WebElement managecategoryoption;
	@FindBy(xpath = "//a[@onclick='click_button(1)']")
	private WebElement addnewcategory;
	@FindBy(xpath = "//input[@id='category']")
	private WebElement categorynamefield;
	@FindBy(xpath = "//div[@class='ms-selectable']/ul/li/span")
	private WebElement group;
	@FindBy(xpath = "//input[@id='main_img']")
	private WebElement categoryimage;
	@FindBy(xpath = "//input[@name='top_menu' and @value='yes']")
	private WebElement showontopmenuyes;
	@FindBy(xpath = "//input[@name='show_home' and @value='yes']")
	private WebElement showonleftmenuyes;
	@FindBy(xpath = "//button[text()='Save']")
	private WebElement savebutton;
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement newcategoryalert;

	public ManageCategoryPage clickOnManageCategory() {
		pageutility.clickOnAnElement(managecategoryoption);
		return this;
	}

	public ManageCategoryPage clickOnNewCategory() {
		pageutility.clickOnAnElement(addnewcategory);
		return this;
	}

	public ManageCategoryPage enterCategoryName(String categoryname) {
		pageutility.enterValueIntoElement(categorynamefield, categoryname);
		return this;
	}

	public ManageCategoryPage selectGroupofcategory() {
		pageutility.clickOnAnElement(group);
		return this;
	}

	public ManageCategoryPage selectCategoryImage() throws AWTException {
		fileuploadutility.fileUploadUsingRobotClass(categoryimage,Constants.CATEGORYIMAGE);
		fileuploadutility.fileUploadUsingSendKeys(categoryimage, Constants.CATEGORYIMAGE);
		return this;
	}

	public ManageCategoryPage showOnTopMenuSelect() {
		pageutility.javaScriptClick(driver, showontopmenuyes);
		return this;
	}

	public ManageCategoryPage showOnLeftMenuSelect() {
		pageutility.javaScriptClick(driver, showonleftmenuyes);
		return this;
	}

	public ManageContactPage clickOnSaveButton() {
		pageutility.javaScriptClick(driver, savebutton);
		return new ManageContactPage(driver);
	}

	public boolean isNewCategoryAlertDisplayed() {
		return pageutility.isAnElementDisplayed(newcategoryalert);
	}
}
