package com.amazon.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/**
 * 
 * @author HenTryRAj
 *
 */
public class HomePageAmazon {
	public WebDriver driver;
	@FindBy(id ="twotabsearchtextbox")
	private WebElement searchBox;
	public WebElement getSearchBox() {
		return searchBox;
	}
	public HomePageAmazon(WebDriver driver ) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	/**
	 * Navigate from Homeapage to Product List page
	 * @param product
	 * @return
	 */
	public AmazonProductListPage navigateToProductListPage(String product) {
		searchBox.sendKeys(product, Keys.ENTER);
		return new AmazonProductListPage(driver);
	}
	

}
