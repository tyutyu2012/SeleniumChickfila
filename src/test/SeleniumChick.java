package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumChick {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/tongyu/eclipse-workspace/SeleniumChickfila/src/test/chromedriver");
		WebDriver webdriver = new ChromeDriver();
		webdriver.get("https://www.chick-fil-a.com/Contact-Support/Send-Feedback");
		Thread.sleep(3000);
		webdriver.findElement(By.linkText("Order & Restaurant Experience Feedback")).click();
		Thread.sleep(3000);
		webdriver.findElement(By.cssSelector("button[data-id='650c381a-4106-4956-b575-8e24872b0669']")).click();
		Thread.sleep(3000);
		webdriver.findElement(By.linkText("Drive-Thru")).click();
		Thread.sleep(3000);
		webdriver.findElement(By.cssSelector("button[data-id='ccb72fb0-e4b4-4b33-ab4a-6901d6b72b37']")).click();
		Thread.sleep(3000);
		webdriver.findElement(By.linkText("Continue")).click();
		Thread.sleep(3000);
		webdriver.findElement(By.cssSelector("li[data-id='{7982F5E2-437D-4E3B-953C-E0890BAA5647}']")).click();
		Thread.sleep(3000);
		webdriver.findElement(By.cssSelector("li[data-name='Taste or quality']")).click();
		Thread.sleep(3000);
		webdriver.findElement(By.cssSelector("button[data-menuitemid='7982f5e2-437d-4e3b-953c-e0890baa5647']")).click();
		Thread.sleep(3000);
		webdriver.findElement(By.linkText("Continue")).click();
		Thread.sleep(3000);
		webdriver.findElement(By.id("contact-form-message")).sendKeys("I love spicy delux chicken sandwich. It's truly amazing!");
		Thread.sleep(3000);
		webdriver.findElement(By.linkText("Continue")).click();
		Thread.sleep(3000);
		webdriver.findElement(By.cssSelector("span[data-tab='secondary']")).click();
		Thread.sleep(3000);
		Select state = new Select(webdriver.findElement(By.cssSelector("select[id='selectAState']")));
		state.selectByValue("TX");
		Thread.sleep(5000);
		Select city = new Select(webdriver.findElement(By.cssSelector("select[id='selectACity']")));
		state.selectByValue("Houston");
	}

}
