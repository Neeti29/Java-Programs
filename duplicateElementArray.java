class duplicateElemenentsArray
{
	public static void main(String [] args)
	{
		int [] arr1={1,2,3,5,7,3,7,8};
		for(int i=1;i<=arr1.length;i++)
		{
			for(int j=i+1;j<=arr1.length++)
			{
				if(arr1[i]==arr1[j]) && (i!=j)
				{
					System.out.println(arr[i]);
				}
	}
}