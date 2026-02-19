package assignment.week3;

public class LoginPage extends BasePage {
	public void performCommonTasks()

	{
		System.out.println("BasePage: Overriding performCommonTasks from BasePage");		
	}

	public static void main(String[] args) {
		LoginPage lp=new LoginPage();
		lp.clickElement();
		lp.enterText();
		lp.findElement();
		lp.performCommonTasks();
	

	}

}
