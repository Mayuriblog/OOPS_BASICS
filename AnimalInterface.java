interface Animal {
    void eat();
    void sleep();
}
//Hierarchical Inheritance - Single parent, multiple children
// Animal is parent and Dog and Goat are children.
class Dog implements Animal {
    public void eat() {
        System.out.println("Dog eats meat.");
    }
    public void sleep() {
        System.out.println("Dog sleeps at night.");
    }
}
class Goat implements Animal {
    public void eat() {
        System.out.println("Goat eats grass.");
    }
    public void sleep() {
        System.out.println("Goat sleeps at night.");
    }
}
public class AnimalInterface {
    public static void main(String[] args) {
        Animal a = new Dog();  // is-a relationship
		Animal b = new Goat();
        a.eat();
        a.sleep();
		b.eat();
        b.sleep();
    }
}
