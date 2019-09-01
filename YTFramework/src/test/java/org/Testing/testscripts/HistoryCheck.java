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

public class HistoryCheck extends Base {
 
	
	@Test
	public void action() throws InterruptedException, IOException
	{
		Login l=new Login(driver,pr);
		l.Signin("ravinyou85","Punjabi@584");   //Login function defined in other Package
        Thread.sleep(4000);
        driver.navigate().refresh();
        WebElement History= driver.findElement(By.xpath(pr.getProperty("History")));  //Clicking the History Section 
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();",History);
        Thread.sleep(5000);
        Screenshot.take_ScreenShot(driver,"C:\\Users\\ROYAL COMPUTER\\Desktop\\YouTubeScreenshots\\History.png");
        Logs.takelog("HistoryCheck", "Clicked on the History Button");
	}   

	
	
	
	
	
}
