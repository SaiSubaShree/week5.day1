package week5.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLeadTestNG  extends Baseclass{

	@Test
	public  void RunLCreateLead() throws InterruptedException {
		// TODO Auto-generated method stub
				driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Newworld");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Natarajan");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Sai suba shree");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("test lead");
		driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("23456");

		//selcting from drop down
		WebElement ele= driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select dd= new Select(ele);
		dd.selectByValue("LEAD_CONFERENCE");
		Thread.sleep(5000);
		driver.findElement(By.className("smallSubmit")).click();


	}

}
