public class Student {

    // attributes
    public int id;
    public String name;
    public int age;
    public int nos;

    // default constructor
    public Student() {
        System.out.println("default constructor called");
    }

    // parameterised constructor
    public Student(int id, String name, int age, int nos) {
        System.out.println("parameterised constructor called");

        this.id = id;
        this.name = name;
        this.age = age;
        this.nos = nos;

    }

    // copy constructor
    public Student(Student srcObj) { // srcObj -> B
        System.out.println("copy constructor called");

        this.id = srcObj.id;
        this.name = srcObj.name;
        this.age = srcObj.age;
        this.nos = srcObj.nos;

    }

    // methods or behaviours
    public void study() {
        System.out.println(name + " studying");
    }

    public void sleep() {
        System.out.println(name + " sleeping");
    }

    public void bunk() {
        System.out.println(name + " bunking");
    }

}
