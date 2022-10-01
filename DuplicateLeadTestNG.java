package week5.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLeadTestNG extends Baseclass {
@Test
	public  void  DuplicateLead(){
		// TODO Auto-generated method stub
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestWorld");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Ramachandran");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Sagar");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Ram");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Finance");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Manage the salary informations");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("ramsagar@gmail.com");
		//Select from drop down
		WebElement Ele = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select dd= new Select(Ele);
		dd.selectByVisibleText("New York");
		driver.findElement(By.className("smallSubmit")).click();
		System.out.println("The titile of the resulting page" + driver.getTitle());
		driver.findElement(By.linkText("Duplicate Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).clear();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Humana");
		driver.findElement(By.id("createLeadForm_firstName")).clear();
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Sita");
		driver.findElement(By.className("smallSubmit")).click();
		System.out.println("The title of the resulting page is :" + driver.getTitle());
		

	}

}
