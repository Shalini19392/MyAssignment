package assignment.week3;

public class RemoveDuplicateWord {

	public static void main(String[] args) {
		String s ="We learn Java basics as part of java sessions in java week1"; 
		
		String[] split= s.split(" ");
		for (int i = 0; i < split.length; i++) {
			for (int j = i+1; j < split.length; j++) {
				if (split[i].equalsIgnoreCase(split[j])) {
					split[j]="";
					
					
				}
				
			}
			
		}
		System.out.println("unique words");
		for(String word:split) {
			if(!word.isEmpty()) {
				System.out.print(word +" ");
			}
		}

	}

}
