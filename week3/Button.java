package assignment.week3;



public class Button extends WebElement {
	
		public void submit() {
			System.out.println("Click the Submit button");
		}
		public static void main(String[] args) {
			Button b=new Button();
			b.submit();
			b.click();
			b.setText();
}
}


