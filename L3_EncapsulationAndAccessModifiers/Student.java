public class Student {

    // Perfect Encapsulation : when each data and methods are assigned as private.
    // attributes
    private int id;
    private String name;
    private int age;
    private int nos;

    //getter: through getters we can access the private data members.
    public String getName(){
       return this.name;
    }    
    
public Student(int id, String name, int age, int nos) {
        
        this.id = id;
        this.name = name;
        this.age = age;
        this.nos = nos;

    }
    
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
