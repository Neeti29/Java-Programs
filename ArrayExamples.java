class ArrayExamples
{
	public static void main(String [] args)
	{
		int [] numbers={8,18,5,2,1,10};
		System.out.println("Total number of elements in an array is:"+numbers.length);
		System.out.println("First element in an array is: " + numbers[0]);
		System.out.println("Last element in an array is: " + numbers[numbers.length-1]);
	
	
		//Sum of array elements
		int sum=0;
		for(int i=0;i<numbers.length;i++)
		{
			System.out.println("Array elements:"+numbers[i]);
			sum+=numbers[i];
		}
		System.out.println("The sum of Array elements:"+sum);
    }	
}