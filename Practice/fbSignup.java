package google;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class fbsignup {

	public static void main(String[] args) {
		
		System.setProperty("Webdriver.chrome.driver", "D://Sofrwares/chromedriver_win32/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.partialLinkText("Create new account")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.name("firstname")).sendKeys("Ganesh");
		driver.findElement(By.name("lastname")).sendKeys("Savant");
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[2]/div/div[1]/input")).sendKeys("9876543210");
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[4]/div/div[1]/input")).sendKeys("password");
		
		Select bdate = new Select(driver.findElement(By.xpath("//*[@id=\"day\"]")));
		bdate.selectByValue("17");
		Select bmonth = new Select(driver.findElement(By.xpath("//*[@id=\"month\"]")));
		bmonth.selectByValue("12");
		Select byear = new Select(driver.findElement(By.xpath("//*[@id=\"year\"]")));
		byear.selectByValue("2001");
		
		
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[7]/span/span[2]/input")).click();
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[11]/button")).click();
		
		
		
		
		
		

	}

}


}
