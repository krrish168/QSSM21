package com.qsp.Websites;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebsiteSample 
{
	public static void main(String[] args) throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver","D:\\Qspiders\\WorkSpace\\QSSM21\\drivers\\chromedriver.exe");
	//upcasting the Subclass ChromeDriver to SUper INterface WebDriver
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	//calling get() of interface WebDriver and overriding it in by subclass ChromeDriver and new implementation will given to that get();
		driver.get("http://flipkart.com");
		Thread.sleep(1000);
		driver.close();
	}

}
