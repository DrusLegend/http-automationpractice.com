package practice;

import java.util.concurrent.TimeUnit;
import static org.testng.AssertJUnit.assertEquals;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Objects.BestSellers;
import Objects.Chart;
import Objects.CheckBoxOther;
import Objects.ConSign;
import Objects.HomePage;
import Objects.QuickView;
import Objects.SiteMap;

@Test
public class AutoTest {
	
	private WebDriver driver;
	private String baseUrl;
	private HomePage homePage;
	private ConSign conSign;
	private QuickView quickView;
	private Chart chart;
	private BestSellers bestSellers;
	private SiteMap siteMap;
	private CheckBoxOther checkBoxOther;
	
	@BeforeSuite
	public void setupSelenium(){
		baseUrl = "http://automationpractice.com/index.php";
		driver = new FirefoxDriver();
		//driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		//driver.manage().window().setSize(new Dimension(1024, 768));
		driver.navigate().to(baseUrl);
	}
	
	@BeforeTest
	private void setupPages() {
		
		homePage = new HomePage(driver);
		conSign = new ConSign(driver);
		quickView = new QuickView(driver);
		chart = new Chart(driver);
		bestSellers = new BestSellers(driver);
		siteMap = new SiteMap(driver);
		checkBoxOther = new CheckBoxOther(driver);
	}
	
	public void setup() throws InterruptedException {
		
		homePage.getContactUs().click();
		conSign.getSubjectHeadingDropDown().selectByVisibleText("Webmaster");
		conSign.entertext("qerrew", "sdfdd", "123466wwuuihufs");
		conSign.getAttachFile().sendKeys("/home/tester/Downloads/a.txt");
		conSign.getSendBtn().click();
		assertEquals(true, conSign.getErrorMessage().isDisplayed());
		driver.navigate().back();
		homePage.getSingIn().click();
		conSign.creaccount("dsfsf");
		conSign.enteralregistered("sfsf", "12345");
		driver.navigate().back();
		assertEquals(true, conSign.getErrorMessage2().isDisplayed());
		assertEquals(true, conSign.getErrorMessage3().isDisplayed());
				
	}
	
	public void page2(){
		
		Actions picture = new Actions(driver);
		picture.moveToElement(homePage.getPictureOne()).perform();
		homePage.getQuickView().click();
		assertEquals(true, homePage.getQuickView().isDisplayed());
		driver.switchTo().frame(1);
		quickView.getSizeDropDown().selectByVisibleText("M");		
		quickView.getQuantityPlus().click();
		quickView.getAddToChart().click();
		assertEquals(true, quickView.getAddToChart().isDisplayed());
		chart.getContinueShoppingBtn().click();
		assertEquals(true, chart.getContinueShoppingBtn().isDisplayed());
	    Actions chart2 = new Actions(driver);
	    chart2.moveToElement(homePage.getCartBtn()).click().perform();
	    homePage.getChartPictures().click();
	    driver.navigate().back();		
	}
	
	public void page3(){
		
		homePage.getWomen().click();
		checkBoxOther.getCotton().click();
		bestSellers.getSorByDropDown().selectByIndex(4);
		bestSellers.getAddToCompare().click();
		bestSellers.getAddToCompare2().click();
		Actions slider = new Actions(driver);
		slider.dragAndDropBy(checkBoxOther.getSliderBtn(), 40, 0).perform();
		slider.dragAndDropBy(checkBoxOther.getSliderBtn2(), -50, 0).click().perform();
		bestSellers.getCompareBtn().click();
		assertEquals(true, bestSellers.getCompareBtn().isDisplayed());
		bestSellers.getRemoveBtn().click();
		assertEquals(true, bestSellers.getRemoveBtn().isSelected());
		driver.navigate().back();
		driver.navigate().back();
		
	}
	
	@AfterSuite
	public void closeSelenium() {
		driver.quit();
	}
}