package herokuappTest;

import java.time.Duration;
import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import herokuAppUtilitites.ReadConfig;

public class BaseClass {
	public WebDriver driver;
	ReadConfig readconfig=new ReadConfig();
	
	@BeforeTest
	public void setUp() {
		
		ChromeOptions options=new ChromeOptions();
		HashMap<String, Object> chromeprefs=new HashMap<String, Object>();
		chromeprefs.put("profile.default_content_settings.popups",0);
		options.addArguments("--disable-extensions");
		options.addArguments("--disable-popup-blocking");
		options.addArguments("--safebrowsing-disable-extension-blacklist");
        options.setExperimentalOption("prefs", chromeprefs);
		
		driver=new ChromeDriver(options);
		String url=readconfig.getURL();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

	
	@AfterTest
	public void teardown() {
		driver.quit();
	}
}
