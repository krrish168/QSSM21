package com.qsp.Websites;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UserpathIdentification {

	public static void main(String[] args) 
	{
	System.out.println(System.getProperty("user.dir")); //it displays the workspace and current project name of eclipse
	System.out.println(System.getProperty("user.dir")+"drivers\\chromedriver.exe");
    System.out.println(System.getProperty("user.dir"));
    System.out.println(System.getProperty("user.dir")+"drivers\\geckodriver.exe");
    System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"Browser Executables\\chromedriver.exe");
    //or
    System.setProperty("webdriver.chrome.driver", "D:\\Qspiders\\WorkSpace\\QSSM21\\Browser Executables\\chromedriver.exe"); //above and this statement both are same
    WebDriver d=new ChromeDriver();
    d.manage().window().maximize();
    d.get("http://myntra.com");
    String url=d.getCurrentUrl();
    System.out.println("Url is :"+url);
    /*String pgsrc=d.getPageSource();
    System.out.println("page source is : "+pgsrc);
*/  
    String title=d.getTitle();
    System.out.println("Title of webpage is: "+title);
    String window=d.getWindowHandle();
    System.out.println("window handle to: "+window);
    d.navigate().to("http://flipkart.com");
    d.close();
	}

}
