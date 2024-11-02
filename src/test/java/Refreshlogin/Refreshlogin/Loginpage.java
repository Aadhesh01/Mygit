package Refreshlogin.Refreshlogin;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

class Loginpage {
	WebDriver driver;
	WebDriverWait wait;

	@Test
	public void test() {
		driver = new ChromeDriver();
		driver.get("https://automationexercise.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement ele = driver.findElement(By.xpath("//a[@class='btn btn-default add-to-cart']"));

		//Creating object of an Actions class
//		Actions action = new Actions(driver);
//
//		//Performing the mouse hover action on the target element.
//		action.moveToElement(ele).perform();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement ele1= driver.findElement(By.xpath("//a[@class='btn btn-default add-to-cart']"));
		wait=new WebDriverWait(driver,Duration.ofSeconds(15));
		wait.until(ExpectedConditions.elementToBeClickable(ele1));
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//a[@class='btn btn-default add-to-cart']")).click();
		driver.findElement(By.xpath("//u[text()='View Cart']")).click();
		driver.findElement(By.xpath("//a[@class='btn btn-default check_out']")).click();
		driver.findElement(By.xpath("//u[text()='Register / Login']")).click();
		driver.findElement(By.xpath("//a[@style='color: orange;']")).click();
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("test@test111511.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("test@123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//i[@class='fa fa-shopping-cart']")).click();
		driver.findElement(By.xpath("//a[@class='btn btn-default check_out']")).click();
		driver.findElement(By.xpath("//a[text()='Place Order']")).click();
                System.out.println("yes");
		
		
		
	}

}
