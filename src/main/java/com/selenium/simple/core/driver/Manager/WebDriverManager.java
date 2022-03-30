package com.selenium.simple.core.driver.Manager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.InputStream;
import java.util.Properties;

public class WebDriverManager {
	/**
	 * Initial preparation
	 */
	static {
		try {
			InputStream inStream = WebDriverManager.class.getClassLoader().getResourceAsStream("test.properties");
			Properties testingPropertes = new Properties();
			testingPropertes.load(inStream);

			String chromeDrivePath = testingPropertes.getProperty("chrome.driver.path");

			if (chromeDrivePath != null && chromeDrivePath != "") {
				System.setProperty("webdriver.chrome.driver", chromeDrivePath);
			}

			String firefoxChromeDrivePath = testingPropertes.getProperty("firefox.driver.path");

			if (firefoxChromeDrivePath != null && firefoxChromeDrivePath != "") {
				System.setProperty("webdriver.firefox.driver", firefoxChromeDrivePath);
			}

		} catch (Exception ex) {

		}
	}
	
	public static WebDriver GetChromeDriver() {
		return new ChromeDriver();
	}
	
	public static WebDriver GetFireFoxDriver() {
		return new FirefoxDriver();
	}
	
	public static WebDriver GetRemoteWebDriver() {
		return null;
	}
}
