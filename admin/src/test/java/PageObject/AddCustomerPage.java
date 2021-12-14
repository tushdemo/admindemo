package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddCustomerPage
{
  
	public WebDriver driver1;
	
	 @FindBy (id="Email")
	  WebElement Username;
	  
	  @FindBy (id="Password")
	  WebElement Password;
	  
	  @FindBy (xpath = "//button[@type='submit']")
	   WebElement Login;
	  
	 
	  @FindBy (xpath= "(//li[@class='nav-item has-treeview'])[4]")
       WebElement Customer;
	
	  @FindBy (xpath="//a[@href='/Admin/Customer/List']")
       WebElement Cust;
	
	  @FindBy (xpath="//a[@href='/Admin/Customer/Create']")
       WebElement AddNew;
	
	  @FindBy (xpath = "//input[@name='Email']")
	   WebElement email;
	  
	  @FindBy (xpath="//input[@name='Password']")
	   WebElement password;
	  
	  @FindBy (xpath="//input[@name='FirstName']")
	   WebElement firstname;
	  
	  @FindBy (xpath = "//input[@name='LastName']")
	   WebElement lastname;
	  
	  @FindBy (xpath = "//input[@id='Gender_Male']")
	   WebElement gender;
	  
	  @FindBy (xpath = "//input[@id='DateOfBirth']")
	  WebElement dateofbirth;
	  
	  @FindBy (xpath="//input[@id='Company']")
       WebElement company;  
	  
//	  @FindBy (xpath="//div[@unselectable='on']//select")
//       WebElement newsletter; 
//	
//	  @FindBy (xpath="(//div[@role='listbox'])[2]")
//       WebElement Custrole; 
	  
	  @FindBy (xpath="//select[@id='VendorId']")
      WebElement vendor;
	  
	  @FindBy (xpath="//button[@name='save']")
       WebElement saveCust;
	  
	  @FindBy (xpath="//a[contains(@href,'/logout')]")
	      WebElement logout; 
	  
	 
	  public AddCustomerPage(WebDriver driver) 
	  {
		  driver1=driver; 
		  PageFactory.initElements(driver, this);
	  }
	  
	  public void fb() throws InterruptedException
	  {
		  Username.clear();
		  Password.clear();
		  Thread.sleep(2000);
		  Username.sendKeys("admin@yourstore.com");
		  Thread.sleep(2000);
		  Password.sendKeys("admin");
		  Thread.sleep(3000);
		  
	  }	
	
	  public void CLick_login() throws InterruptedException
	  {
		  Login.click();
		  Thread.sleep(3000);
	  }
	  
	  public void Customer() throws InterruptedException
	  {
		  Customer.click();
		  Thread.sleep(3000);
	  }
	  public void NewCust() throws InterruptedException
	  {
		  Cust.click();
		  Thread.sleep(3000);
	  }
	  
	  public void AddCust() throws InterruptedException
	  {
		  AddNew.click();
		  Thread.sleep(3000);
	  }
	  
	  public void newcustinfo() throws InterruptedException
	  {
		  email.sendKeys("tusharwarghat123@gmail.com");
		  Thread.sleep(3000);
		  password.sendKeys("123456");
		  Thread.sleep(3000);
		  firstname.sendKeys("Tushar");
		  Thread.sleep(3000);
		  lastname.sendKeys("Warghat");
		  Thread.sleep(3000);
		  gender.click();
		  Thread.sleep(3000);
		  dateofbirth.sendKeys("08-12-1995");
		  Thread.sleep(3000);
		  company.sendKeys("adminorg");
		  Thread.sleep(3000);
//		  Select s = new Select(newsletter);
//		  s.selectByIndex(1);
//		  Thread.sleep(3000);
//		  Select v = new Select(Custrole);
//		  v.selectByValue("5");
		  Thread.sleep(3000);
		  Select d = new Select(vendor);
		  d.selectByVisibleText("Vendor 2");
		  Thread.sleep(3000);
	  }
	 
	  public void Save() throws InterruptedException
	  {
		  saveCust.click();
		  Thread.sleep(3000);
	  }
    
	  public void CLick_logout() throws InterruptedException
	  {
		logout.click();
		Thread.sleep(4000);
	  }
}
