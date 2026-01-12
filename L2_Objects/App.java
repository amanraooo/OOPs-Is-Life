public class App {
    public static void main(String[] args) {
        // deafult constructor
        Student A = new Student();
        A.id = 1;
        A.name = "Ayush";
        A.nos = 5;
        A.age = 16;

        System.out.println(A.id);
        System.out.println(A.name);
        System.out.println(A.nos);
        System.out.println(A.age);

        A.bunk();
        A.study();
        A.sleep();

        System.out.println("-------");

        // parameterised constructor
        Student B = new Student(2, "Bablu", 15, 5);

        System.out.println(B.id);
        System.out.println(B.name);
        System.out.println(B.nos);
        System.out.println(B.age);

        B.bunk();
        B.study();
        B.sleep();

        System.out.println("-------");

        // copy constructor
        Student C = new Student(B);

        System.out.println(C.id);
        System.out.println(C.name);
        System.out.println(C.nos);
        System.out.println(C.age);

        C.bunk();
        C.study();
        C.sleep();

        System.out.println("-------");

    }
}