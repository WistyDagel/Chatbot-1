package chatbot.model;

import java.util.ArrayList;

public class Chatbot
{
	private String name;
	private ChatUser myUser;
	private int numberOfChats;
	/**
	 * A list of memes that the program can pull from when processing the text.
	 */
	private ArrayList<String> memeList;
	/**
	 * A list of input from the user to be used within the program.
	 */
	private ArrayList<String> userInputList;
	
	/**
	 * Creates a Chatbot object with a specified name. Initializes the total Chats to 0. Creates and fills the memeList.
	 *  @param name The name of the Chatbot.
	 */
	public Chatbot(String name)
	{
		// this. means talk to the current class
		this.name = name;
		numberOfChats = 0;
		memeList = new ArrayList<String>();
		userInputList = new ArrayList<String>();
		fillTheMemeList();
		myUser = new ChatUser();
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
	 * Adds a list of memes to memeList.
	 */
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
		int randomChoice = (int)(Math.random() * 6);
		if(userText != null)
		{	
			if(randomChoice == 0)
			{
				// stringChecker
				if(stringChecker(userText))
				{
					incrementChats();
					processedText = "Wow getting a bit long winded there are we?";
					processedText += numberOfChats;
				}
				else
				{
					processedText = "Wow man, learn to talk a bit more. That was pitiful";
					processedText += numberOfChats;
				}
			}
			else if(randomChoice == 1)
			{
				// contentChecker
				if(contentChecker(userText))
				{
					incrementChats();
					processedText = "Man I love spicy food! It's my favorite! Aw man.... Now I'm craving it...";
					processedText +=  numberOfChats;
				}
				else
				{
					processedText = "So.... What kind of food do you like?";
					processedText +=  numberOfChats;
				}
			}
			else if(randomChoice == 2)
			{
				if(memeChecker(userText))
				{
					incrementChats();
					processedText = "Hey! you found a meme: " + userText;
					processedText += "\nIsn't that cool.";
					processedText +=  numberOfChats;
				}
				else
				{
					processedText = "Boring...";
					processedText +=  numberOfChats;
				}	
			}
			else if(randomChoice == 3)
			{
				processedText = "This is really just a filler text but I really don't like you anyway.";
			}
			else if(randomChoice == 4)
			{
				//userInput list add.
			}
			else if(randomChoice == 5)
			{
				if(userInputChecker(userText))
				{
					processedText = "Yikes you knew what you said before!";
				}
				else
				{
					processedText = "I don't think I've heard that before";
				}
			}
			else
			{
				if(chatbotNameChecker(userText))
				{
					processedText = chatbotNameConversation(userText);
				}
				else
				{
					processedText = noNameConversation(userText);
				}
			}
			if (numberOfChats <= 10)
			{
			    /*	if(numberOfChats == 0)
				{
					myUser.setName(userText);
					processedText = "Hello " + myUser.getName() + " what is your age?";
				}
				else if(numberOfChats == 1)
				{
					int age = Integer.parseInt(userText);
					myUser.setAge(age);
					processedText = "Hello " + myUser.getName() + ", you are really " + myUser.getAge()  + " years old?";
					processedText += "\nWhat is your favorite movie?";
				
				}*/
				if(numberOfChats == 10)
				{
					processedText = "I've said too much!";
				}
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
			if (currentText.contains(currentMeme) || currentText.equalsIgnoreCase(currentMeme))
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
	/**
	 * Checks to see if the name of the Chatbot is contained within the String supplied by the user.
	 * @param currentInput The user supplied string
	 * @return Whether the name is inside or not.
	 */
	private boolean chatbotNameChecker(String currentInput)
	{
		boolean hasNameInString = false;
		
		if(currentInput.indexOf(this.getName()) > -1)
		{
			hasNameInString = true;
		}
		
		return hasNameInString;
	}

	private String chatbotNameConversation(String currentInput)
	{
		String nameConversation = "This is what you typed after my name: ";
		
		nameConversation += currentInput.substring(currentInput.indexOf(this.getName()) + this.getName().length() - 1);
		
		return nameConversation;
	}

	private String noNameConversation(String currentInput)
	{
		String notNamed = "";
		
		int smallRandom = (int) (Math.random() * currentInput.length()/2);
		int largerRandom = (int) ((Math.random() * smallRandom) + (Math.random() * (currentInput.length() / 2)) + 1);
		
		notNamed = "You didn't say my name so here is a special phrase: \n" + currentInput.substring(smallRandom, largerRandom);
		
		return notNamed;
	}
	
}