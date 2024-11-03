package week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetInterface {

	public static void main(String[] args) {
		
		 String companyName = "google";
		 char[] cname = companyName.toCharArray();
		 Set<Character> uni = new LinkedHashSet<Character>();
		 Set<Character> dup = new LinkedHashSet<Character>();
		 
		 for (int i = 0; i < cname.length; i++) {
			boolean b = uni.add(cname[i]); //adding the unique values to the Set //add method returns boolean type
			if(!b)
				dup.add(cname[i]);//adding the duplicate values based on add method return type
		 }
		 System.out.println(uni);
		 System.out.println(dup);
	}

}
