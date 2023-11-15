package Seleniumnew.Selenium;

import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.chrome.ChromeDriver;

public class browserlanuch {
	public static void main(String args[]) {
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\Aditi\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		//ChromeOptions co = new ChromeOptions();
		//co.setBinary("C:\\Users\\Aditi\\Downloads\\chrome-win32\\chrome-win32\\chrome.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Options op = driver.manage(); // Options reference variable
		// Options variable is used to manage 
		Window w = op.window(); // maximize window refernce variable 
		w.maximize(); //this command is used to maximize window browser
		
		
	}

}
