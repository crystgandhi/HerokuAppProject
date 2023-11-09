package herokuAppPageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DragTheImage {

	public WebDriver driver;
	// Constructor
	public DragTheImage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//h1")
	WebElement dragImageHeading;
	public String getDragImageHeading() {
		return dragImageHeading.getText();
	}

	@FindBy(xpath = "//div[@id='image']")
	WebElement img;
	@FindBy(xpath = "//div[@id='box']")
	WebElement box;
	public void moveImage() {
		Actions action=new Actions(driver);
		action.moveToElement(img);
		action.dragAndDrop(img, box);
	}

	
}
