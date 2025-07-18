import java.util.Stack;

public class UndoFeature {
    public static void main(String[] args) {
        Stack<String> actions = new Stack<>();
        actions.push("Typed A");
        actions.push("Typed B");
        actions.push("Deleted B");

        System.out.println("Undoing: " + actions.pop());
    }
}