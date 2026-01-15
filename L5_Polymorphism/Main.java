package L5_Polymorphism;

public class Main {
    public static void main(String[] args) {

        // compile time polymorphism : method overloading
        Calculator cal = new Calculator();
        System.out.println(cal.add(2, 2));
        System.out.println(cal.add(2, 2, 2));
        System.out.println(cal.add(2, 2, 2,2.2));

        // run time polymorphism
        // Circle cir = new Circle();
        // cir.draw();

        // Rectangle rect = new Rectangle();
        // rect.draw();

        // run time polymorphism : upcasting
        Circle cir = new Circle();
        doDrawinStuff(cir);

        Rectangle rect = new Rectangle();
        doDrawinStuff(rect);

        Shape s = new Shape();
        doDrawinStuff(s);    

    }
    //for dynamic method dispatch (upcasting)
    public static void doDrawinStuff(Shape s){
        s.draw();
    }
}
