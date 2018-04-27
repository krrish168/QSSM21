package com.qsp.Synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWAit
{
	static
	{
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		//WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://online.actitime.com/qsp3/login.do");
		driver.findElement(By.id("username")).sendKeys("krrish168");
		driver.findElement(By.name("pwd")).sendKeys("Krri$hna0sv");
		driver.findElement(By.xpath("//div[.='Login ']")).click();
		String eTitle="actiTIME -  Enter Time-Track";
		WebDriverWait wait=new WebDriverWait(driver,10);
		try
		{
			wait.until(ExpectedConditions.titleIs(eTitle));
			System.out.println("pass :-)");
		}
		catch(Exception e)
		{
			System.out.println("fail :-(");
		}
		//driver.findElement(By.id("logoutLink")).click();;
		//driver.close();
	}

}
