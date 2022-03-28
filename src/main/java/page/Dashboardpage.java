package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class Dashboardpage {
	WebDriver driver;
public Dashboardpage(WebDriver driver) {
	this.driver=driver;
}
@FindBy(how=How.XPATH,using="//*[@id=\"page-wrapper\"]/div[2]/div/h2") WebElement dashboardElement;
@FindBy(how=How.XPATH,using="//*[@id=\"side-menu\"]/li[3]/a") WebElement customerElement;
@FindBy(how=How.XPATH,using="//*[@id=\"side-menu\"]/li[3]/ul/li[1]/a") WebElement Addcustomerelement;
@FindBy(how=How.XPATH,using="*[@id=\"side-menu\"]/li[3]/ul/li[2]/a") WebElement Listcustomerelement;
public void dashboardcheck() {
	Assert.assertEquals("Dashboard", dashboardElement.getText());
	}
public void customersbutton() {
customerElement.click();
}
public void addcustomerbutton() {
	Addcustomerelement.click();
	
	
}
}
