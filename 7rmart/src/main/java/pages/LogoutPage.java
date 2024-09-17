package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtility;

public class LogoutPage {
	WebDriver driver;
	PageUtility pageutility = new PageUtility();

	public LogoutPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//img[@src='https://groceryapp.uniqassosiates.com/public/assets/admin/dist/img/avatar5.png']")
	private WebElement adminImage;
	@FindBy(xpath = "//a[contains(@href,'logout') and contains(@class,'dropdown')]")
	private WebElement logout;
	@FindBy(xpath = "//button[text()='Sign In']")
	private WebElement loginButton;

	public LogoutPage clickOnAdminButton() {
		pageutility.clickOnAnElement(adminImage);
		return this;
	}

	public LogoutPage clickOnlogoutButton() {
		pageutility.clickOnAnElement(logout);
		return this;
	}

	public boolean isLoginButtonDisplayed() {
		return pageutility.isAnElementDisplayed(loginButton);
	}
}
