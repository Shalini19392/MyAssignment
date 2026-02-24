package week4.day1;

public abstract class CanaraBank implements Payments {

	@Override
	public void upiPayments() {
		System.out.println("gpay");	
	}
	
	public abstract void recordPaymentDetails();

	@Override
	public void cardPayments() {
		System.out.println("SBI card");
		
	}

	@Override
	public void internetBanking() {
		System.out.println("Username");
	}

}
