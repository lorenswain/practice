package Day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragdrop {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("URL");
		
        
        driver.manage().window().maximize();Thread.sleep(20000);
        WebElement SOURCE= driver.findElement(By.xpath(""));
        WebElement TARGET= driver.findElement(By.xpath(""));
        
        Actions act=new Actions(driver);
        act.dragAndDrop(SOURCE, TARGET).perform();

	}

}
