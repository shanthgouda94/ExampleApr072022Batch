package com.sgtesting.practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginLogout {
	public static WebDriver driver=null;
	

	public static void main(String[] args) throws InterruptedException {
		Launchbrowser();
		navigate();
		login();
		minimizeFlyoutwindow();
		creatUser();
		modifyUser();
		DeleteUser();
		logout();
		close();

	}

	private static void modifyUser() {
		// TODO Auto-generated method stub
		try {
			driver.findElement(By.xpath("//*[@id=\"userListTableContainer\"]/table/tbody/tr[2]/td[3]/span")).click();
			Thread.sleep(2000);
			driver.findElement(
					By.xpath("//*[@id=\"userListTableContainer\"]/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]"))
					.click();
			Thread.sleep(2000);

			driver.findElement(By.id("userDataLightBox_usernameField")).clear();
			driver.findElement(By.id("userDataLightBox_usernameField")).sendKeys("sharath");

			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"userDataLightBox_commitBtn\"]/div/span")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void DeleteUser() {
		// TODO Auto-generated method stub
		try {
			driver.findElement(
					By.xpath("//*[@id=\"userListTableContainer\"]/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]"))
					.click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"userDataLightBox_deleteBtn\"]")).click();
			Thread.sleep(1000);
			driver.switchTo().alert().accept();

			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
 	}

	private static void creatUser() throws InterruptedException {
		// TODO Auto-generated method stub
		driver.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr/td[5]/a/div[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"createUserDiv\"]/div")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("userDataLightBox_firstNameField")).sendKeys("user");
		driver.findElement(By.id("userDataLightBox_lastNameField")).sendKeys("5");
		driver.findElement(By.id("userDataLightBox_emailField")).sendKeys("ss@123gmail.com");
		driver.findElement(By.id("userDataLightBox_usernameField")).sendKeys("nithin");
		driver.findElement(By.id("userDataLightBox_passwordField")).sendKeys("12345");
		driver.findElement(By.name("passwordCopy")).sendKeys("12345");
		driver.findElement(By.xpath("//*[@id=\"userDataLightBox_commitBtn\"]/div/span")).click();
		Thread.sleep(2000);

	}

	private static void minimizeFlyoutwindow() {
		try {
			driver.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void Launchbrowser() {
		try {

			// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver",
					"E:\\SeleniumAutomation\\Automation\\Excel-automation\\Selenium_Automation_Practice\\Library\\driver\\chromedriver\\chromedriver.exe");
			 driver = new ChromeDriver();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void navigate() {
		try {
			driver.get("http://localhost:82/login.do");
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private static void login() {
		try {
			driver.findElement(By.id("username")).sendKeys("admin");
			Thread.sleep(2000);
			driver.findElement(By.name("pwd")).sendKeys("manager");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void logout() {
		try {
			driver.findElement(By.xpath("//*[@id=\"usersManagementBodyTagId\"]")).click();
			Thread.sleep(2000);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void close() throws InterruptedException {
		driver.close();
		Thread.sleep(2000);

	}

}
