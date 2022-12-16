package utilslayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Takescreenshot {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","‪‪D:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.apple.com/in/?afid=p238%7CsdUuvv563-dc_mtid_187079nc38483_pcrid_634106874218_pgrid_109516736379_pntwk_g_pchan__pexid__&cid=aos-IN-kwgo-brand--slid---product-");
	}

}
