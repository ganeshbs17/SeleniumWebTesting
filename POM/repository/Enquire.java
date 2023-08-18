package repository;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.WebDriver;

public class Enquire {
		WebDriver driver;
	//Constructor that will be automatically called as soon as the object of the class is created
		public Enquire(WebDriver driver) {
			this.driver=driver;
		}
		
		By namel = new ById("enquiry_name");
		By emaill = new ByName("enquiry_email");
		By phonel = new By.ById("enquiry_phone");
		By msgl = new By.ById("enquiry_message");
		
		public void enterName(String name) {
			driver.findElement(namel).sendKeys(name);
		}
		public void enterEmail(String email) {
			driver.findElement(emaill).sendKeys(email);
		}
		public void enterPhone(String phone) {
			driver.findElement(phonel).sendKeys(phone);
		}
		public void enterMsg(String msg) {
			driver.findElement(msgl).sendKeys(msg);
		}
		
		
}
