package Day4;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkboxandalert {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
        

        driver.manage().window().maximize();
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(By.xpath("//input[@id='sunday']")).click();                               //  select only sunday
        
                                                                                                     //select all checkboxssss
        
       List<WebElement> checkbox= driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']")); 
        
    /*    for(int i=0;i<checkbox.size();i++)
        {
        	checkbox.get(i).click();
        }
        
        /*or we can follow another loop
         
          for(WebElement c :checkbox)
           c.click();
        
        */
        
        
                                                                                                   //select last 3 checkbox
        
        
        for(int i=checkbox.size()-3;i<checkbox.size();i++)
        {
        	checkbox.get(i).click();
        }
        Thread.sleep(5000);
                                                                                                   //UNSELECT CHECKBOX
        for(int i=0;i<checkbox.size();i++)
        {
        	if (checkbox.get(i).isSelected()){
        	
        		checkbox.get(i).click();
        }}
        
	
        List<WebElement> Radiobtn= driver.findElements(By.xpath("//input[@class='form-check-input' and @type='radio']")); 
	     
        for(int i=0;i<Radiobtn.size();i++)
        	Radiobtn.get(i).click();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	//or
        
        for(WebElement r : Radiobtn)
        	r.click();
        
        Thread.sleep(3000);
        for(int i=0;i<Radiobtn.size();i++) {
            if(Radiobtn.get(i).isSelected())
            {
            	Radiobtn.get(i).click();
            }
	
	
	
        }
	
	}

}
