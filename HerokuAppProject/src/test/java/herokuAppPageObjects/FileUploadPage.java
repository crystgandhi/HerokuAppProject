package herokuAppPageObjects;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FileUploadPage {

	// Declare a public instance variable 'driver' of type WebDriver
	public WebDriver driver;

	// Constructor for the FileUploadPage class, taking a WebDriver object as a
	// parameter
	public FileUploadPage(WebDriver driver) {
		// Assign the WebDriver object passed as a parameter to the class variable
		// 'driver'
		this.driver = driver;
		// Initialize the elements on the page using PageFactory
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//h1")
	WebElement fileUploadPageHeading;
	// A method for getting the text from the located element
	public String getFileUploadPageHeading() {
		return fileUploadPageHeading.getText();
	}

	@FindBy(xpath = "//button[text()='Choose']")
	WebElement chooseBtn;
    //Click choose Button
	public void clickChooseBtn() {
		chooseBtn.click();
		String autoItScriptPath = "./AutoItFiles\\Upload.exe";
		try {
			Runtime.getRuntime().exec(autoItScriptPath);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@FindBy(xpath = "//button[contains(text(),'Reset')]")
	WebElement resetBtn;

	public void clickResetBtn() {
		resetBtn.click();
	}

	@FindBy(css = "#navbarDropdownMenuLink")
	WebElement ddMenuLink;
	@FindBy(xpath = "//div[@class='dropdown-menu show']/a")
	List<WebElement> componentsList;

	public void clickDDMenuLink() {
		ddMenuLink.click();
		System.out.println(componentsList.size());
		for (int i = 0; i < componentsList.size(); i++) {
			if (componentsList.get(i).getText().equals("Drag and Drop")) {
				componentsList.get(i).click();
			}

		}
	}

}
