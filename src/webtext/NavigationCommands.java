package webtext;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class NavigationCommands {

	public static void main(String[] args) {
		// Create a driver session
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.google.com");
		
		//Navigate to facebook
		driver.navigate().to("https://www.facebook.com");
		
		//Thread.sleep(2000);
		
		//Go back-->back()
		driver.navigate().back();
		
		//Thread.sleep(2000);
		
		//Forward()
		driver.navigate().forward();
		
		//Thread.sleep(2000);
		
		
	}

}
