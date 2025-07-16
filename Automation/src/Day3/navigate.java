package Day3;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigate {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://tinyurl.com/yn2hm4ke");
        driver.manage().window().maximize();
        Thread.sleep(4000);
        driver.findElement(By.id("ap_email")).sendKeys("dex-ssd-qa-mtest+p+0-1744104414362iZFa@amazon.com");
        driver.findElement(By.className("a-button-input")).click();
        driver.findElement(By.name("password")).sendKeys("testtest");
        driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
     
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        
        /*
         Navigate().to(url) 
         Naviagate().back()
         Naviagate().Forword()
         Naviagate().refresh()
         
         
driver.get()                 ---> accepts URL in string format only
driver.navigate().to()           ---> accepts URL in the string format & URL object format.
         
         
         
         */
         
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
        
        
        
        
      //getWindowHandle()------------ returns ID of the single Browser window
        // String windowid-driver.getWindowHandle();
        // System.out.println("Window ID: "+ windowid); //2C12CA3BA63C9819A03E4C8C98D55F7C

//getWindowHandles() - retuns ID's of the multiple browser windows
        
        



driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
driver.manage().window().maximize();
driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
        
      Set<String> window_ids  = driver.getWindowHandles();
        
      // 1st 
      List<String>window_idlist= new ArrayList(window_ids);
        
        String  x1=window_idlist.get(0);
        String  x2=window_idlist.get(1);
        
        driver.switchTo().window(x2);
        System.out.println(driver.getTitle());
         
       // 2nd
        
        for(String id:window_ids)
        {
        	String x= driver.switchTo().window(id).getTitle();
        	 System.out.println(x);
        	 //if we want to do operation on specific browser window then
        	  // if(x.equals("XyZ")) { System.out.println(driver.getCurrentUrl()); }
        	 
        	 
        }
        	
        
        
        
        
        
        
        
        
        
	}

}
