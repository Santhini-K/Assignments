package week3.day1;
import java.util.ArrayList;
import java.util.List;

public class FindIntersectionUsingList {

	public static void main(String[] args) {
		
		int[] arr1 = {3, 2, 11, 4, 6, 7};
		int[] arr2 = {1, 2, 8, 4, 9, 7};
		
		List<Integer> list1 = new ArrayList<Integer>();
		List<Integer> list2 = new ArrayList<Integer>();
		
		for (int i=0; i< arr1.length; i++) {
			list1.add(arr1[i]);
		}
		System.out.println("List 1 : "+list1);
		
		for (int i=0; i< arr2.length; i++) {
			list2.add(arr2[i]);
		}
		System.out.println("List 2 : "+list2);
		
		//To find the intersection elements of two lists
		System.out.println("Intersection Elements are as follows...");
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if(list1.get(i) == list2.get(j))
					System.out.println(list1.get(i));
			}
		}

	}

}
