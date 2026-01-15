package L4_Inheritence.Transport;

public class Car extends Vehicle {
    public int noOfDoors;
    public String transmissionType;

    Car(String name, String model, int noOfTyres, int noOfDoors, String transmissionType) {

        // to initialize the object of child class with parent class's data members we
        // use super()
        // and super() must be initialized first and after that we initialize the data
        // members of child class we cant use super after initialization of child class
        // members
        super(name, model, noOfTyres);

        this.noOfDoors = noOfDoors;
        this.transmissionType = transmissionType;

        // super() can also invoke the methods of immediate parent
        // super.startEngine();
        // super.stopEngine();

    }

    public void startAC() {
        System.out.println("AC started of " + name);
    }
}
