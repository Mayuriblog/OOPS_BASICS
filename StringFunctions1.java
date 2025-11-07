import java.util.Scanner;

public class StringFunctions1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        
		// Original string
		System.out.println("Original String: \"" + s + "\"");        
        		
		// Substring and Modification
        if (s.length() >= 4)
            System.out.println("Substring(1,4): " + s.substring(1, 4));
        
		System.out.println("Concatenation: " + s.concat(" Rocks!"));
        System.out.println("Replace 'a' with '@': " + s.replace('a', '@'));
        System.out.println("Trimmed: \"" + s.trim() + "\"");

		// Comparison
        System.out.print("Enter another string for comparison: ");
        String s2 = sc.nextLine();
        System.out.println("Equals: " + s.equals(s2));
        System.out.println("Equals Ignore Case: " + s.equalsIgnoreCase(s2));
        System.out.println("CompareTo: " + s.compareTo(s2));
        System.out.println("CompareTo Ignore Case: " + s.compareToIgnoreCase(s2));        
    }
}
