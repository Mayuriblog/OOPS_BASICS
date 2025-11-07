/*Inventory Management in a Store 

Problem Statement: A store tracks two shipments of items. The manager 
wants to check whether both shipments contain identical product IDs in 
the same order. 
*/
import java.util.Arrays;
import java.util.Scanner;

public class InventoryManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of products in each shipment
        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();

        // Create two arrays to store product IDs
        int[] shipment1 = new int[n];
        int[] shipment2 = new int[n];

        // Input product IDs for shipment 1
        System.out.println("\nEnter Product IDs for Shipment 1:");
        for (int i = 0; i < n; i++) {
            System.out.print("Product ID " + (i + 1) + ": ");
            shipment1[i] = sc.nextInt();
        }

        // Input product IDs for shipment 2
        System.out.println("\nEnter Product IDs for Shipment 2:");
        for (int i = 0; i < n; i++) {
            System.out.print("Product ID " + (i + 1) + ": ");
            shipment2[i] = sc.nextInt();
        }

        // Display both shipments
        System.out.println("\nShipment 1: " + Arrays.toString(shipment1));
        System.out.println("Shipment 2: " + Arrays.toString(shipment2));

        // Compare both shipments using built-in method
        if (Arrays.equals(shipment1, shipment2)) {
            System.out.println("\nBoth shipments are identical.");
        } else {
            System.out.println("\nShipments are different.");
        }

    }
}
