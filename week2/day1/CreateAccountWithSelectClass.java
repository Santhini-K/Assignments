package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountWithSelectClass {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/");
		
		driver.manage().window().maximize();
		
		//to login into the application
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//Create an account
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		
		//Entering details to create an account
		String accountName = "Account2027";
		driver.findElement(By.id("accountName")).sendKeys(accountName);
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		
		//using select class...selecting the drop down values by index
		WebElement Industry = driver.findElement(By.name("industryEnumId"));
		Select selectIndustry = new Select(Industry);
		selectIndustry.selectByIndex(3);
		
		//using select class...selecting the drop down values by visible text
		WebElement ownership = driver.findElement(By.name("ownershipEnumId"));
		Select selectOwnership = new Select(ownership);
		selectOwnership.selectByVisibleText("S-Corporation");
		
		//using select class...selecting the drop down values by value
		WebElement source = driver.findElement(By.id("dataSourceId"));
		Select selectSource = new Select(source);
		selectSource.selectByValue("LEAD_EMPLOYEE");
		
		WebElement marketCampaign = driver.findElement(By.id("marketingCampaignId"));
		Select selectMarketCampaign =new Select(marketCampaign);
		selectMarketCampaign.selectByIndex(6);
		
		WebElement state = driver.findElement(By.id("generalStateProvinceGeoId"));
		Select selectState = new Select(state);
		selectState.selectByIndex(50);

		driver.findElement(By.className("smallSubmit")).click();
		
		System.out.println("Success...");
		
		System.out.println(driver.getTitle());
		
		String text = driver.findElement(By.xpath("(//table[@class='fourColumnForm']/tbody/tr/td/span[@class='tabletext'])[1]")).getText();
		System.out.println("ACcount Name "+text+" is created successfully");
		
		if(text.contains(accountName))
		{ 
			System.out.println("Passed : Account Name Matched");
		}
		else
		{
			System.out.println("Failed : Account Name not Matched");
		}
		
		driver.close();
	}

}
