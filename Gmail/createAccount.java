package project;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class signup {

	public static void main(String[] args) throws InterruptedException {
		
		
			System.setProperty("WebDriver.chrome.driver", "D://Sofrwares/chromedriver_win32/chromedriver.exe");
			
			
		
		//createId();
		sendMail() ;
		
	}

	
		
		
	public static void createId() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://accounts.google.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//span[contains(text(),'Create account')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'For my personal use')]")).click();
		
		driver.findElement(By.id("firstName")).sendKeys("Ganesh");
		driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.id("day")).sendKeys("15");
		
		Select month = new Select(driver.findElement(By.id("month")));
		month.selectByValue("2");
		
		driver.findElement(By.name("year")).sendKeys("2002");
		
		Select gender = new Select(driver.findElement(By.id("gender")));
		gender.selectByVisibleText("Male");
		
		driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
		
		driver.findElement(By.name("Username")).sendKeys("ganesh");   //username
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.name("Passwd")).sendKeys("V3ry5tr0ngPW");
		driver.findElement(By.name("PasswdAgain")).sendKeys("V3ry5tr0ngPW");
		driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("phoneNumberId")).sendKeys("8431629389");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
		
		driver.findElement(By.id("code")).click();
		Thread.sleep(20000);
		driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
		
		//skip adding recovery email id
		driver.findElement(By.xpath("//span[contains(text(),'Skip')]")).click();
		//skip adding ph number
		driver.findElement(By.xpath("//span[contains(text(),'Skip')]")).click();
		//confirmation
		driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
		//Agree to T&C
		driver.findElement(By.xpath("//span[contains(text(),'I agree')]")).click();
		
		
		//Account Created Succesfully ganesh17.ibm@gmail.com
		driver.close();
	}
		
		public static void sendMail() {
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://gmail.com/");
			driver.manage().window().maximize();
			
			driver.findElement(By.id("identifierId")).sendKeys("ganesh@gmail.com");      
			driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.findElement(By.name("Passwd")).sendKeys("V3ry5tr0ngPW");
			
			WebDriverWait wait= new WebDriverWait(driver, Duration.ofMinutes(2));
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Next')]"))); 
			driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
			
			driver.findElement(By.xpath("//div[contains(text(),'Compose')]")).click();
			
			//WebDriverWait toAddress = new WebDriverWait(driver, Duration.ofSeconds(10));
			//toAddress.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(text(),'Recipients')]")));
			
			driver.findElement(By.id(":bw")).sendKeys("akashrsgroupmail@gmail.com");
			driver.findElement(By.name("subjectbox")).sendKeys("Ganesh_Savant_Gmail_Project");
			driver.findElement(By.id(":9c"))
			.sendKeys("Hi team,\n"
					+ "I have successfully completed my Gmail project.\n"
					+ "Name: Ganesh Savant\n"
					+ "ID:xxxxx \n\n"
					+ "Regards,\n"
					+ "Ganesh"
					);
					
			driver.findElement(By.id(":7t")).click();
			
			
		}
		
		
		
		
		
		
	}


