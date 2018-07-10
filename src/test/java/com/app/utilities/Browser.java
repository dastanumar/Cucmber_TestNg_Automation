package com.app.utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser {

	private static WebDriver driver;

	public static WebDriver getDriver() {

		if (driver == null || ((RemoteWebDriver) driver).getSessionId() == null) {

			if (Configuration.getPropVal("browser").equalsIgnoreCase("chrome")) {
				WebDriverManager.chromedriver().setup();

				driver = new ChromeDriver();
				driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
				driver.manage().window().fullscreen();

			} else if (Configuration.getPropVal("browser").equalsIgnoreCase("firefox")) {
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
				driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
				driver.manage().window().fullscreen();
				
			} else if (Configuration.getPropVal("browser").equalsIgnoreCase("opera")) {
				WebDriverManager.operadriver().setup();
				driver = new OperaDriver();
				driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
				driver.manage().window().fullscreen();
				
			} else {
				WebDriverManager.chromedriver().setup();

				driver = new ChromeDriver();
				driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
				driver.manage().window().fullscreen();
			}
		}
		return driver;
	}
}
