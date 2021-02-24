package tnggg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class myntralogin {
	public static void main(String[] args) {
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\user\\eclipse-workspace\\org.chrome\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.get("https://www.myntra.com/");
		//WebElement searchs = driver.findElement(By.xpath("//input[@class=\"desktop-searchBar\"]"));
		//searchs.sendKeys("shoes");
	}

}
