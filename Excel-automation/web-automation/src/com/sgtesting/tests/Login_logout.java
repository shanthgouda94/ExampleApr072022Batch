package com.sgtesting.tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_logout {
	public static WebDriver driver = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launchBrowser();
		navigate();
		login();
		minimizeFlyoutwindow();
		createUser();
		deleteUser();
		logout();
		close();

	}

	private static void launchBrowser() {
		try {

			System.setProperty("webdriver.chrome.driver",
					"E:\\SeleniumAutomation\\Automation\\Excel-automation\\web-automation\\Library\\driver\\chromedriver.exe");
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
			driver.findElement(By.xpath("//*[@id=\"loginFormContainer\"]/tbody/tr[1]/td/table/tbody/tr[2]/td/input"))
					.sendKeys("manager");
			driver.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private static void minimizeFlyoutwindow() {
		try {
			driver.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void createUser() {
		try {
			driver.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"createUserDiv\"]/div/div[2]")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("userDataLightBox_firstNameField")).sendKeys("user");
			driver.findElement(By.id("userDataLightBox_lastNameField")).sendKeys("1");
			driver.findElement(By.id("userDataLightBox_emailField")).sendKeys("sg@gmail.com");
			driver.findElement(By.id("userDataLightBox_usernameField")).sendKeys("shanth");
			driver.findElement(By.id("userDataLightBox_passwordField")).sendKeys("1234");
			driver.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("1234");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"userDataLightBox_commitBtn\"]/div/span")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void deleteUser() {
		try {
			driver.findElement(
					By.xpath("//*[@id=\"userListTableContainer\"]/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]"))
					.click();
			Thread.sleep(1000);
			driver.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(2000);
			Alert ok = driver.switchTo().alert();
			ok.accept();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void logout() {
		try {
			driver.findElement(By.id("logoutLink")).click();
			Thread.sleep(2000);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void close() {
		try {
			driver.close();
			Thread.sleep(1000);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
