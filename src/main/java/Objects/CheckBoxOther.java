package Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import proba.Utils;

public class CheckBoxOther {
	
	private WebDriver driver;
	
	public CheckBoxOther(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getTops() {
		return Utils.waitForElementPresence(driver, By.linkText("Tops"), 5);
	}
	
	public WebElement getDresses() {
		return Utils.waitForElementPresence(driver, By.linkText("Dresses"), 5);
	}
	
	public WebElement getTShirts() {
		return Utils.waitForElementPresence(driver, By.linkText("T-shirts"), 5);
	}
	
	public WebElement getBlouses() {
		return Utils.waitForElementPresence(driver, By.linkText("Blouses"), 5);
	}
	
	public WebElement getCasualDresses() {
		return Utils.waitForElementPresence(driver, By.linkText("Casual Dresses"), 5);
	}
	
	public WebElement getEveningDresses() {
		return Utils.waitForElementPresence(driver, By.linkText("Evening Dresses"), 5);
	}
	
	public WebElement getSummerDresses() {
		return Utils.waitForElementPresence(driver, By.linkText("Summer Dresses"), 5);
	}
	
	public WebElement getPlusBtn() {
		return Utils.waitForElementPresence(driver, By.xpath("//li/span"), 5);
	}
	
	public WebElement getPlusBtn2() {
		return Utils.waitForElementPresence(driver, By.xpath("//li[2]/span"), 5);
	}
	
	public WebElement getSubCategoriesTops() {
		return Utils.waitForElementPresence(driver, By.xpath("//li/div/a/img"), 5);
	}
	
	public WebElement getSubCategoriesDresses() {
		return Utils.waitForElementPresence(driver, By.xpath("//li[2]/div/a/img"), 5);
	}
	
	public WebElement getSubCategoriesCasualDresses() {
		return Utils.waitForElementPresence(driver, By.xpath("//li/div/a/img"), 5);
	}
	
	public WebElement getSubCategoriesEveningDresses() {
		return Utils.waitForElementPresence(driver, By.xpath("//li[2]/div/a/img"), 5);
	}
	
	public WebElement getSubCategoriesSummerDresses() {
		return Utils.waitForElementPresence(driver, By.xpath("//li[3]/div/a/img"), 5);
	}
	
	public WebElement getSubCategoriesTShirts() {
		return Utils.waitForElementPresence(driver, By.xpath("//li/div/a/img"), 5);
	}
	
	public WebElement getSubCategoriesBlouses() {
		return Utils.waitForElementPresence(driver, By.xpath("//li[2]/div/a/img"), 5);
	}
	
	public WebElement getTopsBox() {
		return Utils.waitForElementPresence(driver, By.id("layered_category_4"), 5);
	}
	
	public WebElement getDressesBox() {
		return Utils.waitForElementPresence(driver, By.id("layered_category_8"), 5);
	}
	
	public WebElement getS() {
		return Utils.waitForElementPresence(driver, By.id("layered_id_attribute_group_1"), 5);
	}
	
	public WebElement getM() {
		return Utils.waitForElementPresence(driver, By.id("layered_id_attribute_group_3"), 5);
	}
	
	public WebElement getL() {
		return Utils.waitForElementPresence(driver, By.id("layered_id_attribute_group_2"), 5);
	}
	
	public WebElement getBeige() {
		return Utils.waitForElementPresence(driver, By.id("layered_id_attribute_group_7"), 5);
	}
	
	public WebElement getWhite() {
		return Utils.waitForElementPresence(driver, By.id("layered_id_attribute_group_8"), 5);
	}
	
	public WebElement getBlack() {
		return Utils.waitForElementPresence(driver, By.id("layered_id_attribute_group_11"), 5);
	}
	
	public WebElement getOrange() {
		return Utils.waitForElementPresence(driver, By.id("layered_id_attribute_group_13"), 5);
	}
	
	public WebElement getBlue() {
		return Utils.waitForElementPresence(driver, By.id("layered_id_attribute_group_14"), 5);
	}
	
	public WebElement getGreen() {
		return Utils.waitForElementPresence(driver, By.id("layered_id_attribute_group_15"), 5);
	}
	
	public WebElement getYellow() {
		return Utils.waitForElementPresence(driver, By.id("layered_id_attribute_group_16"), 5);
	}
	
	public WebElement getPink() {
		return Utils.waitForElementPresence(driver, By.id("layered_id_attribute_group_24"), 5);
	}
	
	public WebElement getCotton() {
		return Utils.waitForElementPresence(driver, By.id("layered_id_feature_5"), 5);
	}
	
	public WebElement getPolyester() {
		return Utils.waitForElementPresence(driver, By.id("layered_id_feature_1"), 5);
	}
	
	public WebElement getViscose() {
		return Utils.waitForElementPresence(driver, By.id("layered_id_feature_3"), 5);
	}
	
	public WebElement getCasual() {
		return Utils.waitForElementPresence(driver, By.id("layered_id_feature_11"), 5);
	}
	
	public WebElement getDressy() {
		return Utils.waitForElementPresence(driver, By.id("layered_id_feature_16"), 5);
	}
	
	public WebElement getGirly() {
		return Utils.waitForElementPresence(driver, By.id("layered_id_feature_13"), 5);
	}
	
	public WebElement getColorfulDress() {
		return Utils.waitForElementPresence(driver, By.id("layered_id_feature_18"), 5);
	}
	
	public WebElement getMaxiDress() {
		return Utils.waitForElementPresence(driver, By.id("layered_id_feature_21"), 5);
	}
	
	public WebElement getMidiDress() {
		return Utils.waitForElementPresence(driver, By.id("layered_id_feature_20"), 5);
	}
	
	public WebElement getShortDress() {
		return Utils.waitForElementPresence(driver, By.id("layered_id_feature_19"), 5);
	}
	
	public WebElement getShortSleeve() {
		return Utils.waitForElementPresence(driver, By.id("layered_id_feature_17"), 5);
	}
	
	public WebElement getInStock() {
		return Utils.waitForElementPresence(driver, By.id("layered_quantity_1"), 5);
	}
	
	public WebElement getFashionManufacturer() {
		return Utils.waitForElementPresence(driver, By.id("layered_manufacturer_1"), 5);
	}
	
	public WebElement getNew() {
		return Utils.waitForElementPresence(driver, By.id("layered_condition_new"), 5);
	}
	
	public WebElement getSliderBtn() {
		return Utils.waitForElementPresence(driver, By.xpath("//div[@id=\'layered_price_slider\']/a"), 5);
	}
	
	public WebElement getSliderBtn2() {
		return Utils.waitForElementPresence(driver, By.xpath("//div[@id=\'layered_price_slider\']/a[2]"), 5);
	}

}