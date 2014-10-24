package chatbot.controller;

import chatbot.model.Chatbot;
import chatbot.view.ChatbotFrame;
import chatbot.view.ChatbotView;

/**
 * Application Controller for the Chatbot String projoct. Controls the View and Model packages.
 * @author Daniel Osmond
 * @version 1.2 10/1/14
 */

public class ChatbotAppController
{
	/**
	 * The GUI for the app
	 */
	
	private ChatbotView appView;
	/**
	 * Chatbot Model instance
	 */
	
	private Chatbot notSoCleverbot;
	/**
	 * The Startup message.
	 */
	
	private String startMessage;
	/**
	 * GUI Frame for the app.
	 */
	private ChatbotFrame baseFrame;
/**
 * Creates a ChatbotAppController and initializes the assoiated View and Model objects.	
 */
	
	public ChatbotAppController()
	{
		appView = new ChatbotView(this);
		baseFrame = new ChatbotFrame(this);
		notSoCleverbot = new Chatbot("Mr. Clever");
		startMessage = "Welcome to the " + notSoCleverbot.getName() + " Chatbot, type in your name.";
	}
	/**
	 * Allows other object access to the notSoCleverbot.
	 * @return The Chatbot for this app.
	 */
	
	public Chatbot getNotSoCleverbot()
	{
		return notSoCleverbot;
	}
	/**
	 * Starts the Chatbot Application
	 */
	
	public void start()
	{
//		String message = appView.displayChatbotConversations(startMessage);
//
//		 while(!notSoCleverbot.quitChecker(message))
//		 
//		{
//			message = notSoCleverbot.processText(message);
//			if(message.equals("I've said too much!"))
//			{
//				message = appView.displayChatbotConversations(message);
//				quit();
//			}
//			message = appView.displayChatbotConversations(message);
//		}
//		quit();
	}
	/**
	 * Ends and closes the program completely
	 */
	
	private void quit()
	{
		appView.displayInformation("Good bye cruel user :( I hope to never see you again.");
		System.exit(0);
	}
}