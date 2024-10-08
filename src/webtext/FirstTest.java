package webtext;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class FirstTest {

	public static void main(String[] args)
	{
		//launch a browser-create driver session
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.google.com");
		

	}

}
