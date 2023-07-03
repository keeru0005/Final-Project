package PAGECLASS;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class HomePage {
	
	WebDriver driver;
	By search = By.name("query");
	By search_button = By.id("search_icon");
	By StartCourse = By.xpath("//*[@id=\"mobile-scroll-anchor\"]/div/div[2]/div[2]/div[3]/a[2]");
	
	public HomePage(WebDriver driver)
	{
		this.driver = driver;
	}

	public void search()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(search).sendKeys("junit");
	}
	
	public void search_button()
	{
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(search_button).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,450)", "");
	}

	public void StartCourse()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(StartCourse).click();;
	}

}
