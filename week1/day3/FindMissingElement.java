package week1.day3;

import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) {
		
		//initialize an array variable
		int arr[]= {1,4,3,2,8,6,7}; 
		
		//to find and store the length of the array
		int arrlength = arr.length;
		
		//to sort the array
		Arrays.sort(arr);
		
		System.out.println("Missing Element is ");
		for (int i=1; i<arrlength-1; i++)
		{
			if(i!=arr[i-1])   //to compare the iterated value with array elements after sorting
				System.out.println(i); //print the missing value
		}

	}

}
