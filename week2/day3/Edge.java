package week2.day3;

public class Edge extends Browser{


	//create  subclasses such as Edge under Browser
	//Define takeSnap() and clearCookies() methods in Edge class  
	
	public void takeSnap() {
		System.out.println("Taking the snapshot...Edge Class");
	}
	
	public void clearCookies() {
		System.out.println("Clearing the cookies...Edge Class");
	}
	
	public static void main(String[] args) {
		
		Edge e = new Edge();
		e.openURL("Edge", 95);
		e.takeSnap();
		e.clearCookies();
		e.navigateBack("Edge");
		e.closeBrowser("Edge");
		
	}
}
