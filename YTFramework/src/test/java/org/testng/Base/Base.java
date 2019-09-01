package org.testng.Base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base {
	
	public ChromeDriver driver;
	public Properties pr;
	
	@BeforeMethod
	public void initialization() throws IOException
	
	{
		File f=new File("D:\\Eclipse Workspace\\YTFramework\\repo.properties");
		FileInputStream fi=new FileInputStream(f);
		pr=new Properties();
		pr.load(fi);
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ROYAL COMPUTER\\Downloads\\Softwares\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.youtube.com/");                  //Browser Launch and Youtube URL hit
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	}
	
	/*@AfterMethod 
	public void close()
	{
		driver.close();      //closing the browser
	}*/
	
	
	
	

	
	
	
}
