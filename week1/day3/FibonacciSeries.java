package week1.day3;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		int num = 8; //initialize the total number for which a fibonacci series should be calculated
		int fvalue = 0; //first value of the fibonacci series
		int svalue = 1; //second value of the fibonacci series
		
		for(int i=1; i<=num; i++)
		{
			System.out.println(fvalue); // to print the series value 
			int nvalue = fvalue + svalue; // variable to store the next value of series
			fvalue = svalue; //assign the second value to first value
			svalue = nvalue; //assign the next value to second value to calculate the fibonacci series
		}
		
	}

}
