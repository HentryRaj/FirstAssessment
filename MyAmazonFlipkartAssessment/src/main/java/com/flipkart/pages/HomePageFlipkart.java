package com.flipkart.pages;

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
public class HomePageFlipkart {
	public WebDriver driver;
	@FindBy(name = "q")
	private WebElement searchBox;
	
	public WebElement getSearchBox() {
		return searchBox;
	}
	public HomePageFlipkart(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	/**
	 * to navigate flipkart homepage to productlist page
	 * @param product
	 * @return
	 */
	public FlipkartProductListPage navigateToProductListPage(String product) {
		searchBox.sendKeys(product, Keys.ENTER);

		return new FlipkartProductListPage(driver);
	}
}
