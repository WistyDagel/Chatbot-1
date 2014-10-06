package chatbot.model;

import java.util.ArrayList;

public class Chatbot
{
	private String name;
	private int numberOfChats;
	private ArrayList<String> memeList;
	
	/**
	 * Creates a Chatbot object with a specified name. Initializes the total Chats to 0. Creates and fills the memeList.
	 *  @param name The name of the Chatbot.
	 */
	public Chatbot(String name)
	{
		this.name = name;
		numberOfChats = 0;
		memeList = new ArrayList<String>();
		fillTheMemeList();
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
	private void fillTheMemeList()
	{
		memeList.add("u mad bro?");
		memeList.add("doh");
		memeList.add("i'm full");
		memeList.add("money");
		memeList.add("not sure if");
		memeList.add("what if");
	}
	/**
	 * Processes the users input so the Chatbot can make a response.
	 * @param userText The text supplied by the user.
	 * @return What the Chatbot says because of the supplied input.
	 */
	public String processText(String userText)
	{
		String processedText = "";
		incrementChats();
		int randomChoice = (int)(Math.random() * 3);
		if(randomChoice == 0)
		{
			// stringChecker
			if(stringChecker(userText))
			{
				processedText = "Wow getting a bit long winded there are we?";
			}
			else
			{
				processedText = "Wow man, learn to talk a bit more. That was pitiful";
			}
		}
		else if(randomChoice == 1)
		{
			// contentChecker
			if(contentChecker(userText))
			{
				processedText = "Man I love spicy food! It's my favorite! Aw man.... Now I'm craving it...";
			}
			else
			{
				processedText = "So.... What kind of food do you like?";
			}
		}
		else
		{
			if(memeChecker(userText))
			{
				processedText = "Hey! you found a meme: " + userText;
				processedText += "\nIsn't that cool.";
			}
			else
			{
				processedText = "Boring...";
			}	
		}
		return processedText;
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
	/**
	 * Checks to see if the input text is a reference to a meme
	 * @param currentText text input by user
	 * @return value returns either true or false
	 */
	private boolean memeChecker(String currentText)
	{
		boolean foundAMeme = false;
		for(String currentMeme: memeList)
		{
			if (currentMeme.equalsIgnoreCase(currentText))
			{
				foundAMeme = true;
			}
		}
		return foundAMeme;
	}
	/**
	 * Checks how long the text input is and sets a boolean value based on it.
	 * @param userText The text input by the user
	 * @return true if text length is above or equal to 15.
	 */
	private boolean stringChecker(String input)
	{
		boolean longText = false;
		int textLength = input.length();
		if (textLength >= 15)
		{
			longText = true;
		}
		return longText;
	}
	/**
	 * Checks if the text supplied to the user references spicy food.
	 * @param input The text supplied by the user
	 * @return true or false based on input
	 */
	private boolean contentChecker(String input)
	{
		boolean containsWord = false;
		if (input.contains("spicy food"))
		{
			containsWord = true;
		}
		return containsWord;
	}
}