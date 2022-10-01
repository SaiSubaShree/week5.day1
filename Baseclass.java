package week5.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
ChromeDriver driver;
@BeforeMethod
public void Login()	
{
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.get("http://leaftaps.com/opentaps/control/main");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//input[@name='USERNAME']")).sendKeys("DemoCSR");
	driver.findElement(By.xpath("//input[@name='PASSWORD']")).sendKeys("crmsfa");
	driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
	driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
	driver.findElement(By.xpath("//a[text()='Leads']")).click();
	
}
@AfterMethod
public void close()
{
	driver.quit();
}
	
}
