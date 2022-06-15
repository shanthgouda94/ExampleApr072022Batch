package com.sgtesting.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class CreateProject {
      public static WebDriver driver=null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       launch();
       navigate();
       login();
	}
	private static void launch() {
		try {
		System.setProperty("webdriver.chrome.driver","E:\\SeleniumAutomation\\Automation\\Excel-automation\\Selenium_Automation_Practice\\Library\\driver\\chromedriver\\chromedriver.exe");
		 driver=new ChromeDriver();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
  private static void navigate()
  {
	  try
	  {
		 driver.get("http://localhost:82/login.do"); 
		 Thread.sleep(2000);
	  }catch(Exception e)
	  {
		  e.printStackTrace();
	  }
  }
  private static void login()
  {
	  try {
		  driver.findElement(By.id("username")).sendKeys("admin");
		  driver.findElement(By.name("pwd")).sendKeys("manager");
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
	  }catch(Exception e)
	  {
		  e.printStackTrace();
	  }
  }
}
