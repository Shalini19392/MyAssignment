package week4.day2;

import java.util.Set;
import java.util.TreeSet;

public class LearSet {

	public static void main(String[] args) {
		String s  = "google";
		char[] charArray =s.toCharArray();
		Set<Character>Unique=new TreeSet<Character>();
		for (int i = 0; i < charArray.length; i++) {
			Unique.add(charArray[i]);
			
			
		}
		System.out.println(Unique);
	}

}
