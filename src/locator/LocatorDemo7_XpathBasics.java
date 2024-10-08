package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LocatorDemo7_XpathBasics {

	public static void main(String[] args) {
		// Create a driver session
				WebDriver driver=new EdgeDriver();
				driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");

				//email
				driver.findElement(By.xpath("//input[@placeholder='E-Mail Address']")).sendKeys("testmay2024@gmail.com");
				
				//password
				driver.findElement(By.xpath("//input[@type='password']")).sendKeys("test123");
				
				
				//login
				driver.findElement(By.xpath("//input[@value='Login']")).click();
				


	}

}
