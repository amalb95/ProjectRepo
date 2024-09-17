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
	
	@FindBy(xpath = "//a[contains(@href,'list-product') and contains(@class,'small')]")
	private WebElement manageproduct;
	@FindBy(xpath = "//a[contains(@class,'danger ')]")
	private WebElement deletebutton;
	@FindBy(xpath = "//div[@class ='alert alert-success alert-dismissible']")
	private WebElement deleteproductalert;
	
	public ManageProductPage clickOnManageProduct() {
		pageutility.clickOnAnElement(manageproduct);
		return this;
	}
	
	public ManageProductPage clickOnDeleteButton() {
		pageutility.clickOnAnElement(deletebutton);
		return this;
	}
	
	public ManageSubCategoryPage acceptDeleteAlert() {
		pageutility.acceptAlert(driver);
		return new ManageSubCategoryPage(driver);
	}
	
	public boolean isDeleteAlertDisplayed(){
		return pageutility.isAnElementDisplayed(deleteproductalert);
	}
}
