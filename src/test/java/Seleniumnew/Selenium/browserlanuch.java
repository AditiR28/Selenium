package Seleniumnew.Selenium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class browserlanuch {
	public static void main(String args[]) {
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\Aditi\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		//ChromeOptions co = new ChromeOptions();
		//co.setBinary("C:\\Users\\Aditi\\Downloads\\chrome-win32\\chrome-win32\\chrome.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
	}

}
