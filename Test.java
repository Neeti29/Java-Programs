import java.util.Scanner;
class Test
{
	public static void main(String [] args)
	{
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter First number");
		int a=s.nextInt();
		
		System.out.println("Enter Second number");
		int b=s.nextInt();
		
		System.out.println("Enter Third number");
		int c=s.nextInt();
		
		int sum=a+b+c;
		System.out.println("Sum is:"+sum);
		
        float avg=(float)(sum)/3;
		System.out.println("Average is:"+avg);
		
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
		