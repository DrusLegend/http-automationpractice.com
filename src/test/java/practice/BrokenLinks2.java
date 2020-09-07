package practice;

import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.List;		
import java.util.concurrent.TimeUnit;		
import org.openqa.selenium.*;	

public class BrokenLinks2 {
	
	public static void main(String[] args) {									
								
        WebDriver driver = new FirefoxDriver();					
        		
        String myStoreTitle = "Under Construction: My Store";						
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);	
		driver.manage().window().maximize();

		driver.get("http://automationpractice.com/index.php");					
        List<WebElement> linkElements = driver.findElements(By.tagName("a"));							
        String[] linkTexts = new String[linkElements.size()];							
			int					i = 0;					
	
			for (WebElement e : linkElements) {							
			linkTexts[i] = e.getText();							
			i++;			
        }		
	
			for (String t : linkTexts) {							
			driver.findElement(By.linkText(t)).click();					
			if (driver.getTitle().equals(myStoreTitle)) {							
                System.out.println("\"" + t + "\""								
                        + " is under construction.");			
            } else {			
                System.out.println("\"" + t + "\""								
                        + " is working.");			
            }		

			driver.navigate().back();	
        }		
			driver.quit();			
    }		
}