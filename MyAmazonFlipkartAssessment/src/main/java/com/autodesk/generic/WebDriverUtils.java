package com.autodesk.generic;

import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * 
 * @author HenTryRAj
 *
 */
public class WebDriverUtils {
	/**
	 * used for implicitly wait
	 * 
	 * @param driver
	 */
	public void woitForElementToLoad(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	/**
	 * This method is used to wait for element to be visible
	 * 
	 * @param driver
	 * @param element
	 */
	public void waitForElementToVisible(WebDriver driver, WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	/**
	 * This method is use to wait for element to be clickable
	 * 
	 * @param driver
	 * @param element
	 */
	public void waitForElementToBeClickable(WebDriver driver, WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}

	/**
	 * convert String into number
	 * 
	 * @param str
	 * @return
	 */
	public long convertIntoNumb(String str) {
		String n = "";
		char[] ch = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] >= '0' && ch[i] <= '9') {
				n = n + ch[i];
			} else
				continue;
		}
		long num = Long.parseLong(n);
		return num;
	}
}
