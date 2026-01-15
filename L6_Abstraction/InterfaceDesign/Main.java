package L6_Abstraction.InterfaceDesign;

interface Bird {
    void fly();

    void eat();

    // interface can have deafult non-abstract methods
    default void walk() {
        System.out.println("Birds do walk");
    }

}

// implementing multiple inheritence
// in java a class can not extends from multiple classes but can implements multiple interfaces
interface Animal {
    void isAnimal();

}

class Sparrow implements Bird, Animal {

    @Override
    public void eat() {
        System.out.println("Sparrow eating");
    }

    @Override
    public void fly() {
        System.out.println("Sparrow flying");
    }

    @Override
    public void isAnimal() {
        System.out.println("Sparrow is animal");
    }
}

class Crow implements Bird {
    @Override
    public void eat() {
        System.out.println("Crow eating");
    }

    @Override
    public void fly() {
        System.out.println("Crow flying");
    }
}

public class Main {
    public static void main(String[] args) {
        doBirdStuff(new Sparrow());
        doBirdStuff(new Crow());
    }

    public static void doBirdStuff(Bird b) {
        b.eat();
        b.fly();

        // calling isAnimal()
        if (b instanceof Animal) {
            Animal a = (Animal) b;
            a.isAnimal();
        }
    }
}
