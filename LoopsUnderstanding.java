import java.util.Scanner;
	
class LoopsUnderstanding
{

    public static void main(String [] args)
	{
		Scanner s=new Scanner(System.in);
		//Control flow statements;
		//While Loop
		/* int count=10;
		while(count>=1)
		{
			System.out.println(count);
			count--;
		}*/
	 
		/*int i=1,sum=0,n=10;
		while(i<=n)
		{
			sum=sum+i;
			i=i+1;
		}
		System.out.println(sum);*/
	
		//Do-while loop
		int count=1;
		do
		{
			System.out.println(count);
			count++;
		}while(count<=10);
	}
}