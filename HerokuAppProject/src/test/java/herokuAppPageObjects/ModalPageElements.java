package herokuAppPageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ModalPageElements {
	
	public WebDriver driver;

	public ModalPageElements(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//h1")
	WebElement ModalPageHeading;
	
	@FindBy(xpath="//form/button")
	WebElement formBtn;
	
	@FindBy(xpath="//h5")
	WebElement modalTitle;
	@FindBy(xpath="//div[@class='modal-body']")
	WebElement modalBody;
	@FindBy(xpath="//div/button[@id='ok-button']")
	WebElement okBtn;
	@FindBy(xpath="//div/button[@id='close-button']")
	WebElement closeBtn;
	

}
