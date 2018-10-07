package com.qa.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import com.qa.pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.qa.util.TestUtil;

public class TestBase {
	
	protected static WebDriver driver;
	protected static Properties prop;
	public TestBase() throws IOException
	{
		prop = new Properties();
		FileInputStream fs = new FileInputStream("src\\main\\java\\com\\qa\\config\\config.properties");
		prop.load(fs);		
	}
	
	public static void initialization() throws IOException {
		String browser = prop.getProperty("browser");
		
		if(browser.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "src\\main\\java\\com\\qa\\exefiles\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		else if(browser.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "src\\main\\java\\com\\qa\\exefiles\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get(prop.getProperty("url"));

		
		driver.manage().timeouts().pageLoadTimeout(TestUtil.pageloadtimeout, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.implicitwait, TimeUnit.SECONDS);


	}

}
