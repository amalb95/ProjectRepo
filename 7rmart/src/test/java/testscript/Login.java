package testscript;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Login extends Base{
	public void login() {
	String username="admin";
	String password = "admin";
	WebElement uname = driver.findElement(By.xpath("//input[@placeholder='Username']"));
	WebElement pass = driver.findElement(By.xpath("//input[@placeholder='Password']"));
	WebElement login = driver.findElement(By.xpath("//button[text()='Sign In']"));
	uname.sendKeys(username);
	pass.sendKeys(password);
	login.click();
	WebElement adminimage = driver.findElement(By.xpath("//img[@src='https://groceryapp.uniqassosiates.com/public/assets/admin/dist/img/avatar5.png']"));
	boolean isHomePageavailable = adminimage.isDisplayed();
	assertTrue(isHomePageavailable,"HomePage not loaded");
	}
}