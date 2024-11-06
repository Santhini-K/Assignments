package week4.day1;

import java.time.Duration;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableInteraction {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://erail.in/");
		
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		d.findElement(By.id("txtStationFrom")).clear();
		d.findElement(By.id("txtStationFrom")).sendKeys("MAS",Keys.ENTER);
		Thread.sleep(1000);
		d.findElement(By.id("txtStationTo")).clear();
		d.findElement(By.id("txtStationTo")).sendKeys("MDU",Keys.ENTER);
		Thread.sleep(1000);
		d.findElement(By.xpath("//input[@id='chkSelectDateOnly']")).click();
		Thread.sleep(1000);
		d.findElement(By.id("buttonFromTo")).click();
		Thread.sleep(1000);
		System.out.println("Listing the trains");
		List<WebElement> trainList = d.findElements(By.xpath("//div[@id='divTrainsList']/table/tbody/tr/td[2]/a"));
		Set<String> trainNames = new HashSet<String>();	
		for (WebElement s : trainList) {
			String s1=s.getText();
			trainNames.add(s1);
		}
		System.out.println(trainNames);
		Thread.sleep(5000);
		d.quit();
		
	}

}
