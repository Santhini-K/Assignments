package week3.day1;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		
		String str1 = "pets";
		String str2 = "step";
		
		str1.toLowerCase();
		str2.toLowerCase();
		
		char[] str1Char = str1.toCharArray();
		char[] str2Char = str2.toCharArray();
		
		Arrays.sort(str1Char);
		Arrays.sort(str2Char);
		
		boolean result = true;
		
		if(str1Char.length != str2Char.length)
			result = false;
		else
		{
			for (int i = 0; i < str1Char.length; i++) 
			{
				if(str1Char[i] != (str2Char[i]))
					result = false;
			}
		}		
		
		if(result)
			System.out.println("Given Strings are Anagram");
		else
			System.out.println("Given Strings are not Anagram");
	}

}
