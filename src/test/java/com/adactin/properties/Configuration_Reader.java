package com.adactin.properties;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Configuration_Reader {
public Properties p ;
	public Configuration_Reader() throws IOException {
		File f = new File("C:\\Users\\Lenovo\\eclipse-workspace\\cucumberproject\\src\\test\\java\\com\\adactin\\properties\\adaptin.properties");
FileInputStream fis = new FileInputStream(f);
 p = new Properties();
p.load(fis);

}
public String getBrowser() {
	String browser = p.getProperty("browser");
return browser;
}	
public String getUrl() {
	String Url = p.getProperty("url");
return Url;
}
	}