package week2.day3;

public class Browser {

	public String browserName;
	public int browserVersion;
	
	public void openURL(String browserName, int browserVersion)
	{
		System.out.println("Opening the url in " +browserName + " with the version of "+browserVersion);
	}
	
	public void closeBrowser(String browserName)
	{
		System.out.println("Closing the "+browserName);
	}
	
	public void navigateBack(String browserName)
	{
		System.out.println("Navigating back the "+browserName);
	}
}
