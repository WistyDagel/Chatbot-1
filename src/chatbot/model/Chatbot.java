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
	
	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public int getNumberOfChats()
	{
		return numberOfChats;
	}

	public void incrementChats()
	{
		numberOfChats++;
	}
	
	public boolean quitChecker(String input)
	{
		boolean okToQuit = false;
		if(input.equalsIgnoreCase("Good Bye"))
		{
			okToQuit = true;
		}
		return okToQuit;
	}	
}