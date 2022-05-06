package com.qa.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testBase.TestBase;


public class Homepage extends TestBase {
	public Homepage()
	{
		PageFactory.initElements(driver,this);
	}
	
@FindBy(xpath="(//a[@class='nav-a  '])[5]")
private WebElement fasion;

public void clickonFasion()
{
	fasion.click();
}
@FindBy(xpath="(//a[@class='nav-a  '])[2]")
private WebElement mobile;

public void clickonmobile()
{
	mobile.click();
}
}
