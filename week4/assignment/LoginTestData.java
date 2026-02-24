package week4.assignment;

public class LoginTestData extends TestData1 {

	public static void main(String[] args) {
		LoginTestData l =new LoginTestData();
		l.navigateToHomePage();
		l.enterCredentials();
		l.enterUsername();
		l.enterPassword();
		
	}
public void enterUsername() {
	System.out.println("Username: Shalini");
}
public void enterPassword()
{
	System.out.println("Password: *****");
}
}
