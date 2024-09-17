package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtility;

public class ManageContactPage {
	WebDriver driver;
	PageUtility pageutility = new PageUtility();

	public ManageContactPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[contains(@href,'list-contact') and @class='small-box-footer']")
	private WebElement managecontact;
	@FindBy(xpath = "//a[@role='button']")
	private WebElement editcontactbutton;
	@FindBy(xpath = "//input[@id='phone']")
	private WebElement phonefield;
	@FindBy(xpath = "//input[@id='email']")
	private WebElement emailfield;
	@FindBy(xpath = "//textarea[@name ='address']")
	private WebElement addressfield;
	@FindBy(xpath = "//textarea[@name='del_time']")
	private WebElement deliverytimefield;
	@FindBy(xpath = "//input[@id='del_limit']")
	private WebElement deliverychargelimitfield;
	@FindBy(xpath = "//button[@name='Update']")
	private WebElement updatebutton;
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement contactupdatealert;

	public ManageContactPage clickOnManageContact() {
		pageutility.clickOnAnElement(managecontact);
		return this;
	}

	public ManageContactPage clickOnEditContact() {
		pageutility.clickOnAnElement(editcontactbutton);
		return this;
	}

	public ManageContactPage enterPhoneNumber(String phonenumber) {
		pageutility.clearATextField(phonefield);
		pageutility.enterValueIntoElement(phonefield, phonenumber);
		return this;
	}

	public ManageContactPage enterEmail(String email) {
		pageutility.clearATextField(emailfield);
		pageutility.enterValueIntoElement(emailfield, email);
		return this;
	}

	public ManageContactPage enterAddress(String address) {
		pageutility.clearATextField(addressfield);
		pageutility.enterValueIntoElement(addressfield, address);
		return this;
	}

	public ManageContactPage enterDeliveryTime(String deliverytime) {
		pageutility.clearATextField(deliverytimefield);
		pageutility.enterValueIntoElement(deliverytimefield, deliverytime);
		return this;
	}

	public ManageContactPage enterDeliveryChargeLimit(String deliverychargelimit) {
		pageutility.clearATextField(deliverychargelimitfield);
		pageutility.enterValueIntoElement(deliverychargelimitfield, deliverychargelimit);
		return this;
	}

	public ManageNewsPage clickOnUpdateButton() {
		pageutility.javaScriptClick(driver, updatebutton);
		return new ManageNewsPage(driver);
	}

	public boolean isAlertDisplayed() {
		return pageutility.isAnElementDisplayed(contactupdatealert);
	}

}
