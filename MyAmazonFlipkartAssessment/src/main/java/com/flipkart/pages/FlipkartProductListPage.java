package com.flipkart.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/**
 * 
 * @author HenTryRAj
 *
 */
public class FlipkartProductListPage {
	public WebDriver driver;
	@FindBy(xpath = "//div[text() =\"Apple iPhone XR (Yellow, 64 GB)\"]/../../div[2]/div/div/div")
	private WebElement searchproduct;

	public FlipkartProductListPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public WebElement getSearchproduct() {
		return searchproduct;
	}

}
