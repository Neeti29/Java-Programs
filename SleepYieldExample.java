//Difference between sleep and yield
package Threads;
class Producer extends Thread
{
	public void run()
	{
		for(int i=0;i<3;i++)
		{
			System.out.println("I am Producer : Producing Item " + i);
			Thread.yield();
		}
	}
}

class Consumer extends Thread
{
	public void run()
	{
		for(int i=0;i<3;i++)
		{
			System.out.println("I am Consumer : Consuming Item " + i);
			Thread.yield();
		}
	}
}
public class SleepYieldExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//*** Sleep Example ***
		
		System.out.println(Thread.currentThread().getName() + " is sleeping for 3 seconds");
		
		try
		{
			Thread.currentThread().sleep(3000);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		
		System.out.println("Main Thread had enough sleep");
		
		//*** Yield Example ***
		
		System.out.println("Yield Example Starts");
		
		Thread producer =new Producer();
		Thread consumer = new Consumer();
		
		producer.setPriority(Thread.MIN_PRIORITY);
		consumer.setPriority(Thread.MAX_PRIORITY);
		
		producer.start();
		consumer.start();

	}

}