package org.Testing.TestCases.YTFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import net.sourceforge.htmlunit.corejs.javascript.JavaScriptException;

public class Trending extends Credentials {
  
	ChromeDriver driver;
	@BeforeMethod
	public void initialization()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ROYAL COMPUTER\\Downloads\\Softwares\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.youtube.com/");                  //Browser Launch and Youtube URL hit
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
	}
	
	@Test
	public void action() throws InterruptedException
	{
		
		driver.findElement(By.xpath("//paper-button[contains(@aria-label,'Sign in')]")).click(); //Clicking sign in button
		Thread.sleep(3000);
	    WebElement username=driver.findElement(By.xpath("//input[@type='email']"));
	    username.sendKeys(uname);
	    driver.findElement(By.xpath("//span[text()='Next']")).click();
	    for(int i=0;i<=2;i++)
	    {
	    	try 
	    	{
	    		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(pwd);   //Entering the Password
	    	    break;
	    	}
	    	catch(Exception e)
	    	{
	    		System.out.println(e.getMessage());
	    	}
	    	
	    }
	    driver.findElement(By.xpath("//span[text()='Next']")).click();
        Thread.sleep(4000);
        driver.navigate().refresh();
       WebElement Trending= driver.findElement(By.xpath("//span[contains(text(),'Trending')]"));  //Clicking the Trending buttom
       JavascriptExecutor js=(JavascriptExecutor) driver;
       js.executeScript("arguments[0].click();",Trending);
    
        Thread.sleep(5000);
	}

	@AfterMethod
	  
	public void close()
	{
		driver.close();      //closing the browser
	}
	
	
	
	
	
}
