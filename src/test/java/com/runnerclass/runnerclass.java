
package com.runnerclass;



import java.awt.AWTException;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.adactin.baseclass.base_class;
import com.pomadactin.detailspage;
import com.pomadactin.loginpage;
import com.pomadactin.logoutpage;
import com.pomadactin.pomanagerpage;
import com.pomadactin.roomdetails;

public class runnerclass extends base_class {
	public static void main(String[] args) throws InterruptedException, IOException, AWTException {
		//class method       key                        value/path
	//System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo\\eclipse-workspace\\Vinoth\\chrome\\chromedriver_win32\\chromedriver.exe");
		setbrowser("chrome");
//	WebDriver vinoth=new ChromeDriver();
	vinoth.get("https://adactinhotelapp.com/");
	loginpage vs = new loginpage(vinoth);
WebElement username = vinoth.findElement(By.id("username"));
//	//username.sendKeys("vinothprabhakaran");
	sendInput(username, "vinothprabhakaran");
//	
	WebElement password = vinoth.findElement(By.id("password"));
	sendInput(password, "vinovetri");
//	//password.sendKeys("vinovetri");
	WebElement login = vinoth.findElement(By.id("login"));
//	//login.click();
	clickOn(login);
//	
//	//   2nd page
	roomdetails vss=new roomdetails(vinoth);
	WebElement location = vinoth.findElement(By.id("location"));
 dropDown(location, "byindex", "1");
////	Select s = new Select(location);
//	dropDown(location, "byindex", "1");
////	s.selectByIndex(1);
//	
//	
	WebElement hotels = vinoth.findElement(By.id("hotels"));
	dropDown(hotels, "byindex", "1");
//	//Select t = new Select(hotels);
////	t.selectByIndex(1);
//
//	
	WebElement roomtype = vinoth.findElement(By.id("room_type"));
	dropDown(roomtype, "byindex", "1");
//	//Select v = new Select(roomtype);
//	//v.selectByIndex(1);
//	
//	
	WebElement room_no = vinoth.findElement(By.id("room_nos"));
	dropDown(room_no, "byindex", "1");
//	//Select b = new Select(room_no);
//	//b.selectByIndex(1);
//	
//	
	WebElement adult = vinoth.findElement(By.id("adult_room"));
	dropDown(adult, "byindex", "1");
//	//Select e = new Select(adult);
//	//e.selectByIndex(1);
//	
	WebElement childroom = vinoth.findElement(By.id("child_room"));
	dropDown(childroom, "byindex", "1");
//	//Select g = new Select(childroom);
//	//g.selectByIndex(1);
//	
WebElement search = vinoth.findElement(By.id("Submit"));
//    //search.click();
clickOn(search);
//	
//	
//	//3rdpage
	detailspage vsss = new detailspage(vinoth);
	WebElement popup = vinoth.findElement(By.xpath("//input[@name='radiobutton_0']"));
//	//popup.click();
	clickOn(popup);
//	
//	
	WebElement complete = vinoth.findElement(By.id("continue"));
complete.click();
//	clickOn(complete);
//	
//	//4th page
//	
	WebElement firstname = vinoth.findElement(By.name("first_name"));
sendInput(firstname, "vinothprabhakaran");
////	firstname.sendKeys("vinothprabhakaran");
//	
	WebElement lastname = vinoth.findElement(By.name("last_name"));
	sendInput(lastname, "Arumugam");
//	//lastname.sendKeys("Arumugam");
//	
	WebElement address = vinoth.findElement(By.name("address"));  
	sendInput(address, "c29moscowroad australia");
//	//address.sendKeys("c29moscowroad australia");
//	
	WebElement cardnum = vinoth.findElement(By.name("cc_num"));  
	sendInput(cardnum,"1234567891111111" );
 //cardnum.sendKeys("1234567891111111");
	
	WebElement cardtype= vinoth.findElement(By.xpath("//*[@id=\"cc_type\"]"));
	dropDown( cardtype, "byindex", "2");
	//Select y = new Select(cardtype);
//y.selectByIndex(2);

	WebElement month= vinoth.findElement(By.xpath("//*[@id=\"cc_exp_month\"]"));
	dropDown( month, "byindex", "8");
//Select l = new Select(month);
//l.selectByIndex(8);
	
	WebElement year= vinoth.findElement(By.xpath("//*[@id=\"cc_exp_year\"]"));

	dropDown(year, "byindex", "12");
//Select m = new Select(year);
//m.selectByIndex(12);
//	
WebElement cvv = vinoth.findElement(By.name("cc_cvv"));  
sendInput(cvv, "126");
//cvv.sendKeys("126");

	WebElement booknow = vinoth.findElement(By.xpath("//*[@id=\"book_now\"]"));  
	clickOn(booknow);
//	booknow.click();
	
	
//5th page
	Thread.sleep(6000);
	logoutpage vssss= new logoutpage(vinoth);
	WebElement log = vinoth.findElement(By.xpath("//*[@id=\"logout\"]"));
	clickOn(log);
//log.click()
	
//	Thread.sleep(6000);
//	pomanagerpage sv = new pomanagerpage(vinoth);
//	sendInput(sv.getinstantVs().getusername(),"vinothprabhakaran");
//	sendInput(sv.getinstantVs().getpassword(), "vinovetri");
//	clickOn(sv.getinstantVs().getlogin());
//	
//	dropDown(sv.getinstantVss().getlocation(), "byindex", "1");
//	dropDown(sv.getinstantVss().gethotels(), "byindex", "1");
//	dropDown(sv.getinstantVss().getroomtype(), "byindex", "1");
//	dropDown(sv.getinstantVss().getRoom_no(), "byindex", "1");
//	dropDown(sv.getinstantVss().getadult(),"byindex" , "1");
//	dropDown(sv.getinstantVss().getChildroom(), "byindex", "1");
//	clickOn(sv.getinstantVss().getSearch());
//	clickOn(sv.getinstantVsss().getPopup());
//	clickOn(sv.getinstantVsss().getComplete());
//	sendInput(sv.getinstantVsss().getFirstname(), "vinothprabhakaran");
//	sendInput(sv.getinstantVsss().getLastname(), "Arumugam");
//	sendInput(sv.getinstantVsss().getAddress(), "c29moscowroadaustralia");
//	sendInput(sv.getinstantVsss().getCardnum(), "1234567891111111");
//	dropDown(sv.getinstantVsss().getCardtype(), "byindex", "1");
//	dropDown(sv.getinstantVsss().getMonth(), "byindex", "8");
//	dropDown(sv.getinstantVsss().getYear(), "byindex", "12");
//	sendInput(sv.getinstantVsss().cvv, "123");
//	clickOn(sv.getinstantVsss().getBooknow());
//	Thread.sleep(6000);
//	clickOn(sv.getinstantVssss().getLog());
//	
	}
}
//	
//	
//	
//	
//	
//	
//	
	
	
	
	
	
	
	
	



