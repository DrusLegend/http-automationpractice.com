package Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import proba.Utils;

public class BestSellers {
	
	private WebDriver driver;
	
	public BestSellers(WebDriver driver) {
		this.driver = driver;
	}
	
	public Select getSorByDropDown() {
		return new Select(Utils.waitForElementPresence(driver, By.id("selectProductSort"), 5));
	}
	
	public WebElement getGrid() {
		return Utils.waitForElementPresence(driver, By.xpath("//li[@id=\'grid\']/a/i"), 5);
	}
	
	public WebElement getList() {
		return Utils.waitForElementPresence(driver, By.xpath("//li[@id=\'list\']/a/i"), 5);
	}
	
	public WebElement getAddToCompare() {
		return Utils.waitForElementPresence(driver, By.xpath("//a[contains(text(),\'Add to Compare\')]"), 5);
	}
	
	public WebElement getAddToCompare2() {
		return Utils.waitForElementPresence(driver, By.xpath("(//a[contains(text(),\'Add to Compare\')])[2]"), 5);
	}
	
	public WebElement getCompareBtn() {
		return Utils.waitForElementPresence(driver, By.xpath("//span[contains(.,\'Compare (2)\')]"), 5);
	}
	
	public WebElement getAddToWishList() {
		return Utils.waitForElementPresence(driver, By.xpath("//a[contains(text(),\'Add to Wishlist\')]"), 5);
	}
	
	public WebElement getCloseX() {
		return Utils.waitForElementPresence(driver, By.xpath("//body/div[2]/div/div/a"), 5);
	}
	
	public WebElement getMessage() {
		return Utils.waitForElementPresence(driver, By.xpath("//p[contains(.,\'You must be logged in to manage your wishlist.\')]"), 5);
	}
	
	public WebElement getMoreBtn() {
		return Utils.waitForElementPresence(driver, By.xpath("//span[contains(.,\'More\')]"), 5);
	}
	
	public WebElement getMoreBtn2() {
		return Utils.waitForElementPresence(driver, By.xpath("//li[2]/div/div/div[3]/div/div[2]/a[2]/span"), 5);
	}
	
	public WebElement getHomeBtn() {
		return Utils.waitForElementPresence(driver, By.xpath("//a/i"), 5);
	}
	
	public WebElement getAllBestSellersBtn() {
		return Utils.waitForElementPresence(driver, By.xpath("//span[contains(.,\'All best sellers\')]"), 5);
	}
	
	public WebElement getCategoriesWomen() {
		return Utils.waitForElementPresence(driver, By.xpath("(//a[contains(text(),\'Women\')])[2]"), 5);
	}
	
	public WebElement getDelivers() {
		return Utils.waitForElementPresence(driver, By.xpath("//a[contains(text(),\'Delivery\')]"), 5);
	}
	
	public WebElement getLegalNotice() {
		return Utils.waitForElementPresence(driver, By.xpath("//a[contains(text(),\'Legal Notice\')]"), 5);
	}
	
	public WebElement getTermsAndConditions() {
		return Utils.waitForElementPresence(driver, By.xpath("//a[contains(text(),\'Terms and conditions of use\')]"), 5);
	}
	
	public WebElement getAboutUs() {
		return Utils.waitForElementPresence(driver, By.xpath("//a[contains(text(),\'About us\')]"), 5);
	}
	
	public WebElement getSecurePayment() {
		return Utils.waitForElementPresence(driver, By.xpath("//a[contains(text(),\'Secure payment\')]"), 5);
	}
	
	public WebElement getOurStores() {
		return Utils.waitForElementPresence(driver, By.xpath("//a[contains(text(),\'Our stores\')]"), 5);
	}
	
	public WebElement getFashionManufactures() {
		return Utils.waitForElementPresence(driver, By.xpath("//a[contains(text(),\'Fashion Manufacturer\')]"), 5);
	}
	
	public WebElement getAllSpecialsBtn() {
		return Utils.waitForElementPresence(driver, By.xpath("//span[contains(.,\'All specials\')]"), 5);
	}
	
	public WebElement getDiscoverOurStoresBtn() {
		return Utils.waitForElementPresence(driver, By.xpath("//span[contains(.,\'Discover our stores\')]"), 5);
	}
	
	public WebElement getFashionSupplier() {
		return Utils.waitForElementPresence(driver, By.xpath("//a[contains(text(),\'Fashion Supplier\')]"), 5);
	}
	
	public Select getAllManufacturesDropDown() {
		return new Select(Utils.waitForElementPresence(driver, By.name("manufacturer_list"), 5));
	}
	
	public Select getAllSuppliersDropDown() {
		return new Select(Utils.waitForElementPresence(driver, By.name("supplier_list"), 5));
	}
	
	public WebElement getRemoveBtn() {
		return Utils.waitForElementPresence(driver, By.xpath("//td[2]/div/a/i"), 5);
	}
	
	public WebElement getViewBtn() {
		return Utils.waitForElementPresence(driver, By.xpath("//span[contains(.,\'View\')]"), 5);
	}
	
	public WebElement getContinueShoppingBtn() {
		return Utils.waitForElementPresence(driver, By.xpath("//span[contains(.,\'Continue Shopping\')]"), 5);
	}

}