package repository;


import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.WebDriver;

public class login {
	
	WebDriver driver;
	//Constructor that will be automatically called as soon as the object of the class is created
	public login(WebDriver driver) {
		this.driver=driver;
	}
	By emaill = new By.ById("email");
	By passl = new By.ById("pass");
	By loginl = new By.ByName("login");
	
	public void enterid(String id) {
		driver.findElement(emaill).sendKeys(id);
	}
	public void enterpw(String pw) {
		driver.findElement(passl).sendKeys(pw);
	}
	public void login() {
		driver.findElement(loginl).click();
	}
			
	

}
