package com.qa.utilities;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestListener;

import com.qa.testBase.TestBase;

public class Util extends TestBase implements ITestListener
{
	
public Util()
{
PageFactory.initElements(driver, this);	
}
@FindBy(xpath="//span[@class='nav-cart-icon nav-sprite']")
private WebElement cart;

public void cartclick()
{
	cart.click();
}

@FindBy(xpath="//a[@id='nav-logo-sprites']")
private WebElement logo;

public void checklogo()
{
	Boolean b=logo.isDisplayed();
	System.out.println(b);
}
}