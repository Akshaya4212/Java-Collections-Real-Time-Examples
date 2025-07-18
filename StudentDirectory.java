import java.util.HashMap;

public class StudentDirectory {
    public static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<>();
        students.put(101, "Ravi");
        students.put(102, "Anjali");

        int searchId = 101;
        if (students.containsKey(searchId)) {
            System.out.println("Student Found: " + students.get(searchId));
        }
    }
}