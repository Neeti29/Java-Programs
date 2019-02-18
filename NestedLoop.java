
	
class NestedLoop
{

    public static void main(String [] args)
	{
		int i,j;
		//Pattern
		/*for(i=1;i<=5;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(j);
			}
		System.out.println(" ");
		}*/
		
		for(i=1;i<=5;i++)
		{
			for(j=5;j>=i;j--)
			{
				System.out.print(j);
			}
		System.out.println(" ");
		}
		
	}
}