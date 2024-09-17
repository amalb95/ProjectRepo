package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.FileUploadUtility;
import utilities.PageUtility;

public class FooterTextPage {
	WebDriver driver;
	PageUtility pageutility = new PageUtility();
	FileUploadUtility fileuploadutility = new FileUploadUtility();

	public FooterTextPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[contains(@href,'footertext') and contains(@class,'small')]")
	private WebElement footertextpage;
	@FindBy(xpath = "//td[text()='Trivandrum']//parent::tr//td[4]//a")
	private WebElement editbuttonforarsenal;
	@FindBy(xpath = "//textarea[@placeholder='Enter the Address']")
	private WebElement addressfield;
	@FindBy(xpath = "//input[@id='email']")
	private WebElement emailfield;
	@FindBy(xpath = "//input[@id='phone']")
	private WebElement phonefield;
	@FindBy(xpath = "//button[@name='Update']")
	private WebElement updatebutton;
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement footertextalert;

	public FooterTextPage clickOnFooterText() {
		pageutility.clickOnAnElement(footertextpage);
		return this;
	}

	public FooterTextPage clickOnEditButton() {
		pageutility.clickOnAnElement(editbuttonforarsenal);
		return this;
	}

	public FooterTextPage enterValueInAddressField(String address) {
		pageutility.clearATextField(addressfield);
		pageutility.enterValueIntoElement(addressfield, address);
		return this;
	}

	public FooterTextPage enterValueInEmailField(String email) {
		pageutility.clearATextField(emailfield);
		pageutility.enterValueIntoElement(emailfield, email);
		return this;
	}

	public FooterTextPage enterValueInPhoneField(String phonenumber) {
		pageutility.clearATextField(phonefield);
		pageutility.enterValueIntoElement(phonefield, phonenumber);
		return this;
	}

	public ManageCategoryPage clickOnUpdateButton() {
		pageutility.clickOnAnElement(updatebutton);
		return new ManageCategoryPage(driver);
	}

	public boolean isAlertDisplayed() {
		return pageutility.isAnElementDisplayed(footertextalert);
	}
}