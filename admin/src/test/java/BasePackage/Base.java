package BasePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.opera.OperaOptions;

public class Base
{
	public static WebDriver openchromebrowser()
	{
	 ChromeOptions options = new ChromeOptions();
     options.addArguments("--disable-notifications");
     System.setProperty("webdriver.chrome.driver","E:\\soft testing\\se\\chromedriver.exe");
     WebDriver driver = new ChromeDriver(options);
     
     return driver;
	}
	
	public static WebDriver openfirefoxbrowser()
	{
	 FirefoxOptions options = new FirefoxOptions();
     options.addArguments("--disable-notifications");
     System.setProperty("webdriver.gecko.driver","E:\\soft testing\\se\\geckodriver.exe");
     WebDriver driver = new FirefoxDriver(options);
     
     return driver;
	}
	
	public static WebDriver openoperabrowser()
	{
	 OperaOptions options = new OperaOptions();
     options.addArguments("--disable-notifications");
     System.setProperty("webdriver.opera.driver","E:\\soft testing\\se\\operadriver_win64\\operadriver.exe");
     WebDriver driver = new OperaDriver(options);
     
     return driver;
	}
}