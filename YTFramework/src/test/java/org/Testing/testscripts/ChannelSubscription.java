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
import org.testng.pages.Video;
import org.utilities.Logs;
import org.utilities.Screenshot;

public class ChannelSubscription extends Base {
  
	
	@Test
	public void action() throws InterruptedException, IOException
	{
		  
		Login l=new Login(driver,pr);
	    l.Signin("ravinyou85","Punjabi@584");  //Login function defined in other Package
        Thread.sleep(4000);
        driver.navigate().refresh();    //To avoid Pop-up
        Thread.sleep(3000);
        Video vd=new Video(driver,pr);           // Clicking on the particular video.
        vd.videoplay();
        driver.manage().timeouts().implicitlyWait(6,TimeUnit.SECONDS);
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();",driver.findElement(By.xpath(pr.getProperty("ChannelSubs")))); //clicking on the Subscribe button.
        Thread.sleep(4000);
        Screenshot.take_ScreenShot(driver,"C:\\Users\\ROYAL COMPUTER\\Desktop\\YouTubeScreenshots\\ChannelSunscribe.png");
        Logs.takelog("ChannelSubscription","Play the video and click on the Subscribe button");
	}

	
	
	
	
}
