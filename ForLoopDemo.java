import java.util.Scanner;
	
class ForLoopDemo
{

    public static void main(String [] args)
	{
		Scanner s=new Scanner(System.in);
		/*for(int i=10;i>=1;i--)
		{
			System.out.println(i);
		}*/
		
		//Odd Even using for loop
		System.out.println("ODD \t EVEN");
		 
	    for(int i=0;i<=10;i++)
		{
			if(i%2!=0)
			{
				
				System.out.println(i);
			}
			
			else
			{
				
				System.out.println("\t"+i);
				
			}
			  
		
		}
		
		
		
	}
}