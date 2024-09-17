package testscript;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Test;

import constants.Constants;
import pages.AdminUserPage;
import pages.LoginPage;
import pages.ManageNewsPage;
import pages.ManageProductPage;
import utilities.ExcelUtility;

public class ManageNewsTest extends Base {

	public AdminUserPage adminuserpage;
	public LoginPage loginpage;
	public ManageProductPage manageproductpage;
	public ManageNewsPage managenewspage;

	@Test(description = "Verify if user can add a new news in Manage News Page")
	public void verifyAlertIsDisplayedWhenNewNewsisEntered() throws IOException {
		String username = ExcelUtility.getStringData(1, 0, "LoginPage");
		String password = ExcelUtility.getStringData(1, 1, "LoginPage");
		String news = ExcelUtility.getStringData(1, 0, "ManageNewsPage");
		loginpage = new LoginPage(driver);
		loginpage.enterUsername(username).enterPassword(password);
		adminuserpage = loginpage.clickOnSignInButton();
		managenewspage = loginpage.clickOnManageNews();
		manageproductpage = managenewspage.clickOnAddNewNews().enterTheNewsInNewsField(news).clickOnSaveButton();
		boolean isalertdisplayed = managenewspage.isAlertDisplayed();
		assertTrue(isalertdisplayed, Constants.MANAGENEWSMESSAGE);
	}
}