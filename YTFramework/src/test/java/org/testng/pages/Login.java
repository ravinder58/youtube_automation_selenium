package org.testng.pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
	
	ChromeDriver driver;
	Properties pr;
	public Login(ChromeDriver driver,Properties pr)
	{
		this.driver=driver;
		this.pr=pr;
	}
	public void Signin(String uname,String pwd) throws InterruptedException
	{
		driver.findElement(By.xpath(pr.getProperty("Signinbutton"))).click();   //Clicking sign in button
		Thread.sleep(3000);
	    WebElement username=driver.findElement(By.xpath(pr.getProperty("username")));
	    username.sendKeys(uname);               //sending the user name.
	    driver.findElement(By.id(pr.getProperty("nextbutton"))).click();
	    for(int i=0;i<=2;i++)
	    {
	    	try 
	    	{
	    		driver.findElement(By.xpath(pr.getProperty("password"))).sendKeys(pwd);   //Entering the Password
	    	    break;
	    	}  
	    	catch(Exception e)
	    	{
	    		System.out.println(e.getMessage());
	    	}
	    	
	    }
	    driver.findElement(By.id(pr.getProperty("nextbuttonpass"))).click();
	}

}
