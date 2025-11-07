/*Student Ranking System

Problem Statement:
A university wants to display the top-ranking students based on 
their exam scores. Given an array of marks, sort them in ascending 
order using built-in array methods and display the highest marks at 
the end. */
import java.util.Arrays;
import java.util.Scanner;

public class StudentRankingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the number of students
        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();

        // Create an array to store student marks
        int[] marks = new int[n];

        // Read marks of students
        System.out.println("\nEnter the marks of " + n + " students:");
        for (int i = 0; i < n; i++) {
            System.out.print("Student " + (i + 1) + " marks: ");
            marks[i] = sc.nextInt();
        }

        // Sort the array using built-in method
        Arrays.sort(marks);

        // Display the sorted marks (ascending order)
        System.out.println("\nMarks in ascending order:");
        System.out.println(Arrays.toString(marks));

        // Display top-ranking student (highest marks)
        System.out.println("\nHighest mark: " + marks[n - 1]);

        // Display bottom-ranking student (lowest marks)
        System.out.println("Lowest mark: " + marks[0]);

    }
}
