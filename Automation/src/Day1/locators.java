package Day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://tinyurl.com/yn2hm4ke");
        driver.manage().window().maximize();
        Thread.sleep(4000);
        driver.findElement(By.id("ap_email")).sendKeys("dex-ssd-qa-mtest+p+0-1744104414362iZFa@amazon.com");
        driver.findElement(By.className("a-button-input")).click();
        driver.findElement(By.name("password")).sendKeys("testtest");
        driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
        
        
        System.out.println(driver.getCurrentUrl());                                      // get url
        System.out.println(driver.getTitle());                                            // get title
        
        
        List<WebElement> image1 =driver.findElements(By.tagName("img"));
        System.out.println(image1.size());                                             //total number of img available in the page
        
        
        driver.findElement(By.xpath("//span[text()='Returns']")).click();
        
        driver.findElement(By.linkText("Buy Again")).click();                                //link text
        driver.navigate().back();
        Thread.sleep(4000);
        driver.findElement(By.partialLinkText("Not Yet")).click();
        
         System.out.println(driver.findElement(By.id("nav-logo-sprites")).isDisplayed());          //logo displayed
        
         
         List<WebElement> image =driver.findElements(By.tagName("img"));
         System.out.println(image.size());       
         
         
        /*    CSS selector
         
         { 
         
         tag id
        
         //driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("T-shirts"); 
         //driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("T-shirts");
         
         
         tag class 
         driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("T-shirts");
         driver.findElement(By.cssSelector(".search-box-text")).sendKeys("T-shirts");

         
         
         
         }
         */
         
         
         /*  text/ contains text
          * //h1[text()='Login & Security']
          * //h1[contains(text(),'Login & Security')]
          * */
         
         
         
         
         /*
          
          
          
           Xpath with single attribute
                                            "//input[@id='EMAIL_TITLE']"
           
           xpath with multiple attributes
                                            //input[@name='search'][@id='EMAIL_TITLE']
                                            //h1[@id='EMAIL_TITLE'][@class='a-size-base a-spacing-mini a-text-bold'][@aria-label='Email']          *
         
         
           use of and & OR
           
                           //input[@name='search' and @id='EMAIL_TITLE']
                           ////input[@name='search' or @id='EMAIL_TITLE']
           
          */
         
         
         
         
         
         
         
         
         
         //total number of img available in the page
	}
	
	
	
	
	
	

}
