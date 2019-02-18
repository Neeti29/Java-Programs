import java.util.Scanner;
	
class OddEven
{

    public static void main(String [] args)
	{
	  Scanner s=new Scanner(System.in);
	 //Control flow statements;
	
	    System.out.println("Enter first number");
		int num=s.nextInt();
		
		if(num%2==0)
		{
			System.out.println("Number is even");
		}
		
		else
		{
			System.out.println("Number is odd");
		}
	}
}	
	