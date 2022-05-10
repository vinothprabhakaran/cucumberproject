package com.pomadactin;




import org.openqa.selenium.WebDriver;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class loginpage {
public static WebDriver vinoth;
	
	@FindBy(id= "username")
public	WebElement username;
	@FindBy(id = "password")
public WebElement password;
	
	@FindBy(id = "login")
	public WebElement login;
		
	public loginpage(WebDriver vinoth2) {
		loginpage.vinoth=vinoth2;
		PageFactory.initElements(vinoth, this);
	}
	public WebElement getusername() {
		return username;
	}
	public WebElement getpassword() {
		return password;
	}
		public WebElement getlogin() {
			return login;
	}
	
	}


	



