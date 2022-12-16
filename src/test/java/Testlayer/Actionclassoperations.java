package Testlayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionclassoperations {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
	//drag and drop
		Actions act=new Actions(driver);
		for(int i=1;i<=7;i++)
		{
		WebElement src=driver.findElement(By.id("box" +i));
		WebElement dist=driver.findElement(By.id("box10"+i));
		//action chain
		act.dragAndDrop(src, dist).build().perform();
		}
	
	}

}
