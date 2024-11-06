package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollDownToPage {

	public static void main(String[] args) {
		
		ChromeDriver d = new ChromeDriver();
		d.get("https://www.amazon.in/");
		
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement scroll = d.findElement(By.xpath("//a[text()='Conditions of Use & Sale']"));
		System.out.println("Text on the WebPage : "+scroll.getText());
		
		Actions a = new Actions(d);
		a.scrollToElement(scroll).perform();
	}

}
