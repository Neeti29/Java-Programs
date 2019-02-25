package Threads;
class MultithreadDemo  extends Thread
{

	public void run()
	{
		try
		{
			//Displaying the thread that is running
			
			System.out.println("Thread " + Thread.currentThread().getId() + " is running");
		}
		
		catch(Exception e)
		{
			//Throwing an exception
			System.out.println("Exception is caught");
		}
	}
}


public class Multithread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=8; //Number of threads
		for(int i=0;i<n;i++)
		{
			MultithreadDemo object=new MultithreadDemo();
			object.start();
		}

		System.out.println("This is the Main Thread");
	}

}
