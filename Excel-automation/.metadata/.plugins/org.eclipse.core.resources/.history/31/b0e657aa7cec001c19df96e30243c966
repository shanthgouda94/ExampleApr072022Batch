package com.sgtesting.objectmapping;


import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario6 {
	public static WebDriver oBrowser=null;
	public static String filename=null;
	public static ObjectMap objectmap=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		createCustomer();
		createProject();
		modifyProject();
		deleteProject();
		deleteCustomer();
		logout();
		closeApplication();
	}
	
	private static void launchBrowser()
	{
		try
		{
			filename="E:\\SeleniumAutomation\\Automation\\Excel-automation\\ObjectMapping\\ObjectMap\\objectmap.properties";
			System.setProperty("webdriver.chrome.driver","E:\\SeleniumAutomation\\Automation\\Excel-automation\\ObjectMapping\\Library\\driver\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			objectmap=new ObjectMap(filename);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void navigate()
	{
		try
		{
			oBrowser.get("http://localhost:82/login.do");
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
			oBrowser.quit();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void login()
	{
		try
		{
			oBrowser.findElement(objectmap.getLocator("loginpageusername")).sendKeys("admin");
			oBrowser.findElement(objectmap.getLocator("loginpagepassword")).sendKeys("manager");
			oBrowser.findElement(objectmap.getLocator("loginpageloginbtn")).click();
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void minimizeFlyOutWindow()
	{
		try
		{
			oBrowser.findElement(objectmap.getLocator("homepageflyoutwindow")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void createCustomer()
	{
		try {
			oBrowser.findElement(objectmap.getLocator("clickontask")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("clickonadd")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("clickonnewcustomer")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("entercustomername")).sendKeys("Infosys");
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("clickonsave")).click();
			Thread.sleep(2000);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void createProject()
	{
		try {
			oBrowser.findElement(objectmap.getLocator("clickonadd")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("clickonaddnewproject")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("enterprojectname")).sendKeys("Bank of Baroda");
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("clickonsaveproject")).click();
			Thread.sleep(2000);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void modifyProject()
	{
		try {
			oBrowser.findElement(objectmap.getLocator("clickoneditproject")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("clickonprojectnametoedit")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("clickonblankspace")).clear();
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("clickonblankspace")).sendKeys("United States of America");
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("clickonprojecticon")).click();
			Thread.sleep(2000);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void deleteProject()
	{
		try {
			oBrowser.findElement(objectmap.getLocator("clickoneditproject")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("clickonprojectaction")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("clickondeleteproject")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("clickonprojectpermanentally")).click();
			Thread.sleep(2000);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void deleteCustomer()
	{
		try {
			oBrowser.findElement(objectmap.getLocator("clickoneditbutton")).click();
		Thread.sleep(2000);
		oBrowser.findElement(objectmap.getLocator("clickonactionbutton")).click();
		Thread.sleep(2000);
		oBrowser.findElement(objectmap.getLocator("clickondelete")).click();
		Thread.sleep(2000);
		oBrowser.findElement(objectmap.getLocator("clickondeletepermanentally")).click();
		Thread.sleep(2000);
		
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void logout()
	{
		try
		{
			oBrowser.findElement(objectmap.getLocator("homepagelogoutlink")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
