package week1.day2;

public class IsPrime {

	public static void main(String[] args) {
		
		int n = 4;
		int count = 0;
		if (n==0 || n==1)
			System.out.println(n+ " is not a prime number");
		else {
		for (int i = 2; i <=n; i++) 
		{
			if(n%i == 0)
				count++;
		}
		if (count>1)
			System.out.println(n+ " is not a prime number");
		else
			System.out.println(n+ " is a prime number");
		}
	}

}