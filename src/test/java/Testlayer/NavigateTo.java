package Testlayer;

import BaseLayer.BaseClass;

public class NavigateTo extends BaseClass {
	
	public static void main(String[] args) {
		BaseClass.initilization();
		driver.navigate().to("https://www.twitter.com");
	}

}
