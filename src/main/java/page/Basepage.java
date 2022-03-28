package page;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Basepage {
	public void waitforElement(WebDriver driver,int waittime,WebElement element) {
		WebDriverWait wait=new WebDriverWait(driver, waittime);
		wait.until(ExpectedConditions.visibilityOf(element));
		
	}
	public int random(int boundarynum) {
		Random random =new Random();
		return random.nextInt(boundarynum);
}
	public void dropdownelement(WebElement element, String visibletext) {
		Select select=new Select(element);
		select.selectByVisibleText(visibletext);
	}


}
