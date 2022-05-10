package com.pomadactin;



import org.openqa.selenium.WebDriver;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class logoutpage {
public static WebDriver vinoth;
	
	@FindBy(id="logout")
public	WebElement log;

	public logoutpage(WebDriver vinoth2) {
		this.vinoth=vinoth2;
		PageFactory.initElements(vinoth, this);
	
	}

	public WebElement getLog() {
		return log;
	}
}
