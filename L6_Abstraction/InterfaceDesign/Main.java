package L6_Abstraction.InterfaceDesign;

interface Bird {
    void fly();

    void eat();
}

class Sparrow implements Bird {

    @Override
    public void eat() {
        System.out.println("Sparrow eating");
    }

    @Override
    public void fly() {
        System.out.println("Sparrow flying");
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
    }
}
