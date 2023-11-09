package herokuAppPageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FormSubmited {
	public WebDriver driver;

	public FormSubmited(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "/html/body/div/div")
	WebElement submitedFormText;

	public String getText() {
		return submitedFormText.getText();
	}

	@FindBy(xpath = "//h1")
	WebElement submitedFormheading;

	public String getHeading() {
		return submitedFormheading.getText();
	}

	@FindBy(css = "#navbarDropdownMenuLink")
	WebElement ddMenuLink;
	@FindBy(xpath = "//div[@class='dropdown-menu show']/a")
	List<WebElement> componentsList;

public void clickDDMenuLink() {
		ddMenuLink.click();
		System.out.println(componentsList.size());
		for(int i=0; i<componentsList.size(); i++){
			if (componentsList.get(i).getText().equals("Enabled and disabled elements")) {
				componentsList.get(i).click();
			}
		
		}
	}
}
