abstract class Shape {
    abstract void draw();  
    void color() {
        System.out.println("All shapes have a color.");
    }
}
// Hierarchical Inheritance
class Circle extends Shape {
    void draw() {
        System.out.println("Drawing a Circle");
    }
}
class Rectangle extends Shape {
    void draw() {
        System.out.println("Drawing a Rectangle");
    }
}
class Triangle extends Shape {
    void draw() {
        System.out.println("Drawing a Triangle");
    }
}
public class ShapeExample {
    public static void main(String[] args) {
        Shape c = new Circle();
		Shape r = new Rectangle();
		Shape t = new Triangle();
        c.draw();   
        c.color();  
		r.draw();   
        r.color();
		t.draw();   
        t.color();
    }
}
