package google;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox3 {

	public static void main(String[] args) {
		System.setProperty("WebDriver.chrome.driver","D://Sofrwares/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://echoecho.com/htmlforms10.htm");
		driver.manage().window().maximize();
		
		
		
		
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
		System.out.println("Final Selection");
		List<WebElement> radioButton1 = driver.findElements(By.xpath("//input[@type='radio' and @name='group1']"));
		List<WebElement> radioButton2 = driver.findElements(By.xpath("//input[@type='radio' and @name='group2']"));

		for (WebElement radioButtonj : radioButton1) {
		    if (radioButtonj.isSelected()) {
		        System.out.println(radioButtonj.getAttribute("value"));
		        break; // Assuming only one radio button can be selected at a time
		    }
		    
		 for (WebElement radioButtoni : radioButton2) {
			    if (radioButtoni.isSelected()) {
			        System.out.println(radioButtoni.getAttribute("value"));
			        break; // Assuming only one radio button can be selected at a time
			    }
		}


	}}

}
