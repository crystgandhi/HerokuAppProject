package herokuAppPageObjects;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EnabledDisabledElements {
	
	public WebDriver driver;

	public EnabledDisabledElements(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//h1")
	WebElement enabledDisabledHeading;
	public String getHeading() {
		return enabledDisabledHeading.getText();
	}
	
	@FindBy(xpath="//input[@id='disabledInput']")
	WebElement  disabledInput;
	public void enterTextinDisabledInput() {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].value='I am Disabled Input'", disabledInput);
	}
	@FindBy(id="input")
	WebElement enabledInput;
	
	public void enterTextinEnabledInput() {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].value='I am enabled Input'", enabledInput);
	}
	
	@FindBy(css = "#navbarDropdownMenuLink")
	WebElement ddMenuLink;
	@FindBy(xpath = "//div[@class='dropdown-menu show']/a")
	List<WebElement> componentsList;

public void clickDDMenuLink() {
		ddMenuLink.click();
		for(int i=0; i<componentsList.size(); i++){
			if (componentsList.get(i).getText().equals("Radio Button")) {
				componentsList.get(i).click();
			}
		
		}
	}
}
