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
	 * Starts the Chatbot Applicatoin
	 */
	public void start()
	{
		String message = JOptionPane.showInputDialog(null, "Would you like to continue?");
		if(notSoCleverbot.quitChecker(message))
		{
			quit();
		}
		JOptionPane.showMessageDialog(null, "We are not done yet...");
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
