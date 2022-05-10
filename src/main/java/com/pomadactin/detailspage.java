package com.pomadactin;



	import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class detailspage {
		public WebDriver vinoth;
	@FindBy(xpath=("//input[@name='radiobutton_0']"))
	public WebElement popup;
	@FindBy(id = "continue")
	public WebElement complete;
	@FindBy(name="first_name")
	public WebElement firstname;
	@FindBy(name="last_name")
	public WebElement lastname;
	
	@FindBy(id="address")
	public WebElement address;
	
	@FindBy(name="cc_num")
	public WebElement cardnum;

	@FindBy (id="cc_type")
	public WebElement cardtype;
	
	
	@FindBy (xpath=("//*[@id=\"cc_exp_month\"]"))
	public WebElement month;
	
	
	@FindBy (xpath=("//*[@id=\"cc_exp_year\"]"))
	public WebElement year;
	
	@FindBy(name="cc_cvv")
	public WebElement cvv;
	
	@FindBy (id="book_now")
	public WebElement booknow;
	
	public detailspage(WebDriver vinoth2) {
		this.vinoth=vinoth2;
		PageFactory.initElements(vinoth, this);
		
		
		
}

	public WebElement getPopup() {
		return popup;
	}

	public WebElement getComplete() {
		return complete;
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCardnum() {
		return cardnum;
	}

	public WebElement getCardtype() {
		return cardtype;
	}

	public WebElement getMonth() {
		return month;
	}

	public WebElement getYear() {
		return year;
	}

	public WebElement getCvv() {
		return cvv;
	}

	public WebElement getBooknow() {
		return booknow;
	}
}
	
	
	