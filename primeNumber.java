
class primeNumber
{
	public static void main(String [] args)
	{	
		int temp=0;
		for(int num=1;num<=1000;num++)
		{
			
			for(int i=2;i<=num-1;i++)
			{
				if(num%i==0)
				{
					temp=temp+1;
				}
			
			}
			if(temp==0)
				{
					System.out.println(num+ "is a Prime Number");
				}
			else
			{
				temp=0;
			}
		}	
			
			
	}
}