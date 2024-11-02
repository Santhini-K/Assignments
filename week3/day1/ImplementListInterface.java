package week3.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplementListInterface {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.ajio.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//input[@name='searchVal']")).sendKeys("Bags", Keys.ENTER);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//label[contains(text(),'Men')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//label[contains(text(),'Fashion Bags')]")).click();
		Thread.sleep(5000);
		String searchCount = driver.findElement(By.xpath("//div[@class='length']")).getText();
		System.out.println(searchCount);
		List<WebElement> brandNames = driver.findElements(By.xpath("//div[@class='brand']"));
		List<String> bName = new ArrayList<String>();
		for (WebElement i : brandNames) {
			String s = i.getText();
			bName.add(s);
		}
		System.out.println(bName);
		List<WebElement> bagNames = driver.findElements(By.xpath("//div[@class='nameCls']"));
		List<String> bag = new ArrayList<String>();
		for (WebElement i : bagNames) {
			String s1 = i.getText();
			bag.add(s1);
		}
		System.out.println(bag);
	}
}
