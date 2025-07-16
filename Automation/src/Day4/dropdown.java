package Day4;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
        

        driver.manage().window().maximize();
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
       
        WebElement dropdown=driver.findElement(By.xpath("//select[@id='country']"));
      
        Select Dropcountry = new Select(dropdown);
        
        Dropcountry.selectByVisibleText("Japan");
        
        List<WebElement> countdropoption = Dropcountry.getOptions();
        
        System.out.println(countdropoption.size());
        
	}

}
