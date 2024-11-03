package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class InteractionsWithCheckboxes {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/checkbox.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//span[text()='Basic']")).click();
		driver.findElement(By.xpath("//span[text()='Ajax']")).click();	
		
		String text1 = driver.findElement(By.xpath("//div[@class='ui-growl-message']//span")).getText();
		System.out.println(text1);
		if(text1.equals("Checked"))
			System.out.println("Message is as expected");
		else
			System.out.println("Message is not as expected");
		
		driver.findElement(By.xpath("//label[text()='Java']")).click();
		driver.findElement(By.xpath("//label[text()='Javascript']")).click();
		driver.findElement(By.xpath("//label[text()='C-Sharp']")).click();
		
		driver.findElement(By.xpath("//div//h5[text()='Tri State Checkbox']/following-sibling::div/div/div/div[2]")).click();
		//driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(5));
		String triStateMsg = driver.findElement(By.xpath("//div[@class='ui-growl-message']//span")).getText();
		String triStateNo = driver.findElement(By.xpath("//div[@class='ui-growl-message']//p")).getText();
		driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(5));
		System.out.println("Tri State Message and State Status :\n"+triStateMsg+"\n"+triStateNo);
		
	}

}
