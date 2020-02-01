package com.assignment.scriptTest;

import java.io.IOException;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.amazon.pages.HomePageAmazon;
import com.amazon.pages.AmazonProductListPage;
import com.autodesk.generic.BaseClass;
import com.autodesk.generic.WebDriverUtils;
import com.flipkart.pages.HomePageFlipkart;
import com.flipkart.pages.FlipkartProductListPage;
/**
 * 
 * @author HenTryRAj
 *
 */
public class CompareTwoPriceTest extends BaseClass {
	public String actualPriceAmazon;
	public String actualPriceFlipkart;
	public WebDriverUtils webLib = new WebDriverUtils();
	@Test
	public void comparePriceOfAmazonTest() throws IOException {
		String product = fileLib.getDataFromProperties("product");
		String flipkart= fileLib.getDataFromProperties("url1");
		
		HomePageAmazon hpa = new HomePageAmazon(driver);
		AmazonProductListPage searchPage = hpa.navigateToProductListPage(product);
		
		actualPriceAmazon = searchPage.getFoundPrice().getAttribute("innerText");
		driver.navigate().to(flipkart);
		
		HomePageFlipkart hpf = new HomePageFlipkart(driver);
		FlipkartProductListPage searchPageFlipkart = hpf.navigateToProductListPage(product);
		
		actualPriceFlipkart = searchPageFlipkart.getSearchproduct().getAttribute("innerText");	
		
		long amazonPrice = webLib.convertIntoNumb(actualPriceAmazon);
		long flipkartPrice = webLib.convertIntoNumb(actualPriceFlipkart);
		/*Verfication*/
		if(amazonPrice > flipkartPrice) {
			Reporter.log("The Flipkart price for 'iPhone XR (64GB) - Yellow' ===> " + flipkartPrice + " is Less", true);
		}
		else
			Reporter.log("The Amazon price for 'iPhone XR (64GB) - Yellow' ===> " + amazonPrice + " is Less", true);
	}
}
