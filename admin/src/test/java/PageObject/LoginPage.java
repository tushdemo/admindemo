package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage
{
	public WebDriver driver1;
	
	  @FindBy (id="Email")
	  WebElement username;
	  
	  @FindBy (id="Password")
	  WebElement password;
	  
	  @FindBy (xpath = "//button[@type='submit']")
	  private WebElement login;
	  
	  @FindBy (xpath="//a[contains(@href,'/logout')]")
      private WebElement logout	;  
	  	  
	  public LoginPage(WebDriver driver) 
	  {
		  driver1=driver; 
		  PageFactory.initElements(driver, this);
	  }
	  
	  public void fb() throws InterruptedException
	  {
		  username.clear();
		  password.clear();
		  Thread.sleep(2000);
		  username.sendKeys("admin@yourstore.com");
		  Thread.sleep(2000);
		  password.sendKeys("admin");
		  Thread.sleep(3000);
		  
	  }	
	  
	  public void CLick_login() throws InterruptedException
	  {
		  login.click();
		  Thread.sleep(3000);
	  }
	  
	  public void CLick_logout() throws InterruptedException
	  {
		logout.click();
		Thread.sleep(4000);
	  }
}