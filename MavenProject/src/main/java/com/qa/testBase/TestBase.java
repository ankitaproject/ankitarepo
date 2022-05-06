package com.qa.testBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;

import com.qa.pageLayer.Homepage;
import com.qa.utilities.Util;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
public static WebDriver driver;
public Homepage h;
public Util u;
public SoftAssert s;
@BeforeMethod
public void setup()
{
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	h=new Homepage();
	u=new Util();
	s=new SoftAssert();
}
@AfterMethod()
public void TearDown()
{
driver.quit();	
}
}
