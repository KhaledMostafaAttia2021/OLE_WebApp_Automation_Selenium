package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class AppsPage extends PageBase {
	public AppsPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//*[@id=\"action-dropdown-parent-Categories\"]/span[1]")
	WebElement categoriesMenu;
	@FindBy(linkText = "Education")
	WebElement educationOption;

	public void open_Categories_Menu() {
		clickButton(categoriesMenu);
		// action.moveToElement(categoriesMenu).perform();

	}

	public void open_Education_From_Categories_Menu() {

		clickButton(educationOption);

	}

//	@FindBy(xpath = "//*[@id=\"action-dropdown-parent-Categories\"]/span[1]")
//	WebElement categoriesMenu;
//
//	public void open_Categories_Menu() {
//
//		clickButton(categoriesMenu);
//
//	}
//
//	@FindBy(linkText = "Education")
//	WebElement educationOption;
//
//	public void open_Education_From_Categories_Menu() {
//		clickButton(educationOption);
//
//	}

}