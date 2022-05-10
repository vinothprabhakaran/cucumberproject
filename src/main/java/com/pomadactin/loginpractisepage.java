package com.pomadactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpractisepage {
@FindBy(id="username")
public WebElement username;
@FindBy(id="password")
public WebElement password;

private void loginpage(WebDriver vinoth) {
	loginpage.vinoth=vinoth2;
PageFactory.initElements(vinoth, this);

}


public WebElement getUsername() {
	return username;
}
public WebElement getPassword() {
	return password;
}





}
