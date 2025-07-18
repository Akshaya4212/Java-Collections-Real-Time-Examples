import java.util.TreeMap;

public class Leaderboard {
    public static void main(String[] args) {
        TreeMap<Integer, String> scores = new TreeMap<>();
        scores.put(1200, "Alice");
        scores.put(1500, "Bob");
        scores.put(1000, "Charlie");

        scores.descendingMap().forEach((score, name) ->
            System.out.println(name + ": " + score)
        );
    }
}
