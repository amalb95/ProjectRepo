package testscript;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.LoginPage;
import utilities.ExcelUtility;

public class LoginTest extends Base{
	@Test(description = "Verify if a user is able to login using valid username and a valid password",groups = {"Regression"})
	public void verifyTheUserIsAbleToLoginUsingvalidCredentials() throws IOException {
		String username = ExcelUtility.getStringData(1, 0, "LoginPage");
		String password = ExcelUtility.getStringData(1, 1, "LoginPage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsernameOnUsernameField(username);
		loginpage.enterPasswordOnPasswordField(password);
		loginpage.clickOnSignInButton();
		boolean ishomepageloaded = loginpage.isHomePageLoaded();
		assertTrue(ishomepageloaded,"Homepage is not loaded when user enters valid credentials");
	}
	
	@Test(retryAnalyzer = retry.Retry.class,  description = "Verify that a user is not able to login if he uses an incorrect username",groups= {"Smoke"})
	public void verifyTheUserIsNotAbleToLoginUsingInvalidUsername() throws IOException {
		String username = ExcelUtility.getStringData(2, 0, "LoginPage");
		String password = ExcelUtility.getStringData(2, 1, "LoginPage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsernameOnUsernameField(username);
		loginpage.enterPasswordOnPasswordField(password);
		loginpage.clickOnSignInButton();
		boolean ishomepageloaded = loginpage.isHomePageNotLoaded();
		assertTrue(ishomepageloaded,"Homepage is loaded when user enters invalid username and valid password");
	}
	
	@Test(retryAnalyzer = retry.Retry.class, description = "Verify that a user is not able to login using a valid username and an invalid password")
	public void verifyTheUserIsNotAbleToLoginUsingInvalidPassword() throws IOException {
		String username = ExcelUtility.getStringData(3, 0, "LoginPage");
		String password = ExcelUtility.getStringData(3, 1, "LoginPage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsernameOnUsernameField(username);
		loginpage.enterPasswordOnPasswordField(password);
		loginpage.clickOnSignInButton();
		boolean ishomepageloaded = loginpage.isHomePageNotLoaded();
		assertTrue(ishomepageloaded,"Homepage is loaded when user enters valid username and invalid password");
	}
	
	@Test(dataProvider = "LoginProvider",description = "Verify that a user is not able to login when entering an invalid username and invalid password")
	public void verifyTheUserIsNotAbleToLoginUsingInvalidCredentials(String username, String password) throws IOException {
		//String username = ExcelUtility.getStringData(3, 0, "LoginPage");
		//String password = ExcelUtility.getStringData(3, 1, "LoginPage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsernameOnUsernameField(username);
		loginpage.enterPasswordOnPasswordField(password);
		loginpage.clickOnSignInButton();
		boolean ishomepageloaded = loginpage.isHomePageNotLoaded();
		assertTrue(ishomepageloaded,"Homepage is loaded when user enters invalid credentials");
	}
	
	@DataProvider(name = "LoginProvider")
		public Object[][] getDataFromTestData() throws IOException {
			return new Object[][] {{
				ExcelUtility.getStringData(3, 0, "LoginPage"), ExcelUtility.getStringData(3, 1, "LoginPage") },};	
		}
	}
