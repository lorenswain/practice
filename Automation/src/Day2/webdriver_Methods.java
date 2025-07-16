package Day2;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webdriver_Methods {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://tinyurl.com/yn2hm4ke");
        driver.manage().window().maximize();
        Thread.sleep(4000);
        driver.findElement(By.id("ap_email")).sendKeys("dex-ssd-qa-mtest+p+0-1744104414362iZFa@amazon.com");
        driver.findElement(By.className("a-button-input")).click();
        driver.findElement(By.name("password")).sendKeys("testtest");
        driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
        
        
        
        

      //getTitle()------------------- returns title of the page System.out.println(driver.getTitle()); //OrangeHRM
      //getCurrentUrl()-------------- returns URL of the page
                                //System.out.println(driver.getCurrentUrl()); //https://opensource-demo.orangehrmlive.com/web/index.php/a
      //getPageSource()-------------- returns source code of the page //System.out.println(driver.getPageSource());
      //getWindowHandle()------------ returns ID of the single Browser window
                                // String windowid-driver.getWindowHandle();
                                // System.out.println("Window ID: "+ windowid); //2C12CA3BA63C9819A03E4C8C98D55F7C
      
      //getWindowHandles() - retuns ID's of the multiple browser windows
        
        String x[]= {
        driver.getTitle(),
        driver.getCurrentUrl(),
        driver.getPageSource(),
        driver.getWindowHandle()
        };
        
       for(int i=0;i< x.length;i++) {
        System.out.print(x[i]);
       System.out.print("--------------------------------------");      
       }
        
        
       

           //   Set<String> windowids=driver.getWindowHandles();
             //    System.out.println(windowids); //[495D26972EA78583B6AC4278855D6EA0, EA208DEDD8103214FE92B755519C704D]
       
       
       
       
       
/*
conditional methods - access these commands thorugh WebElement    =----retuns boolean value(true/false)
                     isDisplayed() 
                     isEnabled()
                     isSelected()
       
       */
       
       
       System.out.println(driver.findElement(By.id("nav-logo-sprites")).isDisplayed());
       
       
       
        driver.close();
        
        	
	}

}
  