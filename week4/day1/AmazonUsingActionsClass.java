package week4.day1;

import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonUsingActionsClass {

	public static void main(String[] args) throws InterruptedException, IOException {
	
		//Launch browser, Open amazon india, maximize browser and specify implicit wait to load the elements
		ChromeDriver d = new ChromeDriver();
		d.get("https://www.amazon.in/");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//Search for oneplus 9 pro and print the price & customer rating of the first product from search results
		d.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("oneplus 9 pro", Keys.ENTER);
		String priceFirstProd = d.findElement(By.xpath("(//span[@class='a-price-whole'])[1]")).getText();
		System.out.println("First Product Price from the search results : "+priceFirstProd);
		String custRatingsFirstProd = d.findElement(By.xpath("//span[@class='a-size-base s-underline-text']")).getText();
		System.out.println("First Product Customer Ratings : "+custRatingsFirstProd);
		
		WebElement element = d.findElement(By.xpath("(//div[@class='a-section aok-relative s-image-fixed-height']/img)[1]"));
		element.click();
		Set<String> windowHandles = d.getWindowHandles();
		List<String> childwindow=new ArrayList<String>(windowHandles);
		//navigate to child window
		d.switchTo().window(childwindow.get(1));
		
		d.findElement(By.xpath("//input[@name='submit.add-to-cart']")).click();
		Thread.sleep(5000);
		String cartSubTotal = d.findElement(By.xpath("//span[@id='attach-accessory-cart-subtotal']")).getText();
		System.out.println("Added cart Sub total amount is "+cartSubTotal);
		if(cartSubTotal.contains(priceFirstProd))
			System.out.println("Passed : Amount verified - "+priceFirstProd);
		else
			System.out.println("Failed : Amount not verified - "+priceFirstProd);
		
		Thread.sleep(2000);
		d.quit();
	}

}
