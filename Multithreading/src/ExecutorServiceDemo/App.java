package ExecutorServiceDemo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class App {
	public static void main(String[] args) {
		ExecutorService service= Executors.newFixedThreadPool(8);
		String []studentList = {
				"Rohit","Yash","Arzoo","Aman","Ravi","Srishti",
				"Kanika","Promila","Prem","Sajal","Sumit","Himanshu","Ranbir"
		};

		for(String student:studentList)
		{
			CertificationSender task=new CertificationSender(student);
			service.submit(task);
		}

		service.shutdown();
	}
}