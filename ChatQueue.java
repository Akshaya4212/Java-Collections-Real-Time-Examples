import java.util.LinkedList;

public class ChatQueue {
    public static void main(String[] args) {
        LinkedList<String> messages = new LinkedList<>();
        messages.add("Hi");
        messages.add("How are you?");
        messages.add("Let's meet!");

        while(!messages.isEmpty()) {
            System.out.println("Processing message: " + messages.poll());
        }
    }
}
