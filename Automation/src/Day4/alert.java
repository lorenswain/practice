package Day4;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        

        driver.manage().window().maximize();
        
        
        driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));           //normal alert ok btn
        Alert x= driver.switchTo().alert();//.getText(); 
        System.out.println(x.getText());
        Thread.sleep(5000);
        driver.switchTo().alert().accept();
        
        
        Thread.sleep(5000);                                                         //alert ok,cancel
        driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
        driver.switchTo().alert().getText(); Thread.sleep(5000);
        driver.switchTo().alert().accept();
        driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click(); Thread.sleep(5000);
        driver.switchTo().alert().dismiss();
         
        
        
        Thread.sleep(5000);
        driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
        driver.switchTo().alert().sendKeys("loren");Thread.sleep(5000);
        Alert y= driver.switchTo().alert();
        System.out.println(y.getText());
        y.accept();Thread.sleep(5000);
        
        driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
        driver.switchTo().alert().sendKeys("loren");
        //y.dismiss();
        
        
        
       // http://username:password@the-internet.herokuapp.com/basic_auth           //when username password popup come
        // http://admin:admin@the-internet.herokuapp.com/basic_auth
	}

}
