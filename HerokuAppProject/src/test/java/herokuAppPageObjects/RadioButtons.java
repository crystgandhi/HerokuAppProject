package herokuAppPageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RadioButtons {

	
	public WebDriver driver;
	public RadioButtons(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//h1")
	WebElement radioBtnHeading;
	public String getpageHeading() {
		return radioBtnHeading.getText();
	}
	@FindBy(xpath="//input[@value='option2']")
	WebElement radioBtn;
	public void clickRadBtn() {
		radioBtn.click();
	}
	
	@FindBy(css = "#navbarDropdownMenuLink")
	WebElement ddMenuLink;
	@FindBy(xpath = "//div[@class='dropdown-menu show']/a")
	List<WebElement> componentsList;

public void clickDDMenuLink() {
		ddMenuLink.click();
		for(int i=0; i<componentsList.size(); i++){
			if (componentsList.get(i).getText().equals("Page Scroll")) {
				componentsList.get(i).click();
			}
		
		}
	}
}
