package StepDefinations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObject.AddCustomerPage;
import PageObject.LoginPage;
import io.cucumber.java.en.*;
import org.junit.Assert;

public class stepdef 
{
	public WebDriver driver;
//	public LoginPage lg;
	public AddCustomerPage Apg;
	
	
	@Given("User Launch Chrome Browser")
	public void user_launch_chrome_browser()
	{
		System.setProperty("webdriver.chrome.driver","E:\\soft testing\\se1\\chromedriver.exe");
		driver = new ChromeDriver();
		Apg= new AddCustomerPage(driver);
	}
	
	@When("User opens URL {string}")
	public void user_opens_url(String string) 
	{
		driver.get("https://admin-demo.nopcommerce.com/login");
//	    driver.manage().window().maximize();
	}


//	@When("User Opens URL {string}")
//	public void user_opens_url(String url)
//	{
//	    driver.get(url);
//	    driver.manage().window().maximize();
//	}

	@When("User enter Email as {string} and Password as {string}")
	public void user_enter_email_as_and_password_as(String email, String password) throws InterruptedException 
	{
	   Apg.fb();
	}

	@When("Click on Login Button")
	public void click_on_login_button() throws InterruptedException 
	{
		Apg.CLick_login();
	}

	@Then("Page Title  Should be {string}")
	public void page_title_should_be(String string)
	{
		System.out.println(driver.getTitle());
	}
	
	@Then("user can view Dashboard")
	public void user_can_view_dashboard() 
	{
		System.out.println(driver.getTitle());
	}

	@When("user click on Customer Menu")
	public void user_click_on_customer_menu() throws InterruptedException
	{
	      Apg.Customer();
	}

	@When("click on customer menu Item")
	public void click_on_customer_menu_item() throws InterruptedException 
	{
	    Apg.NewCust();
	}

	@When("click on Add new button")
	public void click_on_add_new_button() throws InterruptedException
	{
	    Apg.AddCust();
	}

	
	@When("user enter customer info")
	public void user_enter_customer_info() throws InterruptedException 
	{
	    Apg.newcustinfo();
	}

	@When("click on save button")
	public void click_on_save_button() throws InterruptedException 
	{
	    Apg.Save();
	}

	@Then("user can view conformation message")
	public void user_can_view_conformation_message()
	{
	    System.out.println(driver.getTitle());  
	}
//	@Then("Page Title Should be {string}")
//	public void page_title_should_be(String string)
//	{
//		System.out.println(driver.getTitle());
//	    if(driver.getPageSource().contains("Login was unsuccesful."))
//	    {
//	    	driver.close();
//	    }
//	    else
//	    {
//	    	Assert.assertEquals(string,driver.getTitle());
//	    }
//	}
   
	@When("User Click on Logout button")
	public void user_click_on_logout_button() throws InterruptedException
	{
	   Apg.CLick_logout();
	   Thread.sleep(3000);
	}
	
	@Then("close browser")
	public void close_browser()
	{
	   driver.close(); 
	}
}