package locator;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LocatorDemo4 {

	public static void main(String[] args) {
		//Create a driver session
				WebDriver driver=new EdgeDriver();
				
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
				driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
				
				//username
				driver.findElement(By.name("username")).sendKeys("Admin");


	}

}
