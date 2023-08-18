package repository;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Pom {
	
	WebDriver driver;
	//Constructor that will be automatically called as soon as the object of the class is created
		public Pom(WebDriver driver) {
			this.driver=driver;
		}

	
		public void print() {
			System.out.println("hello from other side");
		

	}

}
