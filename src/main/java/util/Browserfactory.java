package util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Browserfactory {
	   static WebDriver driver;
	   @Test
			public static WebDriver init() {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\vanga\\eclipse-workspace\\datadrivenXML\\driver1\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.get("https://techfios.com/billing/?ng=login/");
			return driver;
			}

	   public static void teardown() {
		   driver.close();
		   driver.quit();
		
	}
}
