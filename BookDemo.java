/**
 * @author     Camby Abell
 * @assignment assg4_Abell
 * @filename   BookDemo.java
 */

package assg4_Abell;

import java.util.*;
import java.io.*;
import assg4_Abell.Book;

public class BookDemo
{
	public static void main(String args[])
	{
		// Initialize an array of 100 books
		Book[] bookList = new Book[100];
		
		// To keep a running total of how many book objects are created.
		int count = 0;
		
		// Try-catch block to open a file, read in the values, and create the 
		// amount of new Book objects that is required.
		//
		// If the file is not opened successfully, the FileNotFoundException
		// is caught.
		try {
			Scanner f = new Scanner(new File("catalog.txt"));
			
			for(count = 0; f.hasNext(); count++)
			{
				int id = f.nextInt();
				String title = f.next();
				String isbn = f.next();
				String author = f.next();
				Character cat = f.next().charAt(0);
				
				bookList[count] = new Book(id, title, isbn, author, cat);
			}

			// Close the file.
			f.close();
		}
		catch (FileNotFoundException e) 
		{
			System.out.println(e);
		}
		
		// Initialize a new Scanner for user input while searching for books.
		Scanner kbd = new Scanner(System.in);
		int userNum;
		
		// Ask user for book id they want to search for.
		System.out.println("Enter book id: ");
		userNum = kbd.nextInt();
		
		// Loop until the user wishes to stop searching the library. When the
		// user wishes to exit, a 0 will exit the search and the program will
		// terminate.
		while(userNum != 0)
		{
			try {
				int search = Book.bookSearch(bookList, count, userNum);
				System.out.println(bookList[search].toString());
			}
			catch (BookNotFoundException e)
			{
				System.out.println(e);
			}

			System.out.println("Enter book id: ");
			userNum = kbd.nextInt();
		}
		
		// Close the kbd scanner.
		kbd.close();
		
		System.out.println("\nThanks for using my program, good-bye!");
	}
}
