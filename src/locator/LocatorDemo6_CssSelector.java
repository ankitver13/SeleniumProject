package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LocatorDemo6_CssSelector {

	public static void main(String[] args) {
		// Create a driver session
				WebDriver driver=new EdgeDriver();
				
				driver.get("https://www.saucedemo.com/");
				
				//username-tagname with id
				driver.findElement(By.cssSelector("input#user-name")).sendKeys("standard_user");
				
				//password-tagname with attribute
				driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("secret_sauce");
				
				//login-tagname with classname
				//driver.findElement(By.cssSelector("input.submit-button")).click();
				
				driver.findElement(By.cssSelector("input#login-button.submit-button[type='submit']")).click();


	}

}
