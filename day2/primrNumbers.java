package week1.day2;

public class primrNumbers {

	static boolean isprime(int n)
		{
		if (n<=1)
		return false;
		for (int i = 2; i <n; i++)
		{
		if (n%i==0)
		{
		return false;
		}
		}
		return true;
		}
		public static void main(String[] args)
		{
		for (int i=0; i<=50;i++) {
		if (isprime(i))
		System.out.println(i+" Is Prime");
		else
		System.out.println(i+" Its not prime");
		}
		}

	}


