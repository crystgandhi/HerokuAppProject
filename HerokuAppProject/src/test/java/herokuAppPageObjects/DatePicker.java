package herokuAppPageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DatePicker {
	
	public WebDriver driver;

	public DatePicker(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//h1")
	WebElement datepicker;
	@FindBy(xpath = "//input[@data-provide='datepicker']")
	WebElement dateField;
	

	  



}
