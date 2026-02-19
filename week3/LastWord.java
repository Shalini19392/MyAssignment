package assignment.week3;

public class LastWord {

	public static void main(String[] args) {
		String s="luffy is still joyboy";
		String[] split=s.split(" ");
		for (int i= split.length-1;i>=0;i--) {
			System.out.println(split[i].length());
			break;
			
			
		}
				

	}

}
