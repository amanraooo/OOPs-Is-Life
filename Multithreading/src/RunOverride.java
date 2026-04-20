class MyRunThread extends Thread{

	//without overriding run() no task will be cretaed no output given
}


public class RunOverride {
	public static void main(String[] args) {
		MyRunThread t = new MyRunThread();
		t.start();
		for (int i = 0; i < 5; i++) {
			System.out.println("main");
		}
	}
}
