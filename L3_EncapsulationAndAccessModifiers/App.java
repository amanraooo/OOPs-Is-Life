
public class App {
    public static void main(String[] args) {

        Student A = new Student(1, "Aman", 22, 5);

        // calling getter
        System.out.println(A.getName());
        System.out.println(A.getAge());

        // calling setter
        A.setName("Rahul");
        A.setAge(23);

        System.out.println(A.getName());
        System.out.println(A.getAge());

        A.setAge(233);
        System.out.println(A.getAge());




    }
}