package week1.day3;

public class LibraryManagement {

	public static void main(String[] args) {
		
		Library lm = new Library(); //to create and initialize an object for the class - Library in the same package
		System.out.println(lm.addBook("Ponniyin Selvan")); //pass the bookname as parameter to a method in the class - Library
		lm.issueBook(); // call the method which is declared in the another class Library which resides in same package of this class
	}

}
