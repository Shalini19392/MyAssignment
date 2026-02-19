package assignment.week3;




public class LoginTestData extends TestData{
	public void enterUsername() {
		System.out.println("Username: Shalini");
	}
	public void enterPassword() {
		System.out.println("paasword: *****");
	}
	
	

	public static void main(String[] args) {
		LoginTestData td =new LoginTestData();
		td.enterCredentials();
		td.navigateToHomePage();
		td.enterUsername();
		td.enterPassword();
	}

}
