/**
 * @author     Camby Abell
 * @assignment assg4_Abell
 * @filename   BookNotFoundException.java
 */

package assg4_Abell;

@SuppressWarnings("serial")
public class BookNotFoundException extends Exception
{
	/**
	 * This is a parameterless constructor that will display an error message
	 * if called.
	 */
	public BookNotFoundException()
	{
		System.out.println("Book id does not exist.");
	}
	
	/**
	 * This constructor will display an error message when called.
	 * @param message - a message.
	 */
	public BookNotFoundException(String message)
	{
		System.out.println(message);
	}
}
