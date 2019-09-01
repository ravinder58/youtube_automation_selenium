package org.Testing.testscripts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Base.Base;
import org.testng.annotations.Test;
import org.testng.pages.Login;
import org.utilities.Logs;
import org.utilities.Screenshot;

public class Subscription extends Base {
 
	
	@Test
	public void action() throws InterruptedException, IOException
	{
	    Login l=new Login(driver,pr);
	    l.Signin("ravinyou85", "Punjabi@584");  //Login function defined in other Package
        Thread.sleep(4000);
        Screenshot.take_ScreenShot(driver,"C:\\Users\\ROYAL COMPUTER\\Desktop\\YouTubeScreenshots\\login.png");
        driver.navigate().refresh();
        WebElement Subscription=driver.findElement(By.xpath(pr.getProperty("Subscription")));
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();",Subscription);
        Thread.sleep(5000);
        Screenshot.take_ScreenShot(driver,"C:\\Users\\ROYAL COMPUTER\\Desktop\\YouTubeScreenshots\\trending.png");   
        Logs.takelog("Subscription","Subscibed to channel successfully");
	}	
}
