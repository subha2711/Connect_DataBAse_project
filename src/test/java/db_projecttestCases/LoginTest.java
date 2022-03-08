package db_projecttestCases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import base.TestBase;
import page.DatabasePage;
import page.LoginPage;

public class LoginTest extends TestBase {
	LoginPage loginpageObj;
	SoftAssert softAssert = new SoftAssert();

	@BeforeMethod
	public void setUp() {
		init();
		loginpageObj = PageFactory.initElements(driver, LoginPage.class);
	}

	//WebDriver driver;

	@Test(priority = 1)
	public void loginTest() throws Throwable {

		loginpageObj.enterUserName(DatabasePage.getData("username"));
		Thread.sleep(2000);
		loginpageObj.enterPassword(DatabasePage.getData("password"));
		Thread.sleep(2000);

		loginpageObj.clickSignInButton();
		takeScreenshotAtEndOftest(driver);
	}
}
