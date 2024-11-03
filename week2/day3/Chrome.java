package week2.day3;

public class Chrome extends Browser{
	
	//create  subclasses such as Chrome under Browser
	//Define openIncognito() and clearCache() methods in Chrome class 
	
	public void openIncognito() {
		System.out.println("Opening the browser in Incognito mode...Chrome Class");
	}
	
	public void clearCache() {
		System.out.println("Clearing the cache...Chrome Class");
	}
	
	public static void main(String[] args) {
		
		Chrome c = new Chrome();
		c.openURL("Chrome", 85);
		c.openIncognito();
		c.clearCache();
		c.navigateBack("Chrome");
		c.closeBrowser("Chrome");
		
	}

}
