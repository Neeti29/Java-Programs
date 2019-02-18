import java.util.Scanner;
	
class Greatest
{

    public static void main(String [] args)
	{
	  Scanner s=new Scanner(System.in);
	 //Control flow statements;
	
	    System.out.println("Enter first number");
		int x=s.nextInt();
		
		System.out.println("Enter second number");
		int y=s.nextInt();
		
		if(x>y)
		{
			System.out.println("x is greatest");
		}
		
		else
		{
			System.out.println("y is greatest");
		}
	}
}	
	