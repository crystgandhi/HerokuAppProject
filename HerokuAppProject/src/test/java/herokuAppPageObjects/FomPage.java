package herokuAppPageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class FomPage {
  public WebDriver driver;
	public FomPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@placeholder='Enter first name']")
	WebElement fname;
	@FindBy(xpath="//input[@placeholder='Enter last name']")
	WebElement lname;
	@FindBy(css="#job-title")
	WebElement jobTitle;
	
	public void enterPersonalInformation() {
	JavascriptExecutor js =((JavascriptExecutor)driver);
	js.executeScript("arguments[0].value='John'", fname);
	js.executeScript("arguments[0].value='Smith'", lname);
	js.executeScript("arguments[0].value='Professor'", jobTitle);
	}
	@FindBy(xpath="//input[@value='radio-button-3']")
	WebElement education;
	@FindBy(xpath="//input[@id='checkbox-2']")
	WebElement sex;
	@FindBy(xpath="//select[@id='select-menu']")
	WebElement expereince;
	@FindBy(xpath="//input[@id='datepicker']")
	WebElement dateField;
	@FindBy(xpath="//a[contains(text(),'Submit')]")
	WebElement submitBtn;
	public void selectotherDetails(){
		education.click();
		sex.click();
		Select yearsOfExpereince=new Select(expereince);
		yearsOfExpereince.selectByIndex(2);
		JavascriptExecutor js =((JavascriptExecutor)driver);
		js.executeScript("arguments[0].value='11/12/2023'",dateField);
		submitBtn.click();
	}
		
	
}
