package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Instantiate an object for chrome browser
		ChromeDriver driver = new ChromeDriver();
				
		//launch the url
		driver.get("http://leaftaps.com/opentaps/control/main");
				
		//Printing the title of the webpage
		System.out.println("Page Title : "+driver.getTitle());
		
		//get the username element and pass the values
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		
		//get the password element and provide the password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		//to click the login button
		WebElement element = driver.findElement(By.className("decorativeSubmit"));
		element.click();
		
		driver.findElement(By.partialLinkText("CRM")).click();
		driver.findElement(By.linkText("Leads")).click();
		
		System.out.println("Entering Create Lead");
		
		driver.findElement(By.partialLinkText("Create")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("XYZ");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Shri");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Nila");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Ms");
		
		driver.findElement(By.name("submitButton")).click();
		System.out.println("Lead created successfully");
		
		//Printing the current title of the webpage
		System.out.println("Current Page Title : "+driver.getTitle());
		
		driver.close();

	}

}
