package com.pomadactin;





	import org.openqa.selenium.WebDriver;


	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class roomdetails {
		public WebDriver vinoth;
	@FindBy(id = "location")
	public WebElement location;
	@FindBy(id = "hotels")
	public WebElement hotels;
	@FindBy(id="room_type")
	public WebElement roomtype;
	@FindBy(id="room_nos")
	public WebElement room_no;
	
	@FindBy(id="adult_room")
	public WebElement adult;
	
	@FindBy(id="child_room")
	public WebElement childroom;
	
	@FindBy(id="Submit")
	public WebElement search;

	public roomdetails(WebDriver vinoth2) {
		this.vinoth=vinoth2;
		PageFactory.initElements(vinoth, this);
	}
	public WebElement getlocation() {
		return location;
	}
	public WebElement gethotels() {
		return hotels;
	}
	public WebElement getroomtype() {
		return roomtype;
			
	}
	
	public WebElement getRoom_no() {
		return room_no;
	}
	
	
	public WebElement getadult() {
		return adult;
	}
	
	public WebElement getChildroom() {
		return childroom;
	}

	

	
	public WebElement getSearch() {
		return search;
	}

	}


