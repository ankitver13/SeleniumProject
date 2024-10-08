package com.Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {
	//1. Write a WebDriver script to navigate to a website and click on a specific link.

	public static void main(String[] args) {
		
		//Create a driver session
		 WebDriver driver=new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.manage().window().maximize();
		 
		 driver.get("https://viratkohli.foundation/");
		 System.out.println("Title of page1: "+driver.getTitle());
		 
		 //Navigating from Virat Kohli Foundation website--> HRX website
		 driver.navigate().to("https://hrxbrand.com/");
		 System.out.println("Title of page2: "+driver.getTitle());
		 
		 //Click on a specific link --- 
		 driver.findElement(By.xpath("//img[@class='m-auto h-260px object-cover cursor-pointer img-hover']")).click();

	}

}
