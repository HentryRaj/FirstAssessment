package com.amazon.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/**
 * 
 * @author HenTryRAj
 *
 */
public class AmazonProductListPage {
	public WebDriver driver;
	@FindBy(xpath = "//span[contains(text() , 'Apple iPhone XR (64GB) - Yellow')]/../../../../../../../div[2]/div[1]/div/div[1]/div/div/a[1]/span[1]/span[1]")
	private WebElement foundPrice;
	
	public WebElement getFoundPrice() {
		return foundPrice;
	}

	public AmazonProductListPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	

}
