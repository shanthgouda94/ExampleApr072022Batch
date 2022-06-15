package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class BasicS7 {
private static RemoteWebDriver driver=null;

	public static void main(String args[]) {
		
		launchBrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		createCustomer();
		createProject();
		createTask();
	    DeleteTask();
	    deleteProject();
	    deleteCustomer();
		logout();
		close();
	}

	private static void launchBrowser() {
		// TODO Auto-generated method stub
		try
		{
		System.setProperty("webdriver.chrome.driver", "E:\\SeleniumAutomation\\Automation\\Excel-automation\\web-automation\\Library\\driver\\chromedriver.exe");
		 driver=new ChromeDriver();
		Thread.sleep(1000);
	}catch(Exception e)
		{
		e.printStackTrace();
		}
	}
	private static void navigate()
	{
		try {
			
		driver.get("http://localhost:82/login.do");
		Thread.sleep(2000);
		
	}catch(Exception e)
		{
		e.printStackTrace();
		}
  }
	private static void login()
	{
		try
		{
			driver.findElement(By.id("username")).sendKeys("admin");
			driver.findElement(By.name("pwd")).sendKeys("manager");
			driver.findElement(By.xpath("//*[@id='loginButton']/div")).click();
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
			driver.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void createCustomer()
	{

		try
		{
			driver.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr/td[3]/a/div[2]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[1]/div[2]/div/div[2]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/div[14]/div[1]")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("customerLightBox_nameField")).sendKeys("custome1");
			driver.findElement(By.id("customerLightBox_descriptionField")).sendKeys("Welcome to project");
			driver.findElement(By.xpath("//span[text()='Create Customer']")).click();	
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
			driver.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[1]/div[2]/div/div[2]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/div[14]/div[2]")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("projectPopup_projectNameField")).sendKeys("Project1");
			driver.findElement(By.name("projectDescriptionField")).sendKeys("Welcome to Project");
			driver.findElement(By.xpath("//span[text()='Create Project']")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void createTask()
	{
		try {
			driver.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[1]/div[1]/div[3]/div/div[3]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/div[13]/div[1]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\'createTasksPopup_createTasksTableContainer\']/table/tbody/tr[1]/td[1]/input")).sendKeys("Task1");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[text()='Create Tasks']")).click();
			Thread.sleep(2000);
			
			
		} catch (Exception e) {
		e.printStackTrace();
		}
	}
	private static void DeleteTask()
	{
			try
			{
			driver.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[1]/table/tbody/tr/td[1]/div/div")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[1]/div[3]/div/div/div[4]")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//*[@id=\'deleteTaskPopup_deleteConfirm_submitBtn\']/div")).click();
				Thread.sleep(2000);
				
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		private static void  deleteProject()
		{
			try
			{
			driver.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[4]/div[1]/div[2]/div[3]/div/div")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[4]/div[4]/div/div[3]/div")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[text()='Delete permanently']")).click();
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
			driver.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")).click();
				Thread.sleep(2500);
				driver.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[2]/div[1]/div[4]/div/div")).click();
				Thread.sleep(1500);
				driver.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[2]/div[4]/div/div[3]/div")).click();
				Thread.sleep(1500);
				driver.findElement(By.id("customerPanel_deleteConfirm_submitTitle")).click();
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
			driver.findElement(By.linkText("Logout")).click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void close()
	{
		try {
			driver.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
