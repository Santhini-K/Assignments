package week2.day3;

public class Overriding extends Polymorphism {

	public void reportStep(String msg, String status) {
		System.out.println("Method overrided in SubClass");
		System.out.println("Report is generated for "+msg+"\nStatus is "+status+"\n");
	}
	
	public void reportStep(String msg, String status, boolean isSnapShot) {
		System.out.println("Method overrided in SubClass");
		System.out.println("Report is generated for "+msg+"\nStatus is "+status);
		if(isSnapShot)
			System.out.println("Snapshot is needed\n");
		else
			System.out.println("Snapshot is not needed\n");
	}
	
	public static void main(String[] args) {
		
		//Overloading
		Polymorphism ol = new Polymorphism();
		ol.reportStep("Operations", "Passed");
		ol.reportStep("Marketing", "Failed", true);
		
		//Overriding
		Overriding or = new Overriding();
		or.reportStep("Management", "Passed");
		or.reportStep("Accounts", "Failed", true);
		
	}

}
