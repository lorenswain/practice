package Day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class wait {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://tinyurl.com/yn2hm4ke");
        driver.manage().window().maximize();
        Thread.sleep(4000);
        driver.findElement(By.id("ap_email")).sendKeys("dex-ssd-qa-mtest+p+0-1744104414362iZFa@amazon.com");
        driver.findElement(By.className("a-button-input")).click();
        driver.findElement(By.name("password")).sendKeys("testtest");
        driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
        
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        
        
        
        
        
        
        

	}

}
