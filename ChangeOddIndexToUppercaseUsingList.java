package week3.day1;

import java.util.ArrayList;
import java.util.List;

public class ChangeOddIndexToUppercaseUsingList {

	public static void main(String[] args) {
		
		//Declare the string
		String input = "changeme";
		char[] charArray = input.toCharArray();
		List<Character> list = new ArrayList<Character>();
		
		//assign the character array to a list
		for (int i=0; i<charArray.length; i++)
			list.add(charArray[i]);
		System.out.println("Given String : "+list);
		
		//logic to print the odd index character in uppercase
		System.out.println("Printing the odd index of the string in Uppercase");
		for(int j=0; j<charArray.length; j++) {
			if(j%2==0)
				System.out.println(list.get(j));
			else
				System.out.println(Character.toUpperCase(list.get(j)));
		}
	}
		
	}

