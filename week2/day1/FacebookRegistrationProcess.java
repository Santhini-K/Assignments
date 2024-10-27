package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookRegistrationProcess {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		
		//Allowing cookies
		driver.findElement(By.xpath("//div[@class='x1ja2u2z x78zum5 x2lah0s x1n2onr6 xl56j7k x6s0dn4 xozqiw3 x1q0g3np xi112ho x17zwfj4 x585lrc x1403ito x972fbf xcfux6l x1qhh985 xm0m39n x9f619 xn6708d x1ye3gou xtvsq51 x1r1pt67']")).click();

		//Create an account...clicking the 
		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		
		//Allowing the cookies
		driver.findElement(By.xpath("//div[@class='x1ja2u2z x78zum5 x2lah0s x1n2onr6 xl56j7k x6s0dn4 xozqiw3 x1q0g3np xi112ho x17zwfj4 x585lrc x1403ito x972fbf xcfux6l x1qhh985 xm0m39n x9f619 xn6708d x1ye3gou xtvsq51 x1r1pt67']")).click();
		
		//Registration starts here
		System.out.println("Registration starts...");
		
		//input first name and last name
		driver.findElement(By.name("firstname")).sendKeys("TRYF");
		driver.findElement(By.name("lastname")).sendKeys("TRYF");
		
		//input the birth data, month and year
		WebElement birthDate = driver.findElement(By.name("birthday_day"));
		Select bd = new Select(birthDate);
		bd.selectByValue("5");
		
		WebElement birthMonth = driver.findElement(By.name("birthday_month"));
		Select bm = new Select(birthMonth);
		bm.selectByValue("3");
		
		WebElement birthYear = driver.findElement(By.name("birthday_year"));
		Select by = new Select(birthYear);
		by.selectByValue("2000");
		
		//input the gender
		driver.findElement(By.xpath("(//input[@class='_8esa'])[1]")).click();	
		
		//input email and password
		driver.findElement(By.name("reg_email__")).sendKeys("xyz@gmail.com");
		driver.findElement(By.id("password_step_input")).sendKeys("sairam1919");
		
		System.out.println("Provided the necessary inputs to create an account, before submitting the buttton");
		
		//submit the provided inputs
		driver.findElement(By.name("websubmit")).click();
		
		System.out.println("Facebook account registration page input feeding has been done successfully...");
		
		//closing the driver
		driver.close();
		
	}

}
