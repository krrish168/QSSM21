package com.qsp.Websites;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserLaunch
{
	//declaration of static block 
	static
	{
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
		System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"\\drivers\\geckodriver.exe");
	}
	//non-static fucntional member declaration
	public void browserLaunch(WebDriver driver) //constructor with param type
	{
		//retrieving webpage by using get() of WebDriver Interface and it doen't return anything.
		driver.get("http://google.com");
		//or
		//retrieving webpage by using navigate().to() method to get webpage
		//driver.navigate().to("http://google.com");
	//Retrieving the URL name by using getCurrentUrl() of WebDriver Interface and it returns URL name as String(return type)
		String currentUrl=driver.getCurrentUrl();
		System.out.println("Current URL is: "+currentUrl);
	//Retrieving the current webpage Title by using getTitle() of WebDriver INterface and it returns Title Name as String(return type)
		String currentTitle=driver.getTitle();
		System.out.println("Current title name of the webpage is: "+currentTitle);
	//Retrieving the current webpage source by using getPageSource() of WebDriver Interface and it returns PAge source(view page source when right click on web page) as string type returnin g function
		String currentPageSource=driver.getPageSource();
		System.out.println("Current webpage source is: "+currentPageSource);
	//Prescribing fixed length and width of the webpage on the window
		Dimension d=new Dimension(300,500);
		driver.manage().window().setSize(d);
	//Prescribing the location of webpage on the window
		Point p=new Point(250,350);
		driver.manage().window().setPosition(p);
	//closing the wepage and along with the browser which we had opened by using close() of WebDriver Interface
	driver.close();
	}
	public static void main(String[] args)
	{
	BrowserLaunch br=new BrowserLaunch();
	br.browserLaunch(new ChromeDriver()); //passing chromedriver to launch the url in chrome browser
	br.browserLaunch(new FirefoxDriver());//passing firefox driver to launch the url in firefox browser
	//here method overloading is done by passing paramaeters differently.
	}
	
}
