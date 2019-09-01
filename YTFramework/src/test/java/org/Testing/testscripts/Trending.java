package org.Testing.testscripts;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Base.Base;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.pages.Login;
import org.utilities.Logs;
import org.utilities.Screenshot;

import net.sourceforge.htmlunit.corejs.javascript.JavaScriptException;

public class Trending extends Base {
  
	@Test
	public void action() throws InterruptedException, IOException
	{
	   Login l=new Login(driver,pr);
	   l.Signin("ravinyou85","Punjabi@584");   //Login function defined in other Package
       Thread.sleep(4000);
       Logs.takelog("Trending","Login Successfull");
       driver.navigate().refresh();
       WebElement Trending= driver.findElement(By.xpath(pr.getProperty("Trending")));  //Clicking the Trending buttom
       JavascriptExecutor js=(JavascriptExecutor) driver;
       js.executeScript("arguments[0].click();",Trending);
        Thread.sleep(5000);
        Screenshot.take_ScreenShot(driver,"C:\\Users\\ROYAL COMPUTER\\Desktop\\YouTubeScreenshots\\Trending.png");
        Logs.takelog("Trending","Clicked on the Trending");
	}

	
	
}
