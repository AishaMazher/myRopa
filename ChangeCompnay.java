package myRopaLogin;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ChangeCompnay {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\amazher\\Documents\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://identity.myropa.dev/Account/login");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebDriverWait wait=new WebDriverWait(driver, 20);
		driver.findElement(By.id("Username")).sendKeys("ropa.connect@ssidecisions.com");
		driver.findElement(By.id("txtPassword")).sendKeys("RopaConnect2");
		driver.findElement(By.id("button")).click();
		//wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='spinner']")));
		driver.findElement(By.xpath("//a[@href='/account/user/MyProfiles']")).click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='spinner']")));
		driver.findElement(By.name("search")).sendKeys("112020");
		driver.findElement(By.xpath("//li[@class='tcol-2']")).click();
		driver.findElement(By.xpath("//img[@src='images/icon-select.png']")).click();
		System.out.println(driver.findElement(By.xpath("//span[@class='logo-text']")).getText());

	}

}
