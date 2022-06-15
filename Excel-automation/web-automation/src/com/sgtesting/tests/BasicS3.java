package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicS3{
	public static WebDriver driver=null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launchBrowser();
		navigate();
		login();
		minimizeFlyoutwindow();
		createCustomer();
		logout();
		close();
		
	}

	private static void launchBrowser() {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","E:\\SeleniumAutomation\\Automation\\Excel-automation\\web-automation\\Library\\driver\\chromedriver.exe");
		 driver = new ChromeDriver();
	}
	
	private  static void navigate()
	{
		try {
		driver.get("http://localhost:82/login.do");
		Thread.sleep(2000);
		}catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void login()
	{
		try {
			driver.findElement(By.id("username")).sendKeys("admin");
			driver.findElement(By.xpath("//*[@id=\"loginFormContainer\"]/tbody/tr[1]/td/table/tbody/tr[2]/td/input")).sendKeys("manager");
			driver.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
			Thread.sleep(2000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void minimizeFlyoutwindow()
	{
		try {
			driver.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(1000);
		} catch (Exception e) {
		e.printStackTrace();
		}
	}
	private static void  logout()
	{
		try {
			driver.findElement(By.id("logoutLink")).click();
			Thread.sleep(2000);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void createCustomer()
	{
		try {
		driver.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[3]/a/div[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[1]/div[2]/div/div[2]")).click();
		driver.findElement(By.xpath("/html/body/div[14]/div[1]")).click();
		driver.findElement(By.id("customerLightBox_nameField")).sendKeys("customer5");
		driver.findElement(By.xpath("//*[@id=\"customerLightBox_commitBtn\"]/div/span")).click();
		Thread.sleep(2000);
	}catch(Exception e)
		{
		e.printStackTrace();
		}
	}
	private static void close()
	{
		try
		{
			driver.quit();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}