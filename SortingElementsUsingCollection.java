package week3.day1;

import java.util.ArrayList;
import java.util.List;

public class SortingElementsUsingCollection {

	public static void main(String[] args) {
		
		//Declare a string array
		String s[] = {"HCL", "Wipro", "Aspire Systems", "CTS"};
		//create a null list
		List<String> l= new ArrayList<String>();
		//assign the strings to the created list
		for (int i = 0; i < s.length; i++) {
			l.add(s[i]);
		}
		System.out.println("Before Sorting the List : "+l);
		//sort the list
		l.sort(null);
		//create an another list to store the elements in descending order
		List<String> l2 = new ArrayList<String>();
		//adding the element from end to the front order in l2 list
		for (int i=s.length-1; i>=0; i--)
			l2.add(l.get(i));
        System.out.println("After Sorting the List : "+l2);
		
	}

}
