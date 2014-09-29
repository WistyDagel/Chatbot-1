package chatbot.controller;

import javax.swing.JOptionPane;

import chatbot.model.Chatbot;
import chatbot.view.ChatbotView;


public class ChatbotAppController
{
	private ChatbotView appView;
	private Chatbot notSoCleverbot;
/**
 * Creates a ChatbotAppController and initializes the assoiated View and Model objects.	
 */
	public ChatbotAppController()
	{
		appView = new ChatbotView(this);
		notSoCleverbot = new Chatbot("Mr. Clever");
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
		String message = JOptionPane.showInputDialog(null, "Welcome to Chatbot, type in your name.");
		while(!notSoCleverbot.quitChecker(message))
		{
			message = appView.displayChatbotConversations(message);
		}
		quit();
	}
	/**
	 * Ends and closes the program completely
	 */
	private void quit()
	{
		JOptionPane.showMessageDialog(null, "Good Bye");
		System.exit(0);
	}
}
