package org.Testing.testscripts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Base.Base;
import org.testng.annotations.Test;
import org.testng.pages.Login;
import org.testng.pages.Video;
import org.utilities.Logs;
import org.utilities.Screenshot;
public class VideoPlay extends Base {
  
	
	
	@Test
	public void action() throws InterruptedException, IOException
	{
		Login l=new Login(driver,pr);
		l.Signin("ravinyou85","Punjabi@584");   //Login function defined in other Package
		Thread.sleep(3000);                     
        driver.navigate().refresh();    //To avoid Pop-up
        Thread.sleep(3000);
        Video vd=new Video(driver,pr);                // Clicking on the particular video.
        vd.videoplay();
        driver.findElement(By.xpath(pr.getProperty("Likebutton"))).click();   //Like the video.
        Screenshot.take_ScreenShot(driver,"C:\\Users\\ROYAL COMPUTER\\Desktop\\YouTubeScreenshots\\PlayVideo.png");
        Logs.takelog("VideoPlay","Clicked on the video successfully and hit the Like button");    
	}	
}
