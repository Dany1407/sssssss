package tnggg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class baseclasssss  {
	public static WebDriver driver;
	public static WebDriver lauchbrower() {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\eclipse-workspace\\redbus\\driver\\chromedriver.exe");
return driver=new ChromeDriver();
	}
	
	public static void lauchurl(String url) {
		driver.get(url);

	}
	public static void userlogin(WebElement e,String value) {
		e.sendKeys(value);
		

	}
	public static void btn(WebElement e) {
		e.click();

	}

}
