package com.sgtesting.testngadvance;

import org.openqa.selenium.Alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AdvanceOne {
public static WebDriver oBrowser = null;
	
@Test (priority=1)
	private static void launchBrowser()
	{
		try
		{

			System.setProperty("webdriver.chrome.driver","E:\\SeleniumAutomation\\Automation\\Excel-automation\\Testng-Automation\\Library\\driver\\chromedriver.exe");
			oBrowser = new ChromeDriver();
			Thread.sleep(3000);

		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

@Test(priority = 2)
	private static void navigate()
	{
		try 
		{
 			oBrowser.get("http://localhost:82/login.do");
			Thread.sleep(3000);
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

@Test(priority = 3)
	private static void login()
	{
		try 
		{
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(3000);


		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

@Test(priority = 4)
	private static void minimizeFlyOutWindow()
	{
		try 
		{
			oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(3000);

		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
@Test(priority = 5)
	private static void createUser1User2User3()
	{
		try 
		{
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//*[@id=\'createUserDiv\']/div")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.name("firstName")).sendKeys("user");
			Thread.sleep(3000);
			oBrowser.findElement(By.name("lastName")).sendKeys("demo1");
			Thread.sleep(3000);
			oBrowser.findElement(By.name("email")).sendKeys("user1@gmail.com");
			Thread.sleep(3000);
			oBrowser.findElement(By.name("username")).sendKeys("user1");
			Thread.sleep(3000);
			oBrowser.findElement(By.name("password")).sendKeys("password1");
			Thread.sleep(3000);
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("password1");
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
			Thread.sleep(3000);
			
			
			oBrowser.findElement(By.xpath("//*[@id=\'createUserDiv\']/div")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.name("firstName")).sendKeys("user");
			Thread.sleep(3000);
			oBrowser.findElement(By.name("lastName")).sendKeys("demo2");
			Thread.sleep(3000);
			oBrowser.findElement(By.name("email")).sendKeys("user2@gmail.com");
			Thread.sleep(3000);
			oBrowser.findElement(By.name("username")).sendKeys("user2");
			Thread.sleep(3000);
			oBrowser.findElement(By.name("password")).sendKeys("password2");
			Thread.sleep(3000);
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("password2");
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
			Thread.sleep(3000);
			
			
			oBrowser.findElement(By.xpath("//*[@id=\'createUserDiv\']/div")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.name("firstName")).sendKeys("user");
			Thread.sleep(3000);
			oBrowser.findElement(By.name("lastName")).sendKeys("demo3");
			Thread.sleep(3000);
			oBrowser.findElement(By.name("email")).sendKeys("user3@gmail.com");
			Thread.sleep(3000);
			oBrowser.findElement(By.name("username")).sendKeys("user5");
			Thread.sleep(3000);
			oBrowser.findElement(By.name("password")).sendKeys("password5");
			Thread.sleep(3000);
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("password5");
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
			Thread.sleep(3000);			
			
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
@Test(priority = 6)
	private static void logout()
	{
		try 
		{
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(3000);


		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	

@Test(priority = 7)
	private static void loginUser1()
	{
		try 
		{
			
			oBrowser.findElement(By.name("username")).sendKeys("user1");
			Thread.sleep(3000);
			oBrowser.findElement(By.name("pwd")).sendKeys("password1");
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//*[@id=\'welcomeScreenBoxId\']/div[3]/div/span[1]")).click();
			Thread.sleep(3000);
			
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

@Test(priority = 8)
	private static void logoutUser1()
	{
		try 
		{
			
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(3000);
			
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
@Test(priority = 9)
	private static void loginUser2()
	{
		try 
		{
			
			oBrowser.findElement(By.name("username")).sendKeys("user2");
			Thread.sleep(3000);
			oBrowser.findElement(By.name("pwd")).sendKeys("password2");
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//*[@id=\'welcomeScreenBoxId\']/div[3]/div/span[1]")).click();
			Thread.sleep(3000);
			
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
@Test(priority = 10)
	private static void logoutUser2()
	{
		try 
		{
			
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(3000);
			
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
@Test(priority = 11)
	private static void loginUser3()
	{
		try 
		{
			
			oBrowser.findElement(By.name("username")).sendKeys("user5");
			Thread.sleep(3000);
			oBrowser.findElement(By.name("pwd")).sendKeys("password5");
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//*[@id=\'welcomeScreenBoxId\']/div[3]/div/span[1]")).click();
			Thread.sleep(3000);
			
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
@Test(priority = 12)
	private static void logoutUser3()
	{
		try 
		{
			
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(3000);
			
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	

@Test(priority = 13)
private static void loginA()
{
	try 
	{
		oBrowser.findElement(By.id("username")).sendKeys("admin");
		oBrowser.findElement(By.name("pwd")).sendKeys("manager");
		oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
		Thread.sleep(3000);


	} catch (Exception e) 
	{
		e.printStackTrace();
	}
}
	
@Test(priority = 14)
	private static void modifyUser1User2User3()
	{
		try 
		{
			
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a")).click();
			Thread.sleep(5000);
			oBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[1]/td[1]/div/table/tbody/tr/td/div[1]")).click();
			Thread.sleep(5000);
			oBrowser.findElement(By.name("password")).sendKeys("welcome1");
			Thread.sleep(3000);
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("welcome1");
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
			Thread.sleep(3000);
			
			oBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.name("password")).sendKeys("welcome2");
			Thread.sleep(3000);
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("welcome2");
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
			Thread.sleep(3000);
			
			oBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[3]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.name("password")).sendKeys("welcome3");
			Thread.sleep(3000);
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("welcome3");
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
			Thread.sleep(3000);
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
@Test(priority = 15)
private static void logoutA()
{
	try 
	{
		oBrowser.findElement(By.linkText("Logout")).click();
		Thread.sleep(3000);


	} catch (Exception e) 
	{
		e.printStackTrace();
	}
}
	
@Test(priority = 16)
	private static void loginUser1A()
	{
		try 
		{
			
			oBrowser.findElement(By.name("username")).sendKeys("user1");
			Thread.sleep(3000);
			oBrowser.findElement(By.name("pwd")).sendKeys("welcome1");
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(3000);
		
			
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
@Test(priority = 17)
	private static void logoutUser1A()
	{
		try 
		{
			
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(3000);
			
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
@Test(priority = 18)
	private static void loginUser2A()
	{
		try 
		{
			
			oBrowser.findElement(By.name("username")).sendKeys("user2");
			Thread.sleep(3000);
			oBrowser.findElement(By.name("pwd")).sendKeys("welcome2");
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(3000);
			
			
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
@Test(priority = 19)
	private static void logoutUser2A()
	{
		try 
		{
			
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(3000);
			
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
@Test(priority = 20)
	private static void loginUser3A()
	{
		try 
		{
			
			oBrowser.findElement(By.name("username")).sendKeys("user5");
			Thread.sleep(3000);
			oBrowser.findElement(By.name("pwd")).sendKeys("welcome3");
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(3000);
			
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
@Test(priority = 21)
	private static void logoutUser3A()
	{
		try 
		{
			
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(3000);
			
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	
@Test(priority = 22)
private static void loginB()
{
	try 
	{
		oBrowser.findElement(By.id("username")).sendKeys("admin");
		oBrowser.findElement(By.name("pwd")).sendKeys("manager");
		oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
		Thread.sleep(3000);


	} catch (Exception e) 
	{
		e.printStackTrace();
	}
}


@Test(priority = 23)
	private static void deleteUser1()
	{
		try 
		{
			
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(5000);
			oBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[1]/td[1]/div/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_deleteBtn\']")).click();
			Thread.sleep(3000);
			Alert oAlert = oBrowser.switchTo().alert();
			String content = oAlert.getText();
			System.out.println(content);
			oAlert.accept();
			Thread.sleep(5000);
			
			
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}

@Test(priority = 24)
	private static void deleteUser2()
	{
		try 
		{
			
			oBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[1]/td[1]/div/table/tbody/tr/td/div[1]")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_deleteBtn\']")).click();
			Thread.sleep(3000);
			Alert oAlert1 = oBrowser.switchTo().alert();
			String content1 = oAlert1.getText();
			System.out.println(content1);
			oAlert1.accept();
			Thread.sleep(5000);
			
			
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}
			
@Test(priority = 25)
	private static void deleteUser3()
	{
		try 
		{
			
			oBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[1]/td[1]/div/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_deleteBtn\']")).click();
			Thread.sleep(3000);
			Alert oAlert2 = oBrowser.switchTo().alert();
			String content2 = oAlert2.getText();
			System.out.println(content2);
			oAlert2.accept();
			Thread.sleep(3000);
			
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}

@Test(priority = 26)
private static void logoutB()
{
	try 
	{
		oBrowser.findElement(By.linkText("Logout")).click();
		Thread.sleep(3000);


	} catch (Exception e) 
	{
		e.printStackTrace();
	}
}
	
@Test(priority = 27)
	private static void closeApplication()
	{
		try
		{

			oBrowser.close();
			Thread.sleep(3000);
			System.out.println("The Advance Scenario One Executed");

		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}

