package webtext;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class GoogleTitleValidation {

	public static void main(String[] args) {
		
		//ctrl+shift+o---> To import the classes
		
		// Create a driver session
		WebDriver driver=new EdgeDriver(); 
		
		//Open Google application
		driver.get("https://www.google.com");
		
		//To get title from application- getTitle()
		String actTitle=driver.getTitle();
		System.out.println("Title is: "+actTitle);
		
		//validate title with expected title
		if(actTitle.equals("Google")) 
		{
			System.out.println("Test Pass......Title matched!");
		}else
		{
			System.out.println("Test Fail......Title not matched!");
		}
		
		//close the browser
		   driver.close();
		
		   //driver.quit();
			

	}

}
