/*Student Marks Management System
Problem Statement:
A school maintains the exam marks of students in a two-dimensional array,
where rows represent students and columns represent subjects.

The school wants to:
1. Store the marks of all students for multiple subjects.
2. Display the marks in tabular form.
3. Calculate each student’s total marks and average marks.
4. Identify the top-performing student based on total marks.
*/
import java.util.Scanner;

public class StudentMarksManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of students and subjects
        System.out.print("Enter number of students: ");
        int students = sc.nextInt();

        System.out.print("Enter number of subjects: ");
        int subjects = sc.nextInt();

        // Declare a 2D array to store marks
        int[][] marks = new int[students][subjects];

        // Read marks
        System.out.println("\nEnter marks of each student:");
        for (int i = 0; i < students; i++) {
            System.out.println("Student " + (i + 1) + ":");
            for (int j = 0; j < subjects; j++) {
                System.out.print("Subject " + (j + 1) + ": ");
                marks[i][j] = sc.nextInt();
            }
        }

        // Display marks in tabular format and calculate totals
        int topStudent = 0;
        int highestTotal = 0;

        System.out.println("\nStudent Marks Table:");
        for (int i = 0; i < students; i++) {
            int total = 0;
            System.out.print("Student " + (i + 1) + " marks: ");
            for (int j = 0; j < subjects; j++) {
                System.out.print(marks[i][j] + " ");
                total += marks[i][j];
            }
            double average = (double) total / subjects;
            System.out.println(" | Total = " + total + ", Average = " + String.format("%.2f", average));

            // Track top performer
            if (total > highestTotal) {
                highestTotal = total;
                topStudent = i;
            }
        }

        // Display top-performing student
        System.out.println("\nTop Performer: Student " + (topStudent + 1) + " with total marks = " + highestTotal);

    }
}
