package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnRelativeBasicXPath {

	public static void main(String[] args) {
		
				//Instantiate an object for chrome browser
				ChromeDriver driver = new ChromeDriver();
						
				//launch the url
				driver.get("http://leaftaps.com/opentaps/control/main");
						
				//Printing the title of the webpage
				System.out.println("Page Title : "+driver.getTitle());
				
				//get the username element using attribute Xpath and pass the values
				driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demosalesmanager");
				
				//get the password element using Index Xpath and provide the password
				driver.findElement(By.xpath("(//input[@class='inputLogin'])[2]")).sendKeys("crmsfa");
				
				//to click the login button
				WebElement element = driver.findElement(By.xpath("//input[contains(@class,'decora')]"));
				element.click();
				
				driver.findElement(By.partialLinkText("CRM")).click();
				driver.findElement(By.linkText("Leads")).click();
				
				//close the broswer
				driver.close();
				
	}

}
