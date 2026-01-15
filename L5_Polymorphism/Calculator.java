package L5_Polymorphism;

public class Calculator {

    // method overloading : over argument count
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    // method overloading : over argument type
    double add(int a, int b, int c, double d) {
        return a + b + c + d;
    }

}
