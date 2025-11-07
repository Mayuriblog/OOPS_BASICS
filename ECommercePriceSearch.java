/*E-Commerce Price Search 
 
Problem Statement: In an online store, a sorted list of product prices 
is maintained. When a customer searches for a product, the system must 
quickly determine whether a price exists in the list using binary search. 

Built-in Methods Used: Arrays.sort(), Arrays.binarySearch(prices, searchValue);
*/
import java.util.Arrays;
import java.util.Scanner;

public class ECommercePriceSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the number of products
        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();

        // Create an array for product prices
        double[] prices = new double[n];

        // Read product prices
        System.out.println("\nEnter the prices of " + n + " products:");
        for (int i = 0; i < n; i++) {
            System.out.print("Price of product " + (i + 1) + ": ");
            prices[i] = sc.nextDouble();
        }

        // Sort prices (binary search requires sorted array)
        Arrays.sort(prices);

        System.out.println("\nSorted product prices:");
        System.out.println(Arrays.toString(prices));

        // Read the price to search from user
        System.out.print("\nEnter the price to search: ");
        double searchPrice = sc.nextDouble();

        // Perform binary search
        int result = Arrays.binarySearch(prices, searchPrice);

        // Display the result
        if (result >= 0) {
            System.out.println("Price " + searchPrice + " found at index " + result + ".");
        } else {
            System.out.println("Price " + searchPrice + " not found in the list.");
        }
    }
}
