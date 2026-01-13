
public class App {
    public static void main(String[] args) {

        Student A = new Student(1, "Aman", 22, 5);

        // calling getter
        System.out.println(A.getName());
        System.out.println(A.getId());

        // calling setter
        A.setName("Rahul");

        System.out.println(A.getName());

    }
}