import java.util.Scanner;
	
class GreatestThree
{

    public static void main(String [] args)
	{
	  Scanner s=new Scanner(System.in);
	 //Control flow statements;
	
	    System.out.println("Enter first number");
		int x=s.nextInt();
		
		System.out.println("Enter second number");
		int y=s.nextInt();
		
		System.out.println("Enter third number");
		int z=s.nextInt();
		
		if(x>y&&x>z)
		{
			System.out.println("x is greatest");
		}
		
		else if(y>z)
		{
			System.out.println("y is greatest");
		}
		
		else
		{
			System.out.println("z is greatest");
		}	
	}
}	
	