package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.annotations.TestInstance;

import page.Dashboardpage;
import page.Loginpage;
import util.Browserfactory;

public class Logintest {
	WebDriver driver;
	

	
	@Parameters({"Username","Password"})
	public void usershouldbeabletologin(String username,String password) {
		
	driver=Browserfactory.init();
	Loginpage lp=PageFactory.initElements(driver, Loginpage.class);
	Dashboardpage dp=PageFactory.initElements(driver, Dashboardpage.class);
	lp.enterusername(username);
	lp.enterpassword(password);
	lp.clicksubmit();
	dp.dashboardcheck();
	//Browserfactory.teardown();
	

	}

}
