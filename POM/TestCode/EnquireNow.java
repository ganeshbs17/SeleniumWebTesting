package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import repository.Pom;
import repository.login;
import repository.Enquire;

public class TestngPOM {
	
	@Test
	public void enquire() {
		System.setProperty("WebDriver.chrome.driver", "D://Sofrwares/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://cuesysinfotech.com");
		driver.manage().window().maximize();
		
//		Pom p = new Pom(driver); 
//		p.print();
		Enquire enq = new Enquire(driver);
		
		enq.enterName("Ganesh");
		enq.enterEmail("test@gmail.com");
		enq.enterPhone("9876543210");
		enq.enterMsg("My name is Ganesh, and I completed Enquire now task");
		//driver.findElement(By.className("enquire-btn")).click();
		
	}
	
	@Test
	public void fblogin() {
		System.setProperty("WebDriver.gecko.driver","D://Sofrwares/geckodriver-v0.33.0-win-aarch64/geckodriver.exe\"");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		login lgin = new login(driver);
		
		lgin.enterid("9019456512");
		lgin.enterpw("abc123xyz");
		lgin.login();
		
	}
	
	@Test
	public void radio() {
		System.setProperty("WebDriver.edge.driver","D://Sofrwares/edgedriver_win64/msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://echoecho.com/htmlforms10.htm");
		driver.manage().window().maximize();
		
		
		
		//int i = new driver.findElement(By.xpath("//input[@value='Cheese']")).get().click();
		int count1 =  driver.findElements(By.xpath("//input[@name='group1']")).size();
		System.out.println("Set 1");
		for(int i = 0;i<count1;i++) {
			driver.findElements(By.xpath("//input[@name='group1']")).get(i).click();
			System.out.println(driver.findElements(By.xpath("//input[@name='group1']")).get(i).getAttribute("value"));
			
//			String ele = (driver.findElements(By.xpath("//input[@name='group1']")).get(i).getAttribute("value"));
//			System.out.println(ele);
			
		}
		
		
		System.out.println("Set 2");
		int count2 =  driver.findElements(By.xpath("//input[@name='group2']")).size();
		for(int i = 0;i<count2;i++) {
			driver.findElements(By.xpath("//input[@name='group2']")).get(i).click();
			System.out.println(driver.findElements(By.xpath("//input[@name='group2']")).get(i).getAttribute("value"));
	
		
	}
	}
}
