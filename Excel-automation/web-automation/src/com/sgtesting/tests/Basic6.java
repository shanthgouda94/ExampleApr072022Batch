package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic6 {
	public static WebDriver o=null;
public static void main(String[] args) {
		
		launchBrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		createCustomer();
		createProject();
		modifyProject();
		deleteCustomer();
		logout();
		closeApplication();
	}
	private static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "E:\\SeleniumAutomation\\Automation\\Excel-automation\\web-automation\\Library\\driver\\chromedriver.exe");
			o=new ChromeDriver();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void navigate()
	{
		try
		{
			o.get("http://localhost:82/login.do");
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void closeApplication()
	{
		try
		{
			o.quit();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void login()
	{
		try
		{
			o.findElement(By.id("username")).sendKeys("admin");
			o.findElement(By.name("pwd")).sendKeys("manager");
			o.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void minimizeFlyOutWindow()
	{
		try
		{
			o.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void logout()
	{
		try
		{
			o.findElement(By.linkText("Logout")).click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void createCustomer()
	{
		try
		{
			o.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr/td[3]/a/div[2]")).click();
			Thread.sleep(2000);
			o.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[1]/div[2]/div/div[2]")).click();
			Thread.sleep(2000);
			o.findElement(By.xpath("/html/body/div[14]/div[1]")).click();
			Thread.sleep(2000);
			o.findElement(By.id("customerLightBox_nameField")).sendKeys("custome1");
			o.findElement(By.id("customerLightBox_descriptionField")).sendKeys("Welcome to project");
			o.findElement(By.xpath("//span[text()='Create Customer']")).click();	
			Thread.sleep(5000);
			
			

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void createProject()
	{
		try
		{
			o.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[1]/div[2]/div/div[2]")).click();
			Thread.sleep(2000);
			o.findElement(By.xpath("/html/body/div[14]/div[2]")).click();
			Thread.sleep(2000);
			o.findElement(By.id("projectPopup_projectNameField")).sendKeys("Project1");
			o.findElement(By.name("projectDescriptionField")).sendKeys("Welcome to Project");
			o.findElement(By.xpath("//span[text()='Create Project']")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void modifyProject()
	{
		try
		{
			o.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")).click();
			Thread.sleep(2000);
			o.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[4]/div[1]/div[2]/div[2]/div/div[1]")).click();
			Thread.sleep(2000);
			o.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[4]/div[1]/div[2]/div[2]/div/div[1]")).sendKeys("Welcome");
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void deleteCustomer()
	
	{
		try
		{
			o.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")).click();
			Thread.sleep(2500);
			o.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[2]/div[1]/div[4]/div/div")).click();
			Thread.sleep(1500);
			o.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[2]/div[4]/div/div[3]/div")).click();
			Thread.sleep(1500);
			o.findElement(By.id("customerPanel_deleteConfirm_submitTitle")).click();
			Thread.sleep(2000);
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}




