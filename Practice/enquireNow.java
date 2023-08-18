package webapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class enquire {

	public static void main(String[] args) {
		
		System.setProperty("WebDriver.chrome.driver", "C://Sofrwares/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://cuesysinfotech.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("enquiry_name")).sendKeys("Ganesh");
		driver.findElement(By.name("enquiry_email")).sendKeys("test@gmail.com");
		driver.findElement(By.id("enquiry_phone")).sendKeys("9876543210");
		driver.findElement(By.id("enquiry_message")).sendKeys("My name is Ganesh, and I completed Enquire now task");
		driver.findElement(By.className("enquire-btn")).click();
		

	}

}
