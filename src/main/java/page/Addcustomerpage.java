package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class Addcustomerpage extends Basepage{
	WebDriver driver;
	
		@FindBy(how=How.XPATH,using="//h5[contains(text(),'Add Contact')]") WebElement addcontactheaderElement;
		@FindBy(how=How.XPATH,using="//*[@id=\"account\"]") WebElement fullnameElement;	
		@FindBy(how=How.XPATH,using="//*[@id=\"cid\"]") WebElement comapanynamElement;
	@FindBy(how=How.XPATH,using="//*[@id=\"email\"]") WebElement emailElement;
		@FindBy(how=How.XPATH,using="//*[@id=\"phone\"]") WebElement phoneElement;
@FindBy(how=How.XPATH,using="//*[@id=\"address\"]") WebElement adressElement;
		@FindBy(how=How.XPATH,using="//*[@id=\"city\"]") WebElement cityElement;
		@FindBy(how=How.XPATH,using="//*[@id=\"state\"]") WebElement stateElement;
	@FindBy(how=How.XPATH,using="//*[@id=\"zip\"]") WebElement zipElement;
	@FindBy(how=How.XPATH,using="//*[@id=\"country\"]") WebElement Countryelement;
	@FindBy(how=How.XPATH,using="//*[@id=\"submit\"]") WebElement submitElement;
	@FindBy(how=How.XPATH,using="//*[@id=\"application_ajaxrender\"]/a") WebElement summaryElement;
	@FindBy(how=How.XPATH,using="//*[@id=\"application_ajaxrender\"]/a") WebElement profilecustomerElement;
	@FindBy(how=How.XPATH,using="//*[@id=\"page-wrapper\"]/div[3]/div[1]/div/div/div[1]/a[1]") WebElement addcustomerlistcustomerElement;
	@FindBy(how=How.XPATH,using="//*[@id=\"foo_filter\"]") WebElement searchbarlistcustomerElement ;
	
	
	public void verifyaddcontactpage() {
		
	//	waitforElement(driver,10,addcontactheaderElement);
		Assert.assertEquals(addcontactheaderElement.getText(), "Add Contact");
	}
	
	public void insertfullname(String fullname) {
		int gennum=random(9999);
		
		fullnameElement.sendKeys(fullname);
	}
	public void insertcompany(String company) {
		
		dropdownelement(comapanynamElement,company);
	}
	public void insertemail(String email) {
		emailElement.sendKeys(random(9999)+email);
		}
	public void insertphone(String phone) {
		phoneElement.sendKeys(random(9999)+phone);
		}
	public void insertadress(String adress) {
		adressElement.sendKeys(random(9999)+adress);
		}
	public void insertcity(String city) {
		cityElement.sendKeys(city);
		}
	public void insertstate(String state) {
		stateElement.sendKeys(state);
		}
	public void insertzip(String zip) {
		zipElement.sendKeys(zip);
		}
	
public void insertcountry(String country) {
		dropdownelement(Countryelement,country);
	}




public void clicksubmit() {
	submitElement.click();
	}




}
//	}


