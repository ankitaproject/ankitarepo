package newPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Newpack1 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get("https://www.google.co.in/");
}
}
