package Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import proba.Utils;

public class HomePage {
	
	private WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getContactUs(){
		return Utils.waitForElementPresence(driver, By.xpath("//a[contains(text(),\'Contact us\')]"), 5);
	}
	
	public WebElement getSingIn(){
		return Utils.waitForElementPresence(driver, By.xpath("//a[contains(text(),\'Sign in\')]"), 5);
	}
	
	public WebElement getSearchBox() {
		return Utils.waitForElementPresence(driver, By.xpath("//input[@id=\'search_query_top\']"), 5);
	}
	
	public void setSearchBox(String searchbox) {
		WebElement searchboxInput = getSearchBox();
		searchboxInput.clear();
		searchboxInput.sendKeys(searchbox);
	}
	
	public void enterText(String searchbox){
		setSearchBox(searchbox);		
	}
	
	public WebElement getSearchBtn() {
		return Utils.waitForElementPresence(driver, By.xpath("//button[@name=\'submit_search\']"), 5);
	}
	
	public WebElement getWomen() {
		return Utils.waitForElementPresence(driver, By.xpath("//a[contains(text(),\'Women\')]"), 5);
	}
	
	public WebElement getDresses() {
		return Utils.waitForElementPresence(driver, By.xpath("(//a[contains(text(),\'Dresses\')])[5]"), 5);
	}
	
	public WebElement getTShirts() {
		return Utils.waitForElementPresence(driver, By.xpath("(//a[contains(text(),\'T-shirts\')])[2]"), 5);
	}
	
	public WebElement getWomenTShirts() {
		return Utils.waitForElementPresence(driver, By.xpath("//a[contains(text(),\'T-shirts\')]"), 5);
	}
	
	public WebElement getWomenBlouses() {
		return Utils.waitForElementPresence(driver, By.xpath("//a[contains(text(),\'Blouses\')]"), 5);
	}
	
	public WebElement getWomenCasualDresses() {
		return Utils.waitForElementPresence(driver, By.xpath("//a[contains(text(),\'Casual Dresses\')]"), 5);
	}
	
	public WebElement getWomenEveningDresses() {
		return Utils.waitForElementPresence(driver, By.xpath("//a[contains(text(),\'Evening Dresses\')]"), 5);
	}
	
	public WebElement getWomenSummerDresses() {
		return Utils.waitForElementPresence(driver, By.xpath("//a[contains(.,\'Summer Dresses\')]"), 5);
	}
	
	public WebElement getDressesCasualDresses() {
		return Utils.waitForElementPresence(driver, By.xpath("(//a[contains(text(),\'Casual Dresses\')])[2]"), 5);
	}
	
	public WebElement getDressesEveningDresses() {
		return Utils.waitForElementPresence(driver, By.xpath("(//a[contains(text(),\'Evening Dresses\')])[2]"), 5);
	}
	
	public WebElement getDressesSummerDresses() {
		return Utils.waitForElementPresence(driver, By.xpath("(//a[contains(text(),\'Summer Dresses\')])[2]"), 5);
	}
	
	public WebElement getCartBtn() {
		return Utils.waitForElementPresence(driver, By.xpath("//b[contains(.,\'Cart\')]"), 5);
	}
	
	public WebElement getLeftArrow() {
		return Utils.waitForElementPresence(driver, By.xpath("//a[contains(text(),\'Prev\')]"), 5);
	}
	
	public WebElement getRightArrow() {
		return Utils.waitForElementPresence(driver, By.xpath("//a[contains(.,\'Next\')]"), 5);
	}
	
	public WebElement getPopular() {
		return Utils.waitForElementPresence(driver, By.xpath("//a[contains(text(),\'Popular\')]"), 5);
	}
	
	public WebElement getBestSellers() {
		return Utils.waitForElementPresence(driver, By.xpath("//a[contains(text(),\'Best Sellers\')]"), 5);
	}
	
	public WebElement getWomenLink() {
		return Utils.waitForElementPresence(driver, By.xpath("(//a[contains(text(),\'Women\')])[2]"), 5);
	}
	
	public WebElement getSpecials() {
		return Utils.waitForElementPresence(driver, By.xpath("//a[contains(text(),\'Specials\')]"), 5);
	}
	
	public WebElement getNewProducts() {
		return Utils.waitForElementPresence(driver, By.xpath("//a[contains(text(),\'New products\')]"), 5);
	}
	
	public WebElement getBestSellersLink() {
		return Utils.waitForElementPresence(driver, By.xpath("//a[contains(text(),\'Best sellers\')]"), 5);
	}
	
	public WebElement getOurStores() {
		return Utils.waitForElementPresence(driver, By.xpath("//a[contains(text(),\'Our stores\')]"), 5);
	}
	
	public WebElement getContactUsLink() {
		return Utils.waitForElementPresence(driver, By.xpath("(//a[contains(text(),\'Contact us\')])[2]"), 5);
	}
	
	public WebElement getTermsAndConditions() {
		return Utils.waitForElementPresence(driver, By.xpath("//a[contains(text(),\'Terms and conditions of use\')]"), 5);
	}
	
	public WebElement getAbouteUs() {
		return Utils.waitForElementPresence(driver, By.xpath("//a[contains(text(),\'About us\')]"), 5);
	}
	
	public WebElement getSiteMap() {
		return Utils.waitForElementPresence(driver, By.xpath("//a[contains(text(),\'Sitemap\')]"), 5);
	}
	
	public WebElement getMyOrders() {
		return Utils.waitForElementPresence(driver, By.xpath("//a[contains(text(),\'My orders\')]"), 5);
	}
	
	public WebElement getMyCreditSlips() {
		return Utils.waitForElementPresence(driver, By.xpath("//a[contains(text(),\'My credit slips\')]"), 5);
	}
	
	public WebElement getMyAddresses() {
		return Utils.waitForElementPresence(driver, By.xpath("//a[contains(text(),\'My addresses\')]"), 5);
	}
	
	public WebElement getMyPersonalInfo() {
		return Utils.waitForElementPresence(driver, By.xpath("//a[contains(text(),\'My personal info\')]"), 5);
	}
	
	public WebElement getNewsletter() {
		return Utils.waitForElementPresence(driver, By.id("newsletter-input"), 5);
	}
	
	public void setNewsletter(String newsletter) {
		WebElement newsletterInput = getNewsletter();
		newsletterInput.clear();
		newsletterInput.sendKeys(newsletter);
	}
	
	public void newsemail (String newsletter){
		setNewsletter(newsletter);		
	}
	
	public WebElement getNewsletterBtn() {
		return Utils.waitForElementPresence(driver, By.xpath("//button[@name=\'submitNewsletter\']"), 5);
	}
	
	public WebElement getPictureOne() {
		return Utils.waitForElementPresence(driver, By.xpath("//img[@alt=\'Faded Short Sleeve T-shirts\']"), 5);
	}
	
	public WebElement getQuickView() {
		return Utils.waitForElementPresence(driver, By.xpath("//span[contains(.,\'Quick view\')]"), 5);
	}
	
	public WebElement getAddToChart() {
		return Utils.waitForElementPresence(driver, By.xpath("//span[contains(.,\'Add to cart\')]"), 5);
	}
	
	public WebElement getMore() {
		return Utils.waitForElementPresence(driver, By.xpath("//span[contains(.,\'More\')]"), 5);
	}
	
	public WebElement getChartPictures() {
		return Utils.waitForElementPresence(driver, By.xpath("//dt/a/img"), 5);
	}
	
	public WebElement getCheckOut() {
		return Utils.waitForElementPresence(driver, By.xpath("//span[contains(.,\'Check out\')]"), 5);
	}
	
	public WebElement getX() {
		return Utils.waitForElementPresence(driver, By.xpath("//span/a"), 5);
	}
}