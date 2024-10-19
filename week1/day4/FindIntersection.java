package week1.day4;

public class FindIntersection {

	public static void main(String[] args) {
		
		//declare two arrays and assign values
				int a[] = {3,2,11,4,6,7}; 
		        int b[] = {1,2,8,4,9,7}; 
		        
		        //to find the length of two arrays
		        int alength = a.length;
		        int blength = b.length;
		        
		        //logic to find the match between two arrays
		        System.out.println("Match found as follows:");
		        for(int i=1; i<=alength-1; i++)
		        	for(int j=1; j<=blength-1; j++)
		        		if(a[i]==b[j])
		        			System.out.println(a[i]); //printing the value of matches between arrays - a and b

	}

}
