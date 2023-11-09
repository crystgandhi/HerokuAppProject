package herokuAppPageObjects;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ScrollThePage {

	// Declare a public instance variable 'driver' of type WebDriver
	public WebDriver driver;
	// Constructor
	public ScrollThePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//h1")
	WebElement largePageContent;
	public String getScrollPageHeading() {
		return largePageContent.getText();
	}

	@FindBy(xpath = "(//input[contains(@class,'form-control')])[position()=1]")
	WebElement nameField;
	@FindBy(xpath="//input[@id='date']")
	WebElement date;
	
	public void enterName() {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);", nameField);
		synchronized(driver) {
			try {
				driver.wait(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		js.executeScript("arguments[0].value='Kathy Wilson'", nameField);
		js.executeScript("arguments[0].value='02/01/2008'", date);
	}
	
	@FindBy(css = "#navbarDropdownMenuLink")
	WebElement ddMenuLink;
	@FindBy(xpath = "//div[@class='dropdown-menu show']/a")
	List<WebElement> componentsList;

public void clickDDMenuLink() {
		ddMenuLink.click();
		for(int i=0; i<componentsList.size(); i++){
			if (componentsList.get(i).getText().equals("Switch Window")) {
				componentsList.get(i).click();
			}
		
		}
	}
}
