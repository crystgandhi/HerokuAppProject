package herokuAppPageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageComponents {
	
	// Declare a public instance variable 'driver' of type WebDriver
	public WebDriver driver;
	public WebElement ele;
	// Constructor
	public HomePageComponents(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(tagName="h1")
	WebElement welcomeHeading;
	public String getHeading() {
		return welcomeHeading.getText();
	}
	@FindBy(xpath="//a[@id='logo']")
	WebElement logo;
	public String getLogoHeading() {
		return logo.getText();
	}
	@FindBy(xpath="//p[1]")
	WebElement paragraph1;
	public String getParagraph1() {
		return paragraph1.getText();
	}
	@FindBy(xpath="//p[2]")
	WebElement paragraph2;
	public String getParagraph2() {
		return paragraph2.getText();
	}
	@FindBy(xpath="//a[text()='Form']")
	WebElement formNavItem;
	public boolean getNavItem1() {
		return formNavItem.isDisplayed();
	}
	public void clickNavItem1() {
		formNavItem.click();
	}
	@FindBy(css="#navbarDropdownMenuLink")
	WebElement ddMenuLink;
	public boolean getDDLink() {
		return ddMenuLink.isDisplayed();
	}
	
	@FindBy(xpath="//div[@class='jumbotron-fluid']/li")
	List<WebElement> componentsList;
	public void getComponentsList() {
		for(int i=0; i<componentsList.size(); i++){
			System.out.println(i + componentsList.get(i).getText());
		}
		}
	
}
