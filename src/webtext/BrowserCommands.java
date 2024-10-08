package webtext;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BrowserCommands {

	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		//to get the title-getTitle
		System.out.println("Application title is: "+driver.getTitle());

	
		//To get the current url -getCurrentUrl()
		System.out.println("Application current url is: "+driver.getCurrentUrl());
	
		//To get the current page source- getPageSource()
		
		System.out.println(driver.getPageSource());
		
		//To close browser
		driver.quit();

	}

}
