package assignment.week3;



public class RadioButton extends Button {
	public void selectRadioButton() {
		System.out.println("Click the Radio button");
		
	}
	public static void main (String[] args) {
		RadioButton rb= new RadioButton();
		rb.selectRadioButton();
		rb.click();
		rb.submit();
		rb.setText();
	}

}
