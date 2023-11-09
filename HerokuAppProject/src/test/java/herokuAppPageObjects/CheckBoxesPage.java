package herokuAppPageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckBoxesPage {
	public WebDriver driver;

	public CheckBoxesPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//h1")
	WebElement checkBoxPageHeading;

	public String getCheckBoxPageHeading() {
		return checkBoxPageHeading.getText();
	}

	@FindBy(xpath = "//input[@id='checkbox-2']")
	WebElement chkBox2;

	public void selectChkBox2() {
		chkBox2.click();
	}

	@FindBy(xpath = "//input[@id='checkbox-3']")
	WebElement chkBox3;

	public void selectChkBox3() {
		chkBox3.click();
	}
	@FindBy(css = "#navbarDropdownMenuLink")
	WebElement ddMenuLink;
	@FindBy(xpath = "//div[@class='dropdown-menu show']/a")
	List<WebElement> componentsList;

	public void clickDDMenuLink() {
		ddMenuLink.click();
		for (int i = 0; i < componentsList.size(); i++) {
			if (componentsList.get(i).getText().equals("Autocomplete")) {
				componentsList.get(i).click();
			}
		}
	}

}
