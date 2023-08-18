package homepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class signup {

	public static void main(String[] args) {
		System.setProperty("WebDriver.chrome.driver","D://Sofrwares/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.partialLinkText("Create new account")).click();
		//driver.findElement(By.id("email")).sendKeys("9876543210");
		//driver.findElement(By.id("pass")).sendKeys("abc123xyz");
		
		

	}

}
