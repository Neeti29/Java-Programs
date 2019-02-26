package Threads;

public class First {
	
   // synchronized 
	public void display(String msg)
	{
		System.out.print("["+msg);
		
		try
		{
			Thread.sleep(1000);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		System.out.println("]");
	}

}
class Second extends Thread
{
	String msg;
	First fobj;
	
	Second(First fp , String str)
	{
		fobj=fp;
		msg=str;
		start();
	}
	
	@Override
	public void run()
	{
		synchronized(fobj)        //Synchronized Block
		{
			fobj.display(msg);
		}
		
	}

}

