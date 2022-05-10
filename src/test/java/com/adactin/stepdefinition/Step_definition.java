package com.adactin.stepdefinition;

import java.awt.List;
import java.util.Map;

import com.adactin.baseclass.base_class;
import com.adactin.properties.File_readManager;
import com.pomadactin.pomanagerpage;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step_definition extends base_class {

	
	public static pomanagerpage sv = new pomanagerpage(vinoth);
@Given("^User Launch The Application In The Browser$")
public void user_Launch_The_Application_In_The_Browser() throws Throwable {
	String url = File_readManager.GetinstantFIR().GetInstantCR().getUrl();
    getUrl(url);
}
//
//
////
//@When("^User Enter \"([^\"]*)\"  in The Username Field$")
//public void user_Enter_in_The_Username_Field(String Username) throws Throwable {
//   sendInput(sv.getinstantVs().getusername(), Username);
//  	
//	}
//
//
//
//@When("^User Enter \"([^\"]*)\" In The Password Field$")
//public void user_Enter_In_The_Password_Field(String Password ) throws Throwable {
//   sendInput(sv.getinstantVs().getpassword(),Password );
//}


@When("^User Enter The Below \"([^\"]*)\" and \"([^\"]*)\"$")
public void user_Enter_The_Below_and(String Username, String Password ) throws Throwable {
    
	
   sendInput(sv.getinstantVs().getusername(), Username);
   sendInput(sv.getinstantVs().getpassword(), Password);
}

@When("^User check The Credintials$")
public void user_check_The_Credintials() throws Throwable {
    
}

@Then("^User Click The Login Page It Navigate To The Search Hotel Page$")
public void user_Click_The_Login_Page_It_Navigate_To_The_Search_Hotel_Page() throws Throwable {
	clickOn(sv.getinstantVs().getlogin());
}



























//
//
//@When("^User Enter \"([^\"]*)\" O in The Username Field$")
//public void user_Enter_O_in_The_Username_Field(String arg1) throws Throwable {
//	 sendInput(sv.getinstantVs().getusername(), "vinothprabhakaran");
//}
//
//@When("^User Enter \"([^\"]*)\" In The Password Field$")
//public void user_Enter_In_The_Password_Field(String arg1) throws Throwable {
//	sendInput(sv.getinstantVs().getpassword(), "vinovetri");
//}
//

//
//
//@When("^User Enter The Valid User Name Or Valid Mail Id in The Username Field$")
//public void user_Enter_The_Valid_User_Name_Or_Valid_Mail_Id_in_The_Username_Field() throws Throwable {
//   sendInput(sv.getinstantVs().getusername(), "vinothprabhakaran");
//}
//
//@When("^User Enter The Valid Password In The Password Field$")
//public void user_Enter_The_Valid_Password_In_The_Password_Field() throws Throwable {
//   sendInput(sv.getinstantVs().getpassword(), "vinovetri");
//}

//
//@When("^User Enter The \"([^\"]*)\" Id in The Username Field$")
//public void user_Enter_The_Id_in_The_Username_Field(String username) throws Throwable {
//    sendInput(sv.getinstantVs().username, username);
//}
//
//@When("^User Enter The \"([^\"]*)\" In The Password Field$")
//public void user_Enter_The_In_The_Password_Field(String password) throws Throwable {
//    sendInput(sv.getinstantVs().getpassword(), password);
//}

//
//
//@Then("^User Click The Login Button And It Navigate To The Search Hotel Page$")
//public void user_Click_The_Login_Button_And_It_Navigate_To_The_Search_Hotel_Page() throws Throwable {
//    clickOn(sv.getinstantVs().getlogin());
//}
//


@When("^User the select the location that are given in the location Field$")
public void user_the_select_the_location_that_are_given_in_the_location_Field() throws Throwable {
	dropDown(sv.getinstantVss().getlocation(), "byindex", "1");
}

@When("^User Select The Hotels That Are Given In The Hotels  Field$")
public void user_Select_The_Hotels_That_Are_Given_In_The_Hotels_Field() throws Throwable {
	dropDown(sv.getinstantVss().gethotels(), "byindex", "1");
}

@When("^User Select The Room type That Are Available in Room Type Field$")
public void user_Select_The_Room_type_That_Are_Available_in_Room_Type_Field() throws Throwable {
	dropDown(sv.getinstantVss().getroomtype(), "byindex", "1");
}

@When("^User Select How Many Room That User Wants In Number Of Rooms Field$")
public void user_Select_How_Many_Room_That_User_Wants_In_Number_Of_Rooms_Field() throws Throwable {
	dropDown(sv.getinstantVss().getRoom_no(), "byindex", "1");
}

@When("^User Select Enter The Valid Check In Date IN Check In Field$")
public void user_Select_Enter_The_Valid_Check_In_Date_IN_Check_In_Field() throws Throwable {
    
}

@When("^User Select Enter The Valid Check Out Date IN Check Out Field$")public void user_Select_Enter_The_Valid_Check_Out_Date_IN_Check_Out_Field() throws Throwable {
  
}

@When("^User Select The How Many Adults Per Room In Adults Per Room Field$")
public void user_Select_The_How_Many_Adults_Per_Room_In_Adults_Per_Room_Field() throws Throwable {
	dropDown(sv.getinstantVss().getadult(),"byindex" , "1");
}

@When("^User Select The How Many Children Per Room In Children Per Room Field$")
public void user_Select_The_How_Many_Children_Per_Room_In_Children_Per_Room_Field() throws Throwable {
	dropDown(sv.getinstantVss().getChildroom(), "byindex", "1");
}

@Then("^User Click The Search Button and It Navigate to Search Hotel Page$")
public void user_Click_The_Search_Button_and_It_Navigate_to_Search_Hotel_Page() throws Throwable {
	clickOn(sv.getinstantVss().getSearch());
}



@When("^User Enter Into The Search hotel page user select radio button$")
public void user_Enter_Into_The_Search_hotel_page_user_select_radio_button() throws Throwable {
	clickOn(sv.getinstantVsss().getPopup());
}

@When("^Click The Continue Then It Navigate To Book Hotel Page$")
public void click_The_Continue_Then_It_Navigate_To_Book_Hotel_Page() throws Throwable {
	clickOn(sv.getinstantVsss().getComplete());
}

@When("^User Enter The Valid First Name In The First Name Field$")
public void user_Enter_The_Valid_First_Name_In_The_First_Name_Field() throws Throwable {
	sendInput(sv.getinstantVsss().getFirstname(), "vinothprabhakaran");
}

@When("^User Enter The Valid Last Name In The Last Name Field$")
public void user_Enter_The_Valid_Last_Name_In_The_Last_Name_Field() throws Throwable {
	sendInput(sv.getinstantVsss().getLastname(), "Arumugam");
}

@When("^User Enter The Valid Address In Address Field$")
public void user_Enter_The_Valid_Address_In_Address_Field() throws Throwable {
	sendInput(sv.getinstantVsss().getAddress(), "c29moscowroadaustralia");
}

@When("^User Enter The Valid (\\d+) Digit Credit Card Number In Credit Card Number Field$")
public void user_Enter_The_Valid_Digit_Credit_Card_Number_In_Credit_Card_Number_Field(int arg1) throws Throwable {
	sendInput(sv.getinstantVsss().getCardnum(), "1234567891111111");
}

@When("^User Select The Card Type In  Credit Card Type Drop Down Field$")
public void user_Select_The_Card_Type_In_Credit_Card_Type_Drop_Down_Field() throws Throwable {
	dropDown(sv.getinstantVsss().getCardtype(), "byindex", "2");
}

@When("^User Select The Card ExpiryMonth In ExpiryMonth Drop Down Field$")
public void user_Select_The_Card_ExpiryMonth_In_ExpiryMonth_Drop_Down_Field() throws Throwable {
	dropDown(sv.getinstantVsss().getMonth(), "byindex", "8");
}

@When("^User Select The Card ExpiryYear In ExpiryYear Drop Down Field$")
public void user_Select_The_Card_ExpiryYear_In_ExpiryYear_Drop_Down_Field() throws Throwable {
	dropDown(sv.getinstantVsss().getYear(), "byindex", "12");
}

@When("^User Enter The Valid CVV Number In CVV Field$")
public void user_Enter_The_Valid_CVV_Number_In_CVV_Field() throws Throwable {
	sendInput(sv.getinstantVsss().cvv, "123");
}

@Then("^User Click The Book Now Button And It Navigate To Booking Confirmation Page$")
public void user_Click_The_Book_Now_Button_And_It_Navigate_To_Booking_Confirmation_Page() throws Throwable {
	clickOn(sv.getinstantVsss().getBooknow());
}



@When("^Hotel Booking Is Done It Take Some Time To Conformation$")
public void hotel_Booking_Is_Done_It_Take_Some_Time_To_Conformation() throws Throwable {
    wait1(30);
}

@Then("^Hotel Booking Confirmed Then User Click The Logout Button And It Navigate To Login Page$")
public void hotel_Booking_Confirmed_Then_User_Click_The_Logout_Button_And_It_Navigate_To_Login_Page() throws Throwable {
    clickOn(sv.getinstantVssss().getLog());
}

	
}





































