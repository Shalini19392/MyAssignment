package assignment.week3;


public class CheckBoxButton extends Button {
	public void clickCheckButton()
	{
		System.out.println("Click the button");
	}
public static void main(String[] args) {
	
	CheckBoxButton cb=new CheckBoxButton();
	cb.clickCheckButton();
	cb.click();
	cb.setText();
	cb.submit();
}
}
