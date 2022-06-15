package com.sgtesting.objectmapping;


import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sceanario2	 {
	public static WebDriver oBrowser=null;
	public static String filename=null;
	public static ObjectMap objectmap=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		createUser();
		modifyUser();
		deleteUser();
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
	private static void createUser()
	{
		try {
			oBrowser.findElement(objectmap.getLocator("userclickbutton")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("clickonadduserbutton")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("createuserfn")).sendKeys("Srinath");
			oBrowser.findElement(objectmap.getLocator("createuserln")).sendKeys("kumar");
			oBrowser.findElement(objectmap.getLocator("createuseremail")).sendKeys("sk@gmail.com");
			oBrowser.findElement(objectmap.getLocator("createuserusername")).sendKeys("skumar");
			oBrowser.findElement(objectmap.getLocator("createuserpw")).sendKeys("123456");
			oBrowser.findElement(objectmap.getLocator("createuserpwcopy")).sendKeys("123456");
			oBrowser.findElement(objectmap.getLocator("clickoncreateuserbutton")).click(); 
			Thread.sleep(2000);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void modifyUser()
	{
		try {
			oBrowser.findElement(objectmap.getLocator("clickoncreateduser")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("createuserfn")).clear();
			oBrowser.findElement(objectmap.getLocator("createuserln")).clear();
			oBrowser.findElement(objectmap.getLocator("createuseremail")).clear();
			oBrowser.findElement(objectmap.getLocator("createuserusername")).clear();
			oBrowser.findElement(objectmap.getLocator("createuserfn")).sendKeys("Sharana");
			oBrowser.findElement(objectmap.getLocator("createuserln")).sendKeys("Basava");
			oBrowser.findElement(objectmap.getLocator("createuseremail")).sendKeys("sb40@gmail.com");
			oBrowser.findElement(objectmap.getLocator("createuserusername")).sendKeys("sb40");
			oBrowser.findElement(objectmap.getLocator("clickonusertomodify")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void deleteUser()
	{
		try {
			oBrowser.findElement(objectmap.getLocator("clickoncreateduser")).click();
		Thread.sleep(2000);
		oBrowser.findElement(objectmap.getLocator("clickondeletebtn")).click();
		Thread.sleep(2000);
		Alert o=oBrowser.switchTo().alert();
		o.accept();
			
			
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