package week1.day4;

public class IsPalindromeNumber {

	public static void main(String[] args) {
		
		int input = 12121;
		int output = 0, tempVar = input;
		
		System.out.println("Input is :"+input);
		
		//logic to reverse the given number
		while(tempVar>0)
		{
			int reminder=tempVar%10;
			output=output*10+reminder;
			tempVar=tempVar/10;
		}
		System.out.println("Output is : "+output);
		
		//to check whether the input and output holds the same number
	if(input==output)
		System.out.println("Given input is a palindrome number");
	else
		System.out.println("Given input is not a palindrome number");

	}

}
