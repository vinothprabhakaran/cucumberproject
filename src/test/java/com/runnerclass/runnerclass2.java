package com.runnerclass;

import com.pomadactin.pomanagerpage;





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

import com.pomadactin.roomdetails;

public class runnerclass2 extends base_class {
	
	public static void main(String[] args) throws InterruptedException, IOException, AWTException {
		//class method       key                        value/path
	//System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo\\eclipse-workspace\\Vinoth\\chrome\\chromedriver_win32\\chromedriver.exe");
		setbrowser("chrome");
	WebDriver vinoth=new ChromeDriver();
	vinoth.get("https://adactinhotelapp.com/");


	pomanagerpage sv = new pomanagerpage(vinoth);
sendInput(sv.getinstantVs().getusername(),"vinothprabhakaran");
sendInput(sv.getinstantVs().getpassword(), "vinovetri");
clickOn(sv.getinstantVs().getlogin());

dropDown(sv.getinstantVss().getlocation(), "byindex", "1");
dropDown(sv.getinstantVss().gethotels(), "byindex", "1");
dropDown(sv.getinstantVss().getroomtype(), "byindex", "1");
dropDown(sv.getinstantVss().getRoom_no(), "byindex", "1");
dropDown(sv.getinstantVss().getadult(),"byindex" , "1");
dropDown(sv.getinstantVss().getChildroom(), "byindex", "1");
clickOn(sv.getinstantVss().getSearch());
clickOn(sv.getinstantVsss().getPopup());
clickOn(sv.getinstantVsss().getComplete());
sendInput(sv.getinstantVsss().getFirstname(), "vinothprabhakaran");
sendInput(sv.getinstantVsss().getLastname(), "Arumugam");
sendInput(sv.getinstantVsss().getAddress(), "c29moscowroadaustralia");
sendInput(sv.getinstantVsss().getCardnum(), "1234567891111111");
dropDown(sv.getinstantVsss().getCardtype(), "byindex", "2");
dropDown(sv.getinstantVsss().getMonth(), "byindex", "8");
dropDown(sv.getinstantVsss().getYear(), "byindex", "12");
sendInput(sv.getinstantVsss().cvv, "123");
clickOn(sv.getinstantVsss().getBooknow());
Thread.sleep(6000);
clickOn(sv.getinstantVssss().getLog());

}
}


