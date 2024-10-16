package week1.day3;

public class Library {
	
	//to add a book and return the title of the book
	String addBook(String bookTitle)
	{
		System.out.println("Book added successfully...\n");
		return bookTitle;
	}
	
	//void method to print regarding the issuing of book
	void issueBook()
	{
		System.out.println("\nBook issued successfully...");
	}

	//main method
	public static void main(String[] args) {
		
		Library lib =  new Library(); //to create and initialize an object for Library
		System.out.println("Book Name is "+lib.addBook("Emotional Intelligence")); //pass the book name
		lib.issueBook(); //to call the method of Library

	}

}
