package week2.day2;


import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class InteractionsWithCheckboxes {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/checkbox.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//span[text()='Basic']")).click();
		driver.findElement(By.xpath("//span[text()='Ajax']")).click();
		String msg1 = driver.findElement(By.xpath("//span[@class='ui-growl-title']")).getText();
		Thread.sleep(5000);
		if(msg1.equals("Checked"))
			System.out.println("Message Verified - "+ msg1);
		else
			System.out.println("Message not verified");
				
		driver.findElement(By.xpath("//label[text()='Java']")).click();
		driver.findElement(By.xpath("//label[text()='Javascript']")).click();
		driver.findElement(By.xpath("//label[text()='C-Sharp']")).click();
				
		driver.findElement(By.xpath("//span[contains(@class,'ui-chkbox-icon ui-c')]/parent::div")).click();
		Thread.sleep(3000);
		String stateMsg = driver.findElement(By.xpath("//span[@class='ui-growl-title']")).getText();
		String stateCode = driver.findElement(By.xpath("//span[@class='ui-growl-title']/following-sibling::p")).getText();
		System.out.println("TriState Box Clicked");
		System.out.println(stateMsg+"\n"+stateCode);
		
		driver.findElement(By.xpath("//div[@class='ui-toggleswitch-slider']")).click();
		String toggleSwitch = driver.findElement(By.xpath("//div//span[@class='ui-growl-title']")).getText();
		Thread.sleep(5000);
		if(toggleSwitch.equals("Checked"))
			System.out.println("Toggle switch is verified :"+toggleSwitch);
		else
			System.out.println("Toggle switch is not verified");
		
		boolean chkDisabled = driver.findElement(By.xpath("//input[@disabled='disabled']")).isEnabled();
		Thread.sleep(5000);
		if(chkDisabled)
			System.out.println("Checkbox is Enabled");
		else
			System.out.println("Checkbox is Disabled");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[contains(@class,'multiple')]")).click();
		driver.findElement(By.xpath("//label[text()='London']/preceding-sibling::div/div[contains(@class,'state-default')]")).click();
		driver.findElement(By.xpath("//label[text()='Rome']/preceding-sibling::div/div[contains(@class,'state-default')]")).click();
		driver.findElement(By.xpath("//label[text()='Paris']/preceding-sibling::div/div[contains(@class,'state-default')]")).click();
		driver.findElement(By.xpath("//a[contains(@class,'close')]")).click();
				
		driver.close();
		

	}

}
