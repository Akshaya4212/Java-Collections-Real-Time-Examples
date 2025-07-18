import java.util.LinkedList;
import java.util.Queue;

public class PrinterQueue {
    public static void main(String[] args) {
        Queue<String> printJobs = new LinkedList<>();
        printJobs.add("Document1.pdf");
        printJobs.add("Document2.docx");

        while (!printJobs.isEmpty()) {
            System.out.println("Printing: " + printJobs.poll());
        }
    }
}