package utilslayer;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javaexecuter {
static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"D:\\AllDrivers\\chromedriver_win32 (1)\\chromedriver.exe");
					
		 driver =new ChromeDriver();
		
		driver.get("https://www.facebook.com/login/");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("notty.akshay007@gmail.com");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("akkshhey");
		WebElement wb=driver.findElement(By.xpath("//button[@value]"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",wb);
		js.executeScript("arguments[0].click();", wb);
	}

}
