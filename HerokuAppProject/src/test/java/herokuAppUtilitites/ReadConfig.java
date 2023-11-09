package herokuAppUtilitites;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {
	
	Properties prop;
	public ReadConfig() {
		prop = new Properties();
	File f=new File("./Configuration/config.properties");
	try {
		FileInputStream fis=new FileInputStream(f);
		try {
			prop.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	}
  public String getURL() {
		return prop.getProperty("url");
	}
}