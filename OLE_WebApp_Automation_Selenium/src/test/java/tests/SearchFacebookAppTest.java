package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import pages.HomePage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.AppsPage;
import pages.HomePage;
import pages.SearchAppPage;

public class SearchFacebookAppTest extends TestBase {

	String Facebook_AppName = "Facebook";
	HomePage homeObject;
	AppsPage appsObject;
	SearchAppPage searchAppObject;

	@Test(priority = 2)
	// @Severity(SeverityLevel.CRITICAL)
	// @Description ("Search for Facebook Application")
	public void User_Can_Search_For_Facebook() throws InterruptedException {
		// homeObject = new HomePage(driver);

		searchAppObject = new SearchAppPage(driver);

		// homeObject.open_Home_Page();
		// Thread.sleep(1000);
		searchAppObject.SearchApp(Facebook_AppName);

		// Thread.sleep(1000);

		Assert.assertTrue(searchAppObject.facebookAppIcon.isDisplayed());

	}

}
