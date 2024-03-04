package additemstocart;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class add_items {
	WebDriver driver = new ChromeDriver();

	@BeforeTest
	public void teting() {
		
		driver.get("https://www.saucedemo.com/v1/");

	}

	@Test()
	public void mytest() {

		driver.findElement(By.id("user-name")).sendKeys("standard_user\r\n");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();

		List<WebElement> add_to_cart = driver.findElements(By.className("btn_primary"));
		for (int i = 0; i < add_to_cart.size(); i++) {
			add_to_cart.get(i).click();
		}
	}

}
