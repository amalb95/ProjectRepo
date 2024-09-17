package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtility;
import utilities.WaitUtility;

public class LoginPage {
	WebDriver driver;
	PageUtility pageutility = new PageUtility();

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@type='text']")
	private WebElement usernameField;
	@FindBy(xpath = "//input[@type='password']")
	private WebElement passwordField;
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement loginButton;
	@FindBy(xpath = "//img[@src='https://groceryapp.uniqassosiates.com/public/assets/admin/dist/img/avatar5.png']")
	private WebElement adminImage;
	@FindBy(xpath = "//div[@class='alert alert-danger alert-dismissible']")
	private WebElement loginalert;
	@FindBy(xpath = "//a[contains(@href,'footertext') and contains(@class,'small')]")
	private WebElement footertextpage;
	@FindBy(xpath = "//a[contains(@href,'list-category') and contains(@class,'small')]")
	private WebElement managecategoryoption;
	@FindBy(xpath = "//a[contains(@href,'list-contact') and @class='small-box-footer']")
	private WebElement managecontact;
	@FindBy(xpath ="//a[contains(@href,'list-news') and @class='small-box-footer']")
	private WebElement managenews;
	@FindBy(xpath = "//a[contains(@href,'list-product') and contains(@class,'small')]")
	private WebElement manageproduct;
	@FindBy(xpath = "//a[contains(@href,'sub-category') and contains(@class,'small')]")
	private WebElement subcategoryoption;
	
	

	public LoginPage enterUsername(String username) {
		pageutility.enterValueIntoElement(usernameField, username);
		return this;
	}

	public LoginPage enterPassword(String password) {
		pageutility.enterValueIntoElement(passwordField, password);
		return this;
	}

	public AdminUserPage clickOnSignInButton() {
		WaitUtility waitutility = new WaitUtility();
		waitutility.waitForElementToBeClickable(driver, loginButton);
		pageutility.clickOnAnElement(loginButton);
		return new AdminUserPage(driver);
	}
	
	public FooterTextPage clickOnFooterText() {
		pageutility.clickOnAnElement(footertextpage);
		return new FooterTextPage(driver);
	}
	
	public ManageCategoryPage clickOnManageCategory() {
		pageutility.clickOnAnElement(managecategoryoption);
		return new ManageCategoryPage(driver);
	}
	
	public ManageContactPage clickOnManageContact() {
		pageutility.clickOnAnElement(managecontact);
		return new ManageContactPage(driver);
	}
	
	public ManageNewsPage clickOnManageNews() {
		pageutility.clickOnAnElement(managenews);
		return new ManageNewsPage(driver);
	}
	
	public ManageProductPage clickOnManageProduct() {
		pageutility.clickOnAnElement(manageproduct);
		return new ManageProductPage(driver);
	}
	
	public ManageSubCategoryPage clickOnSubCategory() {
		pageutility.clickOnAnElement(subcategoryoption);
		return new ManageSubCategoryPage(driver);
	}
	
	public LogoutPage clickOnAdminButton() {
		pageutility.clickOnAnElement(adminImage);
		return new LogoutPage(driver);
	}

	public boolean isHomePageLoaded() {
		return pageutility.isAnElementDisplayed(adminImage);
	}

	public boolean isHomePageNotLoaded() {
		return pageutility.isAnElementDisplayed(loginalert);
	}
}