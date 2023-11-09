package herokuAppPageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwitchWindow {
	
	// Declare a public instance variable 'driver' of type WebDriver

	public WebDriver driver;
	// Constructor
	public SwitchWindow(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//h1")
	WebElement switchWindowHeading;

	public String getWindowHeading() {
		return switchWindowHeading.getText();
	}

	@FindBy(id = "new-tab-button")
	WebElement newTab;

	public void openNewTab() {
		String oldTab = driver.getWindowHandle();
		newTab.click();
		driver.switchTo().window(oldTab);
		synchronized (driver) {
			try {
				driver.wait(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	@FindBy(css = "#alert-button")
	WebElement alertBtn;

	public void openAlertBox() {
		alertBtn.click();
		synchronized (driver) {
			try {
				driver.wait(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		driver.switchTo().alert().accept();
	}

	@FindBy(css = "#navbarDropdownMenuLink")
	WebElement ddMenuLink;
	@FindBy(xpath = "//div[@class='dropdown-menu show']/a")
	List<WebElement> componentsList;

	public void clickDDMenuLink() {
		ddMenuLink.click();
		for (int i = 0; i < componentsList.size(); i++) {
			if (componentsList.get(i).getText().equals("Checkbox")) {
				componentsList.get(i).click();
			}
		}
	}
}
