package L5_Polymorphism;

public class Main {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        System.out.println(cal.add(2, 2));
        System.out.println(cal.add(2, 2, 2));
        System.out.println(cal.add(2, 2, 2,2.2));

        Circle cir = new Circle();
        cir.draw();

        Rectangle rect = new Rectangle();
        rect.draw();

    }
}
