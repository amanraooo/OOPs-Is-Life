package LockDemo;

import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {
	public int bal = 15000;
	private final ReentrantLock rl = new ReentrantLock();

	public void withdraw(String threadName ,int amount){

		System.out.println(threadName+" is trying to  withdraw "+ amount  );

		rl.lock();
		try{
			System.out.println(threadName+" accuired lock");
			if(bal>amount){
				Thread.sleep(2000);
				bal=bal-amount;
				System.out.println("withdrawn: "+ amount+ "remaining: "+ bal);
			}
			else {
				System.out.println("insufficient balance");
			}
		}
		catch(InterruptedException e){
			throw new RuntimeException(e);
		}
		finally {
			rl.unlock();
		}

	}
}
