package testscript;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Test;

import pages.ManageNewsPage;
import utilities.ExcelUtility;

public class ManageNewsTest extends Base{
	
	@Test(description = "Verify if user can add a new news in Manage News Page")
	public void verifyAlertIsDisplayedWhenNewNewsisEntered() throws IOException {
		String username = ExcelUtility.getStringData(1, 0, "LoginPage");
		String password = ExcelUtility.getStringData(1, 1, "LoginPage");
		String news = ExcelUtility.getStringData(1, 0, "ManageNewsPage");
		ManageNewsPage managenewspage = new ManageNewsPage(driver);
		managenewspage.enterUsernameOnUsernameField(username);
		managenewspage.enterPasswordOnPasswordField(password);
		managenewspage.clickOnSignInButton();
		managenewspage.clickOnManageNews();
		managenewspage.clickOnAddNewNews();
		managenewspage.enterTheNewsInNewsField(news);
		managenewspage.clickOnSaveButton();
		boolean isalertdisplayed = managenewspage.isAlertDisplayed();
		assertTrue(isalertdisplayed,"User is unable to enter a new news");
	}
}
