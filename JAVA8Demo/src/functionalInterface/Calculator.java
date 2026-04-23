package functionalInterface;

@FunctionalInterface
public interface Calculator {

	int add(int a, int b);
}

// we have no need to do this
class child implements Calculator{

	@Override
	public int add(int a, int b){
		return a+b;
	}

}

//after java 8

class Driver{
	public static void main(String[] args) {
		Calculator addition = (a,b)->a+b;
		System.out.println("addition "+ addition.add(2,2));
	}
}



