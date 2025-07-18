import java.util.ArrayList;

public class ShoppingCart {
    public static void main(String[] args) {
        ArrayList<String> cart = new ArrayList<>();
        cart.add("Laptop");
        cart.add("Mouse");
        cart.add("Keyboard");

        for(String item : cart) {
            System.out.println("Item in cart: " + item);
        }
    }
}