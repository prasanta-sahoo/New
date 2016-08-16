package com.pack.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class Verifylogin {

	
	@Test
	public void validlogin()
	{
   //WebDriver driver= new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver", "D:\\Data_Backups\\Jars\\chromedriver.exe");
		WebDriver	driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://starter.earn.org/login");
    
    First log= new First(driver);
    log.loginvalidation("earn@org", "Temp1234");
      driver.quit();
}
}
