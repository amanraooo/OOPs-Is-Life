package L6_Abstraction.AbstractDesign;

abstract class Bird {
    abstract void eat();

    abstract void fly();
}

class Sparrow extends Bird {

    public void eat() {
        System.out.println("Sparrow eating");
    }

    public void fly() {
        System.out.println("Sparrow flying");
    }
}

public class Main {
    public static void main(String[] args) {
        Bird b = new Sparrow();
        b.eat();
        b.fly();
    }

}
