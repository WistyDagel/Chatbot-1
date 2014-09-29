package chatbot.view;

import javax.swing.JOptionPane;

import chatbot.controller.ChatbotAppController;

public class ChatbotView
{
	private ChatbotAppController baseController;
	public ChatbotView(ChatbotAppController baseController)
	{
		this.baseController = baseController;
	}
	public String displayChatbotConversations(String input)
	{
		String output = "";
		output = JOptionPane.showInputDialog(null, baseController.getNotSoCleverbot().getName() + " says hello " + input+ ". Do you wish to continue?");
		return output;
	}
}
