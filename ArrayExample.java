// 
public class ArrayExample {
    public static void main(String[] args) {
        
        int[] numbers = {10, 20, 30, 40, 50};
        
        System.out.println("First element: " + numbers[0]);
        System.out.println("Last element: " + numbers[4]);
        
        System.out.println("All elements:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
