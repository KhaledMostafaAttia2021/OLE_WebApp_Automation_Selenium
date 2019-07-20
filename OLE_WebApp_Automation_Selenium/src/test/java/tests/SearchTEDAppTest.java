package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import pages.AppsPage;
import pages.HomePage;
import pages.SearchAppPage;

public class SearchTEDAppTest extends TestBase {
	String TED_AppName = "TED";
	HomePage homeObject;
	AppsPage appsObject;
	SearchAppPage searchAppObject;

	@Test(priority = 1)
	// @Severity(SeverityLevel.CRITICAL)
	// @Description ("Search for TED Application")
	public void User_Can_Search_For_TED() throws InterruptedException {

		homeObject = new HomePage(driver);
		appsObject = new AppsPage(driver);
		searchAppObject = new SearchAppPage(driver);

		homeObject.open_Apps_Tab();

		Thread.sleep(1000);

		String AppsActualtext = driver.getCurrentUrl();

		Assert.assertEquals(AppsActualtext, "https://play.google.com/store/apps?hl=en");

		appsObject.open_Categories_Menu();

		appsObject.open_Education_From_Categories_Menu();

		Thread.sleep(1000);

		String EducationActualtext = driver.getCurrentUrl();
		Assert.assertEquals(EducationActualtext, "https://play.google.com/store/apps/category/EDUCATION?hl=en");

		searchAppObject.SearchApp(TED_AppName);

		Thread.sleep(1000);

		Assert.assertTrue(searchAppObject.tedAppIcon.isDisplayed());
		searchAppObject.open_TED_App();

		Thread.sleep(1000);
		String AppActualtext = driver.getCurrentUrl();
		Assert.assertEquals(AppActualtext, "https://play.google.com/store/apps/details?id=com.ted.android&hl=en");

	}

}
