import java.util.*;

public class ChatBot {
    private static final Map<String, String> responses = new HashMap<>();

    static {
        responses.put("hi", "Hello! How can I assist you today?");
        responses.put("hello", "Hi there! What can I do for you?");
        responses.put("how are you", "I'm just code, but I’m feeling chatty!");
        responses.put("bye", "Goodbye! Have a great day.");
        responses.put("what is ai", "AI stands for Artificial Intelligence—machines that simulate human intelligence.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to ChatBot! Type 'bye' to exit.");

        while (true) {
            System.out.print("> ");
            String userInput = sc.nextLine().toLowerCase().trim();

            if (userInput.equals("bye")) {
                System.out.println(responses.get("bye"));
                break;
            }

            boolean matched = false;
            for (String key : responses.keySet()) {
                if (userInput.contains(key)) {
                    System.out.println(responses.get(key));
                    matched = true;
                    break;
                }
            }

            if (!matched) {
                System.out.println("I'm still learning. Could you rephrase that?");
            }
        }
    }
}