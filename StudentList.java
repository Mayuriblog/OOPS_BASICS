import java.util.ArrayList;

public class StudentList {
    public static void main(String[] args) {
        // Create an ArrayList of students
        ArrayList<String> students = new ArrayList<String>();

        // Add students
        students.add("A");
        students.add("B");
        students.add("C");

        // Display list
        System.out.println("Student List: " + students);

        // Access elements
        System.out.println("First student: " + students.get(0));

        // Update element
        students.set(1, "Bobby");

        // Remove an element
        students.remove("Charlie");

        // Display updated list
        System.out.println("Updated List: " + students);

        // Check size
        System.out.println("Number of students: " + students.size());
    }
}
