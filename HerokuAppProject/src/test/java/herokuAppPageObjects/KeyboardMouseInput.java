package herokuAppPageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KeyboardMouseInput {

	public WebDriver driver;

	public KeyboardMouseInput(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//h1")
	WebElement keyboardMouseInputHeading;
	
	@FindBy(xpath="//input[@id='name']")
	WebElement name;
	@FindBy(css="#button")
	WebElement Btn;
	
}
