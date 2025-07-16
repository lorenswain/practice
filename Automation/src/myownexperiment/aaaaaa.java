package myownexperiment;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Gatherer.Integrator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class aaaaaa {
	public static void main(String[]args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		int []a= {3,7,8,9,2};
		 
		System.out.println(a[3]);
		
		int b[]= new int[6];
		 b[0]=1;
		 b[1]=10; b[2]=20; b[3]=30; b[4]=40; b[5]=5;
		 
		 System.out.println(b[3]);
		 
		 ArrayList<Integer> c= new ArrayList<Integer>();
		 c.add(90);
		 c.add(70);
		 System.out.println(c);
		 
		 driver.get("https://www.wordtune.com/rewrite");driver.manage().window().maximize();
		 Actions act= new Actions(driver);
		 act.keyDown(Keys.CONTROL).sendKeys("a").sendKeys("c").keyUp(Keys.CONTROL).build().perform();
		 driver.findElement(By.id("widget-textarea")).click();
		 act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
		 Assert.assertTrue(true);		
		WebElement z= driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/section[1]/div[1]/div[1]/a[1]"));
		act.moveToElement(z).click().perform();
		
		Set<String> x = driver.getWindowHandles();
		System.out.println(driver.getTitle());
		for(String x1: x) {
		System.out.println(driver.switchTo().window(x1).getTitle());
		System.out.println(driver.switchTo().window(x1).getCurrentUrl());
		
		List<String> handles = new ArrayList<>(x);
		if(handles.size()<3)
		{
			System.out.println(driver.switchTo().window(handles.get(1)).getPageSource());
			
		}
		
	}
		
		driver.close();
	    driver.quit();}

}
