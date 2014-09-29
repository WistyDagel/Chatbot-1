package chatbot.model;

public class Chatbot
{
	private String name;
	private int numberOfChats;
	/**
	 * Creates a Chatbot object with a specified name. Initializes the total Chats to 0.
	 *  @param name The name of the Chatbot.
	 */
	public Chatbot(String name)
	{
		this.name = name;
		numberOfChats = 0;
		// this. means talk to the current class
	}
	/**
	 * Method that retrieves the name of the chatbot when called
	 * @return returns the value of name
	 */
	public String getName()
	{
		return name;
	}
/**
 *  Method that sets the name of the Chatbot when called.
 * @param name New name of the Chatbot
 */
	public void setName(String name)
	{
		this.name = name;
	}
/**
 * Retrieves how many "Chats" have happenes when called.
 * @return Returns how many "Chats" have happened
 */
	public int getNumberOfChats()
	{
		return numberOfChats;
	}
/**
 * Increments the number of chats by 1 when called.
 */
	public void incrementChats()
	{
		numberOfChats++;
	}
	/**
	 *  Determines whether or not it is ok to quit the program.
	 * @param input The input from the user
	 * @return true or false value  based on input
	 */
	public boolean quitChecker(String input)
	{
		boolean okToQuit = false;
		if(input != null && input.equalsIgnoreCase("Good Bye"))
		{
			okToQuit = true;
		}
		return okToQuit;
	}	
}