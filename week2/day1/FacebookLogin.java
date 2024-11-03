package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {

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
		
		//Printing the current title of the webpage
		//System.out.println("Page Title : "+driver.getTitle());
		String title = driver.getTitle();
		
		//Verify the title page
		if(title.contains("My Home | opentaps CRM"))
		{
			System.out.println("Passed");
			System.out.println("Title is "+title);
		}
		
		else
			System.out.println("Failed");

	}

}
