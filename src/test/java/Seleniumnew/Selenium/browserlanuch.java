package Seleniumnew.Selenium;

import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.chrome.ChromeDriver;

public class browserlanuch {
	public static void main(String args[]) throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\Aditi\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		//ChromeOptions co = new ChromeOptions();
		//co.setBinary("C:\\Users\\Aditi\\Downloads\\chrome-win32\\chrome-win32\\chrome.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Options op = driver.manage(); // Options reference variable
		// Options variable is used to manage 
		Window w = op.window(); // maximize window refernce variable 
		w.maximize(); //this command is used to maximize window browser
		//login method
		WebElement user = driver.findElement(By.id("email"));
		user.sendKeys("xyz@abc.com");
		WebElement userpass = driver.findElement(By.xpath("//input[@name='pass']"));
		userpass.sendKeys("abc334");
		//create new account script
		WebElement createaccount = driver.findElement(By.linkText("Create new account"));
		createaccount.click();
		Thread.sleep(3000);
		WebElement firstname = driver.findElement(By.name("firstname"));
		firstname.sendKeys("Aditi");
		WebElement lastname = driver.findElement(By.xpath("//input[@name = 'lastname']"));
		lastname.sendKeys("Rajput");
		WebElement email = driver.findElement(By.xpath("//input[@*='reg_email__']"));
		email.sendKeys("aditi.singh@abc.com");
		WebElement email2 = driver.findElement(By.xpath("//input[@*='reg_email_confirmation__']"));
		email2.sendKeys("aditi.singh@abc.com");
		WebElement password = driver.findElement(By.xpath("//input[@id = 'password_step_input']"));
		password.sendKeys("Ashi@2804");
		
	}

}
