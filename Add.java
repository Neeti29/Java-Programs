import java.util.Scanner;
class Add
{
	public static void main(String [] args)
	{
		//using print statement
	/*	 System.out.println(2+3);
		
		//using variables 
		int x=10;int y=20;int z;
		z=x+y;
		System.out.println("sum is:"+z);
		
		//using command line arguement
		
		System.out.println(args[0]);
		System.out.println(args[1]);
		System.out.println(args[2]);
		
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		int c=Integer.parseInt(args[2]);
		int sum=a+b+c;
		
		System.out.println("Sum is:"+sum);
		
		//using scanner class
		
		System.out.println("Input the first number to add");
		Scanner scan=new Scanner(System.in);
		int n1=scan.nextInt();
		System.out.println("Input the second number to add");
		int n2=scan.nextInt();
		int n3=n1+n2;
		System.out.println("the answer: "+n3);*/
		
		//printing strings 
		Scanner scan=new Scanner(System.in);
       System.out.println("Enter your name:");
	   String s1=scan.next();
       System.out.println("Name is :"+ s1);
	   
	   String s2=scan.nextLine();
       System.out.println("Name is :"+ s2);
	   
	    System.out.println("Enter your gender:");
	   char gender=scan.next().charAt(0);
	   System.out.println("gender: "+gender);
	   
		
		
		
		
	}
}	