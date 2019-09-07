package com.bit.test;

import java.io.IOException;
import java.util.Properties;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.utility.ReadPropFile;

public class BaseTest {

	WebDriver driver;
	
	@Before
	public void openBrowser () throws IOException {
	Properties prop = ReadPropFile.readFile("/Users/syedahasan/eclipse-workspace/PomHomeWork/src/config.properties");	
	String browser = prop.getProperty("browser");	
	
	if (browser.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver", "/Users/syedahasan/Downloads/chromedriver");
	     driver= new ChromeDriver();
	   driver.manage().window().maximize();
				
	}
	else if (browser.equals("firefox")) {
	driver = new FirefoxDriver ();	
	System.out.println("check branch connection");
		
	}
	else if (browser.equals("ie")) {
	driver = new InternetExplorerDriver();
	}
	driver.get(prop.getProperty("url"));
	
	}
	
	@After
	public void closeBrowser () throws InterruptedException {
	Thread.sleep(4000);	
	driver.quit();	
	}

	
	
	
	
}
