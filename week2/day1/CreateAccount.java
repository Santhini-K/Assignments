package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAccount {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		String title2 = driver.getTitle();
		System.out.println("Current WebPage is "+title2);
				
		//Goto CRM/SFA link
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		
		//Click on Accounts tab
		driver.findElement(By.linkText("Accounts")).click();
		
		//Click on Create Account in Account tab
		driver.findElement(By.partialLinkText("Create")).click();
		
		//Provide Account details
		driver.findElement(By.id("accountName")).sendKeys("Account1919");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester 1919");
		driver.findElement(By.id("numberEmployees")).sendKeys("300");
		driver.findElement(By.id("officeSiteName")).sendKeys("LeafTaps");
		
		//create account in account tab
		driver.findElement(By.className("smallSubmit")).click();
		
		//verifying whether the title of the page is verified correctly
		String title = driver.getTitle();
		System.out.println("Current webpage title is : "+title);
		
		if(title.contains("Account Details | opentaps CRM"))
			System.out.println("Title verified");
		else
			System.out.println("Incorrect title");
		
		//Closing the browser
		driver.close();
		

	}

}
