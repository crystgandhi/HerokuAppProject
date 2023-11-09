package herokuAppPageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Autocompletepage {

	public WebDriver driver;

	public Autocompletepage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//h1")
	WebElement autocompletepageheading;

	public String getAutocompletePageHeading() {
		return autocompletepageheading.getText();
	}

	@FindBy(xpath = "//input[@id='autocomplete']")
	WebElement address;

	public void getAddress() {
		address.sendKeys("1092 OakLee Dr");
	}

	@FindBy(xpath = "//input[@id='street_number']")
	WebElement streetAddress1;

	public void getStreetAddress1() {
		streetAddress1.sendKeys("1092 OakLee Dr");
	}

	@FindBy(xpath = "//input[@id='route']")
	WebElement streetAddress2;

	public void getStreetAddress2() {
		streetAddress2.sendKeys("Apt E");
	}

	@FindBy(css = "input[id='locality']")
	WebElement locality;

	public void getLocality() {
		locality.sendKeys("Baltimore");
	}

	@FindBy(css = "*[id='administrative_area_level_1']")
	WebElement state;

	public void getState() {
		state.sendKeys("Maryland");
	}

	@FindBy(css = "#postal_code")
	WebElement postalCode;

	public void getPostalCode() {
		postalCode.sendKeys("21044");
	}

	@FindBy(xpath = "//*[@placeholder='Country']")
	WebElement country;

	public void getCountry() {
		country.sendKeys("USA");
		
	}
	@FindBy(css = "#navbarDropdownMenuLink")
	WebElement ddMenuLink;
	@FindBy(xpath = "//div[@class='dropdown-menu show']/a")
	List<WebElement> componentsList;

	public void clickDDMenuLink() {
		ddMenuLink.click();
		for (int i = 0; i < componentsList.size(); i++) {
			if (componentsList.get(i).getText().equals("File Upload")) {
				componentsList.get(i).click();
			}
		}
	}

}
