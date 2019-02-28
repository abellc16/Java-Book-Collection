/**
 * @author     Camby Abell
 * @assignment assg4_Abell
 * @filename   Book.java
 */

package assg4_Abell;

import assg4_Abell.BookNotFoundException;

public class Book
{	
	// Declare variables for Book data type
	private int book_id;
	private String book_title;
	private String ISBN;
	private String author_last_name;
	private Character category;
	
	/**
	 * This constructor will initialize the five fields of a Book object to 
	 * their corresponding parameters.
	 * 
	 * @param id - the book id.
	 * @param title - the title of a book.
	 * @param isbn - the ISBN of a book.
	 * @param last_name - the last name of the author of a book.
	 * @param cat - the category of a book (Fiction or Non-fiction)
	 */
	public Book(int id, String title, String isbn, String last_name, Character cat)
	{
		book_id          = id;
		book_title       = title;
		ISBN             = isbn;
		author_last_name = last_name;
		category         = cat;
	}
	
	/**
	 * This method returns the book's id.
	 * @return book_id - the book's id
	 */
	public int getBook_id()
	{
		return book_id;
	}
	
	/**
	 * This method returns the book's title.
	 * @return book_title - the book's title.
	 */
	public String getBook_title()
	{
		return book_title;
	}
	
	/**
	 * This method returns the book's ISBN.
	 * @return ISBN - the book's ISBN.
	 */
	public String getISBN()
	{
		return ISBN;
	}
	
	/**
	 * This method returns the author's last name.
	 * @return author_last_name - the author of the book's last name.
	 */
	public String getAuthor_last_name()
	{
		return author_last_name;
	}
	
	/**
	 * This book will return the category of the book.
	 * @return category - the category of the book.
	 */
	public Character getCategory()
	{
		return category;
	}
	
	/**
	 * toString() will print the information of a Book object in a clear,
	 * readable format to the user.
	 */
	public String toString()
	{
		if (this.category.equals('f') || this.category.equals('F'))
		{
			return "Book id: " + this.book_id + ", Title: " + this.book_title 
					+ ", ISBN: " + this.ISBN + ", Author: " + this.author_last_name
					+ ", Category: " + "Fiction";
		}
		else if (this.category.equals('n') || this.category.equals('N'))
		{
			return "Book id: " + this.book_id + ", Title: " + this.book_title 
					+ ", ISBN: " + this.ISBN + ", Author: " + this.author_last_name
					+ ", Category: " + "Non-Fiction";
		}
		
		// In case there is an invalid category entered.
		return "Invalid Category";
	}
	
	/**
	 * bookSearch(bookList, numBooks, id) will search through an array (bbokList) 
	 * looking for a book id (id).
	 * 
	 * @param bookList - the array of Book objects to be searched through.
	 * @param numBooks - the amount of Books in the array.
	 * @param id - the id that is being searched for.
	 * @return i - the index of the found book id.
	 * @throws BookNotFoundException - if the book id being searched for is
	 * not found.
	 */
	public static int bookSearch(Book[] bookList, int numBooks, int id) throws BookNotFoundException
	{
		for(int i = 0; i < numBooks; i++)
		{
			if(bookList[i].getBook_id() == id)
			{
				return i;
			}
		}
		throw new BookNotFoundException();
	}
}
