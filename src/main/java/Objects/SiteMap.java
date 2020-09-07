package Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import proba.Utils;

public class SiteMap {
	
	private WebDriver driver;
	
	public SiteMap(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getNewProducts(){
		return Utils.waitForElementPresence(driver, By.xpath("//a[contains(.,\' New products\')]"), 5);
	}
	
	public WebElement getBestSellers(){
		return Utils.waitForElementPresence(driver, By.xpath("//a[contains(.,\' Best sellers\')]"), 5);
	}
	
	public WebElement getPriceDrop(){
		return Utils.waitForElementPresence(driver, By.xpath("//a[contains(text(),\'Price drop\')]"), 5);
	}
	
	public WebElement getManufacturers(){
		return Utils.waitForElementPresence(driver, By.linkText("Manufacturers"), 5);
	}
	
	public WebElement getSuppliers(){
		return Utils.waitForElementPresence(driver, By.linkText("Suppliers"), 5);
	}
	
	public WebElement getAuthentication(){
		return Utils.waitForElementPresence(driver, By.linkText("Authentication"), 5);
	}
	
	public WebElement getCreateNewAccount(){
		return Utils.waitForElementPresence(driver, By.linkText("Create new account"), 5);
	}
	
	public WebElement getWomen(){
		return Utils.waitForElementPresence(driver, By.xpath("(//a[contains(text(),\'Women\')])[3]"), 5);
	}
	
	public WebElement getTops(){
		return Utils.waitForElementPresence(driver, By.linkText("Tops"), 5);
	}
	
	public WebElement getTShirts(){
		return Utils.waitForElementPresence(driver, By.linkText("T-shirts"), 5);
	}
	
	public WebElement getBlouses(){
		return Utils.waitForElementPresence(driver, By.linkText("Blouses"), 5);
	}
	
	public WebElement getDresses(){
		return Utils.waitForElementPresence(driver, By.linkText("Dresses"), 5);
	}
	
	public WebElement getCasualDresses(){
		return Utils.waitForElementPresence(driver, By.linkText("Casual Dresses"), 5);
	}
	
	public WebElement getEveningDresses(){
		return Utils.waitForElementPresence(driver, By.linkText("Evening Dresses"), 5);
	}
	
	public WebElement getSummerDresses(){
		return Utils.waitForElementPresence(driver, By.linkText("Summer Dresses"), 5);
	}
	
	public WebElement getHome(){
		return Utils.waitForElementPresence(driver, By.xpath("//a[contains(text(),\'Home\')]"), 5);
	}
	
	public WebElement getDelivery(){
		return Utils.waitForElementPresence(driver, By.xpath("//a[contains(.,\' Delivery\')]"), 5);
	}
	
	public WebElement getLegalNotice(){
		return Utils.waitForElementPresence(driver, By.xpath("//a[contains(.,\' Legal Notice\')]"), 5);
	}
	
	public WebElement getTermsAndConditionsOfUse(){
		return Utils.waitForElementPresence(driver, By.xpath("//a[contains(.,\' Terms and conditions of use\')]"), 5);
	}
	
	public WebElement getAboutUs(){
		return Utils.waitForElementPresence(driver, By.xpath("//a[contains(.,\' About us\')]"), 5);
	}
	
	public WebElement getSecurePayment(){
		return Utils.waitForElementPresence(driver, By.xpath("//a[contains(.,\' Secure payment\')]"), 5);
	}
	
	public WebElement getContact(){
		return Utils.waitForElementPresence(driver, By.xpath("//a[contains(.,\' Contact\')]"), 5);
	}
	
	public WebElement getFashionImage(){
		return Utils.waitForElementPresence(driver, By.xpath("//li/div/div/div/div/a/img"), 5);
	}
	
	public WebElement getViewProductsBtn(){
		return Utils.waitForElementPresence(driver, By.xpath("//span[contains(.,\'View products \')]"), 5);
	}

}