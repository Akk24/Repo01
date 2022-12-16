import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fabcebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\TestNG\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.facebook.com/reg/");
		driver.findElement(By.xpath("//input[@name='fname']")).sendKeys("MS");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("DHONI");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).click();
	}

}
