package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class HomePage extends PageBase {
	public HomePage(WebDriver driver) {
		super(driver);
		jse = (JavascriptExecutor) driver;
		action = new Actions(driver);
	}

	//@FindBy(linkText = "Google Play Logo")
	//WebElement homeBtn;

	//public void open_Home_Page() {
	//	clickButton(homeBtn);
	//}

	@FindBy(linkText = "Apps")
	WebElement appsTab;

	public void open_Apps_Tab() {
		clickButton(appsTab);
	}

}