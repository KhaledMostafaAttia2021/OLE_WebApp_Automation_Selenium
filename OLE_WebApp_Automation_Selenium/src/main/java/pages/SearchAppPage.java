package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class SearchAppPage extends PageBase {
	public SearchAppPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(id = "gbqfq")
	WebElement searchTextBox;

	@FindBy(xpath = "//*[@id=\"gbqfb\"]/span")
	WebElement searchBtn;

	public void SearchApp(String AppName) {
		setTextElementText(searchTextBox, AppName);
		clickButton(searchBtn);
	}

	@FindBy(linkText = "TED")
	public WebElement tedAppIcon;

	public void open_TED_App() {
		clickButton(tedAppIcon);
	}

	@FindBy(linkText = "Facebook")
	public WebElement facebookAppIcon;

}