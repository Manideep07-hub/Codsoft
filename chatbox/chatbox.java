import java.util.Scanner;

public class RuleBasedChatbot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Chatbot: Hi! I'm your chatbot. Ask me anything. Type 'exit' to end the chat.");
        
        while (true) {
            System.out.print("You: ");
            String userInput = scanner.nextLine().toLowerCase();
            
            // Exit condition
            if (userInput.equals("exit")) {
                System.out.println("Chatbot: Goodbye! Have a great day!");
                break;
            }

            // Rule-based responses
            if (userInput.contains("hello") || userInput.contains("hi")) {
                System.out.println("Chatbot: Hello! How can I assist you today?");
            } else if (userInput.contains("your name")) {
                System.out.println("Chatbot: I'm a simple rule-based chatbot. You can call me Chatbot!");
            } else if (userInput.contains("weather")) {
                System.out.println("Chatbot: I'm not connected to the internet, but it looks like a great day!");
            } else if (userInput.contains("time")) {
                System.out.println("Chatbot: Sorry, I can't tell the time yet, but I'm learning!");
            } else if (userInput.contains("thank you") || userInput.contains("thanks")) {
                System.out.println("Chatbot: You're welcome! Let me know if you have more questions.");
            } else {
                System.out.println("Chatbot: I'm not sure how to respond to that. Can you ask something else?");
            }
        }
        
        scanner.close();
    }
}
