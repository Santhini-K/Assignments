package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver d = new ChromeDriver();
		d.get("http://leaftaps.com/opentaps/control/main");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		d.findElement(By.id("username")).sendKeys("DemoSalesManager");
		d.findElement(By.id("password")).sendKeys("crmsfa");
		d.findElement(By.className("decorativeSubmit")).click();
		
		d.findElement(By.partialLinkText("CRM/SFA")).click();
		
		d.findElement(By.linkText("Leads")).click();
		d.findElement(By.linkText("Create Lead")).click();
		
		d.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("Lead101");
		d.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Lead");
		d.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("101");
		d.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("Lead");
		
		d.findElement(By.xpath("//input[@name='departmentName']")).sendKeys("Finance");
		d.findElement(By.xpath("//textarea[@name='description']")).sendKeys("Finance Department");
		d.findElement(By.xpath("//input[@id='createLeadForm_primaryEmail']")).sendKeys("lead101@gmail.com");
		
		WebElement state = d.findElement(By.xpath("//select[contains(@id,'State')]"));
		Select stateSel = new Select(state);
		stateSel.selectByVisibleText("New York");
		
		d.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		System.out.println("Lead has been created successfully...");
		Thread.sleep(3000);
		
		d.findElement(By.xpath("//a[text()='Edit']")).click();
		d.findElement(By.xpath("//textarea[@id='updateLeadForm_description']")).clear();
		d.findElement(By.xpath("//textarea[@id='updateLeadForm_importantNote']")).sendKeys("Cleared the Description");
		d.findElement(By.xpath("//input[@value='Update']")).click();
		System.out.println(d.getTitle());
		d.quit();
		
	}

}
