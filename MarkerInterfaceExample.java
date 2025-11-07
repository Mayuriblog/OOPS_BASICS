interface Marker {}   // Marker interface

class Example implements Marker {}

public class MarkerInterfaceExample {
    public static void main(String[] args) {
        Example e = new Example();
        if (e instanceof Marker) {
            System.out.println("Object is marked for special behavior.");
        }
    }
}
