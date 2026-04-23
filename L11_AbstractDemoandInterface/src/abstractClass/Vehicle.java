package abstractClass;

public abstract class Vehicle {

	String brand;

	public Vehicle(String brand) {
		this.brand = brand;
	}

	abstract void start();

	public void concreteMethod(){
		System.out.println("concrete method  in abstract class");
	}
}
