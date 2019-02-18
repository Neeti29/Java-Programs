import java.util.Scanner;
	
class ArithmeticOperations
{

    public static void main(String [] args)
	{
	  Scanner s=new Scanner(System.in);
	 //Control flow statements;
	       System.out.println("Enter first number");
		   int x=s.nextInt();
		
		   System.out.println("Enter second number");
		   int y=s.nextInt();
	      
		   System.out.println("Enter any operator");
		   char op=s.next().charAt(0);
	    
		 switch(op)
		 {
			 case '+':
			 
				//int z=x+y;
				System.out.println("Addition of two numbers :"+(x+y));
				//break;
			 
			 
			 case '-':
			 
				
				//int z=x-y;
				System.out.println("Subtraction of two numbers :"+(x-y));
				break;
			 
			 
			 case '*':
			 
				
				//int z=(x)*(y);
				System.out.println("Multiplication of two numbers :"+(x)*(y));
				break;
			 
			 
			 case '/':
			 
				
				//float z=(float)x/y;
				System.out.println("Division of two numbers :"+(x/y));
				break;
			 	 
			 
			 case '%':
			 
				//int z=x%y;
				System.out.println("Modulas of two numbers :"+(x%y));
				break;
			 
			 
			 default:
			 
				 System.out.println("Invalid operations");
			 
		 }
		
	}
}	
	