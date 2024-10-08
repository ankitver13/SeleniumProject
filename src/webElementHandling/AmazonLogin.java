package webElementHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AmazonLogin {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		  driver.get("https://www.amazon.in");
		  driver.manage().window().maximize();
		  driver.manage().deleteAllCookies();
		  
		  //Enter item in the search box
		  WebElement searchitm = driver.findElement(By.id("twotabsearchtextbox"));
		  searchitm.sendKeys("Apple MacBook ");
		  
		  //Click on Search Button
		  driver.findElement(By.id("nav-search-submit-button")).click();
		  
		  //Click on Apple MacBook
		  WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[text()='Apple MacBook Air Laptop M1 chip, 13.3-inch/33.74 cm Retina Display, 8GB RAM, 256GB SSD Storage, Backlit Keyboard, FaceTime HD Camera, Touch ID. Works with iPhone/iPad; Space Grey']/..)[1]")));
		 driver.findElement(By.xpath("(//span[text()='Apple MacBook Air Laptop M1 chip, 13.3-inch/33.74 cm Retina Display, 8GB RAM, 256GB SSD Storage, Backlit Keyboard, FaceTime HD Camera, Touch ID. Works with iPhone/iPad; Space Grey']/..)[1]")).click();
		
		
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@title='Add to Shopping Cart' and @type='submit'])")));
		  //Click on Add to Cart Button
		  driver.findElement(By.xpath("(//input[@title='Add to Shopping Cart' and @type='submit'])")).click();
		  
		  //Click on Cart Button
		  //driver.findElement(By.xpath("//a[@id='nav-cart']")).click();
		  
	}  

}
