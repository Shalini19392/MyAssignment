package week4.day1;

public class Amazon extends CanaraBank{
	public static void main(String[] args) {
		Amazon a=new Amazon();
		a.cardPayments();
		a.cashOnDelivery();
		a.internetBanking();
		a.recordPaymentDetails();
		a.upiPayments();
	}
	@Override
	public void cashOnDelivery() {
		System.out.println("Flipkart");
		
	}
	@Override
	public void recordPaymentDetails() {
		System.out.println("Username");	
	}
}
