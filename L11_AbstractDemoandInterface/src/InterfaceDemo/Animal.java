package InterfaceDemo;

public interface Animal {

	void makeSound();
	void eats();
}

class Dog implements Animal{

	@Override
	public void makeSound(){
		System.out.println("Dog barks");
	}

	@Override
	public void eats(){
		System.out.println("Dog eats roti");
	}

	public static void main(String[] args) {
		Dog kaalu = new Dog();
		kaalu.eats();
		kaalu.makeSound();
	}
}
