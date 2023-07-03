package PAGECLASS;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	WebDriver driver;
	
	 By Login = By.xpath("//body[1]/section[1]/header[1]/div[2]/div[3]/div[2]/a[1]");
	// By mail = By.name("email");
	 By mail= By.xpath("//*[@id=\"login\"]/div[3]/div[2]/div[2]/div/form/div[1]/input");
	 By pass= By.xpath("//*[@id=\"login\"]/div[3]/div[2]/div[2]/div/form/div[2]/input");
	// By pass = By.name("password");
     By Login_Button = By.xpath("//*[@id=\"login\"]/div[3]/div[2]/div[2]/div/form/div[3]/input");
 
    
     public LoginPage(WebDriver driver)
	   {
		   this.driver= driver;
	   }

     public void Login() 
 	{
    	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    	 driver.findElement(Login).click();
 		
 	}
	
    public void setvalues(String email,String password)
    {
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    	driver.findElement(mail).sendKeys(email);
  	    driver.findElement(pass).sendKeys(password);
    }
  
    public void Login_Button()
    {
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    	driver.findElement(Login_Button).click();
    	

    }


	

    

}
