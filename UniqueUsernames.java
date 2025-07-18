import java.util.HashSet;

public class UniqueUsernames {
    public static void main(String[] args) {
        HashSet<String> usernames = new HashSet<>();
        usernames.add("john123");
        usernames.add("emma99");
        usernames.add("john123"); // duplicate, won't be added

        for (String user : usernames) {
            System.out.println("Registered user: " + user);
        }
    }
}