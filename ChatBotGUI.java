import javax.swing.*;
import java.awt.event.*;

public class ChatBotGUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JavaBot");
        JTextArea chatArea = new JTextArea();
        JTextField inputField = new JTextField();
        JButton sendButton = new JButton("Send");

        // Layout setup
        chatArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(chatArea);
        frame.setLayout(null);
        scrollPane.setBounds(10, 10, 360, 300);
        inputField.setBounds(10, 320, 260, 30);
        sendButton.setBounds(280, 320, 90, 30);

        frame.add(scrollPane);
        frame.add(inputField);
        frame.add(sendButton);

        frame.setSize(400, 400);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Button click event
        sendButton.addActionListener(e -> {
            String userInput = inputField.getText();
            chatArea.append("You: " + userInput + "\n");
            chatArea.append("JavaBot: " + getBotResponse(userInput) + "\n");
            inputField.setText("");
        });
    }

    public static String getBotResponse(String input) {
        input = input.toLowerCase();
        if (input.contains("hi") || input.contains("hello")) {
            return "Hello there!";
        } else if (input.contains("how are you")) {
            return "I'm just code, but I'm feeling great!";
        } else if (input.contains("your name")) {
            return "I'm JavaBot, nice to meet you!";
        } else if (input.equals("bye")) {
            System.exit(0);
            return "";
        } else {
            return "Sorry, I didn't get that.";
        }
    }
}