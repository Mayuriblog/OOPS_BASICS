// Abstract class
abstract class Shape {
    String color;

    Shape(String color) {
        this.color = color;
    }
	// Abstract method 
    abstract double area();
	
	// Concrete (non-abstract) method
    void display() {
        System.out.println("This is a shape of color: " + color);
    }
}

// Subclass Circle extends Shape
class Circle extends Shape {
    double radius;

	// Constructor
    Circle(String color, double radius) {
        super(color); 
        this.radius = radius;
    }
	// Implementing the abstract method
    @Override
    double area() {
        return Math.PI * radius * radius;
    }
	// Method Specific to Circle
    void showDetails() {
        display();
        System.out.println("Circle radius: " + radius);
        System.out.println("Circle area: " + area());
    }
}

public class AbstractClassExample {
    public static void main(String[] args) {
        // Shape s = new Shape("Red");  ❌ Error: Cannot instantiate abstract class
        Circle c = new Circle("Blue", 5.5);
        c.showDetails();
    }
}
