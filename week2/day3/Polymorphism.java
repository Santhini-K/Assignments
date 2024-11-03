package week2.day3;

public class Polymorphism {

	/* Create a Java class. - Inside this class, define the reportStep method with multiple 
	 * overloaded versions: - One version should accept two input arguments: a String for the 
	 * message (msg) and another String for the status (status). 
	 * - Another version of the reportStep method should accept three input arguments: 
	 * a String for the message (msg), a String for the status (status), and a boolean parameter (snap)
	 * to indicate whether to take a snapshot.*/
	 
	public void reportStep(String msg, String status) {
		System.out.println("Report is generated for "+msg+"\nStatus is "+status+"\n");
	}
	
	public void reportStep(String msg, String status, boolean isSnapShot) {
		System.out.println("Report is generated for "+msg+"\nStatus is "+status);
		if(isSnapShot)
			System.out.println("Snapshot is needed\n");
		else
			System.out.println("Snapshot is not needed\n");
	}
	
	public static void main(String[] args) {

		Polymorphism ol = new Polymorphism();
		ol.reportStep("Accounts", "Passed");
		ol.reportStep("Marketing", "Failed", true);
		ol.reportStep("Finance", "Passed", false);
	}

}
