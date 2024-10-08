package flipkart;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FlipkartLogin {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		  driver.get("https://www.flipkart.com");
		  driver.manage().window().maximize();
		  driver.manage().deleteAllCookies();
		  
		  
		//Login
		  WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		//  wait.until(ExpectedConditions.visibilityOfElementLocated(By.Class("//div[@class='H6-NpN _3N4_BX']")));
		 // driver.findElement(By.Class("//div[@class='H6-NpN _3N4_BX']"));
		 
		  
		 
	}

}
