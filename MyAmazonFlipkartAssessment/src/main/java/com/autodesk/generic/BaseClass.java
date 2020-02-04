package com.autodesk.generic;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

/**
 * 
 * @author HenTryRAj
 *
 */
public class BaseClass implements IAutoConstant {
	static {
		System.setProperty(CHROME_KEY, CHROME_VALUE);
	}
	public FileLib fileLib = new FileLib();
	public WebDriverUtils webLib = new WebDriverUtils();
	public WebDriver driver;
	// @Parameters("browser")

	@BeforeClass
	public void configBC() throws IOException {
		// launch the browser
		String BROWSER = fileLib.getDataFromProperties("browser");
		if (BROWSER.equals("chrome"))
			driver = new ChromeDriver();
		else if (BROWSER.equals("firefox"))
			driver = new FirefoxDriver();
	}

	@BeforeMethod
	public void configBM() throws IOException {
		String URL = fileLib.getDataFromProperties("url");
		driver.manage().window().maximize();
		webLib.woitForElementToLoad(driver);
		driver.get(URL);
	}

	@AfterMethod
	public void configAM() {

	}

	@AfterTest
	public void configAT() {
		driver.close();
	}
}
