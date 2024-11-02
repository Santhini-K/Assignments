package week3.day1;

import java.util.ArrayList;
import java.util.List;

public class MissingElementInList {

	public static void main(String[] args) {
		
		 //input the array of elements
		 int arr[] = {1, 2, 3, 4, 10, 6, 8};
		 //creating a list 
		 List<Integer> l = new ArrayList<Integer>();
		 //adding the array elements to the created list
		 for (int i = 0; i < arr.length; i++) 
			l.add(arr[i]);
		 //sorting the list
		 l.sort(null);	
		 //print the sorted list
		 System.out.println("Given List is : "+l);
		 //iterating the list to find the missing elements
		 for (int i= 0; i < arr.length-1; i++) {
			 int first = l.get(i)+1;
			 int second = l.get(i+1);
			 //Checking the missing element and its position
			 if(first != second)
				System.out.println(first+" is missing in the "+ (first-1) + "th index of given List");
		 }
		 
	}
}