import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SimpleChatBot {

    // Knowledge base: keyword → response
    private static final Map<String, String> responses = new HashMap<>();

    static {
        responses.put("hi", "Hello! How can I help you today?");
        responses.put("hello", "Hi there! What can I do for you?");
        responses.put("how are you", "I'm just a bunch of code, but I'm functioning perfectly!");
        responses.put("what is your name", "I'm ChatBot, your virtual assistant.");
        responses.put("bye", "Goodbye! Have a great day.");
        responses.put("help", "I can answer questions about my features, purpose, or usage.");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ChatBot: Hi! I’m your virtual assistant. Type 'bye' to exit.");

        while (true) {
            System.out.print("You: ");
            String userInput = scanner.nextLine().toLowerCase().trim();

            if (userInput.equals("bye")) {
                System.out.println("ChatBot: " + responses.get("bye"));
                break;
            }

            boolean found = false;
            for (String key : responses.keySet()) {
                if (userInput.contains(key)) {
                    System.out.println("ChatBot: " + responses.get(key));
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("ChatBot: Sorry, I didn’t understand that. Try asking something else.");
            }
        }

        scanner.close();
    }
}
