import java.util.Scanner;

public class StringFunctions2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        
		// Original string
		System.out.println("Original String: \"" + s + "\"");        
        
		// Searching and Checking
        System.out.println("Contains 'Pro': " + s.contains("Pro"));
        System.out.println("Starts with 'J': " + s.startsWith("J"));
        System.out.println("Ends with 'g': " + s.endsWith("g"));
        System.out.println("Is Empty: " + s.isEmpty());

        // Conversion and Splitting
        System.out.println("toCharArray():");
        for (char ch : s.toCharArray()) {
            System.out.print(ch + " ");
        }
        System.out.println("\nSplit by space:");
        for (String part : s.split(" ")) {
            System.out.println("[" + part + "]");
        }
        System.out.println("Join Example: " + String.join("-", "Learn", "Java", "Now"));
        System.out.println("String.valueOf(123): " + String.valueOf(123));

        // Formatting and Matching
		System.out.println(s); 
        System.out.println("Formatted String: " + String.format("Hello %s!", s));
        System.out.println("Matches only letters (a-z/A-Z): " + s.matches("[a-zA-Z]+"));
    }
}
