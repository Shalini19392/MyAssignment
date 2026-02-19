package assignment.week3;

public class Palindrome1 {

	public static void main(String[] args) {
		String s="A Man, a aplan, a canal: Panama";
		s=s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
		String rev="";
		for (int i =s.length()-1; i>=0;i--) {
			rev +=s.charAt(i);
			}
		System.out.println(rev);
		if (s.equals(rev)) {
			System.out.println("True");
		} else {
			System.out.println("False");

		}
		
	}

}
