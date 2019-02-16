package com.google.workhouse;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class DemoTest {
	WebDriver driver;
    @Test
	public void ValidateLaunch() {
    	String path = System.getProperty("user.dir");
    	//System.out.println(path);
    	String OS=System.getProperty("os.name").toLowerCase();
    	//if(OS.equals("windows")) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mayukh\\Documents\\GitHub\\workhouse\\src\\test\\java\\com\\google\\workhouse\\resources\\chromedriver.exe");
		driver= new ChromeDriver();
		System.out.println("Launched Browser");
		driver.navigate().to("https://www.google.com/");
		
    	//}
    }
    @AfterClass
		public void quitBrowser() {
    	driver.quit();
		System.out.println("Brower closed");                       
		}
		
	

}
