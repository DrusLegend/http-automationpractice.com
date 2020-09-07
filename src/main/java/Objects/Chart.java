package Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import proba.Utils;

public class Chart {
	
	private WebDriver driver;
	
	public Chart(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getProcedToCheckoutBtn() {
		return Utils.waitForElementPresence(driver, By.xpath("//span[contains(.,\'Proceed to checkout\')]"), 5);
	}
	
	public WebElement getCloseX() {
		return Utils.waitForElementPresence(driver, By.cssSelector(".cross"), 5);
	}
	
	public WebElement getContinueShoppingBtn() {
		return Utils.waitForElementPresence(driver, By.xpath("//div[4]/span/span"), 5);
	}
	
	public WebElement getAddToChartBtn() {
		return Utils.waitForElementPresence(driver, By.xpath("//span[contains(.,\'Add to cart\')]"), 5);
	}
	
	public WebElement getAddToWishlistBtn() {
		return Utils.waitForElementPresence(driver, By.id("wishlist_button"), 5);
	}
	
	public WebElement getMessage() {
		return Utils.waitForElementPresence(driver, By.xpath("//p[contains(.,\'You must be logged in to manage your wishlist.\')]"), 5);
	}
	
	public WebElement getCloseX2() {
		return Utils.waitForElementPresence(driver, By.xpath("//body/div[2]/div/div/a"), 5);
	}
	
	public WebElement getViewLargerBtn() {
		return Utils.waitForElementPresence(driver, By.xpath("//span[@id=\'view_full_size\']/span"), 5);
	}
	
	public WebElement getViewLargerRightArrow() {
		return Utils.waitForElementPresence(driver, By.xpath("//div/a[2]/span"), 5);
	}
	
	public WebElement getViewLargerLeftArrow() {
		return Utils.waitForElementPresence(driver, By.xpath("//div[2]/div/div/div/a/span"), 5);
	}
	
	public WebElement getCloseX3() {
		return Utils.waitForElementPresence(driver, By.xpath("//body/div[2]/div/div/a"), 5);
	}
	
	public WebElement getSmallImage() {
		return Utils.waitForElementPresence(driver, By.id("thumb_1"), 5);
	}
	
	public WebElement getSmallImage2() {
		return Utils.waitForElementPresence(driver, By.id("thumb_2"), 5);
	}
	
	public WebElement getSmallImage3() {
		return Utils.waitForElementPresence(driver, By.id("thumb_3"), 5);
	}
	
	public WebElement getSmallImage4() {
		return Utils.waitForElementPresence(driver, By.id("thumb_4"), 5);
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
	
	public WebElement getSendToFriend() {
		return Utils.waitForElementPresence(driver, By.id("send_friend_button"), 5);
	}
	
	public WebElement getPrint() {
		return Utils.waitForElementPresence(driver, By.xpath("//a[contains(.,\'Print\')]"), 5);
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
	
	public WebElement getPlusBtn() {
		return Utils.waitForElementPresence(driver, By.cssSelector(".icon-plus"), 5);
	}
	
	public WebElement getMinusBtn() {
		return Utils.waitForElementPresence(driver, By.cssSelector(".button-minus > span"), 5);
	}
	
	public Select getSizeDropDown() {
		return new Select(Utils.waitForElementPresence(driver, By.xpath("//select"), 5));
	}
	
	public WebElement getColorOrange() {
		return Utils.waitForElementPresence(driver, By.id("color_13"), 5);
	}
	
	public WebElement getColorBlue() {
		return Utils.waitForElementPresence(driver, By.id("color_14"), 5);
	}
	
	public WebElement getSendToFriendCloseX() {
		return Utils.waitForElementPresence(driver, By.xpath("//body/div[2]/div/div/a"), 5);
	}
	
	public WebElement getSendBtn() {
		return Utils.waitForElementPresence(driver, By.xpath("//button[@id=\'sendEmail\']/span"), 5);
	}
	
	public WebElement getMessage2() {
		return Utils.waitForElementPresence(driver, By.id("send_friend_form_error"), 5);
	}
	
	public WebElement getCancel() {
		return Utils.waitForElementPresence(driver, By.linkText("Cancel"), 5);
	}
	
	public WebElement getNameFriend() {
		return Utils.waitForElementPresence(driver, By.id("friend_name"), 5);
	}
	
	public void setNameFriend(String namefriend) {
		WebElement namefriendInput = getNameFriend();
		namefriendInput.clear();
		namefriendInput.sendKeys(namefriend);
	}
	
	public WebElement getEmailFriend() {
		return Utils.waitForElementPresence(driver, By.id("friend_email"), 5);
	}
	
	public void setEmailFriend(String emailfriend) {
		WebElement emailfriendInput = getEmailFriend();
		emailfriendInput.clear();
		emailfriendInput.sendKeys(emailfriend);
	}
	
	public void enterfriendnameAndemail(String namefriend, String emailfriend){
		setNameFriend(namefriend);
		setEmailFriend(emailfriend);
	}
	
	public WebElement getTShirtsTab() {
		return Utils.waitForElementPresence(driver, By.xpath("(//a[contains(text(),\'T-shirts\')])[3]"), 5);
	}
	
	public WebElement getTops() {
		return Utils.waitForElementPresence(driver, By.xpath("(//a[contains(text(),\'Tops\')])[2]"), 5);
	}
	
	public WebElement getWomen() {
		return Utils.waitForElementPresence(driver, By.xpath("(//a[contains(text(),\'Women\')])[2]"), 5);
	}
	
	public WebElement getHome() {
		return Utils.waitForElementPresence(driver, By.xpath("//a/i"), 5);
	}
	
	public WebElement getDisplayAllPictures() {
		return Utils.waitForElementPresence(driver, By.id("//a[@name=\'resetImages\']"), 5);
	}
	
	public WebElement getSmallPicRightArrow() {
		return Utils.waitForElementPresence(driver, By.id("view_scroll_right"), 5);
	}
	
	public WebElement getSmallPicLeftArrow() {
		return Utils.waitForElementPresence(driver, By.id("view_scroll_left"), 5);
	}

}