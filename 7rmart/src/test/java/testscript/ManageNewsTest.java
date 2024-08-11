package testscript;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import pages.ManageNewsPage;

public class ManageNewsTest extends Base{
	
	@Test
	public void verifyAlertIsDisplayedWhenNewNewsisEntered() {
	String username = "admin";
	String password = "admin";
	String news = "No new News";
	ManageNewsPage managenewspage = new ManageNewsPage(driver);
	managenewspage.enterUsernameOnUsernameField(username);
	managenewspage.enterPasswordOnPasswordField(password);
	managenewspage.clickOnSignInButton();
	managenewspage.clickOnManageNews();
	managenewspage.clickOnAddNewNews();
	managenewspage.enterTheNewsInNewsField(news);
	managenewspage.clickOnSaveButton();
	boolean isalertdisplayed = managenewspage.isAlertDisplayed();
	assertTrue(isalertdisplayed,"Alert is not displayed when a new news is entered");
	}
}
