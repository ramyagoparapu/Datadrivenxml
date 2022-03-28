package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import page.Addcustomerpage;
import page.Dashboardpage;
import page.Loginpage;
import util.Browserfactory;

public class Addcustomertest {
WebDriver driver;
String username;
String password;
String Fullname;
String companyname;
String email;

String phone;
String Adress;
String city;

String country;
String state;
String zip;
@Test
@Parameters({"Username","Password","Fullname","companyname","email","phone","Adress","city","state","zip","country"})
public void validusershouldbeabletocreatecustomer(String username,String password,String Fullname,String companyname,String email,String phone,String Adress,String city,String state,String zip,String country) {
	driver=Browserfactory.init();
	Loginpage lp=PageFactory.initElements(driver, Loginpage.class);
	
	lp.enterusername(username);
	lp.enterpassword(password);
	lp.clicksubmit();
	Dashboardpage dp=PageFactory.initElements(driver, Dashboardpage.class);
	dp.dashboardcheck();
	dp.customersbutton();
	dp.addcustomerbutton();
	Addcustomerpage acp=PageFactory.initElements(driver, Addcustomerpage.class);
	acp.verifyaddcontactpage();
	acp.insertfullname(Fullname);
	acp.insertcompany(companyname);
	acp.insertemail(email);
	acp.insertphone(phone);
	acp.insertadress(Adress);
	acp.insertcity(city);
	acp.insertstate(state);
	acp.insertzip(zip);
	
	acp.insertcountry(country);
	
	
	acp.clicksubmit();
	
}
}
