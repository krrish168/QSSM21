package com.qsp.Websites;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FlipKartWebPage 
{
	static
	{
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException 
	{
	//WebDriver driver=new FirefoxDriver();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.get("https://www.flipkart.com");
	driver.findElement(By.xpath("//button[.='✕']")).click();
	//driver.findElement(By.xpath("//a[.='Login & Signup']"));
	Thread.sleep(3000);
	driver.findElement(By.xpath("(//div[contains(text(),'T-Shirts')])[1]")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//a[.='T-Shirts']")).click();
	Thread.sleep(3000);
	driver.findElement(By.className("_2cLu-l")).click();
	//driver.navigate().to("https://www.flipkart.com/unisopent-designs-printed-men-s-round-neck-maroon-t-shirt/p/itmf3ytkvfxgrqrr?pid=TSHEZUTYYPDZ8P89&lid=LSTTSHEZUTYYPDZ8P89PP6IT1&marketplace=FLIPKART&srno=b_1_20&otracker=browse&fm=neo/merchandising&iid=1d2388ca-12f3-478d-bfc6-9e5943b6db20.TSHEZUTYYPDZ8P89.SEARCH&ppt=Store%20Browse&ppn=Search%20Page&ssid=3x0dln7js00000001523954606694");
	}

}
