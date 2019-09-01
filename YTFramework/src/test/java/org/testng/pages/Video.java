package org.testng.pages;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class Video {

	ChromeDriver driver;
	Properties pr;
	
	public Video(ChromeDriver driver,Properties pr)
	{
		this.driver=driver;
		this.pr=pr;
	}
	
	public void videoplay()
	{
		JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();",driver.findElement(By.xpath(pr.getProperty("VideoLocator"))));   //clicking on the particular video
        driver.manage().timeouts().implicitlyWait(6,TimeUnit.SECONDS);
	}
}
