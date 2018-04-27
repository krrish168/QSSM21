package com.qsp.Synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ImplicitWait
{
	static
	{
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}
	public static void main(String[] args)
	{
		WebDriver driver=new FirefoxDriver();
		//WebDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://online.actitime.com/qsp3/login.do");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("krrish168");
		driver.findElement(By.name("pwd")).sendKeys("Krri$hna0sv");
		driver.findElement(By.xpath("//div[.='Login ']")).click();
		driver.findElement(By.id("logoutLink"));
	}
}
