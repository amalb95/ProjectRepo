package testscript;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Test;

import pages.LoginPage;
import utilities.ExcelUtility;

public class LoginTest extends Base{
	@Test
	public void verifyTheUserIsAbleToLoginUsingvalidCredentials() throws IOException {
		//String username = "admin";
		//String password = "admin";
		String username = ExcelUtility.getStringData(1, 0, "LoginPage");
		String password = ExcelUtility.getStringData(1, 1, "LoginPage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsernameOnUsernameField(username);
		loginpage.enterPasswordOnPasswordField(password);
		loginpage.clickOnSignInButton();
		boolean ishomepageloaded = loginpage.isHomePageLoaded();
		assertTrue(ishomepageloaded,"Homepage is not loaded when user enters valid credentials");
	}
	
	@Test
	public void verifyTheUserIsNotAbleToLoginUsingInvalidUsername() throws IOException {
		//String username = "user";
		//String password = "admin";
		String username = ExcelUtility.getStringData(2, 0, "LoginPage");
		String password = ExcelUtility.getStringData(2, 1, "LoginPage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsernameOnUsernameField(username);
		loginpage.enterPasswordOnPasswordField(password);
		loginpage.clickOnSignInButton();
		boolean ishomepageloaded = loginpage.isHomePageNotLoaded();
		assertTrue(ishomepageloaded,"Homepage is loaded when user enters invalid username and valid password");
	}
	
	@Test
	public void verifyTheUserIsNotAbleToLoginUsingInvalidPassword() throws IOException {
		//String username = "admin";
		//String password = "password";
		String username = ExcelUtility.getStringData(3, 0, "LoginPage");
		String password = ExcelUtility.getStringData(3, 1, "LoginPage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsernameOnUsernameField(username);
		loginpage.enterPasswordOnPasswordField(password);
		loginpage.clickOnSignInButton();
		boolean ishomepageloaded = loginpage.isHomePageNotLoaded();
		assertTrue(ishomepageloaded,"Homepage is loaded when user enters valid username and invalid password");
	}
	
	@Test
	public void verifyTheUserIsNotAbleToLoginUsingInvalidCredentials() throws IOException {
		//String username = "username";
		//String password = "password";
		String username = ExcelUtility.getStringData(3, 0, "LoginPage");
		String password = ExcelUtility.getStringData(3, 1, "LoginPage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsernameOnUsernameField(username);
		loginpage.enterPasswordOnPasswordField(password);
		loginpage.clickOnSignInButton();
		boolean ishomepageloaded = loginpage.isHomePageNotLoaded();
		assertTrue(ishomepageloaded,"Homepage is loaded when user enters invalid credentials");
	}
}