package Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import proba.Utils;

public class QuickView {
	
	private WebDriver driver;
	
	//driver.switchTo().frame(1)
	
	public QuickView(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getX() {
		return Utils.waitForElementPresence(driver, By.xpath("//body[@id=\'index\']/div[2]/div/div/a"), 5);
	}
	
	public WebElement getColorOrange() {
		return Utils.waitForElementPresence(driver, By.id("color_13"), 5);
	}
	
	public WebElement getColorBlue() {
		return Utils.waitForElementPresence(driver, By.id("color_14"), 5);
	}

	public Select getSizeDropDown() {
		return new Select(Utils.waitForElementPresence(driver, By.xpath("//select"), 5));
	}
	
	public WebElement getQuantityBox() {
		return Utils.waitForElementPresence(driver, By.id("quantity_wanted"), 5);
	}
	
	public void setQuantityBox(String quantitybox) {
		WebElement quantityboxInput = getQuantityBox();
		quantityboxInput.clear();
		quantityboxInput.sendKeys(quantitybox);
	}
	
	public void enterforpass(String quantitybox){
		setQuantityBox(quantitybox);		
	}
	
	public WebElement getQuantityMinus() {
		return Utils.waitForElementPresence(driver, By.cssSelector(".icon-minus"), 5);
	}
	
	public WebElement getQuantityPlus() {
		return Utils.waitForElementPresence(driver, By.cssSelector(".icon-plus"), 5);
	}
	
	public WebElement getTweet() {
		return Utils.waitForElementPresence(driver, By.xpath("//button[contains(.,\'Tweet\')]"), 5);
	}
	
	public WebElement getShare() {
		return Utils.waitForElementPresence(driver, By.xpath("//button[contains(.,\' Share\')]"), 5);
	}
	
	public WebElement getGooglePlus() {
		return Utils.waitForElementPresence(driver, By.xpath("//button[contains(.,\' Google+\')]"), 5);
	}
	
	public WebElement getAddToWishlist() {
		return Utils.waitForElementPresence(driver, By.id("wishlist_button"), 5);
	}
	
	public WebElement getMessage() {
		return Utils.waitForElementPresence(driver, By.xpath("//p[contains(.,\'You must be logged in to manage your wishlist.\')]"), 5);
	}
	
	public WebElement getMessageClose() {
		return Utils.waitForElementPresence(driver, By.xpath("//div[2]/div/div/a"), 5);
	}
	
	public WebElement getAddToChart() {
		return Utils.waitForElementPresence(driver, By.xpath("//span[contains(.,\'Add to cart\')]"), 5);
	}
	
	public WebElement getRightArrow() {
		return Utils.waitForElementPresence(driver, By.id("view_scroll_right"), 5);
	}
	
	public WebElement getLeftArrow() {
		return Utils.waitForElementPresence(driver, By.id("view_scroll_left"), 5);
	}
	
	public WebElement getBigPictures() {
		return Utils.waitForElementPresence(driver, By.id("bigpic"), 5);
	}
	
	public WebElement getDisplayAllPictures() {
		return Utils.waitForElementPresence(driver, By.xpath("//a[@name=\'resetImages\']"), 5);
	}
	
	public WebElement getSmallPictures() {
		return Utils.waitForElementPresence(driver, By.id("thumb_1"), 5);
	}
	
	public WebElement getSmallPictures2() {
		return Utils.waitForElementPresence(driver, By.id("thumb_2"), 5);
	}
	
	public WebElement getSmallPictures3() {
		return Utils.waitForElementPresence(driver, By.id("thumb_3"), 5);
	}
	
	public WebElement getSmallPictures4() {
		return Utils.waitForElementPresence(driver, By.id("thumb_4"), 5);
	}

}