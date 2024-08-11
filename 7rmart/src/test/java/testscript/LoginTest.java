package testscript;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import pages.LoginPage;

public class LoginTest extends Base{
	@Test
	public void verifyTheUserIsAbleToLoginUsingvalidCredentials() {
		String username = "admin";
		String password = "admin";
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsernameOnUsernameField(username);
		loginpage.enterPasswordOnPasswordField(password);
		loginpage.clickOnSignInButton();
		boolean ishomepageloaded = loginpage.isHomePageLoaded();
		assertTrue(ishomepageloaded,"Homepage is not loaded when user enters valid credentials");
	}
	
	@Test
	public void verifyTheUserIsNotAbleToLoginUsingInvalidUsername() {
		String username = "user";
		String password = "admin";
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsernameOnUsernameField(username);
		loginpage.enterPasswordOnPasswordField(password);
		loginpage.clickOnSignInButton();
		boolean ishomepageloaded = loginpage.isHomePageNotLoaded();
		assertTrue(ishomepageloaded,"Homepage is loaded when user enters invalid username and valid password");
	}
	
	@Test
	public void verifyTheUserIsNotAbleToLoginUsingInvalidPassword() {
		String username = "admin";
		String password = "password";
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsernameOnUsernameField(username);
		loginpage.enterPasswordOnPasswordField(password);
		loginpage.clickOnSignInButton();
		boolean ishomepageloaded = loginpage.isHomePageNotLoaded();
		assertTrue(ishomepageloaded,"Homepage is loaded when user enters valid username and invalid password");
	}
	
	@Test
	public void verifyTheUserIsNotAbleToLoginUsingInvalidCredentials() {
		String username = "username";
		String password = "password";
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsernameOnUsernameField(username);
		loginpage.enterPasswordOnPasswordField(password);
		loginpage.clickOnSignInButton();
		boolean ishomepageloaded = loginpage.isHomePageNotLoaded();
		assertTrue(ishomepageloaded,"Homepage is loaded when user enters invalid credentials");
	}
}