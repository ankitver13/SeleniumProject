package com.Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Registrationform {
	//4. Implement a test case using WebDriver to validate the functionality of a registration form.

	public static void main(String[] args) {
		
		//Create a driver session
		 WebDriver driver=new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.manage().window().maximize();
		 driver.get("https://www.instagram.com/");
		 
		 //Click on Signup Page
		 driver.findElement(By.xpath("(//span[@class='_ap3a _aaco _aacw _aad0 _aad7'])[1]")).click();
		 
		 WebElement fbBtn=driver.findElement(By.xpath("(//button[normalize-space()='Log in with Facebook'])[1]"));
		 driver.findElement(By.xpath("(//button[normalize-space()='Log in with Facebook'])[1]"));
		 System.out.println("Click on Login with Facebook Button: " +fbBtn.isEnabled());
		 
		 WebElement email=driver.findElement(By.name("emailOrPhone"));
		 System.out.println("Email box: " +email.isEnabled());
		 email.sendKeys("ankit48837@gmail.com");
		 
		 WebElement fullname=driver.findElement(By.name("fullName"));
		 System.out.println("Full Name box: " +fullname.isEnabled());
		 fullname.sendKeys("Ankit Verma");
		 
		 WebElement user=driver.findElement(By.name("username"));
		 System.out.println("User Name box: " +user.isEnabled());
		 user.sendKeys("ankit488373");
		 
		 WebElement password=driver.findElement(By.name("password"));
		 System.out.println("Password box: " +password.isEnabled());
		 password.sendKeys("India@1234");
		 
		 WebElement signup=driver.findElement(By.xpath("//button[normalize-space()='Sign up']"));
		 System.out.println("Click on Signup Button: " +signup.isEnabled());
		

	}

}
