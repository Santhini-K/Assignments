package week3.day1;

import java.util.ArrayList;
import java.util.List;

public class FindSecondLargestNumber {

	public static void main(String[] args) {
		
		 //Declaring an array with list of values
		 int arr[] = {3, 2, 11, 4, 6, 7};
		 //Creating an empty list
		 List<Integer> l = new ArrayList<Integer>();
		 //Adding the elements of an array to the created List
		 for(int i=0; i<arr.length; i++)
			 l.add(arr[i]); //using add() method
		 System.out.println("Before Sorting the List : "+l);
		 //Sorting the list elements
		 l.sort(null);		
		 System.out.println("After Sorting the List : "+l);
		 //find the size of the list
		 int size=l.size();
		 //Printing the second largest elements from the list
		 System.out.println("Second Largest Element : "+l.get(size-2));

	}

}
