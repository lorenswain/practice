package Day4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;
public class mouseover {

	public static void main(String[] args) throws InterruptedException {
		
			WebDriver driver= new ChromeDriver();
		driver.get("https://demo.opencart.com/en-gb?route=common/home");
		
        
        driver.manage().window().maximize();Thread.sleep(20000);
        WebElement x= driver.findElement(By.xpath("//a[normalize-space()='Desktops']"));
       
        WebElement y= driver.findElement(By.xpath("//a[normalize-space()='Mac (1)']"));
        
        Actions act= new Actions(driver);
        act.moveToElement(x).moveToElement(y).build().perform();
         
        WebElement z= driver.findElement(By.xpath("//a[normalize-space()='Phones & PDAs']"));
        act.moveToElement(z).doubleClick().build().perform();
	}

}
