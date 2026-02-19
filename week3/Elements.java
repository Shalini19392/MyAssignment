package assignment.week3;


public class Elements extends Button  {

	public static void main(String[] args) {
		
		Elements e=new Elements();
		e.click();
		e.setText();
		e.submit();
		
		CheckBoxButton cb=new CheckBoxButton();
		cb.clickCheckButton();
		cb.click();
		cb.setText();
		cb.submit();
		
		RadioButton rb= new RadioButton();
		rb.selectRadioButton();
		rb.click();
		rb.submit();
		rb.setText();
		
		TextField tf=new TextField();
		tf.click();
	    tf.setText();
	    tf.getText();
	}

}
