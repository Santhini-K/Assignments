package week2.day4;

public class Amazon extends CanaraBank {
	
	public void recordPaymentDetails() {
		System.out.println("Recording the Payment Details for further use");
	}
	
	public void cashOnDelivery() {
		System.out.println("Cash on Delivery...Amazon");
	}
	
	public void upiPayments(){
		System.out.println("UPI Payments...Amazon");
	}
	

	public static void main(String[] args) {
		
		Amazon amaz = new Amazon();
		System.out.println("We have the following payment methods:");
		amaz.cashOnDelivery();
		amaz.upiPayments();
		amaz.cardPayments();
		amaz.internetBanking();
		amaz.recordPaymentDetails();

	}

}
