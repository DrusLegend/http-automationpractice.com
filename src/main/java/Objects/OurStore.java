package Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import proba.Utils;

public class OurStore {
	
	private WebDriver driver;
	
	public OurStore(WebDriver driver) {
		this.driver = driver;
	}
	
	public Select getRadiusDropDown() {
		return new Select(Utils.waitForElementPresence(driver, By.id("radiusSelect"), 5));
	}
	
	public WebElement getSearchBtn() {
		return Utils.waitForElementPresence(driver, By.xpath("//div[3]/button/span"), 5);
	}
	
	public WebElement getMessage() {
		return Utils.waitForElementPresence(driver, By.xpath("//p[contains(.,\'Address, zip / postal code, city, state or country Not found\')]"), 5);
	}
	
	public WebElement getCloseX() {
		return Utils.waitForElementPresence(driver, By.xpath("//body/div[2]/div/div/a"), 5);
	}
	
	public WebElement getYourLocation() {
		return Utils.waitForElementPresence(driver, By.id("addressInput"), 5);
	}
	
	public void setYourLocation(String yourlocation) {
		WebElement yourlocationInput = getYourLocation();
		yourlocationInput.clear();
		yourlocationInput.sendKeys(yourlocation);
	}
	
	public void newsemail (String yourlocation){
		setYourLocation(yourlocation);		
	}
	
	public WebElement getMessage2() {
		return Utils.waitForElementPresence(driver, By.xpath("//p[contains(.,\'4565465 Not found\')]"), 5);
	}
	
	public WebElement getCloseX2() {
		return Utils.waitForElementPresence(driver, By.xpath("//body/div[2]/div/div/a"), 5);
	}
	
	public WebElement getMapOkBtn() {
		return Utils.waitForElementPresence(driver, By.xpath("//button[contains(.,\'OK\')]"), 5);
	}
	
	public WebElement getPlus() {
		return Utils.waitForElementPresence(driver, By.xpath("(//button[@type=\'button\'])[3]"), 5);
	}
	
	public WebElement getMinus() {
		return Utils.waitForElementPresence(driver, By.xpath("(//button[@type=\'button\'])[4]"), 5);
	}
	
	public WebElement getFullScreen() {
		return Utils.waitForElementPresence(driver, By.cssSelector(".gm-fullscreen-control"), 5);
	}

}