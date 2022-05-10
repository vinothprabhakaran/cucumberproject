package com.pomadactin;

import org.openqa.selenium.WebDriver;


public class pomanagerpage {
	public static WebDriver vinoth;
	private loginpage vs;//6
	private roomdetails vss;//5
	private detailspage vsss;//3
	private logoutpage vssss;//1

	
	public pomanagerpage (WebDriver vinoth2) {
		this.vinoth=vinoth2;
		
	}

	//public void pomangerpage (WebDriver vinoth2) {
		//pomanagerpage.vinoth=vinoth2;
	//	
		
		
	//}

	public loginpage getinstantVs() {
		vs = new loginpage(vinoth);
		return vs;
	}

	public roomdetails getinstantVss() {
		vss = new roomdetails(vinoth);
		return vss;
	}

	public detailspage getinstantVsss() {
		vsss = new detailspage(vinoth);
		return vsss;
	}

	public logoutpage getinstantVssss() {
		vssss = new logoutpage(vinoth);
		return vssss;
	}

	}

		
	














