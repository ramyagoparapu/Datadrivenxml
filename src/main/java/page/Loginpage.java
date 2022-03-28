package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Loginpage {
WebDriver driver;
public Loginpage(WebDriver driver) {
	this.driver=driver;
}
@FindBy(how = How.XPATH,using ="//*[@id=\"username\"]") WebElement usernameboxElement;
@FindBy(how = How.XPATH,using ="//*[@id=\"password\"]") WebElement passwordboxElement;
@FindBy(how =How.XPATH,using ="/html/body/div/div/div/form/div[3]/button") WebElement submitElement;

public void enterusername(String username) {
	usernameboxElement.sendKeys(username);
}
public void enterpassword(String password) {
	passwordboxElement.sendKeys(password);
}
	public void clicksubmit() {
		submitElement.click();;

	}
}