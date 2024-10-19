package week1.day4;

import java.util.Arrays;

public class DetermineAnagram {

	public static void main(String[] args) {
		
		String str1 = "stops";
		String str2 = "potss";
		
		//to find the length of the given strings
		int str1Len = str1.length();
		int str2Len = str2.length();
		
		//to convert the given strings as char Arrays
		char[] str1CharArray = str1.toCharArray();
		char[] str2CharArray = str2.toCharArray();
		
		//to sort the given char
		Arrays.sort(str1CharArray);
		System.out.println("Printing First Character Array after sorting...");
		for(int i=0; i<=str1CharArray.length-1; i++)
			System.out.println(str1CharArray[i]);
		
		Arrays.sort(str2CharArray);
		System.out.println("Printing Second Character Array after sorting...");
		for(int j=0; j<=str2CharArray.length-1; j++)
			System.out.println(str2CharArray[j]);
		
		//compare the characters of two given arrays and storing in a variable
		int result = Arrays.compare(str1CharArray, str2CharArray);
		System.out.println("Comparison Result : "+result);
		
		//to determine whether the given strings are anagram by finding the length
		if(str1Len != str2Len)
			System.out.println("Length Unmatched...Strings are not eligible to check for anagram");
		else
			{
			if(result == 0)
				System.out.println("The given strings are Anagram");
			else
				System.out.println("The given strings are not an Anagram");
			}
			
	}

}
