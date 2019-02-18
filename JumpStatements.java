import java.util.Scanner;
	
class JumpStatements
{

    public static void main(String [] args)
	{
		
		Scanner s=new Scanner(System.in);
		int sum=0;
       /*  for(int j=1;j<=5;j++)
		 {		
			System.out.println("Enter a number:");
			int num=s.nextInt();
			if(num<0)
			{
				System.out.println("Number is negative & zero:"+num);
				break;
            }					
			else
			{
				sum=sum+num;
				
			}
		 }	
		 System.out.println("sum:"+sum);
		*/
		
		for(int j=1;j<=5;j++)
		{
			System.out.println("Enter a number:");
			int num=s.nextInt();
			if(num<=0)
			{
				continue;
				
			}
			else
			{
				sum=sum+num;
			
			}	
				
			
		}
		System.out.println("sum:"+sum);
		
	}
}