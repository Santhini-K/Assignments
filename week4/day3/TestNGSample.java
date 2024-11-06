package week4.day3;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNGSample {


		public  ChromeDriver	driver;
		@Test
		 public void loginPage() {
			 
			 	 driver = new ChromeDriver();
				 driver.manage().window().maximize();
				 driver.get("http://leaftaps.com/opentaps/control/main");
				 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestNGSample n =new TestNGSample();
		n.loginPage();

	}

}
