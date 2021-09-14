package myRopaLogin;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\amazher\\Documents\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://identity.myropa.dev/Account/login");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.id("Username")).sendKeys("ropa.connect@ssidecisions.com");
		driver.findElement(By.id("txtPassword")).sendKeys("RopaConnect2");
		driver.findElement(By.id("button")).click();
		driver.findElement(By.className("logOut-btn")).click();
	  
		
		
	
	
		

	}

}
