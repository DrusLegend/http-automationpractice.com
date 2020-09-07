package Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import proba.Utils;

public class ConSign {
	
	private WebDriver driver;
	
	public ConSign(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getHomeIcon(){
		return Utils.waitForElementPresence(driver, By.xpath("//a/i"), 5);
	}
	
	public Select getSubjectHeadingDropDown() {
		return new Select(Utils.waitForElementPresence(driver, By.id("id_contact"), 5));
	}
	
	public WebElement getEmail() {
		return Utils.waitForElementPresence(driver, By.id("email"), 5);
	}
	
	public void setEmail(String email) {
		WebElement emailInput = getEmail();
		emailInput.clear();
		emailInput.sendKeys(email);
	}
	
	public WebElement getOrderReference() {
		return Utils.waitForElementPresence(driver, By.id("id_order"), 5);
	}
	
	public void setOrderReference(String orderreference) {
		WebElement orderreferenceInput = getOrderReference();
		orderreferenceInput.clear();
		orderreferenceInput.sendKeys(orderreference);
	}
	
	public WebElement getMessage() {
		return Utils.waitForElementPresence(driver, By.id("message"), 5);
	}
	
	public void setMessage(String message) {
		WebElement messageInput = getMessage();
		messageInput.clear();
		messageInput.sendKeys(message);
	}
	
	public void entertext (String email, String orderreference, String message){
		setEmail(email);
		setOrderReference(orderreference);
		setMessage(message);
	}
	
	public WebElement getSendBtn(){
		return Utils.waitForElementPresence(driver, By.xpath("//span[contains(.,\'Send\')]"), 5);
	}
	
	public WebElement getAttachFile() {
		return Utils.waitForElementPresence(driver, By.id("fileUpload"), 5);
	}
	
	public WebElement getErrorMessage(){
		return Utils.waitForElementPresence(driver, By.xpath("//p[contains(.,\'There is 1 error\')]"), 5);
	}
	
	public WebElement getHomeBtn() {
		return Utils.waitForElementPresence(driver, By.cssSelector(".home"), 5);
	}
	
	public WebElement getCreateAccountEmail() {
		return Utils.waitForElementPresence(driver, By.id("email_create"), 5);
	}
	
	public void setCreateAccountEmail(String createaccountemail) {
		WebElement createaccountemailInput = getCreateAccountEmail();
		createaccountemailInput.clear();
		createaccountemailInput.sendKeys(createaccountemail);
	}
	
	public void creaccount (String createaccountemail){
		setCreateAccountEmail(createaccountemail);		
	}
	
	public WebElement getCreateAccountBtn(){
		return Utils.waitForElementPresence(driver, By.xpath("//button[@id=\'SubmitCreate\']/span"), 5);
	}
	
	public WebElement getErrorMessage2(){
		return Utils.waitForElementPresence(driver, By.xpath("//li[contains(.,\'Invalid email address.\')]"), 5);
	}
	
	public WebElement getAlredyRegisteredEmail() {
		return Utils.waitForElementPresence(driver, By.id("email"), 5);
	}
	
	public void setAlredyRegisteredEmail(String alredyregisteredemail) {
		WebElement alredyregisteredemailInput = getAlredyRegisteredEmail();
		alredyregisteredemailInput.clear();
		alredyregisteredemailInput.sendKeys(alredyregisteredemail);
	}
	
	public WebElement getPassword() {
		return Utils.waitForElementPresence(driver, By.id("passwd"), 5);
	}
	
	public void setPassword(String password) {
		WebElement passwordInput = getPassword();
		passwordInput.clear();
		passwordInput.sendKeys(password);
	}
	
	public void enteralregistered (String alredyregisteredemail, String password){
		setAlredyRegisteredEmail(alredyregisteredemail);
		setPassword(password);
	}
	
	public WebElement getSingInBtn(){
		return Utils.waitForElementPresence(driver, By.xpath("//button[@id=\'SubmitLogin\']/span"), 5);
	}
	
	public WebElement getForgotPassword(){
		return Utils.waitForElementPresence(driver, By.xpath("//a[contains(text(),'Forgot your password?')]"), 5);
	}
	
	public WebElement getAuthentication(){
		return Utils.waitForElementPresence(driver, By.xpath("//a[contains(text(),\'Authentication\')]"), 5);
	}
	
	public WebElement getForgotPasswordEmail() {
		return Utils.waitForElementPresence(driver, By.id("email"), 5);
	}
	
	public void setForgotPasswordEmail(String forgotpasswordemail) {
		WebElement forgotpasswordemailInput = getForgotPasswordEmail();
		forgotpasswordemailInput.clear();
		forgotpasswordemailInput.sendKeys(forgotpasswordemail);
	}
	
	public void enterforpass(String forgotpasswordemail){
		setForgotPasswordEmail(forgotpasswordemail);		
	}
	
	public WebElement getRetrievePasswordBtn() {
		return Utils.waitForElementPresence(driver, By.xpath("//span[contains(.,\'Retrieve Password\')]"), 5);
	}
	
	public WebElement getBackToLoginBtn() {
		return Utils.waitForElementPresence(driver, By.xpath("//span[contains(.,\'Back to Login\')]"), 5);
	}
	
	public WebElement getErrorMessage3() {
		return Utils.waitForElementPresence(driver, By.cssSelector(".alert"), 5);
	}

}
