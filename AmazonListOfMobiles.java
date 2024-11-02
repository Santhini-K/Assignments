package week3.day1;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonListOfMobiles {

	public static void main(String[] args) {
		
		//instantiate chrome browser
		ChromeDriver driver = new ChromeDriver();
				
		//enter the given url
		driver.get("https://www.amazon.in");
				
		//implicit wait
		driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(5));
		
		//Searching and enter using Keys class
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Mobiles", Keys.ENTER);
		
		List <WebElement> mobiles = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		int size = mobiles.size();
		System.out.println("Search list is "+size);
		
		List<String> list = new ArrayList<String>();
		for(WebElement i: mobiles) {
			String text =i.getText();
			list.add(text);
		}
		System.out.println(list);
		}
		

	}
