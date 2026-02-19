package assignment.week3;


public class TextField extends WebElement {
	
	public void getText() {
		System.out.println("get Text");
	}
	public static void main(String[] args) {
		TextField tf=new TextField();
	 
	    tf.click();
	    tf.setText();
	    tf.getText();
		
}
}
