package assignment.week3;

public class UpperCase {
	

	public static void main(String[] args) {
		String s="changeme";
		//String Uppercase= s.toUpperCase();
		//convert string into chararray
		char[] charArray =s.toCharArray();
		
		//Loop through the array in reverse
		for (int  i=charArray.length-1; i>=0; i--)
		{
			//check if index is 0
			if(i%2!=0) {
				charArray[i]=Character.toUpperCase(charArray[i]);
				 
			}
			
		}
		//Convert char array back to string
		String result=new String(charArray);
		//Print the result
		System.out.println("Output:" + result);
		

	}

}
