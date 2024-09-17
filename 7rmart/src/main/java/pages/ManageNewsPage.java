package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtility;

public class ManageNewsPage {
	WebDriver driver;
	PageUtility pageutility = new PageUtility();
	public ManageNewsPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath ="//a[contains(@href,'list-news') and @class='small-box-footer']")
	private WebElement managenews;
	@FindBy(xpath="//a[@class='btn btn-rounded btn-danger']")
	private WebElement newbutton;
	@FindBy(xpath="//textarea[@id='news']")
	private WebElement enterthenews;
	@FindBy(xpath="//button[text()='Save']")
	private WebElement savebutton;
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")
	private WebElement newsalert;
	
	public ManageNewsPage clickOnManageNews() {
		pageutility.clickOnAnElement(managenews);
		return this;
	}
	
	public ManageNewsPage clickOnAddNewNews() {
		pageutility.clickOnAnElement(newbutton);
		return this;
	}
	
	public ManageNewsPage enterTheNewsInNewsField(String news) {
		pageutility.enterValueIntoElement(enterthenews, news);
		return this;
	}
	
	public ManageProductPage clickOnSaveButton() {
		pageutility.clickOnAnElement(savebutton);
		return new ManageProductPage(driver);
	}
	
	public boolean isAlertDisplayed() {
		return pageutility.isAnElementDisplayed(newsalert);
	}
	
}